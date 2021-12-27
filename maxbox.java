import java.util.*;
class maxbox
{ 
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number of boxes you Want to Create ");
   int n=sc.nextInt();
   Box boxarr[]=new Box[n];
   int vol[]=new int[n];
   for(int i=0;i<n;i++){
                       boxarr[i]=new Box();
                       System.out.println("_____________________");
                       System.out.println("Box No."+(i+1));
                       boxarr[i].get();
                       vol[i]=boxarr[i].area();
                       System.out.println("_____________________");
                       }
   Arrays.sort(vol);
   int max=vol[vol.length-1];
   System.out.println("The maximum volume among the given boxes is "+max);
   }
}