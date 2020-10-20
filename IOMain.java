package com.javalesson.javaio;

import java.util.Scanner;

public class IOMain {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number a");
        a = scanner.nextInt();
        System.out.println("Please enter a number b");
        b = scanner.nextInt();
        System.out.println("Please enter a number c");
        c = scanner.nextInt();

        System.out.println("Result: a = " + a + " , b = " + b);
        System.out.println("Result " + c);

        System.out.println("Result: a = " + a + " , b = " +b + c);
  }
}
