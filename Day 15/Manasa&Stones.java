/* Link: https://www.hackerrank.com/challenges/manasa-and-stones/problem */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] arr = new int[n];
            int i,j,z;
            
            for(i=n-1,j=0; j<n; i--,j++) {
                arr[j] = (a*i) + (b*j);
            }
            
            for(i=0,z=0; i<n; i++) {
                if(arr[i] != 0) {
                    for(j=i+1; j<n; j++) {
                        if(arr[i] == arr[j])
                        arr[j] = 0;
                    }
                    arr[z] = arr[i];
                    z++;
                }
            }
            
            Arrays.sort(arr);
            for(int el: arr) {
                if(el != 0)
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }
}
