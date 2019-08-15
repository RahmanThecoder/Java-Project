    import javax.swing.*;  
    class FirstSwingExample {  
    public static void main(String[] args) {  
    JFrame f=new JFrame("My Frame");//creating instance of JFrame  
              
    JButton b=new JButton("click");//creating instance of JButton  
    b.setBounds(180,100,100, 40);//x axis, y axis, width, height  
    JTextField t1;  
    t1=new JTextField();  
    t1.setBounds(50,50, 200,30); 
	JLabel l1,l2;  
    l1=new JLabel("First Label.");  
    l1.setBounds(50,25, 100,30);  
	f.add(l1);
	f.add(t1);
    f.add(b);//adding button in JFrame  
              
    f.setSize(500,600);//400 width and 500 height  
    f.setLayout(null);//using no layout managers  
    f.setVisible(true);//making the frame visible  
    }  
    }  