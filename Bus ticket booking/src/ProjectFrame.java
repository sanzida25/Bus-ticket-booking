import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ProjectFrame extends JFrame implements ActionListener{
 
	JFrame frame = new JFrame("NFS Transport");
	JButton rideButton = new JButton("Book Rides");
    JButton mybButton = new JButton("My Bookings");
    JButton accButton = new JButton("My Account");
    JButton helpButton = new JButton("Help");
    JButton logoutButton = new JButton("Log out");

	public ProjectFrame() {
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\1 Nabiha\\JAVA\\Capture.JPG"));
		frame.setBounds(200, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		initialize();
		addActionEvent();
	}
	public void initialize() {
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		rideButton.setFont(new Font("Georgia", Font.BOLD, 28));
		rideButton.setBounds(20, 210, 380, 37);
		rideButton.setForeground(new Color(75, 96, 112));
		rideButton.setLayout(null);
		panel.add(rideButton);
		
		mybButton.setFont(new Font("Georgia", Font.BOLD, 28));
		mybButton.setBounds(20, 260, 380, 37);
		mybButton.setForeground(new Color(75, 96, 112));
		mybButton.setLayout(null);
		panel.add(mybButton);
		
		accButton.setFont(new Font("Georgia", Font.BOLD, 28));
		accButton.setBounds(20, 310, 380, 37);
		accButton.setForeground(new Color(75, 96, 112));
		accButton.setLayout(null);
		panel.add(accButton);
		
		helpButton.setFont(new Font("Georgia", Font.BOLD, 28));
		helpButton.setBounds(20, 360, 380, 37);
		helpButton.setForeground(new Color(75, 96, 112));
		helpButton.setLayout(null);
		panel.add(helpButton);
		
		logoutButton.setFont(new Font("Georgia", Font.BOLD, 14));
		logoutButton.setBounds(650, 20, 90, 20);
		logoutButton.setForeground(new Color(75, 96, 112));
		logoutButton.setLayout(null);
		panel.add(logoutButton);
		
		JLabel bimg = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\NFS.JPG")));
		bimg.setHorizontalAlignment(SwingConstants.CENTER);
		bimg.setBounds(-3, -1, 800, 600);
		panel.add(bimg);
		
	}
 
	public void addActionEvent() {
		rideButton.addActionListener(this);
		mybButton.addActionListener(this);
		helpButton.addActionListener(this);
		accButton.addActionListener(this);
		logoutButton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== rideButton) {
			frame.setVisible(false);
			BookRides ride = new BookRides();
			ride.bookrides.setVisible(true);
		}
		else if(e.getSource()== helpButton) {
			frame.setVisible(false);
			Help h = new Help();
			h.setVisible(true);
		}
		else if(e.getSource()== mybButton) {
			frame.setVisible(false);
			Mybookings m = new Mybookings();
			m.mybook.setVisible(true);
		}
		else if(e.getSource()==accButton) {
			MyAccount acc = new MyAccount();
			frame.setVisible(false);
			acc.setVisible(true);
		}
		else if(e.getSource()== logoutButton) {
			try {
			    FileWriter fwOb = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\mybook.txt", false); 
		        BufferedWriter pwOb = new BufferedWriter(fwOb);
		        pwOb.flush();
		        pwOb.close();
		        fwOb.close();
			    }catch(Exception ep) {
			    	//System.out.println("Error");
			    }
			try {
			    FileWriter fwOb = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\mybook2.txt", false); 
		        BufferedWriter pwOb = new BufferedWriter(fwOb);
		        pwOb.flush();
		        pwOb.close();
		        fwOb.close();
			    }catch(Exception ep) {
			    	//System.out.println("Error");
			    }
			frame.setVisible(false);
		}
	}
}
