package com.ning.leco;

public class TestLeco {
    public static void main(String[] args) {
        TestLeco t = new TestLeco();
        System.out.println(t.reverse(456));
        System.out.println(t.myAtoi("   -78941  5   6"));
    }
    public int reverse(int x) {
        int res = 0;
        while(x != 0) {
            int tmp = x % 10+res * 10;
            if((tmp - x % 10) /10 != res) {
                return 0;
            }
            res = tmp;
            x /= 10;
        }
        return res;
    }
    public int myAtoi(String str) {
        int len = str.length();
        int index = 0;
        while(index < len) {
            if(str.charAt(index) != ' ') {
                break;
            }
            index++;
        }
        if(index == len) {
            return 0;
        }
        int sign = 1;
        char firstChar = str.charAt(index);
        if(firstChar == '+') {
            index++;
            sign = 1;
        }else if(firstChar == '-') {
            index++;
            sign = -1;
        }
        int res = 0;
        while(index < len) {
            char curChar = str.charAt(index);
            if(curChar < '0' || curChar > '9') {
                break;
            }
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (curChar - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (curChar - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }
            res = res * 10 + sign * (curChar - '0');
            index++;
        }
        return res;
    }
}
