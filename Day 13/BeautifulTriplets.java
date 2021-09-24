/* Link: https://www.hackerrank.com/challenges/beautiful-triplets/problem */

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

    public static int beautifulTriplets(int d, List<Integer> a) {
    int[] arr = new int[a.size()];
    for(int i=0;i<a.size(); i++) {
        arr[i] = a.get(i);
    } 
    int ans = 0;
    int n = arr.length;
    for(int i = 0; i < n ; i++){ 
        int x = arr[i];
        if(Arrays.binarySearch(arr,x+d)>-1 && Arrays.binarySearch(arr,x+2*d)>-1)
        ans++;
        }
    return ans;
    }
       
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.beautifulTriplets(d, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
