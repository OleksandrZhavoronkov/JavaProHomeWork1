package com.example.demo;

abstract public class TextOutputs {
    public static void Greetings() {
        System.out.println("Welcome, please write down your name");
    }
    public static void Lines(){
        System.out.println("_____________________________________________________");
    }
    public static void enterData() {
        System.out.println("Please, enter some data");
    }
    public static void emptyLine() {
        System.out.println("\n");
    }
    public static void arraySizeFromUser() {
        System.out.println("Please, enter how long should your array be");
    }
    public static void columnView() {
        System.out.println("Column view for your array: ");
    }
    public static void rawView() {
        System.out.println("Raw view for your array: ");
    }
}