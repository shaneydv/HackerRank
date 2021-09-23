/* Link: https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<n; j++)
                {
                    int x = sc.nextInt();
                    a[i] += x;
                    b[j] += x;
                }
            }
            String pts = "Possible";
            for(int i=0;i<n;i++)
            {
                int j=0;
                for(j=i;j<n;j++)
                {
                    if(a[i] == b[j])
                    {
                        int temp = b[j];
                        b[j] = b[i];
                        b[i] = temp;
                        break;
                    }
                }
                if(j==n)
                {
                    pts = "Impossible";
                    break;
                }
            }
            System.out.println(pts);
        }
    }
}
