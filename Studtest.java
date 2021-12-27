import java.util.*;
class Studtest
{ 
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number of student marks you have to enter ");
   int n=sc.nextInt();
   Stud s[]=new Stud[n];
   for(int i=0;i<n;i++){
                    System.out.println("Student "+(i+1));
                    s[i]=new Stud();
                    s[i].get();
                    System.out.println("____________________\n");
                    s[i].percentage();
                   }
   for(int j=0;j<n;j++){
                    System.out.println("Student "+(j+1));
                    s[j].display();
                    s[j].pdisplay();
                    System.out.println("____________________\n");
                   }
   }
}