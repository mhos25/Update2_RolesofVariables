/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahika
 */
public enum DataType {
    INT ("I") , STRING ("Ljava/lang/String;") ;
    
    private final String jvmType;
    
    private DataType(String jvmType){
        this.jvmType = jvmType;
    }
    
    public String getJvmType(){
    return jvmType;
    }
}
