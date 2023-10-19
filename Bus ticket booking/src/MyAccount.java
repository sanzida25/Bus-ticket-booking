import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.util.logging.*;
import java.io.File;
import java.io.FileNotFoundException;

public class MyAccount extends JFrame implements ActionListener {
	String path = "C:\\1 Nabiha\\JAVA\\files\\Student Information.txt";
	
	Container c = getContentPane();
	
	
	JLabel name;
	JLabel profile = new JLabel("Profile");
	JLabel mnum;
	JLabel email;
	JLabel bgimg = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\new.JPG")));
	
	
	JButton back = new JButton("Back");
	
	
	
	MyAccount(){
		this.setTitle("NFS Transport");
		this.setBounds(200,100,800,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\1 Nabiha\\JAVA\\Capture.JPG"));
		Initialize();
		addActionEvent();
	}
	public void Initialize(){
		c.setLayout(null);
		//lc.setBackground(new Color(26,33,105));
		//c.setBackground(Color.darkGray);
		
		
		back.setFont(new Font("Georgia", Font.BOLD, 12));
		back.setBounds(700, 30, 70, 25);
		//back.setForeground(new Color(75, 96, 112));
		back.setLayout(null);
		c.add(back);
		
		profile.setBounds(350,82,300,56);
		profile.setForeground(Color.white);
		profile.setFont(new Font("Osaka-Mono",Font.BOLD,30));
		profile.setHorizontalTextPosition(SwingConstants.CENTER);
		c.add(profile);

		ArrayList<String> s = new ArrayList<String>();
		String filePath = "C:\\1 Nabiha\\JAVA\\files\\Student Information.txt";
        File file = new File(filePath);
        Scanner scan;
		try {
			
			scan = new Scanner(file);
			while(scan.hasNext()) {
				s.add(scan.next());
        	}
		}catch(Exception e) {
    			
   			 e.printStackTrace();
   		}
		
		
		String n = s.get(0)+" "+s.get(1);
		String mob = s.get(2);
		String e = s.get(3);
		
		name = new JLabel("Name: "+n+" ");
		name.setBounds(100, 200, 900,32);
    	name.setForeground(Color.WHITE);
    	name.setFont(new Font("Georgia", Font.BOLD, 18));
    	c.add(name);
    	
    	
    	mnum = new JLabel("Mobile Number: "+mob);
		mnum.setBounds(100, 250, 900,32);
    	mnum.setForeground(Color.WHITE);
    	mnum.setFont(new Font("Georgia", Font.BOLD, 18));
    	c.add(mnum);
		
		email = new JLabel("Email: "+e);
		email.setBounds(100,300,364,29);
		email.setForeground(Color.white);
		email.setFont(new Font("Osaka-Mono",Font.BOLD,20));
		email.setHorizontalTextPosition(SwingConstants.CENTER);
		c.add(email);
		
		
		bgimg.setBounds(0,0,800,600);
		bgimg.setHorizontalAlignment(SwingConstants.CENTER);
		bgimg.setOpaque(true);
		c.add(bgimg);
		      
		
	}
	
	public void addActionEvent() {
		back.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == back) {
			this.setVisible(false);
			ProjectFrame p = new ProjectFrame();
			p.frame.setVisible(true);
		}
	} 
 } 
    
