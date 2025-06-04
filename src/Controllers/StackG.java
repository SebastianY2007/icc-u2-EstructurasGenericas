package Controllers;

import java.util.EmptyStackException;

import Models.NodeGeneric;

public class StackG<T>{
    private NodeGeneric<T> top;
    private int size;

    public StackG(){
        this.top = top;
        this.size = size;
    }

    public void push(T value){
        NodeGeneric<T> newNode = new NodeGeneric<T>(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public T pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printStack(){
        NodeGeneric<T> current = top;
        while (current != null){
            System.out.println(current.getValue() + " ");
            current = current.getNext();
        }
    }

    public NodeGeneric<T> getTop() {
        return top;
    }

    public void setTop(NodeGeneric<T> top) {
        this.top = top;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "StackG [top=" + top + ", size=" + size + "]";
    }
}
