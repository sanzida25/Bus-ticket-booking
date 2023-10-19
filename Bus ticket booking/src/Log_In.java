import java.awt.Toolkit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Frame; 
import java.awt.Button; 
import java.awt.Color; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

public class Log_In extends JFrame implements ActionListener  {
	String path = "C:\\1 Nabiha\\JAVA\\files\\Student Information.txt";
	
	Container lc = getContentPane();
	
	JLabel al= new JLabel("LOGIN");
	JLabel id= new JLabel("Enter email");
	JLabel pass= new JLabel("Enter password");
	JLabel dl = new JLabel("Don't have an account?");
	JLabel bgimg = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\roads.JPG")));
	
	
	JTextField ut = new JTextField();
	JPasswordField p = new JPasswordField();
	
	JCheckBox sp = new JCheckBox();
	
	//JButton f= new JButton("Forgot password?");
	JButton l = new JButton("ENTER");
	JButton s = new JButton("SIGN UP");
	
	Log_In(){
		this.setTitle("NFS Transport");
		this.setBounds(200,100,800,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\1 Nabiha\\JAVA\\Capture.JPG"));
		Initialize();
		addActionEvent();
		}
	public void Initialize(){
		lc.setLayout(null);
		//lc.setBackground(new Color(26,33,105));
		lc.setBackground(Color.darkGray);
		
		al.setBounds(350,82,300,56);
		al.setForeground(Color.white);
		al.setFont(new Font("Osaka-Mono",Font.BOLD,30));
		al.setHorizontalTextPosition(SwingConstants.CENTER);
		lc.add(al);
		
		/*f.setBounds(320,380,175,29);
		f.setForeground(Color.DARK_GRAY);
		f.setFont(new Font("Osaka-Mono",Font.BOLD,15));
		f.setHorizontalTextPosition(SwingConstants.CENTER);
		lc.add(f);*/
		
		dl.setBounds(320,400,364,29);
		dl.setForeground(Color.white);
		dl.setFont(new Font("Osaka-Mono",Font.BOLD,15));
		dl.setHorizontalTextPosition(SwingConstants.CENTER);
		lc.add(dl);
		
		id.setBounds(170,185,364,29);
		id.setForeground(Color.white);
		id.setFont(new Font("Osaka-Mono",Font.BOLD,20));
		id.setHorizontalTextPosition(SwingConstants.CENTER);
		lc.add(id);
		
		ut.setBounds(300,185,312,37);
		ut.setFont(new Font("Osaka-Mono",Font.PLAIN,15));
		ut.setToolTipText("Enter ID");
		lc.add(ut);
		
		pass.setBounds(130,260,364,29);
		pass.setForeground(Color.white);
		pass.setFont(new Font("Osaka-Mono",Font.BOLD,20));
		pass.setHorizontalTextPosition(SwingConstants.CENTER);
		lc.add(pass);
	
		p.setBounds(300,258,314,37);
		p.setFont(new Font("Osaka-Mono",Font.PLAIN,15));
		p.setToolTipText("Enter password");
		lc.add(p);
		
		sp.setBounds(630, 260, 30, 30);
		sp.setToolTipText("Show password");
		//sp.setBackground(new Color(26,33,105));
		sp.setBackground(Color.darkGray);
		lc.add(sp);
		
		l.setBounds(350,320,97,26);
		l.setHorizontalTextPosition(SwingConstants.CENTER);
		l.setVerticalTextPosition(SwingConstants.CENTER);
		l.setFont(new Font("Palatino",Font.BOLD,17));
		lc.add(l);
		
		s.setBounds(350,450,115,29);
		s.setHorizontalTextPosition(SwingConstants.CENTER);
		s.setVerticalTextPosition(SwingConstants.CENTER);
		s.setFont(new Font("Palatino",Font.BOLD,17));
		lc.add(s);
		
		bgimg.setBounds(0,0,800,600);
		//bgimg.setHorizontalAlignment(SwingConstants.CENTER);
		bgimg.setOpaque(true);
		lc.add(bgimg);
		
	}
	public static void main(String[]args) {
		Log_In lg = new Log_In();
		lg.setVisible(true);
	}
	public void addActionEvent() {
		l.addActionListener(this);
		s.addActionListener(this);
		sp.addActionListener(this);
		//f.addActionListener(this);
		
	}
	static String email; 
	public void actionPerformed(ActionEvent e) {
		/*if(e.getSource() == f) {
			this.setVisible(false);
			p.setVisible(true);
			
		}*/
		if(e.getSource() == s) {
			this.setVisible(false);
			Sign_Up su = new Sign_Up();
			su.setVisible(true);
		}
		if(e.getSource() == sp) {
			if(sp.isSelected()) {
					p.setEchoChar((char)0);
				}
				else{
					p.setEchoChar((char) 8226);
				}
	
		 }
		if(e.getSource() == l) {
			String pass,line,fuserEmail,fpass,fuserID;
			boolean login = false;
			int i=0;
			
			email = ut.getText();
			pass =  p.getText();
		    try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			while((line = br.readLine()) != null) {
				fuserEmail = line.split(" ")[3];
				fpass = line.split(" ")[4];
				fuserID = fuserEmail.split("@")[0];
				if(fuserEmail.equalsIgnoreCase(email) && fpass.equalsIgnoreCase(pass)){
					login=true;
					this.setVisible(false);
					ProjectFrame f= new ProjectFrame();
					f.frame.setVisible(true);
					break;
				}else {
					i++;
				}
				if(!login) {
					if(i>0) {
						JOptionPane.showMessageDialog(null,"Incorrect password","Confirmation",JOptionPane.WARNING_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null,"Invalid email ","Confirmation",JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		}catch(Exception ep) {
			//System.out.print("Something went wrong");
			//ep.printStackTrace();
		}
	 }
  }	
}
