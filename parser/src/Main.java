/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
//import org.antlr.v4.runtime.CharStream;
//import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import src.de.letsbuildacompiler.parser.AdditionrecursionLexer;
import src.de.letsbuildacompiler.parser.AdditionrecursionParser;
/**
 *
 * @author Mahika
 */
public class Main {

    /**
     *
     * @param Args
     * @throws Exception
     */
    public static void main (String [] Args) throws Exception{
        
        ANTLRInputStream input = new ANTLRFileStream("C:\\Users\\Mahika\\Documents\\NetBeansProjects\\parser\\sample.txt");
      // CharStream input = CharStreams.fromFileName("C:\\Users\\Mahika\\Documents\\NetBeansProjects\\parser\\build\\classes\\grammar\\Additionrecursion.g4");
        System.out.println(compile(input));
    }
    
    public static String compile (ANTLRInputStream input){
       AdditionrecursionLexer lexer = new AdditionrecursionLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AdditionrecursionParser parser = new AdditionrecursionParser(tokens);
        
        ParseTree tree = parser.program();
        return CreateJasminFile(new MyVisitor().visit(tree));
    }
    
    private static String CreateJasminFile(String instructions){
     return ".class public HelloWorld\n" +
            ".super java/lang/Object\n" +
            "\n" +
            ".method public static main([Ljava/lang/String;)V\n" +
            "\n" +
            "	.limit stack 100\n" +
            "	.limit locals 100\n" +
            "\n" +
            instructions + "\n" +
            "	return\n" +
            ".end method";
    }
}
