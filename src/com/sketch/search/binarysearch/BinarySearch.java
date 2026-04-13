package com.sketch.search.binarysearch;

import java.util.Arrays;

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

    public static int searchDefault(int[] sortedNumbers, int numberToFind){
        return Arrays.binarySearch(sortedNumbers, numberToFind);
    }

    public static int searchRecursive(int[] sortedNumbers, int numberToFind, int low, int high){
        if(low > high){
            return -1;
        }
        int middlePosition = (low + high) / 2;
        int middleNumber = sortedNumbers[middlePosition];
        if(middleNumber == numberToFind){
            return  middlePosition;
        }
        else if(middleNumber < numberToFind){
            low = middlePosition + 1;
            return searchRecursive(sortedNumbers, numberToFind, low, high);
        }
        else {
            high = middlePosition - 1;
            return searchRecursive(sortedNumbers, numberToFind, low, high);
        }
    }
}
