import java.util.*;
class task extends Thread
 {
   int id;
   //Scanner sc=new Scanner(System.in);
   //System.out.print("Enter Limit ");          error error: <identifier> expected
  // int b=sc.nextInt();                        error: illegal start of type
   int c=5000;
   public void run()
  {
    if(id==1)
     { 
           int total=c;
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
    if(id==2)
  {  int num=c;
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
    System.out.println("      "+temp);
    num--;     }
    n=temp;
    n++;
                                }
    }
                       
 }

   {
   int num=c;
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
     System.out.println("            "+temp);
     num--;
     }
    n=temp;
    n++;
    }
   }
  }
}
  


