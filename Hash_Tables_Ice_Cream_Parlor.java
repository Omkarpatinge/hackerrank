import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
             int tempi=0,tempj=0,flag=0;
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            for( int i=0;i<n;i++)
                {
                for(int j=i+1;j<n;j++)
                    {
                    if(a[i]+a[j]==m)
                        {
                        tempi=i+1;
                        tempj=j+1;
                        flag=1;
                        break; 
                    }
                   
                }
                if(flag==1)
                    break;
            }
            System.out.print(tempi+" "+tempj+"\n");
           
        }
    }
}
