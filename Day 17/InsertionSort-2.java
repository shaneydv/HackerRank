/* Link: https://www.hackerrank.com/challenges/insertionsort2/problem */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
    }
    
    public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
        int j = i;
        int val = arr[i];
        while (j >= 1 && arr[j-1] > val) {
            arr[j] = arr[j-1];
            j--;
        }
        arr[j] = val;
        printArray(arr);
        }
    }
    
    public static void printArray(int[] arr) {
        for(int i: arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
