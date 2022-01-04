package all ;
import java.util.*;
class series
{
   public static void prime(int q)
         { 
           int total=q;
           int n=2;
           for(int j=0;j<total;)
          {
           int div=0;
           for(int i=1;i<=n;i++)
            {
               if(n%i==0)
                  div++;      
            }
           if(div==2)
           {
              System.out.println(n);
              j++;
            }
          n++;
         }
       }

public static void arm(int t)
{  int num=t;
   while(num>0)
   {
   int z=0,number=5,q=0;
   for(int n=1;q<number;n++)    {
   String s1=n+"";   //define typing consting .... to string
   int digit=s1.length();  //define length
   int rem=0,sum=0,temp=n;
   while(n>0)
    {
    rem=n%10;
    sum=sum+(int)Math.pow(rem,digit);
    n=n/10;
    }
    if (sum==temp){
    System.out.println(temp);
    num--;     }
    n=temp;
    n++;
                                }
    }
                       
 }

public static void special(int p)
  {
   int num=p;
   int n=1;
   while(num>0)
   {
    int digit=0,add=0,multi=1,temp=n;
    while(n>0)
    { 
      digit=digit%10;
      add=add+digit;
      multi=multi*digit;
      n=n/10;
     }
    if(add==multi)
    {
     System.out.println(temp);
     num--;
     }
    n=temp;
    n++;
    }
   }
}

