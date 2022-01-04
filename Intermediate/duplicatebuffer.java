//program to find duplicate valus in array using BufferedReader class
import java.io.*;
class duplicatebuffer
{ 
 public static void main(String args[]) throws Exception
  {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the value of n which you have to enter ");
   String r=br.readLine();
   int n=Integer.parseInt(r);
   int w=0,q=n;
   int z[]=new int[n];
   System.out.println("Enter the values ");
   for(int p=0;p<n;p++){
                   String g1=br.readLine();
                   int g=Integer.parseInt(g1);
                   z[p]=g;
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