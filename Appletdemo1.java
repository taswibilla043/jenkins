import java.applet.*;
import java.awt.*;

/*<applet code="Appletdemo1.class" width="300" height="300">
</applet>*/
public class Appletdemo1 extends Applet
{
public void paint(Graphics g)
{
g.drawString("Hello World!",100,150);
g.drawLine(150,300,250,300);
g.drawLine(175,350,175,550);
g.drawOval(200,400,100,150);
g.drawOval(300,350,200,200);
}
}
