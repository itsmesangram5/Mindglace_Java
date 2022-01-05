import java.util.*;
class password extends Exception
{
  public static void main(String args[])
  {
    Scanner a=new Scanner(System.in);
    //System.out.print("length "+z); 
    int upper=0,lower=0,symbol=0,number=0;
    System.out.print(" Please Enter your Password\n  ");
    String b=a.nextLine();
    int z=b.length();
    if(z>=8)
            {
             //System.out.print(" in if else "); 
             for(int i=0;i<b.length();i++)
                      {
                       //System.out.print(" in loop "); 
                       char q=b.charAt(i);
                       int m=(int)q;
                       if(m>96 && m<123)
                          lower++;
                       if(m>64 && m<91)
                          upper++;
                       if(m>32 && m<48 && m==64)
                          symbol++;
                       if(m>47 && m<58)
                          number++;
                       }
            }
     else
         {
          System.out.print(" Your password is too short !!  ___Enter again "); 
          System.exit(1);
         }
     
     
     try
       {
        if(upper<=2 && lower<=2 && symbol<=2 && number<=2 )
                 throw new password();
        else
             System.out.print(" You Can Continue "); 
        }
     catch( password e )
          {
           System.out.print(" Your Password is so simple __please try again ");
          
          }
     
        
    
  }
}
 