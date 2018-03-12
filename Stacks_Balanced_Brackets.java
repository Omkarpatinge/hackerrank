import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
     public static boolean isBalanced(String p) 
     {
         Stack<Character> stack = new Stack<Character>();
         char c;
         for(int i = 0; i< p.length(); ++i)
         {
             c = p.charAt(i);
             
             if(c == '(' || c == '{' || c == '[')
                 stack.push(c);
             else if(!stack.isEmpty() && (c == ')' || c == '}' || c == ']'))
             {
                 if(stack.peek() == check(c))
                     stack.pop();
                 else
                     return false;
             }
             else
                 return false;
         }
         return stack.isEmpty();
     }
    
    public static char check(char c)
    {
        switch (c)
            {
            case '}' : return '{';
            case ']' : return '[';
            case ')' : return '(';
            default: return '!';
                }
    }
  
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
             boolean answer = isBalanced(expression);
             if(answer)
              System.out.println("YES");
             else System.out.println("NO");
        }
    }
}
