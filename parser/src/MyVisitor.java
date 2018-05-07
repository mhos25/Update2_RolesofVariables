/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.Map;
import src.de.letsbuildacompiler.parser.AdditionrecursionBaseVisitor;
import src.de.letsbuildacompiler.parser.AdditionrecursionParser;
import src.de.letsbuildacompiler.parser.AdditionrecursionParser.ExpressionContext;
import Exceptions.UndeclaredVariableException;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author Mahika
 */
public class MyVisitor extends AdditionrecursionBaseVisitor<String> {

    private Map <String, Integer> variables = new HashMap <>();
    private JvmStack jvmStack = new JvmStack();
    private int branchCounter = 0;
    private int compareCount = 0;
    private int andCounter =0;
    private int orCounter = 0;
    private int loopCount = 0;              //number of loops reached in program
    private int loopNum = 0;                // loopID
    private int whileCount = 0;
    
//    @Override
//    public String visitPrintln(AdditionrecursionParser.PrintlnContext ctx) {
//        String argumentInstructions = visit(ctx.argument);
//        DataType type = jvmStack.pop();
//        return "  getstatic java/lang/System/out Ljava/io/PrintStream;\n" + 
//				 argumentInstructions + "\n" + 
//				"  invokevirtual java/io/PrintStream/println(I)V\n";
//    }

    @Override
    public String visitSimplePrintStatement(AdditionrecursionParser.SimplePrintStatementContext ctx) {
        String argumentInstructions = visit(ctx.argument);
        DataType type = jvmStack.pop();
        return "  getstatic java/lang/System/out Ljava/io/PrintStream;\n" + 
				 argumentInstructions + "\n" + 
				"  invokevirtual java/io/PrintStream/println(I)V\n";
    }

    @Override
    public String visitPrintStatementAndVariable(AdditionrecursionParser.PrintStatementAndVariableContext ctx) {
        return " getstatic java/lang/System/out Ljava/io/PrintStream;" + "\n" +
                "new java/lang/StringBuilder" + "\n" + "dup" + "\n" +
                "invokespecial java/lang/StringBuilder/<init>()V" + "\n" +  "ldc " + ctx.txt.getText() + "\n" +
                " invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;" + "\n" +
                " iload " + requireVariableIndex(ctx.varName) + "\n" + 
                "invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;" + "\n" +
                " invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;" + "\n" +
                "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V" + "\n";           
    }
    
    @Override
    public String visitPlus(AdditionrecursionParser.PlusContext ctx) {
      /*  return visitChildren(ctx) + "\n" +  
       "iadd"; */
       String instructions = visitChildren(ctx) + "\n" +  
       "iadd";
       jvmStack.pop();
       jvmStack.pop();
      jvmStack.push(DataType.INT);
       return instructions;
    }

    @Override
    public String visitMinus(AdditionrecursionParser.MinusContext ctx) {
           /*    return visitChildren(ctx) + "\n" +  
                "isub";         */
           String instructions = visitChildren(ctx) + "\n" +  
                "isub";
           jvmStack.pop();
           jvmStack.pop();
           jvmStack.push(DataType.INT);
           return instructions;
    }

    @Override
    public String visitDiv(AdditionrecursionParser.DivContext ctx) {
        String instructions= visitChildren(ctx) + "\n" + 
                "idiv";
        jvmStack.pop();
        jvmStack.pop();
        jvmStack.push(DataType.INT);
        return instructions;
    }

    @Override
    public String visitMult(AdditionrecursionParser.MultContext ctx) {
        String instructions= visitChildren(ctx) + "\n" + 
                "imul";
        
        jvmStack.pop();
       jvmStack.pop();
        jvmStack.push(DataType.INT);
        return instructions;
    }
    
    
    @Override
    public String visitNumber(AdditionrecursionParser.NumberContext ctx) {
      jvmStack.push(DataType.INT);
       return "ldc " + ctx.number.getText();
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
       if(aggregate == null){
           return nextResult;
       } if (nextResult == null){
           return aggregate;
       }
       return aggregate + "\n" + nextResult;
    }

    @Override
    public String visitVarDeclarationAndAssignment(AdditionrecursionParser.VarDeclarationAndAssignmentContext ctx) {
        variables.put(ctx.varName.getText(), variables.size());
        String instructions = visit(ctx.exp) + "\n" + 
              "istore " + requireVariableIndex(ctx.varName);
      return instructions;
    }

    

    @Override
    public String visitSimpleVarDeclaration(AdditionrecursionParser.SimpleVarDeclarationContext ctx) {
         variables.put(ctx.varName.getText(), variables.size());                  
         return ""; 
    }
    
    

  //  @Override
  //  public String visitAssignment(AdditionrecursionParser.AssignmentContext ctx) {
     /*   return visit(ctx.expr) + "\n" + */
     //   "istore " + variables.get(ctx.varName.getText());           //takes top value on top of stack and save it in variable table
      /*      "istore " + requireVariableIndex(ctx.varName);  */
  //    String instructions = visit(ctx.expr) + "\n" + 
  //            "istore " + requireVariableIndex(ctx.varName);
  //    jvmStack.pop();
  //    return instructions;
 //     }

    @Override
    public String visitDirectVarAssignment(AdditionrecursionParser.DirectVarAssignmentContext ctx) {
      String instructions = visit(ctx.expr) + "\n" + 
              "istore " + requireVariableIndex(ctx.varName);
      return instructions;
  
    }  

    @Override
    public String visitInputVar(AdditionrecursionParser.InputVarContext ctx) {
       String instructions = "new java/util/Scanner" + "\n" + "dup" + "\n" +"getstatic java/lang/System/in Ljava/io/InputStream;" + 
               "\n" + "invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V" + "\n" + "astore " + requireVariableIndex(ctx.varName) +
               "\n" + "aload " + requireVariableIndex(ctx.varName) + "\n" + "invokevirtual java/util/Scanner/nextInt()I" +"\n" + "istore " + requireVariableIndex(ctx.varName) + "\n";
       return instructions;
    }
    
    

    @Override
    public String visitVariable(AdditionrecursionParser.VariableContext ctx) {
        /*
        Integer varIndex = variables.get(ctx.varName.getText());
        if (varIndex == null){
        throw new UndeclaredVariableException(ctx.varName);
        }
        return varIndex;
        */
       jvmStack.push(DataType.INT);
         return  "iload " + requireVariableIndex(ctx.varName);    //take the value of the variable from the variable table and put it on top of the stack
    }
    
    private int requireVariableIndex(Token varNameToken){
        Integer varIndex = variables.get(varNameToken.getText());
        if (varIndex == null){
        throw new UndeclaredVariableException(varNameToken);
        }
        return varIndex;
    }

    @Override
    public String visitBranch(AdditionrecursionParser.BranchContext ctx) {
        String conditionInstructions = visit(ctx.condition);
        jvmStack.pop();
        String onTrueInstructions = visit(ctx.onTrue);
        String onFalseInstructions = visit(ctx.onFalse);
        int branchNum = branchCounter;
        ++ branchCounter;
        
      //  System.out.println( "\n\tTTTTTT " + conditionInstructions);
      //  System.out.println("\n\tTTTTTT " + onTrueInstructions);
      //  System.out.println("\n\tTTTTTT " + onFalseInstructions);
        
       /* System.out.println( "****" +conditionInstructions + "\n" +
                "ifne ifTrue" + branchNum + "\n" +
                onFalseInstructions + "\n"+
                "goto endIf" + branchNum + "\n" +
                "ifTrue" + branchNum + ":\n" +
                onTrueInstructions + "\n" +
                "endIf" + branchNum +":\n"); */
        
        return conditionInstructions + "\n" +
                "ifne ifTrue" + branchNum + "\n" +
                onFalseInstructions + "\n"+
                "goto endIf" + branchNum + "\n" +
                "ifTrue" + branchNum + ":\n" +
                onTrueInstructions + "\n" +
                "endIf" + branchNum +":\n";
         
    }

    @Override
    public String visitRelational(AdditionrecursionParser.RelationalContext ctx) {
       // int compareNum = compareCount;
       // ++compareCount;
       loopNum = loopCount;
       ++loopCount;
        String jumpInstructions;
        switch(ctx.operator.getText()){
            case "<":
                jumpInstructions = "if_icmplt";
                break;
            case "<=":
                jumpInstructions = "if_icmple";
                break;
            case ">":
                jumpInstructions = "if_icmpgt";
                break;
            case ">=":
                jumpInstructions= "if_icmpge";
                break;
            default: 
                throw new IllegalArgumentException("Unknown operator: " + ctx.operator.getText());
        
        }
        /*
        String instructions= visitChildren(ctx) + "\n" + 
                jumpInstructions + " onTrue" + compareNum + "\n" +
                "ldc 0\n" + "goto onFalse" + compareNum + "\n"+
                "onTrue" + compareNum + ":\n" + 
                "ldc 1\n" + 
                "onFalse" + compareNum + ":";
        */
        String instructions = visitChildren(ctx) + "\n" + jumpInstructions + " onTrue" + loopNum
                + "\n" + "goto onFalse" + loopNum;
        
        
        jvmStack.pop();
        jvmStack.pop();
        jvmStack.push(DataType.INT);
        return instructions;
    }

    @Override
    public String visitAnd(AdditionrecursionParser.AndContext ctx) {
        String left= visit(ctx.lft);
        String right = visit(ctx.rght);
        int andNum = andCounter; 
        ++andCounter;
        
        jvmStack.pop();
        jvmStack.pop();
        jvmStack.push(DataType.INT);
        
        return left + "\n" + 
                "ifeq onAndFalse" + andNum + "\n" +
                right + "\n" + 
                "ifeq onAndFalse" + andNum + "\n" + 
                "ldc 1 \n" + 
                "goto andEnd" + andNum + "\n"+
                "onAndFalse" + andNum + ":\n" + 
                "ldc 0\n" + 
                "andEnd" + andNum + ":";
    }

    @Override
    public String visitOr(AdditionrecursionParser.OrContext ctx) {
        String left = visit(ctx.lft);
        String right = visit(ctx.rght);
        int orNum = orCounter;
        ++orCounter;
        
        jvmStack.pop();
        jvmStack.pop();
        jvmStack.push(DataType.INT);
        
        return left + "\n" + 
                "ifne onOrTrue" + orNum + "\n"+
                right + "\n" + 
                "ifne onOrTrue" + orNum + "\n" + 
                "ldc 0\n" + 
                "goto orEnd" + orNum + "\n" + 
                "onOrTrue" + orNum + ":\n" + 
                "ldc 1\n" + 
                "orEnd" + orNum + ":";
    }


    @Override
    public String visitPrint(AdditionrecursionParser.PrintContext ctx) {
        String argumentInstructions = visit(ctx.argument); 
        DataType type = jvmStack.pop();
    
   // System.out.println(argumentInstructions);
      return "  getstatic java/lang/System/out Ljava/io/PrintStream;\n" + 
				argumentInstructions + "\n" + 
				"  invokevirtual java/io/PrintStream/print("+ type.getJvmType()+ ")V\n";
    }


    @Override
    public String visitString(AdditionrecursionParser.StringContext ctx) {
        jvmStack.push(DataType.STRING);
       return "ldc " + ctx.txt.getText();
    }

    @Override
    public String visitWhile_statement(AdditionrecursionParser.While_statementContext ctx) {
        int whileNum = whileCount;
        ++whileCount;
       String loopInstructions = visit (ctx.condition);
       String onTrue = visit(ctx.loopCondition);
       
       return " while" + whileNum + ":" + "\n" + loopInstructions + "\n" + "onTrue"+ loopNum + ":" + "\n"+ onTrue + "\n"+ "goto while" + whileNum +
               "\n" + "onFalse" + loopNum + ":" + "\n";
    }

    @Override
    public String visitDo_while(AdditionrecursionParser.Do_whileContext ctx) {
        String onTrue = visit(ctx.loop);
        String conditions = visit(ctx.condition);
        
        return "onTrue" + loopNum + ":" + "\n" + onTrue + "\n" + conditions +"\n" + "onFalse" + loopNum + ":"; 
    }
    
    
    
}
