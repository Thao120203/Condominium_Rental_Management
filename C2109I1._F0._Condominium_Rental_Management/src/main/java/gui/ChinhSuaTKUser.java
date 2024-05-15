package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.commons.codec.digest.DigestUtils;

import database.ConnectDB;
import entity.Account;
import helper.RegexConst;
import helper.Validation;

import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class ChinhSuaTKUser extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnThucHien;
	private JButton btnQuayLai;
	public Trangchu trangchu;
	private JPasswordField password;
	private JPasswordField passwordF;
	private JLabel lblNewLabel_4;
	private JTextField txtCCCD;
	
	

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
					ChinhSuaTKUser frame = new ChinhSuaTKUser();
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
	public ChinhSuaTKUser() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ChinhSuaTKUser.class.getResource("/image/user (3).png")));
		setTitle("Chỉnh Sửa Mật Khẩu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, "name_1162274273889500");
		panel.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel = new JLabel("Chỉnh Sửa Tài Khoản Của Bạn");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		panel_1 = new JPanel();
		panel_1.setFont(new Font("Sylfaen", Font.PLAIN, 19));
		panel.add(panel_1, BorderLayout.CENTER);
		
		lblNewLabel_1 = new JLabel("Bạn Chỉ Được Chỉnh Sửa Mật Khẩu");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		
		lblNewLabel_2 = new JLabel("Mật Khẩu Cũ :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		lblNewLabel_3 = new JLabel("Mật Khẩu Mới :");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		btnThucHien = new JButton("Thực Hiện ");
		btnThucHien.setIcon(new ImageIcon(ChinhSuaTKUser.class.getResource("/image/check (2).png")));
		btnThucHien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnThucHien_actionPerformed(e);
			}
		});
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setIcon(new ImageIcon(ChinhSuaTKUser.class.getResource("/image/back-arrow.png")));
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuayLai_actionPerformed(e);
			}
		});
		
		password = new JPasswordField();
		password.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		passwordF = new JPasswordField();
		passwordF.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		lblNewLabel_4 = new JLabel("Số CCCD :");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		txtCCCD = new JTextField();
		txtCCCD.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(26)
							.addComponent(btnQuayLai)
							.addGap(76)
							.addComponent(btnThucHien))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtCCCD))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(password, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(passwordF, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(92, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(23)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCCCD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(passwordF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnQuayLai)
						.addComponent(btnThucHien, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_1.linkSize(SwingConstants.VERTICAL, new Component[] {btnThucHien, btnQuayLai});
		gl_panel_1.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNewLabel_2, lblNewLabel_3});
		gl_panel_1.linkSize(SwingConstants.HORIZONTAL, new Component[] {btnThucHien, btnQuayLai});
		panel_1.setLayout(gl_panel_1);
	}

	protected void do_btnQuayLai_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		trangchu.setVisible(true);
	}
	protected void do_btnThucHien_actionPerformed(ActionEvent e) {
		String a ="";
		Boolean check = true;
		if(!txtCCCD.getText().equals("")) {
			if(!Validation.checkRegex(RegexConst.CCCD, txtCCCD.getText())) {
				a += "CCCD Không đúng";
				check = false;
			}
		}else {
			 a += "\n Vui lòng nhập số CCCD";
			 check = false;
		}
		
		if(!String.valueOf(password.getPassword()).equals("")) {
			if(!Validation.checkRegex(RegexConst.MK,String.valueOf(password.getPassword()))) {
				a += "\n Mật khẩu cũ không đúng";
				check = false;
			}
		}else {
			 a += "\n Vui lòng nhập mật khẩu cũ";
			 check = false;
		}
		
		if(!String.valueOf(password.getPassword()).equals("")) {
			if(!Validation.checkRegex(RegexConst.MK,String.valueOf(password.getPassword()))) {
				a += "\n Vui lòng nhập mật khẩu tối thiểu tám ký tự, ít nhất một chữ cái và một số";
				check = false;
			}
		}else {
			 a += "\n Vui lòng nhập mật khẩu";
			 check = false;
		}
		
		if(check) {
		Account ac = new Account();
		try (
		    	var con = ConnectDB.getConnect();
		    	var st = con.createStatement();){
		    	String searchSQL = "SELECT * FROM UserApp WHERE  CI_Card = '"+txtCCCD.getText()+"'";
				var rs = st.executeQuery(searchSQL);
				while (rs.next()) {
				ac.setPassword(rs.getString("Pass"));
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		
		String str =String.valueOf(password.getPassword()) ;
	    String md5Hex = DigestUtils
			      .md5Hex(str).toUpperCase();
	    if(md5Hex.equals(ac.getPassword())) {
	    	String md5 = DigestUtils
				      .md5Hex(String.valueOf(passwordF.getPassword())).toUpperCase();
	    	try (var con = ConnectDB.getConnect();
	    			var st = con.createStatement();){
				String update ="UPDATE UserApp SET Pass = '"+ md5 +"' where CI_Card = '"+txtCCCD.getText()+"'";
				st.executeUpdate(update);
				JOptionPane.showMessageDialog(panel, "Đổi thành công");
				this.setVisible(false);
				trangchu.setVisible(true);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
	    }else {
	    	JOptionPane.showMessageDialog(panel, "Mật khẩu cũ không đúng");
	    }
		}else {
			JOptionPane.showMessageDialog(panel, a);
		}
	}
}
