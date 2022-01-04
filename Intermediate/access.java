//Access Specifiers
class A
{ 
  int x=10;
  private int y=20;     
                  }
}
piblic class B extends A
{ int z=30;  
                  }
}
class test
{ 
public static void main (String args[])
{
B obj=new B();
System.out.println(obj.x);
System.out.println(obj.y);
System.out.println(obj.z);
}
}