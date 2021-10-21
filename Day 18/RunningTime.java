/* Link: https://www.hackerrank.com/challenges/runningtime/problem */

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int[] array = new int[s];
        for (int i = 0; i < s; i++) {
            array[i] = scan.nextInt(); 
        }
        insertionSort(array);
    }

    public static void insertionSort(int[] arr) {
        int shifts = 0;
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int value = arr[i];
            while (j >= 1 && arr[j-1] > value) {
                arr[j] = arr[j-1];
                j--;
                shifts++;
            }
            arr[j] = value;
        }
        System.out.println(shifts);
    }
    
}
