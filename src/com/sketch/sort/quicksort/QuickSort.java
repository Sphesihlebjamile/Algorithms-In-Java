package com.sketch.sort.quicksort;

import java.util.Random;

public class QuickSort {
    public static void sort(int[] unsortedArray, int lowIndex, int highIndex){
        if(lowIndex >= highIndex){
            return;
        }
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = unsortedArray[pivotIndex];
        swap(unsortedArray, pivotIndex, highIndex);
        int leftPointer = partition(unsortedArray, lowIndex, highIndex, pivot);

        sort(unsortedArray, lowIndex, leftPointer - 1);
        sort(unsortedArray, leftPointer + 1, highIndex);
    }

    private static int partition(int[] unsortedArray, int lowIndex, int highIndex, int pivot){
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){
            while (unsortedArray[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(unsortedArray[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(unsortedArray, leftPointer, rightPointer);
        }
        swap(unsortedArray, leftPointer, highIndex);

        return leftPointer;
    }

    private static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
