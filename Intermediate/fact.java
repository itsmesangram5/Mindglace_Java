// program to find factorial of s number
import java.util.*;
class fact
{
public static void main (String args[])
{  Scanner sc=new Scanner(System.in);
   System.out.print("Enter Limit ");
   int n=sc.nextInt();
   int r=facto(n);
   System.out.print("Factorial is  "+r);
 }
public static int facto( int n){
   if(n==1)
   return 1;
   else
   return n*facto(n-1);
      
                                }
}