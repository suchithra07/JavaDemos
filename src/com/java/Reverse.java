package com.java;

import java.util.*;

public class Reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String");
        String Str = sc.next();
        String rev = new String("");
        for (int i = Str.length() - 1, j = 0; i >= 0; i--, j++) {
            rev = rev + Str.charAt(i);
        }
        System.out.println("Reverse of " + Str + " is " + rev);
        String sbrev=new StringBuffer(Str) .reverse().toString() ;
        System.out.println(sbrev);

    }
}

