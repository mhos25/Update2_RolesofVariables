/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

import org.antlr.v4.runtime.Token;

/**
 *
 * @author Mahika
 */
public class UndeclaredVariableException extends RuntimeException {
    private int line;
    private int column;
    private String varName; 

    public UndeclaredVariableException (Token varNameToken){
        line = varNameToken.getLine();
        column = varNameToken.getCharPositionInLine();
        varName = varNameToken.getText();
    }
    
    @Override
    public String getMessage() {
        return line + ":" + column + " Undeclared variable <" + varName + ">";
    }
    
    
}
