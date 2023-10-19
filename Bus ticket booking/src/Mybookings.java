import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Mybookings extends JFrame implements ActionListener{

	JFrame mybook = new JFrame("NFS Transport");;
	JLabel his;
	JLabel his1;
	JLabel his2;
	JLabel his3;
	JLabel nohis;
	
	JButton bkButton = new JButton("Back");
	JButton cancel = new JButton("Cancel");
	
    public Mybookings() {
		
		mybook.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\1 Nabiha\\JAVA\\Capture.JPG"));
		mybook.setBounds(200, 100, 800, 600);
		mybook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mybook.setResizable(false);
		
		initialize();
		addActionEvent();
	}

	private void addActionEvent() {
		// TODO Auto-generated method stub
		bkButton.addActionListener(this);
		cancel.addActionListener(this);
	}
	static ArrayList<String> all = new ArrayList<String>();
    static ArrayList<String> s = new ArrayList<String>();
    static ArrayList<String> s1 = new ArrayList<String>();
    static File f = new File("C:\\1 Nabiha\\JAVA\\files\\mybook.txt");
    static File f1 = new File("C:\\1 Nabiha\\JAVA\\files\\mybook2.txt");
    static String str, str1, str2, str3, strr, strr1, strr2, strr3;
    
	private void initialize() {
		// TODO Auto-generated method stub
		JPanel panel4 = new JPanel();
		CancelBooking cb = new CancelBooking();
		ConfirmationWindow w = new ConfirmationWindow();
		Log_In l = new Log_In();
		mybook.getContentPane().add(panel4, BorderLayout.CENTER);
		panel4.setLayout(null);
		if(cb.b1==false && w.c2==false) {
			Scanner scan;
			try {
				scan = new Scanner(f1);
				while(scan.hasNext()) {
					s1.add(scan.next());
	        	}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			strr = s1.get(0)+" "+s1.get(1);
			strr1 = s1.get(2)+" "+s1.get(3);
		    strr2 = s1.get(4)+" "+s1.get(5)+" "+s1.get(6)+" "+s1.get(7);
			strr3 = s1.get(8)+" "+s1.get(9)+"   "+s1.get(10)+" "+s1.get(11)+" "+s1.get(12)+"     "+s1.get(13)+" "+s1.get(14);
			his = new JLabel(strr);
			his.setBounds(100, 120, 900,32);
	    	his.setForeground(Color.WHITE);
	    	his.setFont(new Font("Georgia", Font.BOLD, 18));
	    	panel4.add(his);
	    	his1 = new JLabel(strr1);
			his1.setBounds(100, 150, 900,32);
	    	his1.setForeground(Color.WHITE);
	    	his1.setFont(new Font("Georgia", Font.BOLD, 18));
	    	panel4.add(his1);
	    	his2 = new JLabel(strr2);
			his2.setBounds(50, 200, 900,32);
	    	his2.setForeground(Color.WHITE);
	    	his2.setFont(new Font("Georgia", Font.BOLD, 18));
	    	panel4.add(his2);
	    	his3 = new JLabel(strr3);
			his3.setBounds(50, 250, 900,32);
	    	his3.setForeground(Color.WHITE);
	    	his3.setFont(new Font("Georgia", Font.BOLD, 18));
	    	panel4.add(his3);
		}
		else if(w.c1==false && cb.b1==true){
			Scanner scan;
			try {
				scan = new Scanner(f);
				while(scan.hasNext()) {
					s.add(scan.next());
	        	}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			str = s.get(0)+" "+s.get(1);
			str1 = s.get(2)+" "+s.get(3);
		    str2 = s.get(4)+" "+s.get(5)+" "+s.get(6)+" "+s.get(7);
			str3 = s.get(8)+" "+s.get(9)+"   "+s.get(10)+" "+s.get(11)+" "+s.get(12)+"     "+s.get(13)+" "+s.get(14);
			his = new JLabel(str);
			his.setBounds(100, 120, 900,32);
	    	his.setForeground(Color.WHITE);
	    	his.setFont(new Font("Georgia", Font.BOLD, 18));
	    	panel4.add(his);
	    	his1 = new JLabel(str1);
			his1.setBounds(100, 150, 900,32);
	    	his1.setForeground(Color.WHITE);
	    	his1.setFont(new Font("Georgia", Font.BOLD, 18));
	    	panel4.add(his1);
	    	his2 = new JLabel(str2);
			his2.setBounds(50, 200, 900,32);
	    	his2.setForeground(Color.WHITE);
	    	his2.setFont(new Font("Georgia", Font.BOLD, 18));
	    	panel4.add(his2);
	    	his3 = new JLabel(str3);
			his3.setBounds(50, 250, 900,32);
	    	his3.setForeground(Color.WHITE);
	    	his3.setFont(new Font("Georgia", Font.BOLD, 18));
	    	panel4.add(his3);
	    	cancel.setFont(new Font("Georgia", Font.BOLD, 15));
			cancel.setBounds(430, 300, 100, 25);
			cancel.setLayout(null);
			panel4.add(cancel);
		}
		else {
			nohis = new JLabel("No Bookings Yet");
			nohis.setBounds(100, 120, 900,32);
	    	nohis.setForeground(Color.WHITE);
	    	nohis.setFont(new Font("Georgia", Font.BOLD, 18));
	    	panel4.add(nohis);
		}
		bkButton.setFont(new Font("Georgia", Font.BOLD, 12));
		bkButton.setBounds(700, 30, 70, 25);
		bkButton.setLayout(null);
		panel4.add(bkButton);
		
		if(w.c2==false) {
			try {
				FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\allbookings.txt", true);
				    fw.write(l.email+" ");
					fw.write(strr+" ");
					fw.write(strr1+" ");
					fw.write(strr2+" ");
					fw.write(strr3+" ");
					fw.write("\n");
					fw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		JLabel img4 = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\new.JPG")));
		img4.setHorizontalAlignment(SwingConstants.CENTER);
		img4.setBounds(-5, -2, 800, 600);
		panel4.add(img4);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if(e.getSource()==bkButton) {
			mybook.setVisible(false);
			ProjectFrame f = new ProjectFrame();
			f.frame.setVisible(true);
		}
		else if(e.getSource()==cancel) {
			
			mybook.setVisible(false);
			CancelBooking f = new CancelBooking();
			f.bbook.setVisible(true);
		}
	}

}
