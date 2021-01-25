package com.recursion;

import java.util.ArrayList;

public class BalancedParantheses {
    public static void main(String[] args) {
        int o = 3;
        int c = 3;

        ArrayList<String> balancedP = new ArrayList<>();
        getSolved(balancedP,o,c,"");
        balancedP.stream().forEach(i-> System.out.println(" " + i));
    }

    private static void getSolved(ArrayList<String> balancedP, int o, int c, String b) {
        if(o == 0 && c ==0){
            if(!balancedP.contains(b))
                balancedP.add(b);
            return;
        }

        if(o != 0){
            String b1=b;
            b1 = b1.concat("(");
            getSolved(balancedP,o-1,c,b1);
        }
        if(c > o){
            String b2 = b;
            b2 = b2.concat(")");
            getSolved(balancedP,o,c-1,b2);
        }
    }
}
