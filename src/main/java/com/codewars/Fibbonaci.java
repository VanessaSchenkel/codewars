package com.codewars;

public class Fibbonaci {
    public static void main(String args[]) {
        fib(5);
    }

    public static int fib(int n){
        System.out.println("Called");

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
