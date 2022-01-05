/*
<html>
<applet code="lifecycle.class",
height=300 width=300>
</applet>
</html>
*/
import java.awt.*;
import java.applet.*;
class lifecycle extends Applet
{
 public void init()
  {
   System.out.println(" In init ");
  }
 public void start()
  {
   System.out.println(" In start ");
  }
  public void stop()
  {
   System.out.println(" In stop ");                      //sequence is not importantb or order is not important
  }
  public void paint(Graphics g)
  {
   System.out.println(" In paint ");
  }
  public void destroy()
  {
   System.out.println(" In detroy ");
  }
}