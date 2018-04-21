import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Ae extends Applet
{
Label l=new Label("Click here to submit");
public void init()
{
resize(250,500);
Button b=new Button("Submit");
add(b);
add(l);
Elistener lis=new Elistener();

b.addActionListener(lis);
setVisible(true);
}
class Elistener implements ActionListener
{
public void actionPerformed(ActionEvent ae)
{
l.setText(" button is pressed");
setBackground(Color.yellow);
}
}
}
/*<Applet code = "Ae.class" width=800 Height=500>
</Applet>
*/

