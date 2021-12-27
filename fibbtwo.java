import java.util.*;
class fibbtwo
{
public static void main (String args[])
{  Scanner sc=new Scanner(System.in);
   System.out.print("Enter Limit ");
   int n=sc.nextInt();
   int f1=1;
   int f2=2;
   System.out.print(f1+" ");
   for(int i=1;i<n;i++)    {
   System.out.print(f2+" ");
   f1=f2;
   f2=f1*f1;
                         }
                       
 }

}