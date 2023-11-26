import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.util.*;
import java.awt.event.*;
class Page implements ActionListener
{
	Frame f,f1;
	JPanel p1,p2,p3,p4,p5,p6,p7,pcrop;
	JButton be,b1,b2,b3,b6,b7,b8,b9,b10,bok;
	JLabel img,img1,tips,l1,l2,l3,fl1,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
	JTextArea ta1;
	JTextField t1;
	Dimension ss;
	int h,w,t,d;
	String date;
	Choice c;
	Page()
	{
		date=new SimpleDateFormat("dd").format(new Date());
		d=Integer.parseInt(date);
		ss=Toolkit.getDefaultToolkit().getScreenSize();
		h=ss.height;
		w=ss.width;
		f=new Frame();
		f.setLayout(null);
		f.setBounds(0,0,w,h);
		f.setUndecorated(true);
		be=new JButton(new ImageIcon("close.png"));
		be.setBounds(w-30,0,30,30);
		f.add(be);
		be.addActionListener(this);
		
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(0,0,500,250);
		p1.setBackground(new Color(128,255,128));
		f.add(p1);
		l14=new JLabel("FORECAST");
		l14.setBounds(250,20,200,50);
		p1.add(l14);
		l14.setFont(new Font("Arial",Font.BOLD,28));
		l8=new JLabel("Chandigarh");
		l8.setBounds(25,20,150,50);
		p1.add(l8);
		l8.setFont(new Font("Arial",Font.BOLD,24));
		l8.setForeground(Color.gray);
		l9=new JLabel();
		l9.setBounds(25,60,150,50);
		p1.add(l9);
		l9.setFont(new Font("Arial",Font.PLAIN,18));
		l9.setForeground(Color.gray);
		l11=new JLabel();
		l11.setBounds(115,120,80,80);
		p1.add(l11);
		l11.setFont(new Font("Arial",Font.PLAIN,60));
		l12=new JLabel("°C");
		l12.setBounds(180,130,30,30);
		p1.add(l12);
		l12.setFont(new Font("Arial",Font.PLAIN,18));
		l13=new JLabel();
		l13.setBounds(300,120,150,100);
		p1.add(l13);
		l13.setFont(new Font("Arial",Font.PLAIN,18));
		l13.setForeground(Color.gray);
		if(d%2==0)
		{
			l10=new JLabel(new ImageIcon("sunny.jpg"));
			l10.setBounds(25,120,80,80);
			p1.add(l10);
			l9.setText("<html>Today<br>Sunny</html>");
			l11.setText("39");
			l13.setText("<html>Precipitation: 0%<br>Humidity: 21%<br>Wind: 14 km/h</html>");
		}
		else
		{
			l10=new JLabel(new ImageIcon("msunny.jpg"));
			l10.setBounds(25,120,80,80);
			p1.add(l10);
			l9.setText("<html>Today<br>Mostly Sunny</html>");
			l11.setText("38");
			l13.setText("<html>Precipitation: 0%<br>Humidity: 11%<br>Wind: 14 km/h</html>");
		}

		p2=new JPanel();
		p2.setLayout(null);
		p2.setBounds(500,0,w-500,250);
		p2.setBackground(new Color(255,137,81));
		f.add(p2);
		l5=new JLabel("CROP INFORMATION");
		l5.setBounds(250,20,320,50);
		p2.add(l5);
		l5.setFont(new Font("Arial",Font.BOLD,28));
		b6=new JButton("RICE");
		b6.setBounds(30,100,130,50);
		p2.add(b6);
		b6.setFont(new Font("Arial",Font.BOLD,20));
		b6.setBackground(Color.white);
		b6.setForeground(new Color(56,145,65));
		b6.addActionListener(this);
		b7=new JButton("TEA");
		b7.setBounds(180,100,130,50);
		p2.add(b7);
		b7.setFont(new Font("Arial",Font.BOLD,20));
		b7.setBackground(Color.white);
		b7.setForeground(new Color(56,145,65));
		b7.addActionListener(this);
		b8=new JButton("SUGAR CANE");
		b8.setBounds(330,100,170,50);
		p2.add(b8);
		b8.setFont(new Font("Arial",Font.BOLD,20));
		b8.setBackground(Color.white);
		b8.setForeground(new Color(56,145,65));
		b8.addActionListener(this);
		b9=new JButton("GROUNDNUTS");
		b9.setBounds(520,100,190,50);
		p2.add(b9);
		b9.setFont(new Font("Arial",Font.BOLD,20));
		b9.setBackground(Color.white);
		b9.setForeground(new Color(56,145,65));
		b9.addActionListener(this);
		b10=new JButton("OLIVES");
		b10.setBounds(730,100,130,50);
		p2.add(b10);
		b10.setFont(new Font("Arial",Font.BOLD,20));
		b10.setBackground(Color.white);
		b10.setForeground(new Color(56,145,65));
		b10.addActionListener(this);
		
		p3=new JPanel();
		p3.setLayout(null);
		p3.setBounds(0,250,w/2,300);
		p3.setBackground(new Color(59,59,59));
		f.add(p3);
		tips=new JLabel("<html>Tips on farming - <br><br>1. Have a long term vision<br>2. Set goals for your farm<br>3. Track money coming in and going out<br>4. Cost your own labour time and where to use it<br>5. Make use of available resources<br>6. Check the suitable conditions for the growth of crop<br>7. Develop successful habits</html>");
		tips.setBounds(30,20,350,250);
		tips.setForeground(new Color(128,255,128));
		tips.setFont(new Font("Arial",Font.PLAIN,18));
		p3.add(tips);
		img1=new JLabel(new ImageIcon("tips.jpg"));
		img1.setBounds(450,100,180,120);
		p3.add(img1);
		
		p4=new JPanel();
		p4.setLayout(null);
		p4.setBounds(w/2,250,w/2,300);
		f.add(p4);
		img=new JLabel(new ImageIcon("farm.jpg"));
		img.setBounds(0,0,w/2,300);
		p4.add(img);
		
		p5=new JPanel();
		p5.setLayout(null);
		p5.setBounds(0,550,w/3,h-550);
		p5.setBackground(new Color(255,255,79));
		f.add(p5);
		l2=new JLabel("<html>CHECK SUITABLE CROP<br>BASED ON TEMPERATURE</html>");
		l2.setBounds(80,20,300,50);
		p5.add(l2);
		l2.setFont(new Font("Arial",Font.BOLD,20));
		l3=new JLabel("Enter Temp. (in °C)");
		l3.setBounds(50,100,170,20);
		p5.add(l3);
		l3.setFont(new Font("Arial",Font.PLAIN,18));
		t1=new JTextField();
		t1.setBounds(250,100,100,20);
		p5.add(t1);
		t1.setFont(new Font("Arial",Font.PLAIN,18));
		b2=new JButton("Check");
		b2.setBounds(150,150,100,20);
		p5.add(b2);
		b2.setBackground(new Color(255,255,79));
		b2.addActionListener(this);
		
		p6=new JPanel();
		p6.setLayout(null);
		p6.setBounds(w/3,550,w/3,h-550);
		p6.setBackground(new Color(128,255,255));
		f.add(p6);
		
		p7=new JPanel();
		p7.setLayout(null);
		p7.setBounds(2*w/3,550,w/3,h-550);
		p7.setBackground(new Color(210,255,210));
		f.add(p7);
		l1=new JLabel("NOTES");
		l1.setBounds(170,20,100,50);
		p7.add(l1);
		l1.setFont(new Font("Arial",Font.BOLD,28));
		ta1=new JTextArea();
		ta1.setBounds(20,85,400,100);
		p7.add(ta1);
		ta1.setFont(new Font("Arial",Font.BOLD,18));
		b1=new JButton("Log out");
		b1.setBounds(350,190,100,20);
		p7.add(b1);
		b1.setBackground(new Color(210,255,210));
		b1.addActionListener(this);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object ob=e.getSource();
		if(ob==be)
		System.exit(0);
		else if(ob==b1)
		{
			f.dispose();
			Login call=new Login();
		}
		else if(ob==b2)
		temp();
		else if(ob==b3)
		f1.setVisible(false);
		else if(ob==b6 || ob==b7 || ob==b8 || ob==b9 || ob==b10)
		{
			p2.setVisible(false);
			crop(ob);
		}
		else if(ob==bok)
		{
			pcrop.setVisible(false);
			p2.setVisible(true);
		}
	}
	public void temp()
	{
		if(t1.getText().equals("")==false)
		t=Integer.parseInt(t1.getText());
		f1=new Frame();
		f1.setLayout(null);
		f1.setUndecorated(true);
		f1.setBounds(500,300,400,200);
		f1.setBackground(new Color(66,255,160));
		fl1=new JLabel("Suitable crops to grow are -");
		fl1.setBounds(20,20,300,25);
		f1.add(fl1);
		fl1.setFont(new Font("Arial",Font.BOLD,20));
		c=new Choice();
		c.setBounds(20,70,120,40);
		f1.add(c);
		b3=new JButton("Okay");
		b3.setBounds(40,130,80,20);
		f1.add(b3);
		b3.addActionListener(this);
		l4=new JLabel(new ImageIcon("thumb.jpg"));
		l4.setBounds(220,50,120,120);
		f1.add(l4);
		if(t>=20 && t<=21)
		c.add("Rice");
		if(t>=21 && t<=29)
		c.add("Tea");
		if(t>=32 && t<=38)
		c.add("Sugar Cane");
		if(t>=15 && t<=30)
		c.add("Groundnuts");
		if(t>=15 && t<=20)
		c.add("Olives");
		f1.setVisible(true);
	}
	public void crop(Object ob)
	{
		pcrop=new JPanel();
		pcrop.setLayout(null);
		pcrop.setBounds(500,0,w-500,250);
		pcrop.setBackground(new Color(255,137,81));
		f.add(pcrop);
		l6=new JLabel("RICE");
		pcrop.add(l6);
		l6.setFont(new Font("Arial",Font.BOLD,28));
		l6.setOpaque(true);
		l6.setBackground(Color.white);
		l6.setForeground(new Color(56,145,65));
		l7=new JLabel("HI");
		l7.setBounds(20,70,550,150);
		pcrop.add(l7);
		l7.setFont(new Font("Arial",Font.PLAIN,18));
		bok=new JButton("Okay");
		bok.setBounds(650,150,80,40);
		pcrop.add(bok);
		bok.setBackground(new Color(255,137,81));
		bok.addActionListener(this);
		if(ob==b6)
		{
			l6.setText("RICE");
			l6.setBounds(400,20,70,50);
			l7.setText("<html>Temperature - 20-27 degree Celsius<br>Minimum Rainfall - 115 cm<br>Soil - Fertile riverine alluvial soil is best for rice cultivation</html>");
		}
		else if(ob==b7)
		{
			l6.setText("TEA");
			l6.setBounds(400,20,70,50);
			l7.setText("<html>Temperature - Lowest 16, normally between 21-29 degree Celsius<br>Minimum Rainfall - 150-250 cm<br>Soil - Tea shrubs require fertile mountain soil mixed with lime and iron. the soil should be rich in humus.</html>");
		}
		else if(ob==b8)
		{
			l6.setText("SUGAR CANE");
			l6.setBounds(320,20,210,50);
			l7.setText("<html>Temperature - 32-38 degree Celsius<br>Minimum Rainfall - 110-150 cm<br>Soil - Sandy soils and clay looms</html>");
		}
		else if(ob==b9)
		{
			l6.setText("GROUNDNUTS");
			l6.setBounds(320,20,210,50);
			l7.setText("<html>Temperature - 15-30 degree Celsius<br>Minimum Rainfall - 60-110 cm<br>Soil - Groundnuts perfectly grow in a well-drained sandy loom, or sandy clay loam soil. Deep well drained soils with a pH of 6.5-7.0 and high fertility are ideal for groundnut.</html>");
		}
		else if(ob==b10)
		{
			l6.setText("OLIVES");
			l6.setBounds(380,20,110,50);
			l7.setText("<html>Temperature - 15-20 degree Celsius<br>Minimum Rainfall - Olive trees need a subtropical climate and do best with mild winters and long, warm and dry summers. They are sensitive to hard freezing environments.<br>Soil - Any commercial, well draining potting soil will be fine for an olive tree.</html>");
		}
	}
	public static void main(String z[])
	{
		new Page();
	}
}