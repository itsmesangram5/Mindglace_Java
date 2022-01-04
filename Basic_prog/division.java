
class division
{
  public static void main (String args[])
   {
     int a=50;
     if(a%3==0)
       {
         if(a%5==0)
            System.out.print("both");
        else
        System.out.print("only 3");
       }
     else 
        if (a%5==0)
        System.out.print("only 5");
         else
               System.out.print("not");
   }
}