import java.util.*;
class squarepatt
{
public static void main (String args[])
{  Scanner sc=new Scanner(System.in);
   System.out.print("Enter Number of STARS ");
   int n=sc.nextInt();
   for(int i=0;i<n;i++){
           if(i==0 || i==(n-1)){
                   for(int k=0;k<n;k++){
                         System.out.print("*"+" ");
                                        }
                   System.out.print("\n");
                            }
            else{
                   for(int j=0;j<n+1;j++)                          {
                            if(j==0 || j==(n-1) ){
                                  System.out.print("* ");
                                             }
                            else{
                                  System.out.print("  ");
                                }
                                                                 }
                   System.out.print("\n");
                  }
                       }
}
}