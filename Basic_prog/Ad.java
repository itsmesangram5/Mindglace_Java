class Ad
{
 void add(int a,int b)
{
    int c=a+b;
    System.out.println("Add="+c);
 }
}
 class B extends Ad
{
    void add(int a,int b)
  {
    System.out.println("a="+a);
     System.out.println("b="+b);
      super.add(a,b);

    
 }
 }
 class test
{
public static void main(String args[])
{
  B obj =new B();
  System.out.println(B.add(10,20));
  
}
}