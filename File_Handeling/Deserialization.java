import java.io.*;
public class Deserialization
{
 public static void main(String args[])
   {
    try
       {
        FileIntputStream fileIn = new FileInputStream(fileIn);
        Employee emp1=(Employee)in.readObject();
        System.out.println("EID"+emp1.eid);
        System.out.println("Name "+emp1.name);
        in.close();
        fileIn.close();
       }
       catch(Exception e)
        {
        System.out.println("Filr not Found ");
        }
   }
}
        