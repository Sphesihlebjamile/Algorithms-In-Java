package com.sketch;

import com.sketch.sort.insertionsort.InsertionSort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        int[] unsortedArray = new int[10000];
        Random random = new Random();
        for(int i = 0; i < unsortedArray.length; i++){
            unsortedArray[i] = random.nextInt(50);
        }

        int[] unsortedArrayResult = new int[unsortedArray.length];
        System.arraycopy(unsortedArray, 0, unsortedArrayResult, 0, unsortedArray.length);

        long startTime = System.nanoTime();

        InsertionSort.sort(unsortedArrayResult);

        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0;

        System.out.println("Default Array: " + Arrays.toString(unsortedArray));
        System.out.println("Sorted Array: " + Arrays.toString(unsortedArrayResult));
        System.out.println("Execution Time: " + duration + "ms");
    }
}
