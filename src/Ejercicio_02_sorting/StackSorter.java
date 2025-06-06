package Ejercicio_02_sorting;

import java.util.Stack;

public class StackSorter {

    public void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int actual = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > actual) {
                stack.push(tempStack.pop());
            }

            tempStack.push(actual);
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}