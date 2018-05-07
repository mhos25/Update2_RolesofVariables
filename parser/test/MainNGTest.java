/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import jasmin.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import Exceptions.UndeclaredVariableException;

/**
 *
 * @author Mahika
 */
public class MainNGTest {
    private Path tempDir;
    
    @BeforeMethod
    public void CreateTempDir () throws IOException {
    tempDir = Files.createTempDirectory("compilerTest");
    }
    
    @AfterMethod
    public void deleteTempDir (){
        deleteRecursive(tempDir.toFile());
    }
    
    public MainNGTest() {
    }

    @Test(dataProvider = "provide_code_expectedText")
    public void runningCode_outputsExpectedText(String code, String expectedText) throws Exception {
        //execution
        String actualOutput = compileAndRun(code);
    /*
        System.out.println("*******");
        System.out.println(actualOutput);
        System.out.println("*******");
    */
        //evaluation 
        Assert.assertEquals(actualOutput, expectedText);
        
    }
    
    @Test(expectedExceptions = UndeclaredVariableException.class, expectedExceptionsMessageRegExp = "1:8 Undeclared variable <x>" )
    public void compilingCode_throwsUndeclaredVariableException_ifReadingVariableIsUndefined() throws Exception{
       // execution
        compileAndRun("println(x);");
    
        // evaluation performed by expected exception
    }
    
    @Test(expectedExceptions = UndeclaredVariableException.class, expectedExceptionsMessageRegExp = "1:0 Undeclared variable <x>" )
    public void compilingCode_throwsUndeclaredVariableException_ifWritingVariableIsUndefined() throws Exception{
       // execution
        compileAndRun("x = 5;");
    
        // evaluation performed by expected exception
    }
    
    @DataProvider(name = "dataProvider")
    public Object [] [] provide_code_expectedText (){
        return new Object [] [] {
            {"println(1+2);", "3"+ System.lineSeparator()},
            {"println(1+2+42);", "45" + System.lineSeparator()},
             {"println(1); println(2);", "1"+ System.lineSeparator() + "2"+ System.lineSeparator()},
             {"println(3-2);", "1"+ System.lineSeparator()},
             {"println(2*3);", "6"+ System.lineSeparator()},
             {"println(6/2);", "3"+ System.lineSeparator()},
             {"println(7/2);", "3"+ System.lineSeparator()},
             {"println(8/2*4);", "16"+ System.lineSeparator()},
             {"println(2+3*3);", "11"+ System.lineSeparator()},
             {"println(9-2*3);", "3"+ System.lineSeparator()},
             {"println(8-2+5);", "11"+ System.lineSeparator()},
             {"int foo; foo=42; println(foo);", "42"+ System.lineSeparator()},
             {"int foo; foo = 42;println(foo+2);", "44"+ System.lineSeparator()},
             {"int a; int b; a = 2; b = 5; println(a+b);", "7"+ System.lineSeparator()},
             {"if(0){" +
                " println(81);\n"
                     + "} else {\n"
                     + " println(42);\n"
                     + "}", "42"+ System.lineSeparator()},
             {"if(1){" +
                " println(81);\n"
                     + "} else {\n"
                     + " println(42);\n"
                     + "}", "81"+ System.lineSeparator()}, 
             {"println(1<2);", "1" + System.lineSeparator()},
             {"println(2<=2);", "1" + System.lineSeparator()},
             {"println(3>2);", "1" + System.lineSeparator()},
             {"println(3<=2);", "0" + System.lineSeparator()},
             {"println(1 && 1);", "1" + System.lineSeparator()},
             {"println(1 && 0);", "0" + System.lineSeparator()},
             {"println(0 && 1);", "0" + System.lineSeparator()},
             {"println(0 && 0);", "0" + System.lineSeparator()},
             {"println(1 || 1);", "1" + System.lineSeparator()},
             {"println(1 || 0);", "1" + System.lineSeparator()},
             {"println(0 || 1);", "1" + System.lineSeparator()},
             {"println(0 || 0);", "0" + System.lineSeparator()},
             {"print(\"Hello world\");", "Hello world" + System.lineSeparator()},
             {"int counter; counter = 3; counter = counter -1; println(2*counter);", "4"+ System.lineSeparator()},
             {"int counter; counter = 2; if(counter > 0){println(81);} else {println(42);})", "81"+ System.lineSeparator()}
        };
    }
    
    private String compileAndRun (String code) throws Exception{
        code = Main.compile(new ANTLRInputStream(code));
    //    System.out.println(code);
      ClassFile classFile = new ClassFile();
      classFile.readJasmin(new StringReader (code), "", false);
      Path outputPath = tempDir.resolve(classFile.getClassName() + ".class");
      try(OutputStream out = Files.newOutputStream(outputPath)) {
                classFile.write(out);
        }
      return runJavaClass(tempDir, classFile.getClassName());
    }

    private String runJavaClass(Path dir, String className) throws Exception {
        Process process = Runtime.getRuntime().exec(new String [] {"java", "-cp" , dir.toString(), className});
        try(InputStream in = process.getInputStream()){
        return new Scanner(in).useDelimiter("\\A").next();
        }
        
    }

    private void deleteRecursive(File file) {
        if(file.isDirectory()){
            for (File child: file.listFiles()){
                deleteRecursive(child);
            }
        }
        
        if (!file.delete()){
            throw new Error ("Could not delete file <" + file + ">");
        }
    }
    
}
