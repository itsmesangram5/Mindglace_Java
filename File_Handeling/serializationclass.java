import java.io.*;
 class Employee implements Serializable
{
public int eid;
public String name;
}
 public class serializationclass
{
 public static void main(String args[])throws Exception
{
  Employee emp = new Employee();
  emp.eid = 10;
  emp.name= "Sangram";
  FileOutputStream fileOut = new FileOutputStream("kkk.txt");
  ObjectOutputStream Out = new ObjectOutputStream(fileOut);
  Out.writeObject(emp);
  Out.close();
  fileOut.close();
  System.out.println("Data saved");
}
}