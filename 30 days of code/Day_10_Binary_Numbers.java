import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack st=new Stack();
        while(n>0){
            st.push(n%2);
            n=n/2;
        }
        int count=0;
        int a[]=new int[100000];
        int c=0;
        while(!st.empty()){
            if(st.pop()==1)
                count++;
            else
                {
                a[c]=count;
                count=0;
                c++;
            }
                  }
        a[c]=count;
            c++;
  
        int j=a[0];
        for(int i=1;i<c;i++){
            if(j<a[i])
                {
                int temp=j;
                j=a[i];
                a[i]=temp;
            }
        }
        System.out.println(j);
    }
}
