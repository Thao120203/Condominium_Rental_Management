package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.border.MatteBorder;

import org.apache.commons.codec.digest.DigestUtils;

import dao.AccountDao;
import database.ConnectDB;
import database.ConnectDBFromProperties;
import entity.Account;
import helper.RegexConst;
import helper.Validation;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.CardLayout;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;

public class DkTaiKhoan extends JFrame {

	private JPanel contentPane;
	public TrangChuADMIN trangchu;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_19;
	private JTextField txtHoTen;
	private JTextField txtCCCD;
	private JTextField txtDiaChi;
	private JTextField txtSoPhong;
	private JTextField txtTienPhong;
	private JTextField txtTienCoc;
	private JTextField txtTienXe;
	private JTextField txtTienDien;
	private JTextField txtSDT;
	private JTextField txtNguoi;
	private JButton btnThucHien;
	private JButton btnQuayLai;
	private JPasswordField password;
	public ChuaSD trang;
	private JTextField txtNuoc;
	private JTextField txtRac;
	private JComboBox cbbGioiTinh;
	private JDateChooser dtcNgayVao;
	private JDateChooser dtcNgayHet;
	private JDateChooser dtcNgaySinh;

	

	public ChuaSD getTrang() {
		return trang;
	}

	public void setTrang(ChuaSD trang) {
		this.trang = trang;
	}

	public TrangChuADMIN getTrangchu() {
		return trangchu;
	}

	public void setTrangchu(TrangChuADMIN trangchu) {
		this.trangchu = trangchu;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DkTaiKhoan frame = new DkTaiKhoan();
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
	public DkTaiKhoan() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DkTaiKhoan.class.getResource("/image/register (3).png")));
		setTitle("Đăng Ký Tài Khoản");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, "name_1137238842123100");
		
		lblNewLabel = new JLabel("Số Điện Thoại\r\n :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblNewLabel_1 = new JLabel("Mật Khẩu\r\n :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblNewLabel_2 = new JLabel("Nhập Hợp Đồng");
		lblNewLabel_2.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblNewLabel_3 = new JLabel("Đăng Ký Tài Khoản");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_4 = new JLabel("Họ Và Tên :");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblNewLabel_5 = new JLabel("Số CCCD :");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblNewLabel_6 = new JLabel("Ngày Sinh :");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblNewLabel_7 = new JLabel("Địa Chỉ Thường Trú :");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblNewLabel_8 = new JLabel("Giới Tính :");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblNewLabel_9 = new JLabel("Số Phòng :");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblNewLabel_10 = new JLabel("Ngày Vào :");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblNewLabel_11 = new JLabel("Ngày Hết Hạn :");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblNewLabel_12 = new JLabel("Tiền Phòng :");
lblNewLabel_12.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblNewLabel_13 = new JLabel("Tiền Cọc :");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblNewLabel_14 = new JLabel("Tiền Xe :");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblNewLabel_15 = new JLabel("Tiền Điện :");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblNewLabel_16 = new JLabel("Tiền Nước :");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblNewLabel_17 = new JLabel("Tiền Rác,WiFi:");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblNewLabel_19 = new JLabel("Số Người Ở  :");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_19.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		txtHoTen = new JTextField();
		txtHoTen.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtHoTen.setHorizontalAlignment(SwingConstants.LEFT);
		txtHoTen.setColumns(10);
		
		txtCCCD = new JTextField();
		txtCCCD.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtCCCD.setHorizontalAlignment(SwingConstants.LEFT);
		txtCCCD.setColumns(10);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtDiaChi.setHorizontalAlignment(SwingConstants.LEFT);
		txtDiaChi.setColumns(10);
		
		txtSoPhong = new JTextField();
		txtSoPhong.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtSoPhong.setHorizontalAlignment(SwingConstants.LEFT);
		txtSoPhong.setColumns(10);
		
		txtTienPhong = new JTextField();
		txtTienPhong.setForeground(new Color(0, 0, 0));
		txtTienPhong.setText("5000000");
		txtTienPhong.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtTienPhong.setHorizontalAlignment(SwingConstants.LEFT);
		txtTienPhong.setColumns(10);
		
		txtTienCoc = new JTextField();
		txtTienCoc.setText("5000000");
		txtTienCoc.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtTienCoc.setHorizontalAlignment(SwingConstants.LEFT);
		txtTienCoc.setColumns(10);
		
		txtTienXe = new JTextField();
		txtTienXe.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtTienXe.setHorizontalAlignment(SwingConstants.LEFT);
		txtTienXe.setColumns(10);
		
		txtTienDien = new JTextField();
		txtTienDien.setText("4000");
		txtTienDien.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtTienDien.setHorizontalAlignment(SwingConstants.LEFT);
		txtTienDien.setColumns(10);
		
		txtSDT = new JTextField();
		txtSDT.setFont(new Font("Times New Roman", Font.BOLD, 12));
txtSDT.setHorizontalAlignment(SwingConstants.LEFT);
		txtSDT.setColumns(10);
		
		txtNguoi = new JTextField();
		txtNguoi.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtNguoi.setHorizontalAlignment(SwingConstants.LEFT);
		txtNguoi.setColumns(10);
		
		btnThucHien =new JButton("Thực Hiện");
		btnThucHien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnThucHien_actionPerformed(e);
			}
		});
		btnThucHien.setIcon(new ImageIcon(DkTaiKhoan.class.getResource("/image/check (2).png")));
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setIcon(new ImageIcon(DkTaiKhoan.class.getResource("/image/back-arrow.png")));
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuayLai_actionPerformed(e);
			}
		});
		
		password = new JPasswordField();
		password.setFont(new Font("Times New Roman", Font.BOLD, 12));
		password.setHorizontalAlignment(SwingConstants.LEFT);
		password.setEchoChar('*');
		
		txtNuoc = new JTextField();
		txtNuoc.setText("100000");
		txtNuoc.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtNuoc.setHorizontalAlignment(SwingConstants.LEFT);
		txtNuoc.setColumns(10);
		
		txtRac = new JTextField();
		txtRac.setText("100000");
		txtRac.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtRac.setHorizontalAlignment(SwingConstants.LEFT);
		txtRac.setColumns(10);
		
		cbbGioiTinh = new JComboBox();
		cbbGioiTinh.setModel(new DefaultComboBoxModel(new String[] {"", "nam", "nu"}));
		
		dtcNgayVao = new JDateChooser();
		
		dtcNgayHet = new JDateChooser();
		
		dtcNgaySinh = new JDateChooser();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(dtcNgayVao, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtCCCD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(dtcNgaySinh, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(cbbGioiTinh, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtSoPhong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(dtcNgayHet, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtTienPhong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtTienCoc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtTienXe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtDiaChi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtHoTen, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_16, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtNuoc, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_15, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtTienDien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_17, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtRac, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)))
									.addGap(26))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(txtSDT, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
										.addComponent(password, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))))
							.addGap(51))
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_19, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNguoi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnQuayLai, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addGap(113)
							.addComponent(btnThucHien)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtSDT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(7)
							.addComponent(password, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
					.addGap(14)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_4)
						.addComponent(txtHoTen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(txtCCCD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_6)
						.addComponent(dtcNgaySinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_7)
						.addComponent(txtDiaChi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_8)
						.addComponent(cbbGioiTinh, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_9)
						.addComponent(txtSoPhong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_10)
						.addComponent(dtcNgayVao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_11)
						.addComponent(dtcNgayHet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_12)
						.addComponent(txtTienPhong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_13)
						.addComponent(txtTienCoc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_14)
						.addComponent(txtTienXe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_15)
						.addComponent(txtTienDien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_16)
						.addComponent(txtNuoc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_17)
						.addComponent(txtRac, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_19)
						.addComponent(txtNguoi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnQuayLai, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnThucHien))
					.addContainerGap(68, Short.MAX_VALUE))
		);
		gl_panel.linkSize(SwingConstants.VERTICAL, new Component[] {lblNewLabel_4, lblNewLabel_5, lblNewLabel_6, lblNewLabel_7, lblNewLabel_8, lblNewLabel_9, lblNewLabel_10, lblNewLabel_11, lblNewLabel_12, lblNewLabel_13, lblNewLabel_14, lblNewLabel_15, lblNewLabel_16, lblNewLabel_17, lblNewLabel_19});
		gl_panel.linkSize(SwingConstants.VERTICAL, new Component[] {txtHoTen, txtCCCD, txtDiaChi, txtSoPhong, txtTienPhong, txtTienCoc, txtTienXe, txtTienDien, txtSDT, txtNguoi});
		gl_panel.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNewLabel_4, lblNewLabel_5, lblNewLabel_6, lblNewLabel_7, lblNewLabel_8, lblNewLabel_9, lblNewLabel_10, lblNewLabel_11, lblNewLabel_12, lblNewLabel_13, lblNewLabel_14, lblNewLabel_15, lblNewLabel_16, lblNewLabel_17, lblNewLabel_19});
		gl_panel.linkSize(SwingConstants.HORIZONTAL, new Component[] {txtHoTen, txtCCCD, txtDiaChi, txtSoPhong, txtTienPhong, txtTienCoc, txtTienXe, txtTienDien, txtNguoi});
		panel.setLayout(gl_panel);
	}
	protected void do_btnQuayLai_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		trangchu.setVisible(true);
	}
	public static String getMd5(String input)
    {
			String md5Hex = DigestUtils
				      .md5Hex(input).toUpperCase();
		return md5Hex;
    }
	protected void do_btnThucHien_actionPerformed(ActionEvent e) {	
		String a ="";
		Boolean check = true;
		
		if(!txtSDT.getText().equals("")) {
			if(!Validation.checkRegex(RegexConst.SDT, txtSDT.getText())) {
				a += "Số điện thoại không hợp lệ";
				check = false;
			}
		}else {
			 a += "Vui lòng nhập số điện Thoại";
			 check = false;
		}
		
		if(!String.valueOf(password.getPassword()).equals("")) {
			if(!Validation.checkRegex(RegexConst.MK,String.valueOf(password.getPassword()))) {
				a += "\n Mật khẩu tối thiểu tám ký tự, bao gồm một chữ cái và một số";
				check = false;
			}
		}else {
			 a += "\n Vui lòng nhập mật khẩu";
			 check = false;
		}
		
		
		if(!txtHoTen.getText().equals("")) {
			if(!Validation.checkRegex(RegexConst.TEN, txtHoTen.getText())) {
				a += "\n Họ và tên không hợp lệ";
				check = false;
			}
		}else {
			 a += "\n Vui lòng nhập họ và tên";
			 check = false;
		}
		if(!txtCCCD.getText().equals("")) {
			if(!Validation.checkRegex(RegexConst.CCCD, txtCCCD.getText())) {
				a += "\n Số CCCD không hợp lệ";
				check = false;
			}
		}else {
			 a += "\n Vui lòng nhập số CCCD";
			 check = false;
		}
		
		
		if(!txtDiaChi.getText().equals("")) {
			if(!Validation.checkRegex(RegexConst.DC, txtDiaChi.getText())) {
				a += "\n Địa chỉ không hợp lệ";
				check = false;
			}
		}else {
			 a += "\n Vui lòng nhập địa chỉ";
			 check = false;
		}
		
	
		if(!txtSoPhong.getText().equals("")) {
			if(!Validation.checkRegex(RegexConst.SP, txtSoPhong.getText())) {
				a += "\n Vui lòng nhập số phòng đúng";
				check = false;
			}else {
				String checkPhong = "SELECT * FROM Apartment WHERE Number_Apt = ?";
				try (
						var con = ConnectDB.getConnect();
						PreparedStatement sp = con.prepareStatement(checkPhong);
						){
						sp.setInt(1,Integer.parseInt(txtSoPhong.getText()));
						var sPhong = sp.executeQuery();
						while(sPhong.next()) {
							if(sPhong.getInt("Status") == 1) {
								a += "\n Phòng đã có người ở";
								 check = false;
							}
						}
						

				} catch (Exception e2) {
					e2.printStackTrace();
					}
			}
		}else {
			 a += "\n Vui lòng nhập số phòng";
			 check = false;
		}

		
		
		if(!txtTienPhong.getText().equals("")) {
			if(!Validation.checkRegex(RegexConst.TT, txtTienPhong.getText())) {
				a += "\n Vui lòng nhập số tiền phòng";
				check = false;
			}
		}else {
			 a += "\n Vui lòng nhập tiền phòng";
			 check = false;
		}
		
		if(!txtTienCoc.getText().equals("")) {
			if(!Validation.checkRegex(RegexConst.TT, txtTienCoc.getText())) {
				a += "\n Vui lòng nhập số vào tiền cọc";
				check = false;
			}
		}else {
			 a += "\n Vui lòng nhập tiền cọc";
			 check = false;
		}
		
		if(!txtTienXe.getText().equals("")) {
			if(!Validation.checkRegex(RegexConst.TT, txtTienXe.getText())) {
				a += "\n Vui lòng nhập số tiền Xe";
				check = false;
			}
		}
		
		if(!txtTienDien.getText().equals("")) {
			if(!Validation.checkRegex(RegexConst.TT, txtTienDien.getText())) {
				a += "\n Vui lòng nhập số tiền điện";
				check = false;
			}
		}else {
			 a += "\n Vui lòng nhập tiền điện";
			 check = false;
		}
		
		if(dtcNgaySinh.getDate()==null ) {
			 a += "\n Vui lòng nhập ngày sinh";
			 check = false;
		}	else {
			if(dtcNgayVao.getDate().getYear() - dtcNgaySinh.getDate().getYear()<=18) {
				a += "\n Chưa đủ 18 tuổi";
				 check = false;
			}
		}
		
		if(dtcNgayVao.getDate()==null && dtcNgayHet.getDate()==null) {
			 a += "\n Vui lòng nhập ngày";
			 check = false;
		}	else {
			
			if(dtcNgayHet.getDate().getMonth() <= dtcNgayVao.getDate().getMonth() && dtcNgayHet.getDate().getYear() <= dtcNgayVao.getDate().getYear()) {
				a += "\n Ngày hết hạn phải lớn hơn ngày vào";
				 check = false;
			}
		}
//		if(dtcNgayHet.getDate()==null) {
//			 a += "\n Vui lòng nhập ngày hết hạn";
//			 check = false;
//		}
		
		if(cbbGioiTinh.getSelectedItem()==null) {
			a += "\n Vui lòng chọn giới tính";
			check = false;
		}
		
		if(!txtNguoi.getText().equals("")) {
			if(!Validation.checkRegex(RegexConst.TT, txtNguoi.getText())) {
				a += "\n Vui lòng nhập số vào số người ở";
				check = false;
			}
			
		}else {
			 a += "\n Vui lòng nhập số người ở";
			 check = false;
		} 
		
		List<Account> data = AccountDao.getListCCCD();
		for (var ccd : data) {
			
			if(ccd.getCCCD().equals(txtCCCD.getText())) {
				a += "\n CCCD đã tồn tại";
				 check = false;
			}
		}
		for (var ac : data) {
			if(ac.getPhone().equals(txtSDT.getText())) {
				a += "\n SDT đã tồn tại";
				 check = false;
			}
			
		}
//		for (var acc : data) {
//			if(acc.getPhone().equals(txtSDT.getText())&& acc.getCCCD().equals(txtCCCD.getText())) {
//				a += "\n SDT đã tồn tại \n CCCD đã tồn tại";
//				 check = false;
//			}
//			
//		}
		
		
		
		String taikhoan = "insert into UserApp (CI_Card,Phone,Pass,[Level],Fullname,"
				+ "Gender,Dob,[Address]) values (?,?,?,?,?,?,?,?)";
		
		String hopdong = "insert into [Contract] (Id_User,Id_Apt,Entry_Date,Exp_Date,Rent_Apt,"
				+ "Deposit,Parking_Fee,Garbage_Wifi,Water,Num_Occupants) values (?,?,?,?,?,?,?,?,?,?)";
		int id_user = 0 ;
		int id_phong =0;
		if(check) {
			var ngaysinh = new SimpleDateFormat("yyyy-MM-dd").format(dtcNgaySinh.getDate());
			var ngayvao = new SimpleDateFormat("yyyy-MM-dd").format(dtcNgayVao.getDate());
			var ngayra = new SimpleDateFormat("yyyy-MM-dd").format(dtcNgayHet.getDate());
			
			try (
					var con = ConnectDB.getConnect();
					PreparedStatement cs = con.prepareStatement(taikhoan);
					PreparedStatement hd = con.prepareStatement(hopdong);
					var st = con.createStatement();
					
					){
				// up tk
				cs.setString(1,txtCCCD.getText());
				cs.setString(2,txtSDT.getText());
				cs.setString(3,getMd5(String.valueOf(password.getPassword())) );
				cs.setInt(4,2);
				cs.setString(5,txtHoTen.getText());
				cs.setString(6,cbbGioiTinh.getSelectedItem().toString());
				cs.setString(7,ngaysinh);
				cs.setString(8,txtDiaChi.getText());
				cs.executeUpdate();
				// up hop dong
				String searchID_phong = "SELECT * FROM Apartment WHERE  Number_Apt = "+txtSoPhong.getText();
				var rs = st.executeQuery(searchID_phong);
				while (rs.next()) {
					  id_phong = rs.getInt("Id_Apt");
					}
				String update ="UPDATE Apartment SET [Status] = 1 where Id_Apt = "+id_phong;
				st.executeUpdate(update);
				
				String searchID_user = "SELECT * FROM UserApp WHERE Phone = '"+txtSDT.getText()+"'";
				var user = st.executeQuery(searchID_user);
				while (user.next()) {
					  id_user = user.getInt("Id_User");
					}
				hd.setInt(1,id_user);
				hd.setInt(2,id_phong);
				hd.setString(3,ngayvao);
				hd.setString(4,ngayra);
				hd.setString(5,txtTienPhong.getText());
				hd.setString(6,txtTienCoc.getText());
				hd.setString(7,(!txtTienXe.getText().equals(""))?txtTienXe.getText():null);
				hd.setString(8,txtRac.getText());
//				hd.setString(9,txtWf.getText());
				hd.setString(9,txtNuoc.getText());
				hd.setString(10,txtNguoi.getText());
				hd.executeUpdate();
				
				JOptionPane.showMessageDialog(panel, "Đăng ký thành công");
				this.setVisible(false);
				trangchu.setVisible(true);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}else {
			JOptionPane.showMessageDialog(panel, a,"lỗi",JOptionPane.ERROR_MESSAGE);
		}
	}
}