/* Link: https://www.hackerrank.com/challenges/migratory-birds/problem */ 

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(migratoryBirds(arr));
    }
    public static int migratoryBirds(int[] arr) {
        int n = arr.length;
        int[] ary = new int[n];

        for(int i = 0; i < n ; i++ ) {
            ary[arr[i]]++;
        }

        int max = 0,maxpos=0;
        for(int i = 0 ; i < n ; i++)
        {
            if(ary[i] > max)
            {
                max = ary[i];
                maxpos = i;
            }
        }
        return maxpos;
    }
}
