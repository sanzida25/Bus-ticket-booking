import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Sign_Up extends JFrame implements ActionListener {
	String path = "C:\\1 Nabiha\\JAVA\\files\\Student Information.txt";
	
	Container sc= getContentPane();
	
	JLabel al= new JLabel("SIGN UP");
	JLabel dl= new JLabel("Already have an account?");
	JLabel fname= new JLabel("First Name");
	JLabel lname= new JLabel("Last Name");
	JLabel mnum= new JLabel("Mobile Number");
	JLabel id= new JLabel("Email");
	JLabel pass= new JLabel("Password");
	JLabel bgimg = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\buss.JPG")));
	

	JTextField st= new JTextField();
	JTextField pt= new JTextField();
	JTextField mb= new JTextField();
	JTextField ID= new JTextField();
	JPasswordField p= new JPasswordField();
	
	JCheckBox sp= new JCheckBox();
	
	JButton ca= new JButton("SUBMIT");
	JButton lb= new JButton("LOGIN");
	
	Sign_Up(){
		this.setTitle("NFS Transport");
		this.setBounds(200,100,800,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\1 Nabiha\\JAVA\\Capture.JPG"));
		
		Initialize();
		addActionEvent();
	}
	
	public void Initialize() {
		sc.setLayout(null);
		//sc.setBackground(new Color(26,33,105));
		sc.setBackground(Color.darkGray);
		
		al.setBounds(510,52,300,56);
		al.setForeground(Color.white);
		al.setFont(new Font("Osaka-Mono",Font.BOLD,30));
		al.setHorizontalTextPosition(SwingConstants.CENTER);
		sc.add(al);
		
		dl.setBounds(420,455,364,29);
		dl.setForeground(Color.white);
		dl.setFont(new Font("Osaka-Mono",Font.BOLD,15));
		dl.setHorizontalTextPosition(SwingConstants.CENTER);
		sc.add(dl);
		
		fname.setBounds(300,125,364,29);
		fname.setForeground(Color.white);
		fname.setFont(new Font("Osaka-Mono",Font.BOLD,20));
		fname.setHorizontalTextPosition(SwingConstants.CENTER);
		sc.add(fname);
		
		st.setBounds(420,120,312,37);
		st.setFont(new Font("Osaka-Mono",Font.PLAIN,15));
		st.setToolTipText("Enter First Name");
		sc.add(st);
		
		lname.setBounds(300,185,364,29);
		lname.setForeground(Color.white);
		lname.setFont(new Font("Osaka-Mono",Font.BOLD,20));
		lname.setHorizontalTextPosition(SwingConstants.CENTER);
		sc.add(lname);
	
		pt.setBounds(420,180,312,37);
		pt.setFont(new Font("Osaka-Mono",Font.PLAIN,15));
		pt.setToolTipText("Enter Last Name");
		sc.add(pt);
		
		id.setBounds(350,245,364,29);
		id.setForeground(Color.white);
		id.setFont(new Font("Osaka-Mono",Font.BOLD,20));
		id.setHorizontalTextPosition(SwingConstants.CENTER);
		sc.add(id);
		
		ID.setBounds(420,240,312,37);
		ID.setFont(new Font("Osaka-Mono",Font.PLAIN,15));
		ID.setToolTipText("Enter ID");
		sc.add(ID);
		
		mnum.setBounds(260,300,364,29);
		mnum.setForeground(Color.white);
		mnum.setFont(new Font("Osaka-Mono",Font.BOLD,20));
		mnum.setHorizontalTextPosition(SwingConstants.CENTER);
		sc.add(mnum);
		
		mb.setBounds(420,300,312,37);
		mb.setFont(new Font("Osaka-Mono",Font.PLAIN,15));
		mb.setToolTipText("Enter Mobile Number");
		sc.add(mb);
		
		pass.setBounds(300,365,364,29);
		pass.setForeground(Color.white);
		pass.setFont(new Font("Osaka-Mono",Font.BOLD,20));
		pass.setHorizontalTextPosition(SwingConstants.CENTER);
		sc.add(pass);
		
		p.setBounds(420,360,312,37);
		p.setFont(new Font("Osaka-Mono",Font.PLAIN,15));
		p.setToolTipText("Enter password");
		sc.add(p);
		
		sp.setBounds(750,364,30, 30);
		sp.setToolTipText("Show password");
		//sp.setBackground(new Color(26,33,105));
		sp.setBackground(Color.DARK_GRAY);
		sp.setOpaque(true);
		sc.add(sp);
		
		ca.setBounds(470,420,97,26);
		ca.setHorizontalTextPosition(SwingConstants.CENTER);
		ca.setVerticalTextPosition(SwingConstants.CENTER);
		ca.setFont(new Font("Palatino",Font.BOLD,17));
		ca.setBackground(Color.white);
		sc.add(ca);
		
		lb.setBounds(470,500,97,26);
	    lb.setHorizontalTextPosition(SwingConstants.CENTER);
		lb.setVerticalTextPosition(SwingConstants.CENTER);
		lb.setFont(new Font("Palatino",Font.BOLD,17));
		lb.setBackground(Color.white);
		sc.add(lb);
		
		bgimg.setBounds(0,-9,800,600);
		//im.setHorizontalAlignment(SwingConstants.CENTER);
		bgimg.setOpaque(true);
		sc.add(bgimg);
		
	}
	
	public void addActionEvent() {
		lb.addActionListener(this);
		ca.addActionListener(this);
		sp.addActionListener(this);
	}
	
	public boolean check(String ID) {
		String line;
		try {
			FileReader fr= new FileReader(path);
			BufferedReader br= new BufferedReader(fr);
			while((line = br.readLine())!=null) {
				if(ID.split("@")[0].equalsIgnoreCase(line.split(" ")[3].split("@")[0])) {
					return true;
				}
			}
		}
		catch(Exception ep) {
			System.out.println("ERROR 404! File-Not-Found, new created");
			//ep.printStackTrace();
		}
		return false;
			
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sp) {
			if(sp.isSelected()) {
					p.setEchoChar((char)0);
				}
				else{
					p.setEchoChar((char) 8226);
				}
		 }
		if(e.getSource() == lb) {
			this.setVisible(false);
			Log_In lg= new Log_In();
			lg.setVisible(true);	
		}
		if(e.getSource() == ca) {
			String line;
			try {
				if(!check(ID.getText())) {
					FileWriter fw = new FileWriter(path,true);
					st.write(fw);
					fw.write(" ");
					pt.write(fw);
					fw.write(" ");
					mb.write(fw);
					fw.write(" ");
					ID.write(fw);
					fw.write(" ");
					p.write(fw);
					fw.write("\n");
					//fw.write(st.write(fw)+" "+pt.write(fw)+" "+mb.write(fw)+" "+ID.write(fw)+" "+passwordField.write(fw)+"\n");
					fw.close();
					JOptionPane.showMessageDialog(null,"Account created! Login to continue","Confirmation",JOptionPane.WARNING_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Email already in use!","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}catch(Exception ep){
				ep.printStackTrace();
				System.out.println("Use another email");
			}
		}

	}

}
