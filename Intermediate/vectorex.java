
import java.util.*;
class vectorex
{
public static void main(String args[])
 {  
  Vector v=new Vector();
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of object  ");
  int no=sc.nextInt();
  for(int i=0;i<no;i++)
  {
    System.out.println("Enter object  ");
    String item=sc.next();
    v.add(item);
   }
  System.out.println("Capacity="+v.capacity());
  System.out.println("Size  "+v.size());
  v.insertElementAt("c++",2);
  v.removeElementAt(2);
  System.out.println("Capacity="+v.capacity());
  System.out.println("Size  "+v.size());
  System.out.println(v);
  v.removeElementAt(3);
  System.out.println("Capacity="+v.capacity());
  System.out.println("Size  "+v.size());
  for(int i=0;i<v.size();i++)
    { 
      System.out.println(v.get(i)+" ");
    }
}
}