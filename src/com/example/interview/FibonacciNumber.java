package com.example.interview;

public class FibonacciNumber {
    public static void main(String args[]) {
        int n = 6;
        System.out.println(fibo(n));
    }

    public static int fibo(int n) {
        if(n <= 1) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}