package com.sketch;

import com.sketch.sort.quicksort.QuickSort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        int[] unsortedArray = new int[100];
        Random random = new Random();
        for(int i = 0; i < unsortedArray.length; i++){
            unsortedArray[i] = random.nextInt(20);
        }

        int[] unsortedArrayResult = new int[unsortedArray.length];
        System.arraycopy(unsortedArray, 0, unsortedArrayResult, 0, unsortedArray.length);

        QuickSort.sort(unsortedArrayResult, 0, unsortedArrayResult.length - 1);

        System.out.println("Actual Value Index: " + Arrays.toString(unsortedArray));
        System.out.println("Actual Value Index: " + Arrays.toString(unsortedArrayResult));
    }
}
