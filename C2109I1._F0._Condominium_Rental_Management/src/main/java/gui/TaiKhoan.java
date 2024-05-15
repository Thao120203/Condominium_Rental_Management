package gui;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Dimension;

import javax.security.auth.Refreshable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.filechooser.FileNameExtensionFilter;

import database.ConnectDB;

import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.border.MatteBorder;
import java.awt.Toolkit;

public class TaiKhoan extends JFrame {
	private JPanel panel;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JButton btnQuayLai;
	public Trangchu trangchu;
	private JLabel lblNgayT;
	private JLabel lbldc;
	private JLabel lblGiiTnh;
	private JLabel lblSoPhong;
	private JLabel lblSoDT;
	private JLabel lblNgay;
	private JLabel lblHVTn;
	private JLabel lblSCccd;
	private JLabel lblHoTen;
	private JLabel lblDT;
	private JLabel lblNgaySinh;
	private JLabel lblCCCD;
	private JLabel lblGioiTinh;
	private JLabel lblDiaChi;
	private JLabel lblNgayThue;
	private JLabel lblNgayHet;
	private JLabel lblSPhng;
	private JLabel lblPhong;
	
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TaiKhoan frame = new TaiKhoan();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	public Trangchu getTrangchu() {
		return trangchu;
	}

	public void setTrangchu(Trangchu trangchu) {
		this.trangchu = trangchu;
	}

	/**
	 * Create the frame.
	 */
	public TaiKhoan() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TaiKhoan.class.getResource("/image/used.png")));
		setTitle("Tài Khoản");
		setFrameIcon(new ImageIcon(TaiKhoan.class.getResource("/image/apartment-building-icon.png")));
		setResizable(false);
//		setMaximizable(true);
//		setIconifiable(true);
//		setClosable(true);
		setBounds(100, 100, 623, 637);
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 130));
		panel.setBackground(new Color(211, 211, 211));
		getContentPane().add(panel, BorderLayout.NORTH);
		
		scrollPane = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(253)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(274, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(22)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(TaiKhoan.class.getResource("/image/noavatar (1).jpg")));
		scrollPane.setViewportView(lblNewLabel);
		panel.setLayout(gl_panel);
		
		panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		
		panel_2 = new JPanel();
		panel_2.setFont(new Font("Sylfaen", Font.PLAIN, 19));
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(173, 216, 230), 2), "Th\u00F4ng Tin C\u01A1 B\u1EA3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setIcon(new ImageIcon(TaiKhoan.class.getResource("/image/back-arrow.png")));
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuayLai_actionPerformed(e);
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(25)
							.addComponent(btnQuayLai))
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 609, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 373, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addComponent(btnQuayLai)
					.addGap(27))
		);
		
		lblNgayT = new JLabel("Ngày Vào Thuê :");
		lblNgayT.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNgayT.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lbldc = new JLabel("Địa Chỉ :");
		lbldc.setHorizontalAlignment(SwingConstants.RIGHT);
		lbldc.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblGiiTnh = new JLabel("Giới Tính ;");
		lblGiiTnh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGiiTnh.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblSoPhong = new JLabel("Ngày Hết Hạn :");
		lblSoPhong.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoPhong.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblSoDT = new JLabel("SỐ ĐT ;");
		lblSoDT.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoDT.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblNgay = new JLabel("Ngày Sinh ;");
		lblNgay.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNgay.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblHVTn = new JLabel("Họ Và Tên :");
		lblHVTn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHVTn.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblSCccd = new JLabel("Số CCCD :");
		lblSCccd.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSCccd.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblHoTen = new JLabel("");
		lblHoTen.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoTen.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		lblHoTen.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblDT = new JLabel("");
		lblDT.setHorizontalAlignment(SwingConstants.CENTER);
		lblDT.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblDT.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblNgaySinh = new JLabel("");
		lblNgaySinh.setHorizontalAlignment(SwingConstants.CENTER);
		lblNgaySinh.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNgaySinh.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblCCCD = new JLabel("");
		lblCCCD.setHorizontalAlignment(SwingConstants.CENTER);
		lblCCCD.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblCCCD.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblGioiTinh = new JLabel("");
		lblGioiTinh.setHorizontalAlignment(SwingConstants.CENTER);
		lblGioiTinh.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblGioiTinh.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblDiaChi = new JLabel("");
		lblDiaChi.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiaChi.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblDiaChi.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblNgayThue = new JLabel("");
		lblNgayThue.setHorizontalAlignment(SwingConstants.CENTER);
		lblNgayThue.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNgayThue.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblNgayHet = new JLabel("");
		lblNgayHet.setHorizontalAlignment(SwingConstants.CENTER);
		lblNgayHet.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNgayHet.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblSPhng = new JLabel("Số Phòng :");
		lblSPhng.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSPhng.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblPhong = new JLabel("");
		lblPhong.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhong.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblPhong.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(33)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(lblHVTn, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblHoTen, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(lblSoDT, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblDT, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(lbldc, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblDiaChi, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(lblNgayT, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNgayThue, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(lblSoPhong, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNgayHet, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblGiiTnh, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblSCccd, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNgay, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblGioiTinh, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
										.addComponent(lblNgaySinh, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
										.addComponent(lblCCCD)))))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(31)
							.addComponent(lblSPhng, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblPhong, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHVTn, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblHoTen, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSoDT, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDT, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNgay, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNgaySinh, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSCccd, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCCCD, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblGiiTnh, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGioiTinh, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbldc, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDiaChi, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNgayT, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNgayThue, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSoPhong, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNgayHet, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSPhng, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPhong, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_panel_2.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNgaySinh, lblCCCD});
		panel_2.setLayout(gl_panel_2);
		panel_1.setLayout(gl_panel_1);
		 loadData();

	}

	private void setFrameIcon(ImageIcon imageIcon) {
		// TODO Auto-generated method stub
		
	}
	
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
	protected void do_btnQuayLai_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		trangchu.setVisible(true);
	}
	
	public void loadData() {
		try (
		    	var con = ConnectDB.getConnect();
		    	var st = con.createStatement();){
				String searchSQL = "SELECT * FROM [Contract] "
		    			+ "  JOIN UserApp ON [Contract].Id_User = UserApp.Id_User"
		    			+ "  JOIN Apartment on [Contract].Id_Apt = Apartment.Id_Apt"
		    			+ "  WHERE  Phone = '"+ ShareData.Login.getPhone() +"'";
				var rs = st.executeQuery(searchSQL);
				if (rs.next()) {
				lblHoTen.setText(rs.getString("Fullname"));
				lblDT.setText(rs.getString("Phone"));
				lblNgaySinh.setText(rs.getString("Dob"));
				lblCCCD.setText(rs.getString("CI_Card"));
				lblGioiTinh.setText(rs.getString("Gender"));
				lblDiaChi.setText(rs.getString("Address"));
				lblNgayThue.setText(rs.getString("Entry_Date"));
				lblNgayHet.setText(rs.getString("Exp_Date"));
				lblPhong.setText(rs.getString("Number_Apt"));
				} 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
	}
}
