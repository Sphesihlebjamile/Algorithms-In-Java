package com.sketch;

import com.sketch.search.*;

public class Main {
    public static void main(String[] args){
        int[] sortedArray = { 1, 2, 3, 5, 7, 9, 11, 14, 17, 26, 18, 37, 42, 43, 44, 47, 48, 49, 78, 227, 5556, 8976 };
        int valueToFind = 5556;

        int binarySearchIndex = BinarySearch.searchDefault(sortedArray, valueToFind);

        System.out.println("Expected Value Index: 20");
        System.out.println("Actual Value Index: " + binarySearchIndex);
    }
}
