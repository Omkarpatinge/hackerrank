import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            if(n==1)
                System.out.print("Not prime \n");
            else if(n==2 || n==3)
                System.out.print("Prime \n");
            
            else if(n%2==0){
                System.out.print("Not prime \n");
            continue;
        }
            else if(n%3==0)
                {
                System.out.print("Not prime \n");
            continue;
            }
            else
            { 
                int flag=0;// prime
              for(int i=2;(i*i)<=n;i++)
               {
                  if(n%i==0)
                  {
                      flag=1;//prime
                      break;
                  }
              }
              if(flag==0)
                  System.out.print("Prime \n");
                else
                    System.out.print("Not prime \n");
            }
                        
        }
        
        
    }
}
