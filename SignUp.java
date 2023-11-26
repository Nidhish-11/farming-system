import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SignUp implements ActionListener
{
	Frame f;
	JLabel l1,l2,t1i,t2i,t3i,t4i,t5i,li;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,be,bl;
	SignUp()
	{
		f=new Frame("Login");
		f.setLayout(null);
		f.setBounds(390,160,640,500);
		f.setUndecorated(true);
		f.setBackground(new Color(0,206,206));
		be=new JButton(new ImageIcon("close.png"));
		be.setBounds(610,0,30,30);
		f.add(be);
		be.addActionListener(this);
		li=new JLabel(new ImageIcon("icon.png"));
		li.setBounds(275,30,80,80);
		f.add(li);
		l1=new JLabel("FARMING");
		l1.setBounds(250,140,150,25);
		l1.setForeground(Color.white);
		f.add(l1);
		l1.setFont(new Font("Badoni MT",Font.PLAIN,28));
		t1=new JTextField();
		t1.setBounds(90,220,190,40);
		f.add(t1);
		t1.setFont(new Font("Arial",Font.PLAIN,24));
		t1i=new JLabel(new ImageIcon("User.jpg"));
		t1i.setBounds(50,220,40,40);
		f.add(t1i);
		t2=new JTextField();
		t2.setBounds(90,280,190,40);
		f.add(t2);
		t2.setFont(new Font("Arial",Font.PLAIN,24));
		t2i=new JLabel(new ImageIcon("phone.png"));
		t2i.setBounds(50,280,40,40);
		f.add(t2i);
		t3=new JTextField();
		t3.setBounds(90,340,190,40);
		f.add(t3);
		t3.setFont(new Font("Arial",Font.PLAIN,24));
		t3i=new JLabel(new ImageIcon("pass.jpg"));
		t3i.setBounds(50,340,40,40);
		f.add(t3i);
		b1=new JButton(new ImageIcon("signup.jpg"));
		b1.setBounds(200,410,230,30);
		f.add(b1);
		l2=new JLabel("Sign Up for free");
		l2.setBounds(265,190,190,20);
		f.add(l2);
		t4=new JTextField();
		t4.setBounds(350,220,190,40);
		f.add(t4);
		t4.setFont(new Font("Arial",Font.PLAIN,24));
		t4i=new JLabel(new ImageIcon("aadhar.png"));
		t4i.setBounds(310,220,40,40);
		f.add(t4i);
		t5=new JTextField();
		t5.setBounds(350,280,190,40);
		f.add(t5);
		t5.setFont(new Font("Arial",Font.PLAIN,24));
		t5i=new JLabel(new ImageIcon("region.png"));
		t5i.setBounds(310,280,40,40);
		f.add(t5i);
		bl=new JButton("Login instead?");
		bl.setBounds(250,450,120,20);
		f.add(bl);
		bl.setForeground(Color.white);
		bl.setBackground(new Color(0,206,206));
		bl.addActionListener(this);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object ob=e.getSource();
		if(ob==be)
		System.exit(0);
		else if(ob==bl)
		{
			f.dispose();
			Login call=new Login();
		}
	}
	public static void main(String z[])
	{
		new SignUp();
	}
}