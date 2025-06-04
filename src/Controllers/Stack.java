package Controllers;

import Models.Node;
import java.util.EmptyStackException;

public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }
    
    // Metodo que ingrese un valor int
    public void push(int value){
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
    }

    public int pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        return value;
    }

    public int peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printStack(){
        Node current = top;
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}