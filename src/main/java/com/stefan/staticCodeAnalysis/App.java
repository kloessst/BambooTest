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
        Inner.equalString(a);
    }

    public static boolean equalString(String a)  {
        String b = "B";
        return a == b;
    }
    
    public static class Inner {
        public static boolean equalString(String a)  {
            String b = "B";
            return a == b;
        }
    }
}
