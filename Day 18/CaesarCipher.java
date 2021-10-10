/* Link: https://www.hackerrank.com/challenges/caesar-cipher-1/problem */

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
    
    static String caesarCipher(String s, int k) 
    {
        char[] arr = s.toCharArray();

        k = k%26;

        for(int i=0;i<arr.length;i++)
        {
            int num =0;
            int ch = (int)arr[i];

            if( ch >= 65 && ch <= 90 )
            {
                num = (int)arr[i] + k;
                if(num>90) num -= 26;
                arr[i] = (char)num;
            }
            else if( ch >= 97 && ch <= 122 )
            {
                num = (int)arr[i] + k;
                if(num>122) num -= 26;
                arr[i] = (char)num;
            }
        }

        return String.valueOf(arr);
    }
} 

   

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
