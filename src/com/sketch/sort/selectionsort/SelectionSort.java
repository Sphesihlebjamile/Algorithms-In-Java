package com.sketch.sort.selectionsort;

public class SelectionSort {
    public static int[] sort(int[] unsortedArray){
        if(unsortedArray.length == 1){
            return unsortedArray;
        }

        int length = unsortedArray.length;

        for (int i = 0; i < length - 1; i ++){
            int min = unsortedArray[i];
            int minIndex = i;
            for(int j = i + 1; j < unsortedArray.length; j++){
                if(unsortedArray[j] < min){
                    min = unsortedArray[j];
                    minIndex = j;
                }
            }
            swap(unsortedArray, i, minIndex);
        }

        return  unsortedArray;
    }

    private static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
