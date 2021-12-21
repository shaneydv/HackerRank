/* Link: https://www.hackerrank.com/challenges/countingsort1/problem */

import java.util.*;

public class CountingSort1 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i=0;
        ArrayList<Integer> al=new ArrayList<>();
        while(i<100)
        {
            int j=0;
            int count=0;
            while(j<arr.length)
            {
                if(arr[j]==i)
                {
                    count++;
                }
                j++;
            }
            al.add(count);
            i++;
        }
        ListIterator<Integer> li=al.listIterator();
        while(li.hasNext())
        {
            System.out.print(li.next()+" ");
        }
    }
}
