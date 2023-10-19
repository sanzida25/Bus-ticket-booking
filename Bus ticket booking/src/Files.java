import java.util.Calendar;
import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Files{

	
    public Files() {
		initialize();
		addprice();
	}

    static String path = "C:\\1 Nabiha\\JAVA\\files\\mybook2.txt";
    
	public void initialize() {
		// TODO Auto-generated method stub
		
		Calendar c = Calendar.getInstance();
		SimpleDateFormat Day1 = new SimpleDateFormat("dd/MM/yyyy"); 
		SimpleDateFormat Time = new SimpleDateFormat("HH:mm:ss"); 
	    Date date = new Date();
	    c.add(Calendar.DAY_OF_MONTH, 1);
	    String Day2 = Day1.format(c.getTime());
	    BookRides b = new BookRides();
		if(b.d==1) {
			    try {
				    FileWriter bookings = new FileWriter(path,true);
				    bookings.write(" Today "+Day2+" ");
				    bookings.close();
			  } catch (IOException e1) {
				    JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			  }}
	    	else if(b.d==2) {
			    try {
					FileWriter bookings = new FileWriter(path,true);
					bookings.write(" Tomorrow "+Day1.format(date)+" ");
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showInputDialog(null,"Sorry, seat not avalilable",JOptionPane.WARNING_MESSAGE);
			  }}
		if(b.time==1) {
			try {
				FileWriter bookTime = new FileWriter(path,true);
				bookTime.write("8:00 AM ");
				bookTime.close();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			}}
		else if(b.time==2) {
			try {
				FileWriter bookTime = new FileWriter(path,true);
				bookTime.write("10:00 AM ");
				bookTime.close();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			}}
		else if(b.time==3) {
			try {
				FileWriter bookTime = new FileWriter(path,true);
				bookTime.write("12:00 PM ");
				bookTime.close();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			}}
		else if(b.time==4) {
			try {
				FileWriter bookTime = new FileWriter(path,true);
				bookTime.write("2:00 PM ");
				bookTime.close();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			}}
		else if(b.time==5) {
			try {
				FileWriter bookTime = new FileWriter(path,true);
				bookTime.write("4:00 PM ");
				bookTime.close();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			}}
		else if(b.time==6) {
			try {
				FileWriter bookTime = new FileWriter(path,true);
				bookTime.write("6:00 PM ");
				bookTime.close();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			}}
		if(b.f==1) {
			try {
	 			FileWriter bookings = new FileWriter(path,true);
	 			bookings.write("From Basundhara To ");
	 			bookings.close();
	 		  }catch (IOException e1) {
	 			JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
	 		} }
		else if(b.f==2) {
			try {
	 			FileWriter bookings = new FileWriter(path,true);
	 			bookings.write("From Dhanmondi To ");
	 			bookings.close();
	 		  }catch (IOException e1) {
	 			JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
	 		} }
		else if(b.f==3) {
			try {
	 			FileWriter bookings = new FileWriter(path,true);
	 			bookings.write("From Mirpur To ");
	 			bookings.close();
	 		  }catch (IOException e1) {
	 			JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
	 		} }
		else if(b.f==4) {
			try {
	 			FileWriter bookings = new FileWriter(path,true);
	 			bookings.write("From Rampura To ");
	 			bookings.close();
	 		  }catch (IOException e1) {
	 			JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
	 		} }
		else if(b.f==5) {
			try {
	 			FileWriter bookings = new FileWriter(path,true);
	 			bookings.write("From Uttara To ");
	 			bookings.close();
	 		  }catch (IOException e1) {
	 			JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
	 		} }
		if(b.t==1) {
		      try {
				   FileWriter bookings = new FileWriter(path,true);
				   bookings.write("Basundhara ");
				   bookings.close();
			  }
		      catch (IOException e1) {
			       JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			  }
		}
		else if(b.t==2) {
		      try {
				   FileWriter bookings = new FileWriter(path,true);
				   bookings.write("Dhanmondi ");
				   bookings.close();
			  }
		      catch (IOException e1) {
			       JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			  }
		}
		else if(b.t==3) {
		      try {
				   FileWriter bookings = new FileWriter(path,true);
				   bookings.write("Mirpur ");
				   bookings.close();
			  }
		      catch (IOException e1) {
			       JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			  }
		}
		else if(b.t==4) {
		      try {
				   FileWriter bookings = new FileWriter(path,true);
				   bookings.write("Rampura ");
				   bookings.close();
			  }
		      catch (IOException e1) {
			       JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			  }
		}
		else if(b.t==5) {
		      try {
				   FileWriter bookings = new FileWriter(path,true);
				   bookings.write("Uttara ");
				   bookings.close();
			  }
		      catch (IOException e1) {
			       JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
			  }
		}
		Seats seat = new Seats();
		if(seat.s==1) {
			try {
				FileWriter bookings = new FileWriter(path,true);
				bookings.write("Seat: A1 ");
				bookings.close();
				
				//seat.a1.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.a1.setBounds(120, 50, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==2) {
			try {
				FileWriter bookings = new FileWriter(path,true);
				bookings.write("Seat: A2 ");
				bookings.close();
				
				//seat.a2.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.a2.setBounds(220, 50, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==3) {
			try {
				FileWriter bookings = new FileWriter(path,true);
				bookings.write("Seat: A3 ");
				bookings.close();
				
				//seat.a3.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.a3.setBounds(500, 50, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==4) {
			try {
				FileWriter bookings = new FileWriter(path,true);
				bookings.write("Seat: A4 ");
				bookings.close();
				
				//seat.a4.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.a4.setBounds(600, 50, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==5) {
			try {
				FileWriter bookings = new FileWriter(path,true);
				bookings.write("Seat: B1 ");
				bookings.close();
				
				//seat.b1.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.b1.setBounds(120, 170, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==6) {
			try {
				FileWriter bookings = new FileWriter(path,true);
				bookings.write("Seat: B2 ");
				bookings.close();
				
				//seat.b2.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.b2.setBounds(220, 170, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==7) {
			try {
				FileWriter bookings = new FileWriter(path,true);
				bookings.write("Seat: B3 ");
				bookings.close();
				
				//seat.b3.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.b3.setBounds(500, 170, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==8) {
			try {
				FileWriter bookings = new FileWriter(path,true);
				bookings.write("Seat: B4 ");
				bookings.close();
				
				//seat.b4.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.b4.setBounds(600, 170, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==9) {
			try {
				FileWriter bookings = new FileWriter(path,true);
				bookings.write("Seat: C1 ");
				bookings.close();
				
				//seat.c1.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.c1.setBounds(120, 290, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==10) {
			try {
				FileWriter bookings = new FileWriter(path,true);
				bookings.write("Seat: C2 ");
				bookings.close();
				
				//seat.c2.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.c2.setBounds(220, 290, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==11) {
			try {
				FileWriter bookings = new FileWriter(path,true);
				bookings.write("Seat: C3 ");
				bookings.close();
				
				//seat.c3.setFont(new Font("Georgia", Font.BOLD, 12));
			//	seat.c3.setBounds(500, 290, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==12) {
			try {
				FileWriter bookings = new FileWriter(path,true);
				bookings.write("Seat: C4 ");
				bookings.close();
				
			//	seat.c4.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.c4.setBounds(600, 290, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==13) {
			try {
				FileWriter bookings = new FileWriter(path,true);
				bookings.write("Seat: D1 ");
				bookings.close();
				
				//seat.d1.setFont(new Font("Georgia", Font.BOLD, 12));
			//	seat.d1.setBounds(120, 410, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==14) {
			try {
				FileWriter bookings = new FileWriter(path,true);
				bookings.write("Seat: D2 ");
				bookings.close();
				
				//seat.d2.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.d2.setBounds(220, 410, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==15) {
			try {
				FileWriter bookings = new FileWriter(path,true);
				bookings.write("Seat: D3 ");
				bookings.close();
				//seat.d3.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.d3.setBounds(500, 410, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
		else if(seat.s==16) {
			try {
				FileWriter bookings = new FileWriter(path,true);
				bookings.write("Seat: D4 ");
				bookings.close();
				//seat.d4.setFont(new Font("Georgia", Font.BOLD, 12));
				//seat.d4.setBounds(600, 410, 60, 80);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
			}
		}
	}
 public void addprice() {
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
						FileWriter bookings = new FileWriter(path,true);
						bookings.write("Ticket Price: "+p);
						bookings.close();
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
					}
			}
			else if(b.t==3) {
				p=100;
				try {
					FileWriter bookings = new FileWriter(path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==4) {
				p=130;
				try {
					FileWriter bookings = new FileWriter(path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==5) {
				p=80;
				try {
					FileWriter bookings = new FileWriter(path,true);
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
					FileWriter bookings = new FileWriter(path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				} 
			}
			else if(b.t==3) {
				p=140;
				try {
					FileWriter bookings = new FileWriter(path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==4) {
				p=110;
				try {
					FileWriter bookings = new FileWriter(path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==5) {
				p=180;
				try {
					FileWriter bookings = new FileWriter(path,true);
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
					FileWriter bookings = new FileWriter(path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==2) {
				p=140;
				try {
					FileWriter bookings = new FileWriter(path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==4) {
				p=160;
				try {
					FileWriter bookings = new FileWriter(path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==5) {
				p=100;
				try {
					FileWriter bookings = new FileWriter(path,true);
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
					FileWriter bookings = new FileWriter(path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==2) {
				p=110;
				try {
					FileWriter bookings = new FileWriter(path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==3) {
				p=160;
				try {
					FileWriter bookings = new FileWriter(path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==5) {
				p=190;
				try {
					FileWriter bookings = new FileWriter(path,true);
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
					FileWriter bookings = new FileWriter(path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==2) {
				p=180;
				try {
					FileWriter bookings = new FileWriter(path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==3) {
				p=100;
				try {
					FileWriter bookings = new FileWriter(path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(b.t==4) {
				p=190;
				try {
					FileWriter bookings = new FileWriter(path,true);
					bookings.write("Ticket Price: "+p);
					
					bookings.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		}
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date d = new Date();
		try {
			FileWriter bookings = new FileWriter(path,true);
			bookings.write(" ("+formatter.format(d)+")");
			bookings.write("\n");
			bookings.close();
			
		} catch (IOException e1) {
			JOptionPane.showMessageDialog(null,"Sorry, seat not avalilable","Confirmation",JOptionPane.YES_NO_OPTION);
		}
	
	 }
 
 
 }

