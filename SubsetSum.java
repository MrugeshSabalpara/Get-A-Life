package com.recursion;

import java.util.ArrayList;

public class SubsetSum {
    public static void main(String[] args) {
        int[] a = {3,4,5,2};
        int sum = 6;
        int n = a.length;

        ArrayList<Integer> ans = new ArrayList<>();
        getSubsetSum(a,n,sum,ans);
    }

    private static void getSubsetSum(int[] a, int n, int sum, ArrayList<Integer> ans) {

        if(sum == 0){
            ans.forEach(i-> System.out.print(" " + i));
            System.out.println();
            return;
        }

        else if(n == 0){
            return;
        }

        getSubsetSum(a,n-1,sum, ans);
        ArrayList<Integer>ans1 = new ArrayList<>(ans);
        ans1.add(a[n-1]);
        getSubsetSum(a,n-1,sum-a[n-1], ans1);

    }
}
