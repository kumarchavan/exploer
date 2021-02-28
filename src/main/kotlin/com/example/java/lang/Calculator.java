package com.example.java.lang;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int execute(Task task) {
        return task.process(a, b);
    }
}
