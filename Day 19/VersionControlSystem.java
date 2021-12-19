/* Link: https://www.codechef.com/problems/VCS */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            for(int i=1; i<=n; i++) {
                arr[i-1] = i;
            }

            int[] a1 = new int[m];
            int[] a2 = new int[k];

            for(int i=0; i<m; i++) {
                a1[i] = sc.nextInt();
            }

            for(int j=0; j<k; j++) {
                a2[j] = sc.nextInt();
            }

            int c1 = 0;
            int c2 = 0;
            for(int i=0; i<m; i++) {
                if(isPresent(a2, a1[i])) {
                    c1++;
                }
            }
            for(int i=0; i<n; i++) {
                if(isPresent(a1, arr[i]) || isPresent(a2, arr[i])) {
                    continue;
                } else {
                    c2++;
                }
            }
            System.out.println(c1 + " " + c2);
        }
	}
	
	public static boolean isPresent(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
    
}