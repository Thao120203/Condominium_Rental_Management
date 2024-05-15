package gui;

import java.awt.*;  
import java.net.URL;


import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

import dao.AccountDao;
import database.ConnectDB;
import database.ConnectDBFromProperties;
import entity.Account;
import gui.Trangchu;
import helper.RegexConst;
import helper.Validation;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Layout extends JFrame {
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JPasswordField password;
	private JTextField txtSDT;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btnLogin;
	public Trangchu trangchu;
	public TrangChuADMIN trangchu1;
	
	
	
	
	public TrangChuADMIN getTrangchu1() {
		return trangchu1;
	}

	public void setTrangchu1(TrangChuADMIN trangchu1) {
		this.trangchu1 = trangchu1;
	}

	public Trangchu getTrangchu() {
		return trangchu;
	}

	public void setTrangchu(Trangchu trangchu) {
		this.trangchu = trangchu;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Layout frame = new Layout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Layout() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Layout.class.getResource("/image/apartment_icon.png")));
		setResizable(false);
		setTitle("Đăng Nhập");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 680);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		setContentPane(contentPane);
		
		panel = new JPanel();
		
		lblNewLabel = new JLabel("Số Điện Thoại");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblNewLabel_1 = new JLabel("Mật Khẩu");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblNewLabel_2 = new JLabel("  :");
		lblNewLabel_2.setIcon(new ImageIcon(Layout.class.getResource("/image/preferences-desktop-user-password-icon.png")));
		
		lblNewLabel_3 = new JLabel("  :");
		lblNewLabel_3.setMaximumSize(new Dimension(2, 10));
		lblNewLabel_3.setIcon(new ImageIcon(Layout.class.getResource("/image/Mobile-Phone-icon (2).png")));
		
		password = new JPasswordField();
		
		
		txtSDT = new JTextField();
		txtSDT.setColumns(10);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Layout.class.getResource("/image/canho.jpg")));
		lblNewLabel_4.setBackground(new Color(135, 206, 250));
		
		lblNewLabel_5 = new JLabel("Đăng Nhập");
		lblNewLabel_5.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_5.setBackground(new Color(248, 248, 255));
		
		btnLogin = new JButton("Đăng nhập");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLoginActionPerformed(e);
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(264)
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(28)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addComponent(txtSDT, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(90)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addComponent(password, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(275)
							.addComponent(btnLogin))
						.addComponent(lblNewLabel_4, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 651, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 464, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(6)
							.addComponent(lblNewLabel))
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(txtSDT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(1)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addComponent(btnLogin)
					.addGap(7))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 653, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
//		ImageIcon icon = new ImageIcon();
//		icon.setImage(icon.getImage().getScaledInstance(nen.getWidth(), nen.getHEIGHT, Image.SCALE_DEFAULT));
		
	}
	
	
	protected void btnLoginActionPerformed(ActionEvent e) {
	    String a ="";
		Boolean check = true;
		if(!txtSDT.getText().equals("")) {
			if(!Validation.checkRegex(RegexConst.SDT, txtSDT.getText())) {
				a += "Số điện thoại không đúng";
				check = false;
			}
			
		}else {
			 a += "Vui lòng nhập số điện Thoại";
			 check = false;
		}
		if(!String.valueOf(password.getPassword()).equals("")) {
			
			if(!Validation.checkRegex(RegexConst.MK,String.valueOf(password.getPassword()))) {
				a += "\n Mật khẩu không đúng";
				check = false;
			}
		}else {
			 a += "\n Vui lòng nhập mật khẩu";
			 check = false;
		}
		if(check) {
			Account check1 = new Account();
		    try (
		    	var con = ConnectDB.getConnect();
		    	var st = con.createStatement();){
		    	String searchSQL = "SELECT * FROM UserApp WHERE Phone = '"+txtSDT.getText()+"'";
				var rs = st.executeQuery(searchSQL);
				while (rs.next()) {
				
//				
//				
				check1.setPassword(rs.getString("Pass"));
				check1.setQuyenhan(rs.getInt("Level"));
				}
				String str =String.valueOf(password.getPassword()) ;
			    String md5Hex = DigestUtils
					      .md5Hex(str).toUpperCase();
			    AccountDao dao = new AccountDao();
			    Account acc = dao.checkLogin(txtSDT.getText());
			    if(md5Hex.equals(check1.getPassword())) {
			    	check1.setStatus(1);
			    	if(check1.getQuyenhan()==2) {
			    		Trangchu add = new Trangchu();
			    		ShareData.Login = acc;
						add.setVisible(true);
			    	}else {
			    		TrangChuADMIN trangchu = new TrangChuADMIN();
			    		ShareData.Login = acc;
			    		trangchu.setVisible(true);
			    	}
			    	this.setVisible(false);
			    	JOptionPane.showMessageDialog(contentPane, "Đăng nhập thành công ");
					
			    }else {
			    	JOptionPane.showMessageDialog(null,"không tồn tại");
			    }
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}else {
			JOptionPane.showMessageDialog(panel, a);
		}
	}
	
}

