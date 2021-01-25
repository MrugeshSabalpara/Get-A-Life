package com.recursion;

import java.util.Stack;

public class DeleteElementFromStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(1);
        s.push(0);
        s.push(2);

        int mid = (s.size())/2;

        System.out.println("Mid is " + mid);
        System.out.println(s);
        int count = 0;
        delete(s,mid,count);
        System.out.println(s);
    }

    private static void delete(Stack<Integer> s, int mid, int count) {
        if(s.isEmpty())
            return;

        else if(count == mid){
            s.pop();
            return;
        }
        count++;
        int temp = s.pop();
        delete(s,mid,count);
        s.push(temp);
    }
}
