package mypackage;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;	

public class A{  
   {	 
    JFrame f=new JFrame("My Frame");//creating instance of JFrame
JTextField t1 =new JTextField();
JTextField t2=new JTextField();;
t1.setBounds(50,15, 100,30);
t2.setBounds(50,50, 100,30);
JLabel l1=new JLabel("My Result");  
    l1.setBounds(50,75, 100,30);
	JButton b1=new JButton("+");
 b1.setBounds(180,200,100, 40);
	
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
	String s1=t1.getText();//text box1 data store
	String s2=t2.getText();
	int a =Integer.parseInt(s1);
	int b =Integer.parseInt(s2);
	int c=a+b;
	String res = String.valueOf(c);
				l1.setText(res);
		}
	});
	
	f.add(b1);
	f.add(l1);
		f.add(t1);
	f.add(t2);
    f.setSize(500,600);//400 width and 500 height  
    f.setLayout(null);//using no layout managers 
	
    f.setVisible(true);//making the frame visible 
	}
}  

