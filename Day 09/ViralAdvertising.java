/* Link: https://www.hackerrank.com/challenges/strange-advertising/problem */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static int viralAdvertising(int n) {
    int[] liked = new int[n+1];
    int[] shared = new int[n+1];
    
    shared[1] = 5; liked[1] = 2;
    int sum = liked[1];
    
    for(int i=2; i<shared.length; i++) {
        shared[i] = (shared[i-1] / 2) * 3;
        liked[i] = shared[i] / 2;
        sum += liked[i];
    } 
    
    return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
