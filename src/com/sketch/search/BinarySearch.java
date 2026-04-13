package com.sketch.search;

public class BinarySearch {
    public static int search(int[] sortedNumbers, int numberToFind){
        int low = 0;
        int high = sortedNumbers.length - 1;

        while (low <= high){
            int middlePosition = (low + high) / 2;
            int middleNumber = sortedNumbers[middlePosition];
            if(middleNumber == numberToFind){
                return middlePosition;
            }
            else if(middleNumber < numberToFind){
                low = middlePosition + 1;
            }
            else {
                high = middlePosition - 1;
            }
        }

        return -1;
    }
}
