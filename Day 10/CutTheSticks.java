/* Link: https://www.hackerrank.com/challenges/cut-the-sticks/problem */

import java.util.*;

public class CutTheSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(n);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                System.out.println(arr.length - i);
            }
        }
    }
}
