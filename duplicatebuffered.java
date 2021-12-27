import java.io.*;
class duplicatebuffer
{ 
 public static void main(String args[])
  {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the value of n which you have to enter ");
   String n1=br.readLine();
   int n=int.parseInt(n1);
   int w=0,q=n;
   int z[]=new int[n];
   System.out.println("Enter the values ");
   for(int p=0;p<n;p++){
                   int g=int.parseInt(n1);
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