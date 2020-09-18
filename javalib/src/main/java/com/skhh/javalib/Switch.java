package com.skhh.javalib;

public class Switch {
    public static void main (String [] args){
        int i =1;
        switch (i){
            case 0:
                System.out.println("i is zero");
                break;
            case 1:
                System.out.println("i is one");
                break;
            case 2:
                System.out.println("i is two");
                break;
                default:
                System.out.println("i is greater than two");
            break;
        }

        String str = "Hello";
        switch (str)
        {
            case "Hello":
                System.out.println("Hello"); break;
            case "Hi":
                System.out.println("Hi"); break;
            case "Hey":
                System.out.println("Hey"); break;
        }
    }
}
