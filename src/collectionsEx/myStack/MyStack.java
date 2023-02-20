package collectionsEx.myStack;

import collectionsEx.myArray.MyArray;

public class MyStack {
    MyArray stack;
    int top;

    public MyStack() {
        top = 0;
        stack = new MyArray(); //default size : 10
    }
    public MyStack(int size) {
        top = 0;
        stack = new MyArray(size);
    }

    public void push(int data) {
        if(isFull()) {
            System.out.println("Stack is Full.");
            return;
        }
        stack.addElement(data);
        top++;
    }
    public int pop() {
        if(stack.isEmpty()) {
            System.out.println("Stack is Empty.");
            return 0;
        }
        return stack.removeElement(--top);
    }

    public int peek() {
        if(stack.isEmpty()) {
            System.out.println("Stack is Empty.");
            return 0;
        }
        return stack.getElement(top-1);
    }

    public boolean isFull() {
        if(top==stack.ARRAY_SIZE) {
            return true;
        }
        return false;
    }
}
