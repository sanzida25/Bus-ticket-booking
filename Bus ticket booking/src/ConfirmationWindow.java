import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ConfirmationWindow extends JFrame implements ActionListener {

	JFrame Confirmation;
	
	JLabel priceLabel = new JLabel("Ticket Price: ");
	JLabel tkLabel;
	
	JButton confirmButton = new JButton("Confirm");
	JButton cancelButton = new JButton("Cancel");
	
    public ConfirmationWindow() {
		
		Confirmation = new JFrame("NFS Transport");
		Confirmation.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\1 Nabiha\\JAVA\\Capture.JPG"));
		Confirmation.setBounds(450, 250, 400, 200);
		Confirmation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Confirmation.setResizable(false);
		
		Initialize();
		addActionEvent();
	}
	
	private void Initialize() {
		// TODO Auto-generated method stub
		JPanel panel5 = new JPanel();
		Confirmation.getContentPane().add(panel5, BorderLayout.CENTER);
		panel5.setLayout(null);
		BookRides brr = new BookRides();
		
    	panel5.add(confirmButton);
    	panel5.add(cancelButton);
    	
    	Seats se = new Seats();
    	priceLabel.setBounds(90, 45, 370,32);
    	priceLabel.setForeground(Color.DARK_GRAY);
    	priceLabel.setFont(new Font("Georgia", Font.BOLD, 18));
    	panel5.add(priceLabel);
    	
    	ArrayList<String> s = new ArrayList<String>();
		File f = new File("C:\\1 Nabiha\\JAVA\\files\\TK.txt");
        	Scanner scan;
			try {
				scan = new Scanner(f);
				while(scan.hasNext()) {
					s.add(scan.nextLine());
	        	}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String str = s.get(0);
			tkLabel = new JLabel("BDT "+str);
			tkLabel.setBounds(220, 45, 300,32);
	    	tkLabel.setForeground(Color.DARK_GRAY);
	    	tkLabel.setFont(new Font("Georgia", Font.BOLD, 18));
	    	panel5.add(tkLabel);
    	
    	confirmButton.setBounds(60, 100, 120, 28);
    	confirmButton.setForeground(Color.DARK_GRAY);
    	confirmButton.setFont(new Font("Georgia", Font.BOLD, 14));
    	
    	cancelButton.setBounds(210, 100, 120, 28);
    	cancelButton.setForeground(Color.DARK_GRAY);
    	cancelButton.setFont(new Font("Georgia", Font.BOLD, 14));
    	
    	JLabel b = new JLabel((new ImageIcon("C:\\1 Nabiha\\JAVA\\e.JPG")));
    	b.setHorizontalAlignment(SwingConstants.CENTER);
		b.setBounds(-3, -12, 400, 200);
		panel5.add(b);
	}

	private void addActionEvent() {
		// TODO Auto-generated method stub
		confirmButton.addActionListener(this);
		cancelButton.addActionListener(this);
	}
	static boolean bo=true; 
    public void saveFile() {
    	Calendar c = Calendar.getInstance();
		SimpleDateFormat Day1 = new SimpleDateFormat("dd/MM/yyyy"); 
		SimpleDateFormat Time = new SimpleDateFormat("HH:mm:ss"); 
	    Date date = new Date();
	    c.add(Calendar.DAY_OF_MONTH, 1);
	    String Day2 = Day1.format(c.getTime());
	    BookRides b = new BookRides();
		if(b.d==1) {
			    try {
				    FileWriter bookings = new FileWriter(b.path,true);
				    bookings.write(" Today "+Day2+" ");
				    bookings.close();
			  } catch (IOException e1) {
				    JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			  }}
	    	else if(b.d==2) {
			    try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write(" Tomorrow "+Day1.format(date)+" ");
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showInputDialog(null,"Sorry, seat not avalilable",JOptionPane.WARNING_MESSAGE);
			  }}
		if(b.time==1) {
			try {
				FileWriter bookTime = new FileWriter(b.path,true);
				bookTime.write("8:00 AM ");
				bookTime.close();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			}}
		else if(b.time==2) {
			try {
				FileWriter bookTime = new FileWriter(b.path,true);
				bookTime.write("10:00 AM ");
				bookTime.close();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			}}
		else if(b.time==3) {
			try {
				FileWriter bookTime = new FileWriter(b.path,true);
				bookTime.write("12:00 PM ");
				bookTime.close();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			}}
		else if(b.time==4) {
			try {
				FileWriter bookTime = new FileWriter(b.path,true);
				bookTime.write("2:00 PM ");
				bookTime.close();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			}}
		else if(b.time==5) {
			try {
				FileWriter bookTime = new FileWriter(b.path,true);
				bookTime.write("4:00 PM ");
				bookTime.close();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			}}
		else if(b.time==6) {
			try {
				FileWriter bookTime = new FileWriter(b.path,true);
				bookTime.write("6:00 PM ");
				bookTime.close();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			}}
		if(b.f==1) {
			try {
	 			FileWriter bookings = new FileWriter(b.path,true);
	 			bookings.write("From Basundhara To ");
	 			bookings.close();
	 		  }catch (IOException e1) {
	 			JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
	 		} }
		else if(b.f==2) {
			try {
	 			FileWriter bookings = new FileWriter(b.path,true);
	 			bookings.write("From Dhanmondi To ");
	 			bookings.close();
	 		  }catch (IOException e1) {
	 			JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
	 		} }
		else if(b.f==3) {
			try {
	 			FileWriter bookings = new FileWriter(b.path,true);
	 			bookings.write("From Mirpur To ");
	 			bookings.close();
	 		  }catch (IOException e1) {
	 			JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
	 		} }
		else if(b.f==4) {
			try {
	 			FileWriter bookings = new FileWriter(b.path,true);
	 			bookings.write("From Rampura To ");
	 			bookings.close();
	 		  }catch (IOException e1) {
	 			JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
	 		} }
		else if(b.f==5) {
			try {
	 			FileWriter bookings = new FileWriter(b.path,true);
	 			bookings.write("From Uttara To ");
	 			bookings.close();
	 		  }catch (IOException e1) {
	 			JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
	 		} }
		if(b.t==1) {
		      try {
				   FileWriter bookings = new FileWriter(b.path,true);
				   bookings.write("Basundhara ");
				   bookings.close();
			  }
		      catch (IOException e1) {
			       JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			  }
		}
		else if(b.t==2) {
		      try {
				   FileWriter bookings = new FileWriter(b.path,true);
				   bookings.write("Dhanmondi ");
				   bookings.close();
			  }
		      catch (IOException e1) {
			       JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			  }
		}
		else if(b.t==3) {
		      try {
				   FileWriter bookings = new FileWriter(b.path,true);
				   bookings.write("Mirpur ");
				   bookings.close();
			  }
		      catch (IOException e1) {
			       JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			  }
		}
		else if(b.t==4) {
		      try {
				   FileWriter bookings = new FileWriter(b.path,true);
				   bookings.write("Rampura ");
				   bookings.close();
			  }
		      catch (IOException e1) {
			       JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			  }
		}
		else if(b.t==5) {
		      try {
				   FileWriter bookings = new FileWriter(b.path,true);
				   bookings.write("Uttara ");
				   bookings.close();
			  }
		      catch (IOException e1) {
			       JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			  }
		}
		Seats seat = new Seats();
		if(seat.s==1 && bo==true) {
			try {
				FileWriter bookings = new FileWriter(b.path,true);
				bookings.write("Seat: A1 ");
				bookings.close();
				bo=false;
				//seat.a1.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.a1.setBounds(120, 50, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==2 && bo==true) {
			try {
				FileWriter bookings = new FileWriter(b.path,true);
				bookings.write("Seat: A2 ");
				bookings.close();
				bo=false;
				//seat.a2.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.a2.setBounds(220, 50, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==3 && bo==true) {
			try {
				FileWriter bookings = new FileWriter(b.path,true);
				bookings.write("Seat: A3 ");
				bookings.close();
				bo=false;
				//seat.a3.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.a3.setBounds(500, 50, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==4 && bo==true) {
			try {
				FileWriter bookings = new FileWriter(b.path,true);
				bookings.write("Seat: A4 ");
				bookings.close();
				bo=false;
				//seat.a4.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.a4.setBounds(600, 50, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==5 && bo==true) {
			try {
				FileWriter bookings = new FileWriter(b.path,true);
				bookings.write("Seat: B1 ");
				bookings.close();
				bo=false;
				//seat.b1.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.b1.setBounds(120, 170, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==6 && bo==true) {
			try {
				FileWriter bookings = new FileWriter(b.path,true);
				bookings.write("Seat: B2 ");
				bookings.close();
				bo=false;
				//seat.b2.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.b2.setBounds(220, 170, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==7 && bo==true) {
			try {
				FileWriter bookings = new FileWriter(b.path,true);
				bookings.write("Seat: B3 ");
				bookings.close();
				bo=false;
				//seat.b3.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.b3.setBounds(500, 170, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==8 && bo==true) {
			try {
				FileWriter bookings = new FileWriter(b.path,true);
				bookings.write("Seat: B4 ");
				bookings.close();
				bo=false;
				//seat.b4.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.b4.setBounds(600, 170, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==9 && bo==true) {
			try {
				FileWriter bookings = new FileWriter(b.path,true);
				bookings.write("Seat: C1 ");
				bookings.close();
				bo=false;
				//seat.c1.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.c1.setBounds(120, 290, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==10 && bo==true) {
			try {
				FileWriter bookings = new FileWriter(b.path,true);
				bookings.write("Seat: C2 ");
				bookings.close();
				bo=false;
				//seat.c2.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.c2.setBounds(220, 290, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==11 && bo==true) {
			try {
				FileWriter bookings = new FileWriter(b.path,true);
				bookings.write("Seat: C3 ");
				bookings.close();
				bo=false;
				//seat.c3.setFont(new Font("Georgia", Font.BOLD, 12));
			//	seat.c3.setBounds(500, 290, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==12 && bo==true) {
			try {
				FileWriter bookings = new FileWriter(b.path,true);
				bookings.write("Seat: C4 ");
				bookings.close();
				bo=false;
			//	seat.c4.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.c4.setBounds(600, 290, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==13 && bo==true) {
			try {
				FileWriter bookings = new FileWriter(b.path,true);
				bookings.write("Seat: D1 ");
				bookings.close();
				bo=false;
				//seat.d1.setFont(new Font("Georgia", Font.BOLD, 12));
			//	seat.d1.setBounds(120, 410, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==14 && bo==true) {
			try {
				FileWriter bookings = new FileWriter(b.path,true);
				bookings.write("Seat: D2 ");
				bookings.close();
				bo=false;
				//seat.d2.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.d2.setBounds(220, 410, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==15 && bo==true) {
			try {
				FileWriter bookings = new FileWriter(b.path,true);
				bookings.write("Seat: D3 ");
				bookings.close();
				//seat.d3.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.d3.setBounds(500, 410, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
			bo=false;
		}
		else if(seat.s==16 && bo==true) {
			try {
				FileWriter bookings = new FileWriter(b.path,true);
				bookings.write("Seat: D4 ");
				bookings.close();
				//seat.d4.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.d4.setBounds(600, 410, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}bo=false;
		}
    }
    public void price() {
		BookRides b = new BookRides();
		Calendar c = Calendar.getInstance();
		SimpleDateFormat Day1 = new SimpleDateFormat("dd/MM/yyyy"); 
		SimpleDateFormat Time = new SimpleDateFormat("HH:mm:ss"); 
	    Date date = new Date();
	    c.add(Calendar.DAY_OF_MONTH, 1);
	    String Day2 = Day1.format(c.getTime());
		int p;
		if(b.f==1) {
			if(b.t==2) {
				p=190;
				 try {
						FileWriter bookings = new FileWriter(b.path,true);
						bookings.write("Ticket Price: "+p);
						bookings.close();
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
					}
			}
			else if(b.t==3) {
				p=100;
				try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==4) {
				p=130;
				try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==5) {
				p=80;
				try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
		}
		else if(b.f==2) {
			if(b.t==1) {
				p=190;
				try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				} 
			}
			else if(b.t==3) {
				p=140;
				try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==4) {
				p=110;
				try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==5) {
				p=180;
				try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
		}
		else if(b.f==3) {
			if(b.t==1) {
				p=100;
				try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==2) {
				p=140;
				try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==4) {
				p=160;
				try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==5) {
				p=100;
				try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
		}
		else if(b.f==4) {
			if(b.t==1) {
				p=130;
				try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==2) {
				p=110;
				try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==3) {
				p=160;
				try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==5) {
				p=190;
				try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
		}
		else if(b.f==5) {
			if(b.t==1) {
				p=80;
				try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==2) {
				p=180;
				try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==3) {
				p=100;
				try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==4) {
				p=190;
				try {
					FileWriter bookings = new FileWriter(b.path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		}
		
		
	}
    static int limit=0; static boolean c2=true, c1=true;
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Seats s =new Seats();
		BookRides b = new BookRides();
		ProjectFrame main = new ProjectFrame();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();
		if(e.getSource()==cancelButton) {
			Confirmation.setVisible(false);
			s.seat.setVisible(true);
		}
		
		else if(e.getSource()==confirmButton) {
			CancelBooking mb = new CancelBooking();
			Mybookings m = new Mybookings();
			if(mb.n==1) {
				limit = 0;
			}
			
			if(limit==0) {
				limit=1;
				if(mb.b1==false) {
					c2=false; mb.n=0;
					Files f = new Files();
					f.initialize();
					f.addprice();
					JOptionPane.showMessageDialog(Confirmation, "Successfully Booked!!");
					Confirmation.setVisible(false);
					main.frame.setVisible(true); 
				}
			else {
					c1=false;
					JOptionPane.showMessageDialog(Confirmation, "Successfully Booked!!");
					Confirmation.setVisible(false);
					main.frame.setVisible(true);
					saveFile();
					price();
					try {
						FileWriter bookings = new FileWriter(b.path,true);
						bookings.write(" ("+formatter.format(date)+")");
						bookings.write("\n");
						bookings.close();
						
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
					}
				}
			}
			else {
				JOptionPane.showMessageDialog(Confirmation, "Sorry! Cannot book more than once in a day");
				Confirmation.setVisible(false);
				main.frame.setVisible(true);
			}
			
		}
	}

}
