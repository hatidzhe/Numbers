package com.hatidzhe;

/**
 * Created by hatidzhe on 15-6-23.
 */
public class BubbleSort {

    public static int[] bubblesort(int[] unsorted) {
        int temp;
        for (int i=1; i<unsorted.length; i++) {
            for(int j=0; j<unsorted.length-i; j++) {
                if(unsorted[j]>unsorted[j+1]) {
                    temp=unsorted[j];
                    unsorted[j]=unsorted[j+1];
                    unsorted[j+1]=temp;
                }

            }
        }
        return unsorted;
    }
}
