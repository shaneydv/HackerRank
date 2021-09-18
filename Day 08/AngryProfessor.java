/* Link: https://www.hackerrank.com/challenges/angry-professor/problem */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int[] arr = new int[n];
            int count = 0;
            
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] <= 0) count++;
            }
            
            if(count < k)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}
