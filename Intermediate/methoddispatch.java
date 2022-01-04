// refference object
class principal
{
  void show()
           {
            System.out.println("In Principal ");
            }
}
class professor extends principal
{
  void show()
           {
            System.out.println("In Professor ");
            }
}
class student extends professor
{
  void show()
           {
            System.out.println("In student ");
            }
}
class test
{
  public static void main(String args[])
  {
   principal obj1=new principal();
   professor obj2=new professor();
   student obj3=new student();
   principal ref;
   ref=obj1;
   ref.show();
   ref=obj2;
   ref.show();
   ref=obj3;
   ref.show();
   }
}