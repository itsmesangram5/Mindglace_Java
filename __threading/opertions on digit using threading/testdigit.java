import java.util.*;
class testdigit
{
 public static void main(String args[]) //throws Exception -----if somebody passe negative value in t[i].sleep();
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter No ");
   int n=sc.nextInt();
   digitoperation t[]=new digitoperation[4];
   for(int i=0;i<4;i++)
    {
     t[i]=new digitoperation();
     t[i].id=i;
     t[i].no=n;
     // t[i].sleep(1000); If you want otput not at atime ie. want delay after one task  
     t[i].start();
      }
   }
}