package com.recursion;

import java.util.Stack;

public class
SortStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(1);
        s.push(0);
        s.push(2);

        sort(s);
        System.out.println(s);
    }

    private static void sort(Stack<Integer> s) {
        if(s.isEmpty())
            return;

        int temp = s.pop();
        sort(s);
        insert(s,temp);
    }

    private static void insert(Stack<Integer> s, int temp) {
        if(s.isEmpty() || s.peek() < temp){
            s.push(temp);
            return;
        }

        int val = s.pop();
        insert(s,temp);
        s.push(val);
    }
}
