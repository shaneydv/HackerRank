/* Link: https://www.hackerrank.com/challenges/gem-stones/problem */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.next();
        }
        System.out.println(gemstones(arr, n));
    }
    
    public static int gemstones(String[] arr, int n) {
        int count = 0;
        for(int i=97; i<=122; i++) {
            char ch = (char)(i);
            for(int j=0; j<n; j++) {
                if(arr[j].indexOf(ch) == -1) {
                    break;
                } else if(j == n-1 && arr[j].indexOf(ch) != -1) {
                    count++;
                }
            }
        }
        return count;
    }
}
