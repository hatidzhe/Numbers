package com.hatidzhe;

public class Main {

    public static void main(String[] args) {
        int[] unsorted = {1,5,8,2,7,4};
        int[] sorted = BubbleSort.bubblesort(unsorted);

        for (int i = 0; i<sorted.length; i++) {
            System.out.print(sorted[i] + ", ");
        }
    }
}
