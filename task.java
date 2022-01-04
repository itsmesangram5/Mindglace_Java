import all.*;
class task extends Thread
 {
   int id;
   //Scanner sc=new Scanner(System.in);
   //System.out.print("Enter Limit ");          error error: <identifier> expected
  // int b=sc.nextInt();                        error: illegal start of type
   int c=5000;
   public void run()
  {
    if(id==1)
     {
      series.prime(c);
      }
    if(id==2)
    {
       series.arm(c);
      }
    if(id==3)
    {
      series.special(c);
      } 
  }
}
  


