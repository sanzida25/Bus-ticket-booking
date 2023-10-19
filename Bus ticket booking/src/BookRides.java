import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class BookRides extends JFrame implements ActionListener{

	static int d=0, time=0; 
	static int f=0, t=0;
	String path = "C:\\1 Nabiha\\JAVA\\files\\mybook.txt";
	JFrame bookrides;
	JLabel fromLabel = new JLabel("Choose Your Location: ");
	JLabel toLabel = new JLabel("Choose Your Destination: ");
	JLabel timeLabel = new JLabel("Choose Time: ");
	JLabel dateLabel = new JLabel("Choose Date: ");
	
	JButton fbasuButton = new JButton("Basundhara");
	JButton fdhanButton = new JButton("Dhanmondi");
	JButton fmirButton = new JButton("Mirpur");
	JButton framButton = new JButton("Rampura");
	JButton futtButton = new JButton("Uttara");
	JButton tbasuButton = new JButton("Basundhara");
	JButton tdhanButton = new JButton("Dhanmondi");
	JButton tmirButton = new JButton("Mirpur");
	JButton tramButton = new JButton("Rampura");
	JButton tuttButton = new JButton("Uttara");
	JButton am8Button = new JButton("8:00 AM");
	JButton am10Button = new JButton("10:00 AM");
	JButton pm12Button = new JButton("12:00 PM");
	JButton pm2Button = new JButton("2:00 PM");
	JButton pm4Button = new JButton("4:00 PM");
	JButton pm6Button = new JButton("6:00 PM");
	JButton d1Button = new JButton("Today");
	JButton d2Button = new JButton("Tomorrow");
	JButton bkButton = new JButton("Back");

	public static void main(String[] args) {
		
		 BookRides book = new BookRides();
	     book.bookrides.setVisible(true);
	}
	
	public BookRides() {
		
		bookrides = new JFrame("NFS Transport");
		bookrides.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\1 Nabiha\\JAVA\\Capture.JPG"));
		bookrides.setBounds(200, 100, 800, 600);
		bookrides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bookrides.setResizable(false);
		
		initialize();
		addActionEvent();
	}

	private void addActionEvent() {
		// TODO Auto-generated method stub
		fbasuButton.addActionListener(this);
		fdhanButton.addActionListener(this);
		fmirButton.addActionListener(this);
		framButton.addActionListener(this);
		futtButton.addActionListener(this);
		tbasuButton.addActionListener(this);
		tdhanButton.addActionListener(this);
		tmirButton.addActionListener(this);
		tramButton.addActionListener(this);
		tuttButton.addActionListener(this);
		am8Button.addActionListener(this);
		am10Button.addActionListener(this);
		pm12Button.addActionListener(this);
		pm2Button.addActionListener(this);
		pm4Button.addActionListener(this);
		pm6Button.addActionListener(this);
		d1Button.addActionListener(this);
		d2Button.addActionListener(this);
		bkButton.addActionListener(this);
	}

	private void initialize() {
		// TODO Auto-generated method stub
		JPanel panel1 = new JPanel();
		bookrides.getContentPane().add(panel1, BorderLayout.CENTER);
		panel1.setLayout(null);
		
		panel1.add(dateLabel);
    	panel1.add(fromLabel);
    	panel1.add(toLabel);
    	panel1.add(timeLabel);
    	
    	bkButton.setFont(new Font("Georgia", Font.BOLD, 12));
		bkButton.setBounds(700, 30, 70, 25);
		bkButton.setLayout(null);
		panel1.add(bkButton);
    	
    	dateLabel.setBounds(40, 20, 250, 32);
    	dateLabel.setForeground(new Color(206, 224, 237));
    	dateLabel.setFont(new Font("Georgia", Font.BOLD, 18));
    	panel1.add(dateLabel);
    	
    	d1Button.setFont(new Font("Georgia", Font.BOLD, 12));
		d1Button.setBounds(50, 70, 120, 28);
		d1Button.setLayout(null);
		panel1.add(d1Button);
		
		d2Button.setFont(new Font("Georgia", Font.BOLD, 12));
		d2Button.setBounds(190, 70, 120, 28);
		d2Button.setLayout(null);
		panel1.add(d2Button);
    	
    	panel1.add(am8Button);
    	panel1.add(am10Button);
    	panel1.add(pm12Button);
		panel1.add(pm2Button);
		panel1.add(pm4Button);
		panel1.add(pm6Button);
    	
		panel1.add(fbasuButton);
		panel1.add(fdhanButton);
		panel1.add(fmirButton);
		panel1.add(framButton);
		panel1.add(futtButton);

		panel1.add(tbasuButton);
		panel1.add(tdhanButton);
		panel1.add(tmirButton);
		panel1.add(tramButton);
		panel1.add(tuttButton);
		
		JLabel img1 = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\new.JPG")));
		img1.setHorizontalAlignment(SwingConstants.CENTER);
		img1.setBounds(-5, -2, 800, 600);
		panel1.add(img1);
		
	}

	public void time() {
		timeLabel.setBounds(40, 140, 250, 32);
    	timeLabel.setForeground(new Color(206, 224, 237));
    	timeLabel.setFont(new Font("Georgia", Font.BOLD, 18));
    	
		am8Button.setFont(new Font("Georgia", Font.BOLD, 12));
		am8Button.setBounds(50, 190, 120, 28);
		am8Button.setLayout(null);
		
		am10Button.setFont(new Font("Georgia", Font.BOLD, 12));
		am10Button.setBounds(190, 190, 120, 28);
		am10Button.setLayout(null);
		
		pm12Button.setFont(new Font("Georgia", Font.BOLD, 12));
		pm12Button.setBounds(330, 190, 120, 28);
		pm12Button.setLayout(null);
		
		pm2Button.setFont(new Font("Georgia", Font.BOLD, 12));
		pm2Button.setBounds(470, 190, 120, 28);
		pm2Button.setLayout(null);
		
		pm4Button.setFont(new Font("Georgia", Font.BOLD, 12));
		pm4Button.setBounds(610, 190, 120, 28);
		pm4Button.setLayout(null);
		
		pm6Button.setFont(new Font("Georgia", Font.BOLD, 12));
		pm6Button.setBounds(50, 230, 120, 28);
		pm6Button.setLayout(null);
	}
	public void Yourloc(ActionEvent e) {
	
		fromLabel.setBounds(40, 300, 250, 32);
    	fromLabel.setForeground(new Color(206, 224, 237));
    	fromLabel.setFont(new Font("Georgia", Font.BOLD, 18));
    	
    	fbasuButton.setFont(new Font("Georgia", Font.BOLD, 12));
		fbasuButton.setBounds(50, 350, 120, 28);
		fbasuButton.setLayout(null);
		
		fdhanButton.setFont(new Font("Georgia", Font.BOLD, 12));
		fdhanButton.setBounds(190, 350, 120, 28);
		fdhanButton.setLayout(null);
		
		fmirButton.setFont(new Font("Georgia", Font.BOLD, 12));
		fmirButton.setBounds(330, 350, 120, 28);
		fmirButton.setLayout(null);
		
		framButton.setFont(new Font("Georgia", Font.BOLD, 12));
		framButton.setBounds(470, 350, 120, 28);
		framButton.setLayout(null);
		
		futtButton.setFont(new Font("Georgia", Font.BOLD, 12));
		futtButton.setBounds(610, 350, 120, 28);
		futtButton.setLayout(null);	
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()== d1Button) {
			d=1;
			time(); 
		}
		else if(e.getSource()== d2Button) {
			d=2;
			time();
		}
		
		if(e.getSource()== am8Button) {
			time=1;
			Yourloc(e);
		}
		else if(e.getSource()== am10Button) {
			time=2;
			Yourloc(e);
		}
		else if(e.getSource()== pm12Button) {
			time=3;
			Yourloc(e);
		}
		else if(e.getSource()== pm2Button) {
			time=4;
			Yourloc(e);
		}
		else if(e.getSource()== pm4Button) {
			time=5;
			Yourloc(e);
		}
		else if(e.getSource()== pm6Button) {
			time=6;
			Yourloc(e);
		}
		if(e.getSource()== fbasuButton) {
			toLabel.setBounds(40, 420, 250, 32);
	    	toLabel.setForeground(new Color(206, 224, 237));
	    	toLabel.setFont(new Font("Georgia", Font.BOLD, 18));
	    	
			tdhanButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tdhanButton.setBounds(50, 470, 120, 28);
			tdhanButton.setLayout(null);
		
			tmirButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tmirButton.setBounds(190, 470, 120, 28);
			tmirButton.setLayout(null);
			
			tramButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tramButton.setBounds(330, 470, 120, 28);
			tramButton.setLayout(null);
			
			tuttButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tuttButton.setBounds(470, 470, 120, 28);
			tuttButton.setLayout(null);
			f=1;
		}
		else if(e.getSource()== fdhanButton) {
			toLabel.setBounds(40, 420, 250, 32);
	    	toLabel.setForeground(new Color(206, 224, 237));
	    	toLabel.setFont(new Font("Georgia", Font.BOLD, 18));
	    	
			tbasuButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tbasuButton.setBounds(50, 470, 120, 28);
			tbasuButton.setLayout(null);
			
			tmirButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tmirButton.setBounds(190, 470, 120, 28);
			tmirButton.setLayout(null);
			
			tramButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tramButton.setBounds(330, 470, 120, 28);
			tramButton.setLayout(null);
			
			tuttButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tuttButton.setBounds(470, 470, 120, 28);
			tuttButton.setLayout(null);
			f=2;
		}
		else if(e.getSource()== fmirButton) {
			toLabel.setBounds(40, 420, 250, 32);
	    	toLabel.setForeground(new Color(206, 224, 237));
	    	toLabel.setFont(new Font("Georgia", Font.BOLD, 18));
	    	
			tbasuButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tbasuButton.setBounds(50, 470, 120, 28);
			tbasuButton.setLayout(null);
			
			tdhanButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tdhanButton.setBounds(190, 470, 120, 28);
			tdhanButton.setLayout(null);
			
			tramButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tramButton.setBounds(330, 470, 120, 28);
			tramButton.setLayout(null);
			
			tuttButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tuttButton.setBounds(470, 470, 120, 28);
			tuttButton.setLayout(null);
			f=3;
		}
		else if(e.getSource()== framButton) {
			toLabel.setBounds(40, 420, 250, 32);
	    	toLabel.setForeground(new Color(206, 224, 237));
	    	toLabel.setFont(new Font("Georgia", Font.BOLD, 18));
	    	
			tbasuButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tbasuButton.setBounds(50, 470, 120, 28);
			tbasuButton.setLayout(null);
			
			tdhanButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tdhanButton.setBounds(190, 470, 120, 28);
			tdhanButton.setLayout(null);
			
			tmirButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tmirButton.setBounds(330, 470, 120, 28);
			tmirButton.setLayout(null);
			
			tuttButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tuttButton.setBounds(470, 470, 120, 28);
			tuttButton.setLayout(null);
			f=4;
		}
		else if(e.getSource()== futtButton) {
			toLabel.setBounds(40, 420, 250, 32);
	    	toLabel.setForeground(new Color(206, 224, 237));
	    	toLabel.setFont(new Font("Georgia", Font.BOLD, 18));
	    	
			tbasuButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tbasuButton.setBounds(50, 470, 120, 28);
			tbasuButton.setLayout(null);
			
			tdhanButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tdhanButton.setBounds(190, 470, 120, 28);
			tdhanButton.setLayout(null);
			
			tmirButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tmirButton.setBounds(330, 470, 120, 28);
			tmirButton.setLayout(null);
			
			tramButton.setFont(new Font("Georgia", Font.BOLD, 12));
			tramButton.setBounds(470, 470, 120, 28);
			tramButton.setLayout(null);
			f=5;
		}
		else if(e.getSource()==bkButton) {
			bookrides.setVisible(false);
			ProjectFrame f = new ProjectFrame();
			f.frame.setVisible(true);
		}
		else {
			method(e);
		}
	}
	private void method(ActionEvent e) {
		// TODO Auto-generated method stub
		
	    Seats s =new Seats();
		if(e.getSource()==tbasuButton) {  
			t=1;
			bookrides.setVisible(false);
			s.seat.setVisible(true);
		}
		else if(e.getSource()==tdhanButton) { 
			t=2;
			bookrides.setVisible(false);
			s.seat.setVisible(true);
		}
		else if(e.getSource()==tmirButton) { 
			t=3;
			bookrides.setVisible(false);
			s.seat.setVisible(true);
		}
		else if(e.getSource()==tramButton) {  
			t=4;
			bookrides.setVisible(false);
			s.seat.setVisible(true);
		}
		else if(e.getSource()==tuttButton) {  
			t=5;
			bookrides.setVisible(false);
			s.seat.setVisible(true);
		}
		
	}

}
