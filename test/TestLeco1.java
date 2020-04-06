package com.ning.leco;

public class TestLeco1 {
    public static int fib1(int n) {
        if(n <= 1) {
            return n;
        }
        int one = 0;
        int two = 1;
        for(int i = 0;i < n -1;i++) {
            int sum = one + two;
            one = two;
            two = sum;
        }
        return two;
    }
    public static int fib2(int n) {
        if(n <= 1) {
            return n;
        }
        return fib2(n - 1) + fib2(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(fib1(0));
        System.out.println(fib1(1));
        System.out.println(fib1(2));
        System.out.println(fib1(3));
        System.out.println(fib1(4));
        System.out.println(fib1(5));
        System.out.println(fib2(3));
    }
}
