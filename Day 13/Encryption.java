/* Link: https://www.hackerrank.com/challenges/encryption/problem */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static String encryption(String s) {
        double sqr;
        int len=0,lb=0,ub=0;
        String res="";
        String str = s.replace(" ", "");
        len=str.length();
        sqr=Math.sqrt(len);
        lb=(int)Math.floor(sqr);
        ub=lb;

        if(lb*ub<len) {
            ub+=1;
        }
        
        char st[]=str.toCharArray();
        
        for(int i=0;i<ub;i++) {
            for(int j=i;j<len;j=j+ub) {
                res=res+st[j];
            }
            res+=" ";
        }
        
        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
