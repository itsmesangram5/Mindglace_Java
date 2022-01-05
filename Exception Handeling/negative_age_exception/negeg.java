import java.util.*;
class negeg extends Exception
  {
     public static void main(String args[])
      {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age=");
        int a=sc.nextInt();
       try
         {
           if (a<=0)
            
             throw new negeg();
           else
             System.out.println("valid");
           }
            catch (negeg e)
           {
            System.out.print("invalid age");
     }
    }
}