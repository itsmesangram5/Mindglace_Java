// Program to find maximum digit in the number
import java.util.*;
class Maxnum
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number ");
  int num=sc.nextInt();
  int temp=num;
  int max=(temp%10);
  while(temp>max)
          {
           if((temp%10)>max)
                      {
                       max=(temp%10);
                       }
           temp=(temp/10);
           }
  System.out.println("Maximum Digit in the Number "+num+" is '"+max+"'");
 }
}
