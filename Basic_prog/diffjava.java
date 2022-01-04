import java.util.*;
class diffjava
{
 public static void main (String args[])
   {
     int a[]={7,9,12,19,8,3,13};
     
     Arrays.sort(a);
        
       System.out.println("ans="+(a[a.length-1]-a[0]));
   }
  }