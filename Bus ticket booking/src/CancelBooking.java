import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CancelBooking extends JFrame implements ActionListener{

	JFrame bbook = new JFrame("NFS Transport");;
	JLabel warning = new JLabel("You Cannot Cancel More Than Once. Proceed?");
	
	JButton con = new JButton("Confirm");
	JButton can = new JButton("Cancel");
	static boolean b1=true;
	
    public CancelBooking() {
		
    	bbook.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\1 Nabiha\\JAVA\\Capture.JPG"));
		bbook.setBounds(450, 250, 400, 200);
		bbook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bbook.setResizable(false);
		
		initialize();
		addActionEvent();
	}

	private void addActionEvent() {
		// TODO Auto-generated method stub
		con.addActionListener(this);
		can.addActionListener(this);
	}

	private void initialize() {
		// TODO Auto-generated method stub
		JPanel panelc = new JPanel();
		bbook.getContentPane().add(panelc, BorderLayout.CENTER);
		panelc.setLayout(null);
		
		warning.setBounds(25, 45, 400,32);
		warning.setForeground(Color.BLACK);
		warning.setFont(new Font("Georgia", Font.BOLD, 14));
		panelc.add(warning);
		
		con.setBounds(60, 100, 120, 28);
    	con.setForeground(Color.DARK_GRAY);
    	con.setFont(new Font("Georgia", Font.BOLD, 14));
    	panelc.add(con);
    	
    	can.setBounds(210, 100, 120, 28);
    	can.setForeground(Color.DARK_GRAY);
    	can.setFont(new Font("Georgia", Font.BOLD, 14));
    	panelc.add(can);
		
    	JLabel c = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\e.JPG")));
    	c.setHorizontalAlignment(SwingConstants.CENTER);
		c.setBounds(-3, -12, 400, 200);
		panelc.add(c);
	}
	static int n=0;
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==con) {
			b1=false; n=1;
			Mybookings m = new Mybookings();
			Log_In l = new Log_In();
			try {
				FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\allbookings.txt", true);
				    fw.write(l.email+" ");
					fw.write(m.str+" ");
					fw.write(m.str1+" ");
					fw.write(m.str2+" ");
					fw.write(m.str3+" ");
					fw.write("Cancelled ");
					fw.write("\n");
					fw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			bbook.setVisible(false);
			ProjectFrame f = new ProjectFrame();
			f.frame.setVisible(true);
		}
		if(e.getSource()==can && b1==true) {
			Mybookings m = new Mybookings();
			bbook.setVisible(false);
			m.mybook.setVisible(true);
		}
	}

}
