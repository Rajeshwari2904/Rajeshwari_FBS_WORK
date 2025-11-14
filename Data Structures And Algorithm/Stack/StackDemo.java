package com.stack;

public class StackDemo {

    private int top = 0; // index tracker
    private Node[] stack = new Node[10];

    // SINGLETON OBJECT
    private static StackDemo ref = new StackDemo();

    // private constructor
    private StackDemo() { }

    // (This constructor is unnecessary — you can remove it)
    private StackDemo(Node[] ref) {
        stack = ref;
    }

    // returns same object always
    public static StackDemo getObject() {
        return ref;
    }

    public Node[] getStack() {
        return stack;
    }

    public void setStack(Node[] stack) {
        this.stack = stack;
    }

    public void push(int value) {
        if (top == stack.length) {
            System.out.println("Stack is Full!");
            return;
        }

        Node newNode = new Node(value);
        stack[top] = newNode;
        top++;
    }

    public void pop() {
        if (top == 0) {
            System.out.println("Stack is Empty.");
            return;
        }

        top--;
        Node deleted = stack[top];
        stack[top] = null;

        System.out.println(deleted.getData() + " : is deleted");
    }

    public void display() {
        if (top == 0) {
            System.out.println("Stack is Empty!");
            return;
        }

        System.out.println("Stack Elements:");
        for (int i = top - 1; i >= 0; i--) {  
            System.out.println(stack[i].getData());
        }
    }
}

