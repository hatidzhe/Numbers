package com.hatidzhe;
<<<<<<< HEAD
=======
import java.util.Scanner;

>>>>>>> 0be276453df071c3ac391e2f5b6987963991f0fc

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
        int[] unsorted = {1,5,8,2,7,4};
        int[] sorted = BubbleSort.bubblesort(unsorted);

        for (int i = 0; i<sorted.length; i++) {
            System.out.print(sorted[i] + ", ");
        }
    }
}
=======

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
>>>>>>> 0be276453df071c3ac391e2f5b6987963991f0fc
