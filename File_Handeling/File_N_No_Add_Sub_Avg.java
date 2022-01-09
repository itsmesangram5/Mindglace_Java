import java.io.*;

public class File_N_No_Add_Sub_Avg
{
  public static void main(String args[])
  											throws IOException
 {
     String fname,dname;

     int add=0,sub=0,avg=0,total=0;

	 BufferedReader in=new BufferedReader
	                                   (new InputStreamReader(System.in));

	 System.out.println("\nEnter Input File: ");
	 fname = in.readLine();

	 System.out.println("\nEnter Output File: ");
	 dname = in.readLine();

     DataInputStream input =new DataInputStream
                                        (new FileInputStream(fname));

     DataOutputStream output = new DataOutputStream
                                        (new FileOutputStream(dname));

	while(true)
	{
	    String n1=input.readLine();

	    if(n1==null)
	     break;

        add+=Integer.parseInt(n1);
        sub-=Integer.parseInt(n1);
        total++;
    }
       avg=add/total;

       output.writeBytes(Integer.toString(add));
       output.writeBytes("       ");
       output.writeBytes(Integer.toString(sub)+"     \n");
       output.writeBytes(Integer.toString(avg)+"     \n");

       System.out.println("\nAdd="+add);
       System.out.println("\nSub="+sub);
       System.out.println("\nAvg="+avg);

		System.out.println("\nOutput Write Done !!");
       input.close();
       output.close();
  }
}

