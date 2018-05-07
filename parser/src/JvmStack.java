
import java.util.Deque;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahika
 */
public class JvmStack {
    private Deque<DataType> typesOnStack = new LinkedList<>();
    
    public void push(DataType type){
        typesOnStack.push(type);
    }
    public DataType pop(){
        return typesOnStack.pop();
    }
}
