/* Link: https://www.hackerrank.com/challenges/time-conversion/problem */

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

    public static String timeConversion(String s) {
        
    String str="";
    
    if(!s.substring(0,2).equals("12") && s.contains("PM")) {
        str = Integer.toString(Integer.parseInt(s.substring(0,2)) + 12);
        s = str + s.substring(2, s.length());
    }
    
    if(s.substring(0,2).equals("12") && s.contains("AM")) {
        str = "00";
        s = str + s.substring(2, s.length());
    }
    
    return s.substring(0, s.length()-2);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
