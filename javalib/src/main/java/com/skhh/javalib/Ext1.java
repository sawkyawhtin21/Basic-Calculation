package com.skhh.javalib;

public class Ext1 {

    public static void main(String[]args){
        int a=5, b=2, c=1;
        int m=++a*5;
        int x=10,y=2,p=2;
        p*=x/y; // p=p*x/y


        int s=5;
        s/=5; // s=s/5;
        int n=b++-c*2;
        // b-c*2
        // 2-1*2 // 2-2=0
        System.out.println("the volut of m:"+m);
        System.out.println("the volut of s:"+s);
        System.out.println("the volut of p:"+p);
        System.out.println("the volut of n:"+n);

    }

}
