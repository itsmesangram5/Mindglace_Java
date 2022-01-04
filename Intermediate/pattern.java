//program to print a pattern using loop
import java.util.*;
class pattern
{
public static void main (String args[])
{  char ch[]={ '*','@','#','$','<','>'};
   for(int i=0;i<ch.length;i++)
   { for(int j=0;j<ch.length-i;j++)
     System.out.print(" ");
     for(int k=0;k<=i;k++)
     System.out.print(ch[k]+" ");
     System.out.print("\n");
                                }
}
}