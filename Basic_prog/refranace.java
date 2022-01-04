class abc
{
  void show(int x,int y)
  {
    x++;
    y++;
 }
}
class xyz
{
 public static void main(String args[])
  {
   abc obj =new abc();
 
 System.out.println("x="+obj.x);
 System.out.println("y="+obj.y);
   
   obj.show(obj);
   System.out.println("x="+obj.x);
  System.out.println("y="+obj.y);
}
}
  