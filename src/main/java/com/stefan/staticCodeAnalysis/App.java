package com.stefan.staticCodeAnalysis;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String a = "A";
        String b = "B";
        System.out.println(equalString("Hello"));
    }

    public static boolean equalString(String a) {
        String b = "B";
        return a == b;
    }
}