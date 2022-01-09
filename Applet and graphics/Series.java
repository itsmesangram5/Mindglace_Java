/*<html>
<applet code = "Series.class", 
height=300 width=300>
</applet>
</html>*/
 
import java.awt.*;
import java.applet.*;
public class Series extends Applet  
 {
  
   public void paint(Graphics g)
   {
     for(int i=1; i<=10; i++)
     {
       g.drawString(i+"" , 50*i,50);
     }
    }
}
   