package com.qulix.cs.fundamentals.optional1;

public class ReverseNumbers {
    public static void main(String[] args) {
        if(args.length != 0) {
            for(int i = args.length-1; i >= 0; i--) {
                System.out.print(args[i] + " ");
            }
        }
    }
}
