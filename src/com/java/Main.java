package com.java;
public class Main {

    public static void main(String[] args) {
        // write your code here
        //System.out.println();

        String pal= "leevee";
        int sp=0;
        int ep=pal.length()-1;
        boolean bol=true;
        while(sp<ep)
        {
            String sl= pal.substring(sp,sp+1);
            String el= pal.substring(ep,ep+1);
            if (sl.equalsIgnoreCase(el)==false){
                bol=false;
                System.out.println("not a palindrome");
                break;

            }
            sp++;
            ep--;
        }

        if(bol==true)
            System.out.println(" a palindrome");
    }

}
