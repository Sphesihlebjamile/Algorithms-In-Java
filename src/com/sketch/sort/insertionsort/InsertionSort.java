package com.sketch.sort.insertionsort;

public class InsertionSort {
    public static void sort(int[] array){
        for(int i = 1; i < array.length; i++){
            int currentValue = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > currentValue){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentValue;
        }
    }
}
