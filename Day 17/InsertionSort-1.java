/* Link: https://www.hackerrank.com/challenges/insertionsort1/problem */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int remo = arr[n-1];
        
        for(int i = n-2 ; i>=0;i--){
            if(arr[i]>remo)
            {
                arr[i+1] = arr[i];
            }
            if(arr[i]<remo){
                arr[i+1] = remo;
                break;
            }
            for(int a : arr){
                System.out.print(a+" ");
                }
            System.out.println();
        }
        if(arr[0]>remo){
            arr[0] = remo;
        }

        for(int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}
