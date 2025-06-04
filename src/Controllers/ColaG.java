package Controllers;

import java.util.EmptyStackException;

import Models.Node;
import Models.NodeGeneric;

public class ColaG<T> {
    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;

    public ColaG(){
        this.primero = primero;
        this.ultimo = ultimo;
    }

    public void add(T value){
        NodeGeneric<T> newNode = new NodeGeneric<T>(value);
        if (isEmpty()){
            primero = newNode;
            ultimo = newNode;
        }else{
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
    }

    public T remove(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        T value = primero.getValue();
        primero = primero.getNext();
        return value;
    }

    public boolean isEmpty(){
        return primero == null;
    }

    public void printCola(){
        NodeGeneric<T> current = primero;
        while (current != null){
            System.out.println(current.getValue() + " ");
            current = current.getNext();
        }
    }

    public int size(){
        NodeGeneric<T> current = primero;
        int cont = 0;
        while (current != null){
            System.out.println(current.getValue() + " ");
            current = current.getNext();
            cont++;
        }
        System.out.println();
        return cont;
    }
}
