
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;	

 class MyMain
{
	public static void main(String[] args) { 
	myUIClass1 obj = new myUIClass1();
	}
}

	
class myUIClass1
{
	 myUIClass1()
	 {	 
    JFrame f=new JFrame("My Frame 1");//creating instance of JFrame

JLabel l1=new JLabel("Hello from Frame 1");  
    l1.setBounds(50,175, 200,30);
	JButton b1=new JButton("Next");
 b1.setBounds(180,200,100, 40);
	
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
	f.setVisible(false);
	
	myUIClass2 obj = new myUIClass2();
		}
	});
	
	f.add(l1);
	f.add(b1);
    f.setSize(500,600);//400 width and 500 height  
    f.setLayout(null);//using no layout managers 
	
    f.setVisible(true);//making the frame visible 
	}
}




class myUIClass2
{
	 myUIClass2()
	 {	 
    JFrame f=new JFrame("My Frame 2");//creating instance of JFrame

JLabel l1=new JLabel("Hello from Frame 2");  
    l1.setBounds(50,175, 200,30);
	JButton b1=new JButton("Previous");
 b1.setBounds(180,200,100, 40);
	
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
	f.setVisible(false);
	myUIClass3 obj = new myUIClass3();
		}
	});
	
	f.add(l1);
	f.add(b1);
    f.setSize(500,600);//400 width and 500 height  
    f.setLayout(null);//using no layout managers 
	
    f.setVisible(true);//making the frame visible 
	}
}




// third one
class myUIClass3
{
	 myUIClass3()
	 {	 
    JFrame f=new JFrame("My Frame 1");//creating instance of JFrame

JLabel l1=new JLabel("Hello from Frame 3");  
    l1.setBounds(50,175, 200,30);
	JButton b1=new JButton("Next");
 b1.setBounds(180,200,100, 40);
	
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
	f.setVisible(false);
	
	myUIClass4 obj = new myUIClass4();
		}
	});
	
	f.add(l1);
	f.add(b1);
    f.setSize(500,600);//400 width and 500 height  
    f.setLayout(null);//using no layout managers 
	
    f.setVisible(true);//making the frame visible 
	}
}


// forth one


class myUIClass4
{
	 myUIClass4()
	 {	 
    JFrame f=new JFrame("My Frame 4");//creating instance of JFrame

JLabel l1=new JLabel("Hello from Frame 4");  
    l1.setBounds(50,175, 200,30);
	JButton b1=new JButton("Next");
 b1.setBounds(180,200,100, 40);
	
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
	f.setVisible(false);
	
	myUIClass5 obj = new myUIClass5();
		}
	});
	
	f.add(l1);
	f.add(b1);
    f.setSize(500,600);//400 width and 500 height  
    f.setLayout(null);//using no layout managers 
	
    f.setVisible(true);//making the frame visible 
	}
}

//fifth one

class myUIClass5
{
	 myUIClass5()
	 {	 
    JFrame f=new JFrame("My Frame 5");//creating instance of JFrame

JLabel l1=new JLabel("Hello from Frame 5");  
    l1.setBounds(50,175, 200,30);
	JButton b1=new JButton("Next");
 b1.setBounds(180,200,100, 40);
	
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
	f.setVisible(false);
	
	myUIClass1 obj = new myUIClass1();
		}
	});
	
	f.add(l1);
	f.add(b1);
    f.setSize(500,600);//400 width and 500 height  
    f.setLayout(null);//using no layout managers 
	
    f.setVisible(true);//making the frame visible 
	}
}