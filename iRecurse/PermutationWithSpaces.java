package com.recursion;

public class PermutationWithSpaces {
    public static void main(String[] args) {
        String s = "ABCD";

        String o = "A";
        s= s.substring(1);

        solve(o,s);

    }

    private static void solve(String o, String s) {

        if(s.length() == 0){
            System.out.println(o);
            return;
        }

        String o1 = o;
        String o2 = o;
        o1 = o1.concat("_");
        o1 = o1.concat(s.substring(0,1));
        o2 = o2.concat(s.substring(0,1));

        solve(o1,s.substring(1));
        solve(o2,s.substring(1));

        return;


    }
}
