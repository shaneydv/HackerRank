/* Link: https://www.hackerrank.com/challenges/service-lane/problem */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        while(t-->0) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int min = Integer.MAX_VALUE;
            while(s<=e) {
                min = Math.min(min,arr[s]);
                s++;
            }
            System.out.println(min);
        }
    }
}
