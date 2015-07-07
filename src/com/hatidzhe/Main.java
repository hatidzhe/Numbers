package com.hatidzhe;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        double x;
        x = Math.log(number) / Math.log(2);

        if (x == Math.floor(x)){
            System.out.println("The number is a power of two");
        }
        else{
            System.out.println("The number is not a power of two");


        }
    }
}