class abc
{
  void show(int x,int y)
  {
    x++;
    y++;
 }
}
class test
{
 public static void main(String args[])
  {
 int x=10,y=20;
 System.out.println("x="+x);
 System.out.println("y="+y);
   abc obj=new abc();
   obj.show(x,y);
   System.out.println("x="+x);
  System.out.println("y="+y);
}
}
  