import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.print.*;
import java.io.*;


class BillingApplication implements ActionListener
{
	JTextField tf = new JTextField();
	JTextField tf2 = new JTextField();
	
	BillingApplication()
	{
		JFrame f = new JFrame("LOGIN PAGE");
		f.setSize(1100,690);
		JPanel p = new JPanel();
		ImageIcon img = new ImageIcon("Logo.png");
		ImageIcon img1 = new ImageIcon("FrontImage.png");
		JLabel imglabel = new JLabel(img);
		JLabel img1label = new JLabel(img1);
		imglabel.setBounds(1,1,1100,270);
		img1label.setBounds(10,275,590,350);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//font for text label
		Font font1 = new Font("SansSerif", Font.BOLD, 17);
		
		tf2.setBounds(750,420,220,35);
		tf2.setFont(font1);
		
		tf.setBounds(750,300,220,35);
		tf.setFont(font1);
		
		
		
		
		//label for username 
		JLabel Username = new JLabel("UserName:");
		Username.setFont(font1);
		Username.setBounds(650,300,180,35);
		
		//label for password 
		
		JLabel Password = new JLabel("PassWord:");
		Password.setFont(font1);
		Password.setBounds(650,420,180,35);
		
		
		JButton b = new JButton("LOGIN");
		JButton b2 = new JButton("EXIT");
		JButton b3 = new JButton("CLEAR");
		
		b.setBounds(670,515,130,30);
		b2.setBounds(860,515,130,30);
		b3.setBounds(770,580,130,30);
		
		f.setLayout(null);
		
		f.setVisible(true);	
		
		b.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		f.add(p);
		f.add(b);
		f.add(tf);
		f.add(Username);
		f.add(Password);
		f.add(tf2);
		f.add(b2);
		f.add(b3);
		f.add(imglabel);
		f.add(img1label);
		
		
	}
	
	
	
	public void actionPerformed(ActionEvent e){
			
			String str = e.getActionCommand();
			
			if(str.equals("EXIT"))
			{
				System.exit(0);
			}
			else if(str.equals("CLEAR"))
			{
				tf.setText(null);
				tf2.setText(null);
				
				
			}
			else if(str.equals("LOGIN"))
			{
				String username = tf.getText();
				String password = tf2.getText();
				
				if (username.equals("User123") && password.equals("1234"))
				{
					tf.setText(null);
					tf2.setText(null);
					new SecondFrame();
				}
				else if (username.equals("") && password.equals(""))
				{
					JOptionPane.showMessageDialog(null, "YOU CANT LEAVE IT BLANK, ENTER USERNAME AND PASSWORD TO LOG IN");
				}
				
				else
				{
					JOptionPane.showMessageDialog(null, "YOU HAVE ENTERED INCORRECT PASSWORD");
				}
			}
			
			
			
			
	}
	
	public class SecondFrame implements ActionListener{
	public JFrame f2 = new JFrame("BILL PAGE");
		
		JTextField f2tf1 =  new JTextField();
		JTextField f2tf2 = new JTextField();
		JTextField f2tf3 = new JTextField();
		JTextField f2tf4 = new JTextField();
		JTextField f2tf5 = new JTextField();
		
		
		JLabel applestock = new JLabel("100");
		JLabel mangostock = new JLabel("100");
		JLabel kiwistock = new JLabel("100");
		
		
		int applecount = 100;
		int mangocount = 100;
		int kiwicount = 100;
		
		
		String [] fruit = {"1","2","3","4","5","6","7","8","9","10"};
		JComboBox <String> cb = new JComboBox<>(fruit);
		
		String [] fruittwo = {"1","2","3","4","5","6","7","8","9","10"};
		JComboBox <String> cb2 = new JComboBox<>(fruittwo);
		
		String [] fruitthree = {"1","2","3","4","5","6","7","8","9","10"};
		JComboBox <String> cb3 = new JComboBox<>(fruitthree);
		
		JTextArea tf3 = new JTextArea();
	
	
	
	public SecondFrame()
		{
		
		f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f2.getContentPane().setBackground(new Color(106,242,237));
		//font style
		
		Font font1 = new Font("SansSerif", Font.BOLD, 13);
		Font font2 = new Font("SansSerif", Font.BOLD, 17);
		
		
		tf3.setBounds(410,85,600,350);
		tf3.setFont(font1);
		tf3.setForeground(Color.black);
		tf3.setEditable(false);
		
		//for print screen
		
		JLabel print = new JLabel("BILL SCREEN");
		print.setBounds(680,50,120,27);
		print.setFont(font2);
		
		
		// for the name inpu
		
		JLabel name = new JLabel("Name :");
		name.setBounds(60,80,120,27);
		f2tf1.setBounds(110,80,200,27);
		f2tf1.setFont(font1);
		
		//for the mobile number input
		
		JLabel mobile = new JLabel("MObile Number :");
		mobile.setBounds(10,160,120,27);
		f2tf2.setBounds(110,160,200,27);
		f2tf2.setFont(font1);
		
		//for the product name 1
		
		JLabel product1 = new JLabel("Enter Product 1 :");
		product1.setBounds(10,240,120,27);
		f2tf3.setBounds(110,240,200,27);
		f2tf3.setFont(font1);
		
		
		//quantity label
		
		
			
		JLabel qty1 = new JLabel("Qty:");
		qty1.setBounds(315,240,50,27);
		cb.setBounds(342,240,50,27);
		
		//for the product name 2
		
		JLabel product2 = new JLabel("Enter Product 2 :");
		product2.setBounds(10,320,120,27);
		f2tf4.setBounds(110,320,200,27);
		f2tf4.setFont(font1);
		//quantity label 2 
		
		
		
		JLabel qty2 = new JLabel("Qty:");
		qty2.setBounds(315,320,50,27);
		cb2.setBounds(342,320,50,27);
		
		
		//for the product name 3 
		
		JLabel product3 = new JLabel("Enter Product 3 :");
		product3.setBounds(10,400,120,27);
		f2tf5.setBounds(110,400,200,27);
		f2tf5.setFont(font1);
		
		//quantity label 3 
		
		
		//label for stock
		JLabel stock = new JLabel("STOCK REMAINING:");
		stock.setBounds(1100,5,170,20);
		stock.setFont(font2);
		
		JLabel applelabel = new JLabel("APPLE:");
		applelabel.setBounds(1100,27,150,20);
		applestock.setBounds(1250,27,150,20);
		applestock.setFont(font2);
		applelabel.setFont(font2);
		
		
		JLabel mangolabel = new JLabel("MANGO:");
		mangostock.setBounds(1250,50,150,20);
		mangolabel.setBounds(1100,50,150,20);
		mangostock.setFont(font2);
		mangolabel.setFont(font2);
		
		
		JLabel kiwilabel = new JLabel("KIWI:");
		kiwistock.setBounds(1250,74,150,20);
		kiwilabel.setBounds(1100,74,150,20);
		kiwistock.setFont(font2);
		kiwilabel.setFont(font2);
		
		
		
		
		JLabel qty3 = new JLabel("Qty:");
		qty3.setBounds(315,400,50,27);
		cb3.setBounds(342,400,50,27);
		
		//for the clear
		
		JButton clear = new JButton("CLEAR");
		clear.setBounds(80,500,130,30);
		
		//for the bill
		
		JButton bill = new JButton("BILL");
		bill.setBounds(240,500,130,30);
		
		
		//for the print 
		
		JButton printtext = new JButton("PRINT");
		printtext.setBounds(410,500,130,30);
		
		
		//for save
		
		JButton save = new JButton("SAVE");
		save.setBounds(580,500,130,30);
		
		
		//actionlisteners
		
		clear.addActionListener(this);
		printtext.addActionListener(this);
		bill.addActionListener(this);
		save.addActionListener(this);
		
	
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f2.add(clear);
		
		f2.add(bill);
		f2.add(printtext);
		f2.add(tf3);
		f2.add(f2tf5);
		f2.add(product3);
		f2.add(f2tf2);
		f2.add(f2tf4);
		f2.add(product2);
		f2.add(mobile);
		f2.add(name);
		f2.add(f2tf1);
		f2.add(f2tf3);
		f2.add(qty2);
		f2.add(cb2);
		f2.add(qty3);
		f2.add(cb3);
		f2.add(qty1);
		f2.add(cb);
		f2.add(stock);
		f2.add(applestock);
		f2.add(mangostock);
		f2.add(kiwistock);
		f2.add(applelabel);
		f2.add(mangolabel);
		f2.add(kiwilabel);
		
		f2.add(print);
		f2.add(save);
		f2.add(product1);
		f2.setLayout(null);
		f2.setSize(820,700);
		f2.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent a){
			
			String strw = a.getActionCommand();
			
			if(strw.equals("SAVE"))
			{
				try{
					String title = f2tf2.getText();
					
					
					
				FileWriter fw = new FileWriter(new File("C:\\Users\\Prasad\\Desktop\\project\\Billdatabase\\" +title +".txt"));
				
				
				tf3.write(fw);
				
				JOptionPane.showMessageDialog(null,"Saved Succesfully");
				
				fw.close();
				}
				catch(IOException ee){
						
				}
				
			}
			
			else if(strw.equals("BILL"))
			{
				tf3.setText("");
				
				
				String nameone = String.format(f2tf1.getText());
				if(nameone.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Enter Name, Bill cannot be generated without name");
				}
				
				
				
				String mobileone = String.format(f2tf2.getText());
				if(mobileone.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Enter Mobile number, Bill cannot be generated without Mobile number");
				}
				
				
				String pet = (String)cb.getSelectedItem();
				int value1 = Integer.parseInt(pet);
				String pet2 = (String)cb2.getSelectedItem();
				int value2 = Integer.parseInt(pet2);
				String pet3 = (String)cb3.getSelectedItem();
				int value3 = Integer.parseInt(pet3);
				
				int apple = 0;
				int kiwi = 0;
				int mango = 0;
				String price1 = "";
				String price2 = "";
				String price3 = "";
				
				
				
			/////////////////////////////////////////////////////////////////////////
				///for product 1
				
				String productone = String.format(f2tf3.getText());
				
				
				
				if(productone.equals("apple") || productone.equals("APPLE") )
				{
					apple = value1 * 50;
					  price1 = "50/-";
					applecount = applecount - value1;
					if(applecount <= 5)
					{
						JOptionPane.showMessageDialog(null,"You have low stock , please enter new stock");
					}
					
					applestock.setText(String.valueOf(applecount));
					  
				}
				else if(productone.equals("mango") || productone.equals("MANGO") )
				{
					mango = value1 * 100;
					  price1 = "100/-";
					  mangocount = mangocount - value1;
					 if(mangocount <= 5)
					{
						JOptionPane.showMessageDialog(null,"You have low stock , please enter new stock");
					}
					  mangostock.setText(String.valueOf(mangocount));
				}
				else if(productone.equals("kiwi") || productone.equals("KIWI") )
				{
					kiwi = value1 * 150;
					  price1 = "150/-";
					  kiwicount = kiwicount - value1;
					if(kiwicount <= 5)
					{
						JOptionPane.showMessageDialog(null,"You have low stock , please enter new stock");
					}
					  kiwistock.setText(String.valueOf(kiwicount));
				}
				
			///////////////////////////////////////////////////////////////////////////
				///for product 2
				String producttwo = String.format(f2tf4.getText());
				
				if(producttwo.equals("apple") || producttwo.equals("APPLE") )
				{
					apple = value2 * 50;
					price2 = "50/-";
					applecount = applecount - value2;
					if(applecount <= 5)
					{
						JOptionPane.showMessageDialog(null,"You have low stock , please enter new stock");
					}
					  
					applestock.setText(String.valueOf(applecount));
				}
				else if(producttwo.equals("mango") || producttwo.equals("MANGO") )
				{
					mango = value2 * 100;
					price2 = "100/-";
					 mangocount = mangocount - value2;
					 if(mangocount <= 5)
					{
						JOptionPane.showMessageDialog(null,"You have low stock , please enter new stock");
					}
					  
					 
					 mangostock.setText(String.valueOf(mangocount));
				}
				else if(producttwo.equals("kiwi") || producttwo.equals("KIWI") )
				{
					kiwi = value2 * 150;
					price2 = "150/-";
					kiwicount = kiwicount - value2;
					if(kiwicount <= 5)
					{
						JOptionPane.showMessageDialog(null,"You have low stock , please enter new stock");
					}
					
					
					kiwistock.setText(String.valueOf(kiwicount));
				}
				
			///////////////////////////////////////////////////////////////////////////
				/////for product 3 
				String productthree = String.format(f2tf5.getText());
				
				if(productthree.equals("apple") || productthree.equals("APPLE") )
				{
					apple = value3 * 50;
					price3 = "50/-";
					applecount = applecount - value3;
					if(applecount <= 5)
					{
						JOptionPane.showMessageDialog(null,"You have low stock , please enter new stock");
					}
					
					applestock.setText(String.valueOf(applecount));
				}
				else if(productthree.equals("mango") || productthree.equals("MANGO") )
				{
					mango = value3 * 100;
					price3 = "100/-";
					mangocount = mangocount - value3;
					
					if(mangocount <= 5)
					{
						JOptionPane.showMessageDialog(null,"You have low stock , please enter new stock");
					}
					
					mangostock.setText(String.valueOf(mangocount));
				}
				else if(productthree.equals("kiwi") || productthree.equals("KIWI") )
				{
					kiwi = value3 * 150;
					price3 = "150/-";
					kiwicount = kiwicount - value3;
					
					if(kiwicount <= 5)
					{
						JOptionPane.showMessageDialog(null,"You have low stock , please enter new stock");
					}
					
					kiwistock.setText(String.valueOf(kiwicount));
				}
				
				
	
	
				
				int total = apple + kiwi + mango;
				
				
				
				tf3.append("\t\t       BILL OF PRODUCTS\n\n===============================================================================\n"
				+"   Name:\t"+nameone+"\n\n   Mobile no: \t"+mobileone +"\t\t\tGST Number: XXXXXXXXX" +
				"\n===============================================================================\n"
					+ "   " + productone+ "\t\t\t   Qty:"+value1+"\t\t Price:"+price1+"\n"
					+ "   " + producttwo+ "\t\t\t   Qty:"+value2+"\t\t Price:"+price2+"\n" 
					+ "   " + productthree+ "\t\t\t   Qty:"+value3+"\t\t Price:"+price3+"\n"
					+"\n\n\n\n\n================================================================================"
					+"\n  Total\t\t\t\t\t   "+ total+"/-");
					
				//f2tf1.setText(null);
				//f2tf2.setText(null);
				f2tf3.setText(null);
				f2tf4.setText(null);
				f2tf5.setText(null);
				
				
				
				
			}
			
			
			else if(strw.equals("CLEAR"))
			{
				f2tf1.setText(null);
				f2tf2.setText(null);
				f2tf3.setText(null);
				f2tf4.setText(null);
				f2tf5.setText(null);
				tf3.setText("");
				
			}
			else if(strw.equals("PRINT"))
			{
				try
				{
					boolean complete = tf3.print();
					
					if(complete)
					{
						JOptionPane.showMessageDialog(null, "done Printing");
					}
					else
					{
						JOptionPane.showMessageDialog(null, " Printing failed");
					}
					
					
					
					
					
				String title = f2tf2.getText();
					
				FileWriter fw = new FileWriter(new File(title +".txt"));
				tf3.write(fw);
				
				JOptionPane.showMessageDialog(null,"Saved Succesfully");
				
				fw.close();
				}
				catch (PrinterException e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
				catch(IOException aae){
					
				}
			}
			
			
		
		
		
	}
	
				
	
	
	
	
		}
	

	
	
	public static void main(String arg[])
	{
		new BillingApplication();
	}
}

