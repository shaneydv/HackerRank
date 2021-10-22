/* Link: https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem */

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

    public static String hackerrankInString(String s) {
    String str = "hackerrank";
    if (s.length() < str.length()) {
        return "NO";
    }
    int j=0;
    for(int i=0; i<s.length(); i++) {
        if(j<str.length() && s.charAt(i)==str.charAt(j)) {
            j++;
        }
    }
    return (j == str.length() ? "YES" : "NO");
    }
    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.hackerrankInString(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

