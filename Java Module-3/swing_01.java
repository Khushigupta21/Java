package basic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//Creating Page not found frame
class PNF{
	JLabel l1;
	public PNF() {
		JFrame fr =new JFrame("ERROR");
		fr.setVisible(true);
		fr.setSize(200, 200);
		fr.setLayout(null);
		
		l1=new JLabel("Data Not Found");
		l1.setBounds(50, 50, 90, 90);
		fr.add(l1);
	}
}

class swingdemo implements ActionListener{
	JLabel l1,l2,l3,l4,l5;
	JButton b1,b2,b3,b4;
	JTextField t1,t2,t3,t4,t5;
	//Design Portion (User Interface)
		public swingdemo(){
			JFrame fr= new JFrame("Demo");
					fr.setVisible(true);
					fr.setSize(500,500);
					fr.setLayout(null);

					l1=new JLabel("Id");
					l1.setBounds(100, 100, 120, 20);
					fr.add(l1);
					
					
					l2=new JLabel("Name");
					l2.setBounds(100, 130, 120, 20);
					fr.add(l2);
						
					
					l3=new JLabel("Address");
					l3.setBounds(100, 160, 120, 20);
					fr.add(l3);
					
					l4=new JLabel("Contact No");
					l4.setBounds(100, 190, 120, 20);
					fr.add(l4);
										
					l5=new JLabel("Email");
					l5.setBounds(100, 220, 120, 20);
					fr.add(l5);
					
					t1=new JTextField();
					t1.setBounds(200, 100, 120, 20);
					fr.add(t1);
					
					t2=new JTextField();
					t2.setBounds(200, 130, 120, 20);
					fr.add(t2);
					
					t3=new JTextField();
					t3.setBounds(200, 160,120, 20);
					fr.add(t3);
					
					t4=new JTextField();
					t4.setBounds(200, 190, 120, 20);
					fr.add(t4);
					
					t5=new JTextField();
					t5.setBounds(200, 220, 120, 20);
					fr.add(t5);
					
					b1=new JButton("SUBMIT");
					b1.setBounds(100, 280, 120, 30);
					fr.add(b1);
					
					b2=new JButton("SEARCH");
					b2.setBounds(250, 280, 120, 30);
					fr.add(b2);
					
					b3=new JButton("UPDATE");
					b3.setBounds(100, 310, 120, 30);
					fr.add(b3);
					
					b4=new JButton("Delete");
					b4.setBounds(250, 310, 120, 30);
					fr.add(b4);
					
					b1.addActionListener(this);
					b2.addActionListener(this);
					b3.addActionListener(this);
					b4.addActionListener(this);
					
		}
		//DataBase Connection
		public static Connection createConnection1() {
			Connection conn=null;
			//JDBC Connection
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing", "root", "");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return conn;
			
		}
		//Onclick Activites
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== b1) {
				int id=Integer.parseInt(t1.getText());
				String name= t2.getText();
				String address=t3.getText();
				long contact=Long.parseLong(t4.getText());
				String email=t5.getText();
				System.out.println("Submit button clicked");
				System.out.println(id);
				System.out.println(name);
				System.out.println(address);
				System.out.println(contact);
				System.out.println(email);
				
				try {
					Connection conn= swingdemo.createConnection1();
					//SQL Query
					String sql="insert into user (id,name,address,contact,email) values(?,?,?,?,?)";
					PreparedStatement pst = conn.prepareStatement(sql);
					pst.setInt(1, id);
					pst.setString(2, name);
					pst.setString(3, address);
					pst.setLong(4, contact);
					pst.setString(5, email);
		            // Execute query
					pst.executeUpdate();
					System.out.println("data inserted succesfully");
		            // Clear fields after saving
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			else if(e.getSource()==b2) {
				System.out.println("Searched button clicked");
				int id=Integer.parseInt(t1.getText());
				try {
					Connection conn = swingdemo.createConnection1();
					String sql="select * from user where id=?";
					PreparedStatement pst=conn.prepareStatement(sql);
					pst.setInt(1, id);
					ResultSet rs =pst.executeQuery();
					if(rs.next()) {
						t1.setText(String.valueOf(rs.getInt("id")));
						t2.setText(rs.getString("name"));
						t3.setText(rs.getString("address"));
						t4.setText(String.valueOf(rs.getLong("contact")));
						t5.setText(rs.getString("email"));
					}
					else {
						System.out.println("data not found");
						new PNF();
						t1.setText("");
						t2.setText("");
						t3.setText("");
						t4.setText("");
						t5.setText("");
					}	
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			else if(e.getSource()==b3) {
				int id=Integer.parseInt(t1.getText());
				String name=t2.getText();
				String address=t3.getText();
				long contact=Long.parseLong(t4.getText());
				String email=t5.getText();
				try {
					Connection conn= swingdemo.createConnection1();
					String sql="update user set name=?,address=?,contact=?,email=? where id=?";
					PreparedStatement pst=conn.prepareStatement(sql);
					pst.setString(1, name);
					pst.setString(2, address);
					pst.setLong(3, contact);
					pst.setString(4,email);
					pst.setInt(5, id);
					pst.executeUpdate();
					System.out.println("data updated");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				System.out.println("Update button clicked");
			}
			else if (e.getSource()==b4) {
				System.out.println("Delete button clicked");
				int id=Integer.parseInt(t1.getText());
				try {
					Connection conn=swingdemo.createConnection1();
					String sql="delete from user where id=?";
					PreparedStatement pst=conn.prepareStatement(sql);
					pst.setInt(1, id);
					pst.executeUpdate();
					System.out.println("Data deleted Succesfully");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}	
}
//Main Class

public class swing_01 {
	public static void main(String[] args) {
		//Object Of Class
		new swingdemo();
	}
}
