//program to print fibbonecci series
import java.util.*;
class fibbthree
{
public static void main (String args[])
{  Scanner sc=new Scanner(System.in);
   System.out.print("Enter Limit ");
   int n=sc.nextInt();
   int f1=1;
   int f2=f1*f1;
   for(int i=0;i<n;i++)    {
   System.out.print(" "+f2);
   f1++;
   f2=f1*f1;
                         }
                       
 }

}