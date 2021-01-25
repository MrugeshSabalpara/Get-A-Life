package com.recursion;

import java.util.Arrays;


public class SortArray {

    public static void main(String[] args) {

        int[] a = {6,3,7,4,9,8};
        int[] sorted = sortA(a, a.length-1);
        Arrays.stream(sorted).forEach(i-> System.out.print(" "+ i));
    }

    private static int[] sortA(int[] ar, int end) {
        if(end == 0){
            return ar;
        }
//        for(int i = 1; i <= end;i++){
//            if(ar[i-1] > ar[i]){
//                int temp = ar[i-1];
//                ar[i-1] = ar[i];
//                ar[i] = temp;
//            }
//        }

        int temp = ar[end];
        ar = sortA(ar, end-1);
        insert(ar,end, temp);
        return ar;
    }

    private static void insert(int[] ar, int end, int temp) {
        if(end == 0 || ar[end-1] < temp){
            ar[end] = temp;
            return;
        }

        int val = ar[end-1];
        insert(ar,end-1,temp);
        ar[end] =val;
    }
}
