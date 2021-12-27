import java.util.*;
class duplicate
{ 
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the value of n which you have to enter ");
   int n=sc.nextInt();
   int w=0,q=n;
   int z[]=new int[n];
   System.out.println("Enter the values ");
   for(int p=0;p<n;p++){
                   z[p]=sc.nextInt();
                       }
                  
   for(int m=0;m<n;m++){
                for(int i=n-1;i>w;i--){
                                 if(z[m]==z[i]){
                                               System.out.println("Duplicate value is "+z[m]); 
                                               z[m]=0;
                                              }
                                     }
                w++;
                        }
   }
}