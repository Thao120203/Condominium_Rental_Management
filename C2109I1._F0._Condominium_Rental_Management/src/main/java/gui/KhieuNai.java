package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import database.ConnectDB;
import entity.SetHoaDon;
import helper.RegexConst;
import helper.Validation;

import javax.swing.border.LineBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class KhieuNai extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNguoiNhan;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnThucHien;
	private JButton btnQuayLai;
	public Trangchu trangchu;
	private JTextField txtKhieuNai;
	private JLabel lblNewLabel_1;

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
					KhieuNai frame = new KhieuNai();
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
	public KhieuNai() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(KhieuNai.class.getResource("/image/complaint (2).png")));
		setTitle("Khiếu Nại");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		lblNewLabel = new JLabel("Khiếu Nại");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNguoiNhan = new JLabel("Người Nhận :");
		lblNguoiNhan.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		btnThucHien = new JButton("Thực Hiện");
		btnThucHien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnThucHien_actionPerformed(e);
			}
		});
		btnThucHien.setIcon(new ImageIcon(KhieuNai.class.getResource("/image/check (2).png")));
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setIcon(new ImageIcon(KhieuNai.class.getResource("/image/back-arrow.png")));
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuayLai_actionPerformed(e);
			}
		});
		
		txtKhieuNai = new JTextField();
		txtKhieuNai.setBorder(new TitledBorder(null, "N\u1ED9i Dung Khi\u1EBFu N\u1EA1i", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		txtKhieuNai.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Quản Lý");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNguoiNhan)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(btnQuayLai, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
								.addGap(73)
								.addComponent(btnThucHien))
							.addComponent(txtKhieuNai, GroupLayout.PREFERRED_SIZE, 448, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(18)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtKhieuNai, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNguoiNhan, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(31)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnQuayLai)
						.addComponent(btnThucHien, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(11, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
	protected void do_btnQuayLai_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		trangchu.setVisible(true);
	}
	protected void do_btnThucHien_actionPerformed(ActionEvent e) {
		if(checkSpam()<3) {
			String a ="";
			Boolean check = true;
			if(!txtKhieuNai.getText().equals("")) {
				if(!Validation.checkRegex(RegexConst.TH, txtKhieuNai.getText())) {
					a += "Vui lòng không nhập quá 180 kí tự";
					check = false;
				}
			}else {
				 a += "Vui lòng nhập khiếu nại";
				 check = false;
			}
			String khieunai = "insert into Complain (Content,Id_User,Created_At) values (?,?,GETDATE())";
			int id_user = 0 ;
			if(check) {
				try (
						var con = ConnectDB.getConnect();
						PreparedStatement cs = con.prepareStatement(khieunai);
						
						var st = con.createStatement();
						
						){
					
					String searchID_user = "SELECT * FROM UserApp WHERE Phone = "+ShareData.Login.getPhone();
					var user = st.executeQuery(searchID_user);
					while (user.next()) {
						  id_user = user.getInt("Id_User");
						}
					
					
					cs.setString(1,txtKhieuNai.getText());
					cs.setInt(2,id_user);
					
					cs.executeUpdate();
					JOptionPane.showMessageDialog(panel, "Khiếu nại thành công");
					this.setVisible(false);
					trangchu.setVisible(true);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}else {
				JOptionPane.showMessageDialog(panel, a);
			}
		}else {
			JOptionPane.showMessageDialog(panel, "Vui lòng không spam");
		}
		
	}
		public int checkSpam() {
			int id_user=0;
			int count = 0;
			
			var day = LocalDate.now().toString();
			try (
					var con = ConnectDB.getConnect();
					PreparedStatement cs = con.prepareCall("{call limitComplain(?,'"+day+"')}");
					
					var st = con.createStatement();
					
					){
				
				String searchID_user = "SELECT * FROM UserApp WHERE Phone = "+ShareData.Login.getPhone();
				var user = st.executeQuery(searchID_user);
				while (user.next()) {
					  id_user = user.getInt("Id_User");
					}
				
				cs.setInt(1,id_user);
				
				var rs = cs.executeQuery();
				
				while(rs.next()) {
					count= rs.getInt(1);					
				}
				
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			return count;
	}
}
