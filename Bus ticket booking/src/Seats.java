import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Seats extends JFrame implements ActionListener {

	JFrame seat = new JFrame("NFS Transport");
	JLabel cLabel = new JLabel("C");
	JLabel hLabel = new JLabel("H");
	JLabel o1Label = new JLabel("O");
	JLabel o2Label = new JLabel("O");
	JLabel sLabel = new JLabel("S");
	JLabel eLabel = new JLabel("E");
	JLabel s1Label = new JLabel("S");
	JLabel e2Label = new JLabel("E");
	JLabel aLabel = new JLabel("A");
	JLabel tLabel = new JLabel("T");
	
	/*JLabel a1 = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\!A1.JPG")));
	JLabel a2 = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\!A2.JPG")));
	JLabel a3 = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\!A3.JPG")));
	JLabel a4 = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\!A4.JPG")));
	JLabel b1 = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\!B1.JPG")));
	JLabel b2 = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\!B2.JPG")));
	JLabel b3 = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\!B3.JPG")));
	JLabel b4 = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\!B4.JPG")));
	JLabel c1 = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\!C1.JPG")));
	JLabel c2 = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\!C2.JPG")));
	JLabel c3 = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\!C3.JPG")));
	JLabel c4 = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\!C4.JPG")));
	JLabel d1 = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\!D1.JPG")));
	JLabel d2 = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\!D2.JPG")));
	JLabel d3 = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\!D3.JPG")));
	JLabel d4 = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\!D4.JPG")));*/
	
	static int s=0;
	
	JButton bkButton = new JButton("Back");
	JButton a1Button = new JButton((new ImageIcon("C:\\1 Nabiha\\JAVA\\A1.JPG")));
	JButton a2Button = new JButton((new ImageIcon("C:\\1 Nabiha\\JAVA\\A2.JPG")));
	JButton a3Button = new JButton((new ImageIcon("C:\\1 Nabiha\\JAVA\\A3.JPG")));
	JButton a4Button = new JButton((new ImageIcon("C:\\1 Nabiha\\JAVA\\A4.JPG")));
	JButton b1Button = new JButton((new ImageIcon("C:\\1 Nabiha\\JAVA\\B1.JPG")));
	JButton b2Button = new JButton((new ImageIcon("C:\\1 Nabiha\\JAVA\\B2.JPG")));
	JButton b3Button = new JButton((new ImageIcon("C:\\1 Nabiha\\JAVA\\B3.JPG")));
	JButton b4Button = new JButton((new ImageIcon("C:\\1 Nabiha\\JAVA\\B4.JPG")));
	JButton c1Button = new JButton((new ImageIcon("C:\\1 Nabiha\\JAVA\\C1.JPG")));
	JButton c2Button = new JButton((new ImageIcon("C:\\1 Nabiha\\JAVA\\C2.JPG")));
	JButton c3Button = new JButton((new ImageIcon("C:\\1 Nabiha\\JAVA\\C3.JPG")));
	JButton c4Button = new JButton((new ImageIcon("C:\\1 Nabiha\\JAVA\\C4.JPG")));
	JButton d1Button = new JButton((new ImageIcon("C:\\1 Nabiha\\JAVA\\D1.JPG")));
	JButton d2Button = new JButton((new ImageIcon("C:\\1 Nabiha\\JAVA\\D2.JPG")));
	JButton d3Button = new JButton((new ImageIcon("C:\\1 Nabiha\\JAVA\\D3.JPG")));
	JButton d4Button = new JButton((new ImageIcon("C:\\1 Nabiha\\JAVA\\D4.JPG")));
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seats s = new Seats();
	     s.seat.setVisible(true);
	     s.price();
	}
	
	public Seats(){
		seat.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\1 Nabiha\\JAVA\\Capture.JPG"));
		seat.setBounds(200, 100, 800, 600);
		seat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		seat.setResizable(false);
		
		Initialize();
		addActionEvent();
	}

	private void addActionEvent() {
		// TODO Auto-generated method stub
		a1Button.addActionListener(this);
		a2Button.addActionListener(this);
		a3Button.addActionListener(this);
		a4Button.addActionListener(this);
		b1Button.addActionListener(this);
		b2Button.addActionListener(this);
		b3Button.addActionListener(this);
		b4Button.addActionListener(this);
		c1Button.addActionListener(this);
		c2Button.addActionListener(this);
		c3Button.addActionListener(this);
		c4Button.addActionListener(this);
		d1Button.addActionListener(this);
		d2Button.addActionListener(this);
		d3Button.addActionListener(this);
		d4Button.addActionListener(this);
		bkButton.addActionListener(this);

	}

	private void Initialize() {
		// TODO Auto-generated method stub
		JPanel panel4 = new JPanel();
		seat.getContentPane().add(panel4, BorderLayout.CENTER);
		panel4.setLayout(null);
		
		cLabel.setBounds(380, 90, 250, 32);
    	cLabel.setForeground(new Color(206, 224, 237));
    	cLabel.setFont(new Font("Georgia", Font.BOLD, 26));
    	panel4.add(cLabel);
    	
    	hLabel.setBounds(378, 120, 250, 32);
    	hLabel.setForeground(new Color(206, 224, 237));
    	hLabel.setFont(new Font("Georgia", Font.BOLD, 26));
    	panel4.add(hLabel);
    	
    	o1Label.setBounds(380, 150, 250, 32);
    	o1Label.setForeground(new Color(206, 224, 237));
    	o1Label.setFont(new Font("Georgia", Font.BOLD, 26));
    	panel4.add(o1Label);
    	
    	o2Label.setBounds(380, 180, 250, 32);
    	o2Label.setForeground(new Color(206, 224, 237));
    	o2Label.setFont(new Font("Georgia", Font.BOLD, 26));
    	panel4.add(o2Label);
    	
    	sLabel.setBounds(381, 210, 250, 32);
    	sLabel.setForeground(new Color(206, 224, 237));
    	sLabel.setFont(new Font("Georgia", Font.BOLD, 26));
    	panel4.add(sLabel);
    	
    	eLabel.setBounds(379, 240, 250, 32);
    	eLabel.setForeground(new Color(206, 224, 237));
    	eLabel.setFont(new Font("Georgia", Font.BOLD, 26));
    	panel4.add(eLabel);
    	
    	s1Label.setBounds(380, 300, 250, 32);
    	s1Label.setForeground(new Color(206, 224, 237));
    	s1Label.setFont(new Font("Georgia", Font.BOLD, 26));
    	panel4.add(s1Label);
    	
    	e2Label.setBounds(378, 330, 250, 32);
    	e2Label.setForeground(new Color(206, 224, 237));
    	e2Label.setFont(new Font("Georgia", Font.BOLD, 26));
    	panel4.add(e2Label);
    	
    	aLabel.setBounds(377, 360, 250, 32);
    	aLabel.setForeground(new Color(206, 224, 237));
    	aLabel.setFont(new Font("Georgia", Font.BOLD, 26));
    	panel4.add(aLabel);
    	
    	tLabel.setBounds(378, 390, 250, 32);
    	tLabel.setForeground(new Color(206, 224, 237));
    	tLabel.setFont(new Font("Georgia", Font.BOLD, 26));
    	panel4.add(tLabel);
    	
    	/*s2Label.setBounds(378, 420, 250, 32);
    	s2Label.setForeground(new Color(206, 224, 237));
    	s2Label.setFont(new Font("Georgia", Font.BOLD, 26));
    	panel4.add(s2Label);*/
		
    	/*panel4.add(a1);
    	panel4.add(a2);
    	panel4.add(a3);
    	panel4.add(a4);
    	panel4.add(b1);
    	panel4.add(b2);
    	panel4.add(b3);
    	panel4.add(b4);
    	panel4.add(c1);
    	panel4.add(c2);
    	panel4.add(c3);
    	panel4.add(c4);
    	panel4.add(d1);
    	panel4.add(d2);
    	panel4.add(d3);
    	panel4.add(d4);*/
    	
    	seatButtons();
		panel4.add(a1Button);
		panel4.add(a2Button);
		panel4.add(a3Button);
		panel4.add(a4Button);
		panel4.add(b1Button);
		panel4.add(b2Button);
		panel4.add(b3Button);
		panel4.add(b4Button);
		panel4.add(c1Button);
		panel4.add(c2Button);
		panel4.add(c3Button);
		panel4.add(c4Button);
		panel4.add(d1Button);
		panel4.add(d2Button);
		panel4.add(d3Button);
		panel4.add(d4Button);
		
		bkButton.setFont(new Font("Georgia", Font.BOLD, 12));
		bkButton.setBounds(700, 30, 70, 25);
		bkButton.setLayout(null);
		panel4.add(bkButton);

		JLabel img4 = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\new.JPG")));
		img4.setHorizontalAlignment(SwingConstants.CENTER);
		img4.setBounds(-5, -2, 800, 600);
		panel4.add(img4);
	}
    public void seatButtons() {
    	a1Button.setFont(new Font("Georgia", Font.BOLD, 12));
		a1Button.setBounds(120, 50, 60, 80);
		
		a2Button.setFont(new Font("Georgia", Font.BOLD, 12));
		a2Button.setBounds(220, 50, 60, 80);
		
		a3Button.setFont(new Font("Georgia", Font.BOLD, 12));
		a3Button.setBounds(500, 50, 60, 80);
		
		a4Button.setFont(new Font("Georgia", Font.BOLD, 12));
		a4Button.setBounds(600, 50, 60, 80);
		
		b1Button.setFont(new Font("Georgia", Font.BOLD, 12));
		b1Button.setBounds(120, 170, 60, 80);
		
		b2Button.setFont(new Font("Georgia", Font.BOLD, 12));
		b2Button.setBounds(220, 170, 60, 80);
		
		b3Button.setFont(new Font("Georgia", Font.BOLD, 12));
		b3Button.setBounds(500, 170, 60, 80);
		
		b4Button.setFont(new Font("Georgia", Font.BOLD, 12));
		b4Button.setBounds(600, 170, 60, 80);
		
		c1Button.setFont(new Font("Georgia", Font.BOLD, 12));
		c1Button.setBounds(120, 290, 60, 80);
		
		c2Button.setFont(new Font("Georgia", Font.BOLD, 12));
		c2Button.setBounds(220, 290, 60, 80);
		
		c3Button.setFont(new Font("Georgia", Font.BOLD, 12));
		c3Button.setBounds(500, 290, 60, 80);
		
		c4Button.setFont(new Font("Georgia", Font.BOLD, 12));
		c4Button.setBounds(600, 290, 60, 80);
		
		d1Button.setFont(new Font("Georgia", Font.BOLD, 12));
		d1Button.setBounds(120, 410, 60, 80);
		
		d2Button.setFont(new Font("Georgia", Font.BOLD, 12));
		d2Button.setBounds(220, 410, 60, 80);
		
		d3Button.setFont(new Font("Georgia", Font.BOLD, 12));
		d3Button.setBounds(500, 410, 60, 80);
		
		d4Button.setFont(new Font("Georgia", Font.BOLD, 12));
		d4Button.setBounds(600, 410, 60, 80);
    }
    public void price() {
		BookRides b = new BookRides();
		int p;
		if(b.f==1) {
			if(b.t==2) {
				p=190;
				 try {
						FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
						fw.write("190");
						fw.close();
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
					}
			}
			else if(b.t==3) {
				p=100;
				try {
					FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
					fw.write("100");
					fw.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==4) {
				p=130;
				try {
					FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
					fw.write("130");
					fw.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==5) {
				p=80;
				try {
					FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
					fw.write("80");
					fw.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
		}
		else if(b.f==2) {
			if(b.t==1) {
				p=190;
				try {
					FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
					fw.write("190");
					fw.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				} 
			}
			else if(b.t==3) {
				p=140;
				try {
					FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
					fw.write("140");
					fw.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==4) {
				p=110;
				try {
					FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
					fw.write("110");
					fw.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==5) {
				p=180;
				try {
					FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
					fw.write("180");
					fw.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
		}
		else if(b.f==3) {
			if(b.t==1) {
				p=100;
				try {
					FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
					fw.write("100");
					fw.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==2) {
				p=140;
				try {
					FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
					fw.write("140");
					fw.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==4) {
				p=160;
				try {
					FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
					fw.write("160");
					fw.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==5) {
				p=100;
				try {
					FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
					fw.write("100");
					fw.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
		}
		else if(b.f==4) {
			if(b.t==1) {
				p=130;
				try {
					FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
					fw.write("130");
					fw.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==2) {
				p=110;
				try {
					FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
					fw.write("110");
					fw.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==3) {
				p=160;
				try {
					FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
					fw.write("160");
					fw.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==5) {
				p=190;
				try {
					FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
					fw.write("190");
					fw.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
		}
		else if(b.f==5) {
			if(b.t==1) {
				p=80;
				try {
					FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
					fw.write("80");
					fw.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==2) {
				p=180;
				try {
					FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
					fw.write("180");
					fw.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==3) {
				p=100;
				try {
					FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
					fw.write("100");
					fw.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==4) {
				p=190;
				try {
					FileWriter fw = new FileWriter("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
					fw.write("190");
					fw.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		}	
	}
    
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Seats ss = new Seats();
		if(e.getSource()==a1Button) {
			s=1;
			ss.price();
			seat.setVisible(false);
			ConfirmationWindow c = new ConfirmationWindow();
			c.Confirmation.setVisible(true);
		}
		else if(e.getSource()==a2Button) {
			s=2;ss.price();
			seat.setVisible(false);
			ConfirmationWindow c = new ConfirmationWindow();
			c.Confirmation.setVisible(true);
		}
		else if(e.getSource()==a3Button) {
			s=3;ss.price();
			seat.setVisible(false);
			ConfirmationWindow c = new ConfirmationWindow();
			c.Confirmation.setVisible(true);
		}
		else if(e.getSource()==a4Button) {
			s=4;ss.price();
			seat.setVisible(false);
			ConfirmationWindow c = new ConfirmationWindow();
			c.Confirmation.setVisible(true);
		}
		else if(e.getSource()==b1Button) {
			s=5;ss.price();
			seat.setVisible(false);
			ConfirmationWindow c = new ConfirmationWindow();
			c.Confirmation.setVisible(true);
		}
		else if(e.getSource()==b2Button) {
			s=6;ss.price();
			seat.setVisible(false);
			ConfirmationWindow c = new ConfirmationWindow();
			c.Confirmation.setVisible(true);
		}
		else if(e.getSource()==b3Button) {
			s=7;ss.price();
			seat.setVisible(false);
			ConfirmationWindow c = new ConfirmationWindow();
			c.Confirmation.setVisible(true);
		}
		else if(e.getSource()==b4Button) {
			s=8;ss.price();
			seat.setVisible(false);
			ConfirmationWindow c = new ConfirmationWindow();
			c.Confirmation.setVisible(true);
		}
		else if(e.getSource()==c1Button) {
			s=9;ss.price();
			seat.setVisible(false);
			ConfirmationWindow c = new ConfirmationWindow();
			c.Confirmation.setVisible(true);
		}
		else if(e.getSource()==c2Button) {
			s=10;ss.price();
			seat.setVisible(false);
			ConfirmationWindow c = new ConfirmationWindow();
			c.Confirmation.setVisible(true);
		}
		else if(e.getSource()==c3Button) {
			s=11;ss.price();
			seat.setVisible(false);
			ConfirmationWindow c = new ConfirmationWindow();
			c.Confirmation.setVisible(true);
		}
		else if(e.getSource()==c4Button) {
			s=12;ss.price();
			seat.setVisible(false);
			ConfirmationWindow c = new ConfirmationWindow();
			c.Confirmation.setVisible(true);
		}
		else if(e.getSource()==d1Button) {
			s=13;ss.price();
			seat.setVisible(false);
			ConfirmationWindow c = new ConfirmationWindow();
			c.Confirmation.setVisible(true);
		}
		else if(e.getSource()==d2Button) {
			s=14;ss.price();
			seat.setVisible(false);
			ConfirmationWindow c = new ConfirmationWindow();
			c.Confirmation.setVisible(true);
		}
		else if(e.getSource()==d3Button) {
			s=15;ss.price();
			seat.setVisible(false);
			ConfirmationWindow c = new ConfirmationWindow();
			c.Confirmation.setVisible(true);
		}
		else if(e.getSource()==d4Button) {
			s=16;ss.price();
			seat.setVisible(false);
			ConfirmationWindow c = new ConfirmationWindow();
			c.Confirmation.setVisible(true);
		}
		
		else if(e.getSource()==bkButton) {
			seat.setVisible(false);
			BookRides br = new BookRides();
			br.bookrides.setVisible(true);
		}
	}

}
