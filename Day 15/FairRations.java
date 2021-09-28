/* Link: https://www.hackerrank.com/challenges/fair-rations/problem */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int bread = 0;
        for(int i=0; i<n-1; i++) {
            if(arr[i]%2!=0) {
                arr[i] += 1;
                arr[i+1] += 1;
                bread += 2;
            } 
        }
        
        if(arr[n-1]%2==0)
        System.out.println(bread);
        else
        System.out.println("NO");    
    }
}
