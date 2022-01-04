// program to demonstrate interface
interface abc 
 {
  void show();
}
class xyz implements abc 
{
 void show()
{
 System.out.println("In show");
}
}
class test
 {
  public static void main(String args[])
  {
   xyz obj=new xyz();
   obj.show();
   }
}