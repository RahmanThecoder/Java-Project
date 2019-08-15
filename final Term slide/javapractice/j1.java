import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



class button{
	public static void main(String[] args)
	{
		
	Myclass4 obj=new Myclass4();
}
}
	
	class Myclass4{
		Myclass4()
		{
			JFrame f=new JFrame("myframe");
			JTextField y=new JTextField();
			JTextField y2=new JTextField();			
			y.setBounds(50,15, 100, 30);
			y2.setBounds(50,50, 100,30);
			JLabel k1=new JLabel ("my label above");
			k1.setBounds(50,75, 100,30);
			JButton h1=new JButton("+");
			h1.setBounds(180,200,100,40);
			
			h1.addActionListener(new ActionListener()
			
			{
				public void actionPerformed(ActionEvent e)
				{
				String s1=y.getText();
				String s2= y2.getText();
				int a = Integer.parseInt(s1);
				int b = Integer.parseInt(s2);
				
				int c= a+b;
				String resultt =String.valueOf(c);
				k1.setText(resultt);
			
			}
		
			});
			f.add(h1);
			f.add(k1);
			f.add(y);
			f.add(y2);
			f.setSize(500,600);
			f.setLayout(null);
			f.setVisible(true);
			
			
		}
	}
		