package com.hatidzhe;
<<<<<<< HEAD


public class Main {
    public static void main(String[] args) {


       String word = "Band";
        String reverse = reverse(word);
        System.out.printf(" original String : %s , reversed String %s %n", word, reverse);
    }


    public static String reverse(String source) {
        if (source == null || source.isEmpty()) {
            return source;
        }
        String reverse = "";
        for (int i = source.length() - 1; i >= 0; i--) {
            reverse = reverse + source.charAt(i);
        }

        return reverse;


    }
}




=======
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
>>>>>>> 6113fdfca79769a9d8f035393e381861166e60f5
