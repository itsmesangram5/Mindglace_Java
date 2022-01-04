import java .util.*;
class vector_demo
  {
  public static void main(String args[])
  {
     Vector v=new Vector();
     Scanner s=new scanner(System.in);

     System.out.println("Enter number of object=");
     int no=s.nextInt();
     for (int i=0; i<no;i++)
   }
     System.out.println("Enter object=");
       
     String item=s.next();
    v.addElement(item);
   }
     System.out.println("capacity="+v.capacity());
          System.out.println("size="v.size()); 
      v.removeElementAt(2);
      v.removeElementAt(3);
    System.out.println("Vector size="+v.size());
      v.insertElementAt("c++",2);
      System.out.println(v);  
      System.out.println();
   for (int i=0, i<v.size();i++)
       System.out.println(v.get(i)+" ");
    }
}