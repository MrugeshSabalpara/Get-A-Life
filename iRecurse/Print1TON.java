package com.recursion;

public class Print1TON {

    public static void main(String[] args) {
        int n = 10;
        printNum(n);
    }

    private static void printNum(int n) {
        if(n == 0){
            return;
        }
        System.out.print(" " + n);
        printNum(n-1);
    }
}
