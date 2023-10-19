import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Help extends JFrame implements ActionListener{

	Container c = getContentPane();
	
	JButton bkButton = new JButton("Back");
	JButton contactbutton = new JButton("Contact Us");
	JButton feedbackbutton = new JButton("Send Feedback");
	JButton privacybutton = new JButton("Privacy Policy");
	
	JLabel bgimg = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\new.JPG")));
	
    public Help() {
		
		this.setTitle("NFS Transport");
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\1 Nabiha\\JAVA\\Capture.JPG"));
		this.setBounds(200, 100, 800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		Initialize();
		addActionEvent();
	}

	public void addActionEvent() {
		// TODO Auto-generated method stub
		bkButton.addActionListener(this);
		contactbutton.addActionListener(this);
		feedbackbutton.addActionListener(this);
		privacybutton.addActionListener(this);
	}

	public void Initialize() {
		// TODO Auto-generated method stub
		c.setLayout(null);
		
		
		bkButton.setFont(new Font("Georgia", Font.BOLD, 12));
		bkButton.setBounds(700, 30, 70, 25);
		bkButton.setLayout(null);
		c.add(bkButton);
		
		contactbutton.setFont(new Font("Georgia", Font.BOLD, 28));
		contactbutton.setBounds(20, 210, 380, 37);
		contactbutton.setForeground(new Color(75, 96, 112));
		contactbutton.setLayout(null);
		c.add(contactbutton);
		
		feedbackbutton.setFont(new Font("Georgia", Font.BOLD, 28));
		feedbackbutton.setBounds(20, 260, 380, 37);
		feedbackbutton.setForeground(new Color(75, 96, 112));
		feedbackbutton.setLayout(null);
		c.add(feedbackbutton);
		
		privacybutton.setFont(new Font("Georgia", Font.BOLD, 28));
		privacybutton.setBounds(20, 310, 380, 37);
		privacybutton.setForeground(new Color(75, 96, 112));
		privacybutton.setLayout(null);
		c.add(privacybutton);
		
		
		bgimg.setBounds(0,0,800,600);
		//im.setHorizontalAlignment(SwingConstants.CENTER);
		bgimg.setOpaque(true);
		c.add(bgimg);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bkButton) {
			this.setVisible(false);
			ProjectFrame f = new ProjectFrame();
			f.frame.setVisible(true);
		}
		if(e.getSource()==contactbutton){
	
		    String s= "Hotline: 01700000000"+"\n"+"Email : support.nfstransportbd.com";
			JOptionPane.showMessageDialog(null,s,"CONTACT US",JOptionPane.PLAIN_MESSAGE);
	        
		}
		if(e.getSource() == feedbackbutton) {
			try {
				String line;
				FileWriter fr= new FileWriter("C:\\1 Nabiha\\JAVA\\files\\feedback.txt",true);
				fr.write(JOptionPane.showInputDialog(null,null,"Send FeedBack", JOptionPane.QUESTION_MESSAGE));
				fr.write("\n");
				fr.close();
				}catch(Exception x) {
					//System.out.println("error");
				}
		        
		}
		if(e.getSource()== privacybutton) {
				String h="By staying connected with us and agreeing to the privacy policy you are agreeing to this app storing your information."+"\n"+"We provide transportation services around several places around Dhaka with less than 200 taka."+"\n"+"Our goal is to ensure a safe and comfortable journey to our customers.";
				JOptionPane.showMessageDialog(null,h,"Privacy Policy",JOptionPane.INFORMATION_MESSAGE);
				
				}
		        
		
	}


}
