// program to add two numbers and modify the existing method
class A
{ void add(int a,int b){
                    int c=a+b;
                    System.out.print("Add ="+c);     
                  }
}
class B extends A
{ void add(int a,int b){
                    System.out.println(a);  
                    System.out.println(b);  
                    add(a,b);  
                  }
}
class test
{ 
public static void main (String args[])
{
B obj=new B();
obj.add(10,20);
}
}