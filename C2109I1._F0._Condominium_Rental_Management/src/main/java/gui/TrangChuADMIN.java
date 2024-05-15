package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class TrangChuADMIN extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton button;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPanel panel_3;
	private JLabel lblNewLabel_3;
	private JButton btnCSuaTK;
	private JButton btnTaoTk;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btnXemPhong;
	private JButton btnThongKe;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JButton btnGHD;
	private JLabel lblNewLabel_8;
	private JButton btnXThietHai;
	private JButton btnKhieuNai;
	private JLabel lblXKhieuNai;
	private JButton btnDangXuat;
	private JLabel lblNewLabel_9;
	private JButton btnXemThanhToan;
	private JLabel lblXemThanhTon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrangChuADMIN frame = new TrangChuADMIN();
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
	public TrangChuADMIN() {
		setTitle("Trang Chủ Admin");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TrangChuADMIN.class.getResource("/image/apartment-building-icon.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 654);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setRequestFocusEnabled(false);
		panel.setPreferredSize(new Dimension(10, 80));
		panel.setName("");
		panel.setBackground(new Color(32, 178, 170));
		contentPane.add(panel, BorderLayout.NORTH);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		btnNewButton.setIcon(new ImageIcon(TrangChuADMIN.class.getResource("/image/reseller-account-icon (1).png")));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.WHITE);
		
		button = new JButton("");
		button.setIcon(new ImageIcon(TrangChuADMIN.class.getResource("/image/png-clipart-computer-icons-bell-bell-hat-black-thumbnail (1).png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 541, Short.MAX_VALUE)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.LEADING))
					.addContainerGap(29, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TrangChuADMIN.class.getResource("/image/Apartment-icon.png")));
		
		lblNewLabel_1 = new JLabel("35/6 Đường D5, Phường 25 ,Quận Bình Thạnh ,Thành Phồ Hồ Chí Minh");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		lblNewLabel_2 = new JLabel("APTECH HOME");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 654, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(22)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2))
					.addGap(111))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 87, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(12)
							.addComponent(lblNewLabel_1)))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 248, 255));
		
		lblNewLabel_3 = new JLabel("Tạo Tài Khoản");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		btnCSuaTK = new JButton("");
		btnCSuaTK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnCSuaTK_actionPerformed(e);
			}
		});
		btnCSuaTK.setIcon(new ImageIcon(TrangChuADMIN.class.getResource("/image/writer.png")));
		
		btnTaoTk = new JButton("");
		btnTaoTk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnTaoTk_actionPerformed(e);
			}
		});
		btnTaoTk.setIcon(new ImageIcon(TrangChuADMIN.class.getResource("/image/add-user (1).png")));
		
		lblNewLabel_4 = new JLabel("Sửa Tài Khoản");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		lblNewLabel_5 = new JLabel("Phòng");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		btnXemPhong = new JButton("");
		btnXemPhong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnXemPhong_actionPerformed(e);
			}
		});
		btnXemPhong.setIcon(new ImageIcon(TrangChuADMIN.class.getResource("/image/living-room.png")));
		
		btnThongKe = new JButton("");
		btnThongKe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnThongKe_actionPerformed(e);
			}
		});
		btnThongKe.setIcon(new ImageIcon(TrangChuADMIN.class.getResource("/image/bar-chart (1).png")));
		
		lblNewLabel_6 = new JLabel("Thống Kê");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		lblNewLabel_7 = new JLabel("Xem Thiệt Hại");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		btnGHD = new JButton("");
		btnGHD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnGHD_actionPerformed(e);
			}
		});
		btnGHD.setIcon(new ImageIcon(TrangChuADMIN.class.getResource("/image/invoice (3).png")));
		
		lblNewLabel_8 = new JLabel("Gửi Hóa Đơn");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		btnXThietHai = new JButton("");
		btnXThietHai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnXThietHai_actionPerformed(e);
			}
		});
		btnXThietHai.setIcon(new ImageIcon(TrangChuADMIN.class.getResource("/image/property.png")));
		
		btnKhieuNai = new JButton("");
		btnKhieuNai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnKhieuNai_actionPerformed(e);
			}
		});
		btnKhieuNai.setIcon(new ImageIcon(TrangChuADMIN.class.getResource("/image/complaintt.png")));
		
		lblXKhieuNai = new JLabel("Xem Khiếu Nại");
		lblXKhieuNai.setHorizontalAlignment(SwingConstants.CENTER);
		lblXKhieuNai.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		btnDangXuat = new JButton("");
		btnDangXuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnDangXuat_actionPerformed(e);
			}
		});
		btnDangXuat.setIcon(new ImageIcon(TrangChuADMIN.class.getResource("/image/logout.png")));
		
		lblNewLabel_9 = new JLabel("Đăng Xuất");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		btnXemThanhToan = new JButton("");
		btnXemThanhToan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnXemThanhToan_actionPerformed(e);
			}
		});
		btnXemThanhToan.setIcon(new ImageIcon(TrangChuADMIN.class.getResource("/image/cost-per-click.png")));
		
		lblXemThanhTon = new JLabel("Xem Thanh Toán");
		lblXemThanhTon.setHorizontalAlignment(SwingConstants.CENTER);
		lblXemThanhTon.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(64)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(btnCSuaTK, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnXemPhong, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addComponent(btnKhieuNai, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTaoTk, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblXKhieuNai, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
							.addGap(96)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_panel_3.createSequentialGroup()
										.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
											.addComponent(btnXemThanhToan, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
											.addGroup(gl_panel_3.createSequentialGroup()
												.addGap(2)
												.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
											.addComponent(btnThongKe, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
										.addGap(5)))
								.addComponent(lblXemThanhTon, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))))
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_3.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
								.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGap(103)
									.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
										.addComponent(btnXThietHai, 0, 0, Short.MAX_VALUE)
										.addComponent(lblNewLabel_7, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
								.addComponent(lblNewLabel_9, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnDangXuat, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(106)
							.addComponent(btnGHD, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)))
					.addGap(84))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap(19, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_3.createSequentialGroup()
								.addGap(1)
								.addComponent(btnCSuaTK, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_3.createSequentialGroup()
								.addGap(5)
								.addComponent(btnGHD, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnXemPhong, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGap(6)
									.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGap(10)
									.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)))
							.addGap(11)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnXThietHai, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTaoTk, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnThongKe, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))
					.addGap(6)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnKhieuNai, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblXKhieuNai, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_3.createSequentialGroup()
									.addComponent(btnDangXuat, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
							.addGap(14)
							.addComponent(btnXemThanhToan)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblXemThanhTon, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(77, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 624, GroupLayout.PREFERRED_SIZE)
					.addGap(10))
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
	}

	protected void do_btnCSuaTK_actionPerformed(ActionEvent e) {
		ChinhSuaTK cs = new ChinhSuaTK();
		cs.setVisible(true);
		cs.trangchu = this;
		this.setVisible(false);
	}
	protected void do_btnXemPhong_actionPerformed(ActionEvent e) {
		XemPhong xp = new XemPhong();
		xp.setVisible(true);
		xp.trangchu = this;
		this.setVisible(false);
	}
	protected void do_btnGHD_actionPerformed(ActionEvent e) {
		GuiHoaDon ghd = new GuiHoaDon();
		ghd.setVisible(true);
		ghd.trangchu = this;
		this.setVisible(false);
	}
	protected void do_btnTaoTk_actionPerformed(ActionEvent e) {
		DkTaiKhoan dk = new DkTaiKhoan();
		dk.setVisible(true);
		dk.trangchu = this;
		this.setVisible(false);
	}
	protected void do_btnThongKe_actionPerformed(ActionEvent e) {
		ThongKe th = new ThongKe();
		th.setVisible(true);
		th.trangchu = this;
		this.setVisible(false);
	}
	protected void do_btnXThietHai_actionPerformed(ActionEvent e) {
		XemThietHai th = new XemThietHai();
		th.setVisible(true);
		th.trangchu = this;
		this.setVisible(false);
	}
	protected void do_btnKhieuNai_actionPerformed(ActionEvent e) {
		XemKhieuNai kn = new XemKhieuNai();
		kn.setVisible(true);
		kn.trangchu = this;
		this.setVisible(false);
	}
	protected void do_btnDangXuat_actionPerformed(ActionEvent e) {
		Layout kn = new Layout();
		kn.setVisible(true);
		kn.trangchu1 = this;
		this.setVisible(false);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		TaiKhoanAdmin tk = new TaiKhoanAdmin();
		tk.setVisible(true);
		tk.trangchu = this;
		this.setVisible(false);
	}
	protected void do_btnXemThanhToan_actionPerformed(ActionEvent e) {
		XemThanhToan tk = new XemThanhToan();
		tk.setVisible(true);
		tk.trangchu = this;
		this.setVisible(false);
	}
}
