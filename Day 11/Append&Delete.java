/* Link: https://www.hackerrank.com/challenges/append-and-delete/problem */

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

    public static String appendAndDelete(String s, String t, int k) {

    if(k >= s.length()+t.length()) {
        return "Yes";
    }
    
    int sIndex=0, tIndex=0;
    
    while(sIndex<s.length() && tIndex<t.length()) {
        if(s.charAt(sIndex) == t.charAt(tIndex)) {
            sIndex++;
            tIndex++;
        } else {
            break;
        }
    }
    
    int minOp = 0;
    minOp = s.length()-sIndex + t.length()-tIndex;
    
    if(k < minOp) {
        return "No";
    }
    
    if((k-minOp)%2 == 0) {
        return "Yes";
    }
    
    return "No";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
