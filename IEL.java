import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class IEL extends Frame
{
public static void main(String[] args)
{
ItemEventListener ie=new ItemEventListener();
}
Label l1=new Label("select your choice");
Label l2=new Label();
public ItemEventListener()
{
	super("Event handling");
	List l=new List();
	add(l1,BorderLayout.CENTER);
	add(l2,BorderLayout.SOUTH);
	l.add("Juice");
	l.add("Vegetables");
	l.add("fruits");
	l.add(medicines");
	l.addItemListener(new ItemListener()
	{
		public void itemStateChanged(ItemEvent te)
		{
			l1.setText("You have choosen"+te.getItem()+te.getItemSelectable());;
	}});
	addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent we){
			System.exit(0);
	}});
	add(l,BorderLayout.SOUTH);
	setSize(900,400);
	setVisible(true);
}
}
	

/*<Applet code = "IEL.class" width=900 Height=400>
</Applet>
*/