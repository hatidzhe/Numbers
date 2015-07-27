package com.hatidzhe;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;
        System.out.println("Enter your number");
        int number = new Scanner(System.in).nextInt();
        if ( number > 0 ) {
            if (number % 2 == 0) System.out.println("The number is even");
            else System.out.println("The number is odd");
        }
        else System.out.println("Enter a positive number");


    }
}
