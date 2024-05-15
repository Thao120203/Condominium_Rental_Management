package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.commons.codec.digest.DigestUtils;

import dao.AccountDao;
import database.ConnectDB;
import entity.Account;
import helper.RegexConst;
import helper.Validation;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ChinhSuaTKAdmin extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JTextField txtCCCD;
	private JLabel lblNewLabel_1;
	private JButton btnQuayLai;
	private JButton btnThucHien;
	private JLabel lblNewLabel_2;
	private JPasswordField password;
	private JLabel lblNewLabel_3;
	private JPasswordField passwordF;
	private JLabel lblNewLabel_4;
	public TaiKhoanAdmin trangchu;

	
	public TaiKhoanAdmin getTrangchu() {
		return trangchu;
	}

	public void setTrangchu(TaiKhoanAdmin trangchu) {
		this.trangchu = trangchu;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChinhSuaTKAdmin frame = new ChinhSuaTKAdmin();
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
	public ChinhSuaTKAdmin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ChinhSuaTKAdmin.class.getResource("/image/user (3).png")));
		setTitle("Chỉnh Sửa Mật Khẩu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, "name_1246987251678200");
		panel.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel = new JLabel("Chỉnh Sửa Mật Khẩu Của Bạn");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		panel_1 = new JPanel();
		panel_1.setFont(new Font("Sylfaen", Font.PLAIN, 19));
		panel.add(panel_1, BorderLayout.CENTER);
		
		txtCCCD = new JTextField();
		txtCCCD.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Chỉnh Sửa Mật Khẩu");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuayLai_actionPerformed(e);
			}
		});
		btnQuayLai.setIcon(new ImageIcon(ChinhSuaTKAdmin.class.getResource("/image/back-arrow.png")));
		
		btnThucHien = new JButton("Thực Hiện ");
		btnThucHien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnThucHien_actionPerformed(e);
			}
		});
		btnThucHien.setIcon(new ImageIcon(ChinhSuaTKAdmin.class.getResource("/image/check (2).png")));
		
		lblNewLabel_2 = new JLabel("Mật Khẩu Cũ :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		password = new JPasswordField();
		password.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		lblNewLabel_3 = new JLabel("Mật Khẩu Mới :");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		passwordF = new JPasswordField();
		passwordF.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		lblNewLabel_4 = new JLabel("Số CCCD :");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(32)
							.addComponent(btnQuayLai)
							.addGap(45)
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
					.addContainerGap(108, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(23)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
						.addComponent(passwordF, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(btnQuayLai)
							.addGap(24))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(btnThucHien, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addGap(22))))
		);
		gl_panel_1.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNewLabel_2, lblNewLabel_3});
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