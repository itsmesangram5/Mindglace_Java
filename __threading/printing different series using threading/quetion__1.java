import java.util.*;
class quetion__1
     {
          public static void main(String args[])
          {
             task t1=new task();
             task t2=new task();
             task t3=new task();
             Scanner sc=new Scanner(System.in);
             System.out.print("Enter Limit ");          
             int h=sc.nextInt();
              t1.c=h;
              t2.c=h;
              t3.c=h;

              t1.id=1;
              t2.id=2;
              t3.id=3;
              t1.start();
              t2.start();
              t3.start();
    }
} 