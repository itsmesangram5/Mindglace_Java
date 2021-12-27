import java.util.*;
class Stud
{
 int roll,mark1,mark2,mark3;
 String name;
 void get(){
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter your Roll number ");
            roll=sc.nextInt();
            System.out.println("Enter Marks of 1st Subject ");
            mark1=sc.nextInt();
            System.out.println("Enter Marks of 2nd Subject ");
            mark2=sc.nextInt();
            System.out.println("Enter Marks of 3st Subject ");
            mark3=sc.nextInt();
           }
  void display(){
            System.out.println(" Roll number is - "+roll);
            System.out.println(" Marks of 1st Subject is - "+mark1);
            System.out.println(" Marks of 2nd Subject is - "+mark2);
            System.out.println(" Marks of 3st Subject is - "+mark3);
                }
  double percentage(){
                   double p=(mark1+mark2+mark3)/3;
                   return p;
                  }
  void pdisplay(){
                  double p=(mark1+mark2+mark3)/3;
                  System.out.println("Percentage of the student is "+p+"%");
                  }
}