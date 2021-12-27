import java.util.*;
class Studmax
{ 
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number of student marks you have to enter ");
   int n=sc.nextInt();
   Stud s[]=new Stud[n];
   for(int i=0;i<n;i++){
                    s[i]=new Stud();
                    s[i].get();
                    System.out.println("\n");
                   }
   double per[]=new double[n];
   double temp[]=new double[n];
   for(int j=0;j<n;j++){
                    per[j]=s[j].percentage();
                    temp[j]=s[j].percentage();
                   }
   Arrays.sort(temp);
   for(int j=0;j<n;j++){
                    if(temp[temp.length-1]==per[j]){        
                     System.out.println("The Imformation of Topper Student is ");
                     System.out.println("_________________\n");
                     s[j].display();
                     s[j].pdisplay();
                     System.out.println("_________________");
                                                   }
                   }
   }
}