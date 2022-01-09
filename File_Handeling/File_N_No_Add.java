import java.io.*;

public class File_N_No_Add
{
  public static void main(String args[])
  											throws IOException
 {
     String fname,dname;

     int sum=0;

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

        sum+=Integer.parseInt(n1);
    }
       output.writeBytes(Integer.toString(sum));

		System.out.println("\nAddition Done !!");
       input.close();
      output.close();
  }
}

