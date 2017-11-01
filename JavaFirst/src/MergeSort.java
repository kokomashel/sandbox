/**
 * Created on 10/30/17.
 * Given  datasets, print the number of inversions that must be swapped
 * to sort each dataset on a new line.
 * https://www.hackerrank.com/challenges/ctci-merge-sort/problem
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MergeSort {

    private static long swapCounter = 0;

    static long countInversions(int[] arr) {
        // Complete this function
        int[] tmp = new int[arr.length];
        swapCounter = 0;
        mergeSort(arr, tmp, 0, arr.length - 1);
        return swapCounter;
    }

    private static void mergeSort(int[] array, int[] tmp, int leftStart, int rightEnd)
    {
        if(leftStart >= rightEnd)
            return;

        int middle = (leftStart + rightEnd)/2;
        mergeSort(array, tmp, leftStart, middle);
        mergeSort(array, tmp, middle + 1, rightEnd);

        mergeHalves(array, tmp, leftStart, rightEnd);
    }

    private static void mergeHalves (int[] array, int[] tmp, int leftStart, int rightEnd)
    {
        int leftEnd = (rightEnd + leftStart)/2;
        int rightStart = leftEnd + 1;
        int left = leftStart;
        int right = rightStart;
        int index = leftStart;
        int size = rightEnd - leftStart +1;

        while((right <= rightEnd) && (left <= leftEnd)){

            if(array[left] <= array[right]){
                tmp[index] = array[left];
                left++;
            }
            else {
                tmp[index] = array[right];
                right++;
                swapCounter += leftEnd - left + 1;
            }
            index++;
        }

        if((leftEnd - left + 1) > 0) {
            System.arraycopy(array, left, tmp, index, leftEnd - left + 1);
            //swapCounter += leftEnd - left +1;
        }
        if((rightEnd - right + 1) > 0)
            System.arraycopy(array, right, tmp, index, rightEnd - right + 1);
        System.arraycopy(tmp, leftStart, array, leftStart, size);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            long result = countInversions(arr);
            System.out.println(result);
        }
        in.close();
    }
}

