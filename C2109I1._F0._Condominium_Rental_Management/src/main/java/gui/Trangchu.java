package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JDesktopPane;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import java.awt.Component;

public class Trangchu extends JFrame {
	private JPanel panel;
	private JButton button;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPanel panel_4;
	private JButton btnThietHai;
	private JButton btnThanhToan;
	private JButton btnHopDong;
	private JButton btnHoaDon;
	private JButton btnKhieuNai;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_8;
	private JButton btnDangXuat;
	private JLabel lblNewLabel_14;
	private JButton btnCSuaTK;
	private JLabel lblNewLabel_7;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trangchu frame = new Trangchu();
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
	public Trangchu() {
		setAutoRequestFocus(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Trangchu.class.getResource("/image/apartment-building-icon.png")));
		loadGUI();
	}
	private void loadGUI() {
//		setClosable(true);
		setResizable(false);
//		setMaximizable(true);
//		setIconifiable(true);
		setTitle("Trang Chủ User");
		setFrameIcon(new ImageIcon(Trangchu.class.getResource("/image/apartment_icon.png")));
		setBounds(100, 100, 648, 646);
		
		panel = new JPanel();
		panel.setRequestFocusEnabled(false);
		panel.setPreferredSize(new Dimension(10, 80));
		panel.setBackground(new Color(32, 178, 170));
		panel.setName("");
		getContentPane().add(panel, BorderLayout.NORTH);
		
		button = new JButton("");
		button.setIcon(new ImageIcon(Trangchu.class.getResource("/image/png-clipart-computer-icons-bell-bell-hat-black-thumbnail (1).png")));
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		btnNewButton.setIcon(new ImageIcon(Trangchu.class.getResource("/image/reseller-account-icon (1).png")));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 521, Short.MAX_VALUE)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(24))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addContainerGap(29, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.CENTER);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(240, 248, 255));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		btnThietHai = new JButton("");
		btnThietHai.setIcon(new ImageIcon(Trangchu.class.getResource("/image/property.png")));
		btnThietHai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnThietHai_actionPerformed(e);
			}
		});
		
		btnThanhToan = new JButton("");
		btnThanhToan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnThanhToan_actionPerformed(e);
			}
		});
		btnThanhToan.setIcon(new ImageIcon(Trangchu.class.getResource("/image/cost-per-click.png")));
		
		btnHopDong = new JButton("");
		btnHopDong.setIcon(new ImageIcon(Trangchu.class.getResource("/image/hd (1).png")));
		btnHopDong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnHopDong_actionPerformed(e);
			}
		});
		
		btnHoaDon = new JButton("");
		btnHoaDon.setIcon(new ImageIcon(Trangchu.class.getResource("/image/hoadon (1).png")));
		btnHoaDon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnHoaDon_actionPerformed(e);
			}
		});
		
		btnKhieuNai = new JButton("");
		btnKhieuNai.setIcon(new ImageIcon(Trangchu.class.getResource("/image/complaintt.png")));
		btnKhieuNai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnKhieuNai_actionPerformed(e);
			}
		});
		
		lblNewLabel_3 = new JLabel("Thiệt Hại");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_4 = new JLabel("Đã Thanh Toán");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		lblNewLabel_5 = new JLabel("Hợp Đồng");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		lblNewLabel_6 = new JLabel("Hóa Đơn");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		lblNewLabel_8 = new JLabel("Khiếu Nại");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		btnDangXuat = new JButton("");
		btnDangXuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnDangXuat_actionPerformed(e);
			}
		});
		btnDangXuat.setIcon(new ImageIcon(Trangchu.class.getResource("/image/logout.png")));
		
		lblNewLabel_14 = new JLabel("Đăng Xuất");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		btnCSuaTK = new JButton("");
		btnCSuaTK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnCSuaTK_actionPerformed(e);
			}
		});
		btnCSuaTK.setIcon(new ImageIcon(Trangchu.class.getResource("/image/writer.png")));
		
		lblNewLabel_7 = new JLabel("Sửa Tài Khoản");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(68)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel_14)
						.addComponent(btnDangXuat, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblNewLabel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnThietHai, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnHoaDon, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_8)
								.addComponent(lblNewLabel_4)
								.addComponent(btnThanhToan, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnKhieuNai, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_4.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
									.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnCSuaTK, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
									.addGap(6))
								.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
									.addGroup(Alignment.LEADING, gl_panel_4.createSequentialGroup()
										.addGap(116)
										.addComponent(btnHopDong, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap(92, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnHopDong)
								.addComponent(btnThietHai, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnThanhToan))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(btnCSuaTK, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(116)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnKhieuNai, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnHoaDon, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))))
					.addGap(14)
					.addComponent(btnDangXuat, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(112, Short.MAX_VALUE))
		);
		gl_panel_4.linkSize(SwingConstants.HORIZONTAL, new Component[] {btnThietHai, btnThanhToan, btnHoaDon, btnKhieuNai, lblNewLabel_3, lblNewLabel_4, lblNewLabel_6, lblNewLabel_8, btnDangXuat, lblNewLabel_14});
		panel_4.setLayout(gl_panel_4);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Trangchu.class.getResource("/image/Apartment-icon.png")));
		
		lblNewLabel_1 = new JLabel("APTECH HOME");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		
		lblNewLabel_2 = new JLabel("35/6 Đường D5, Phường 25 ,Quận Bình Thạnh ,Thành Phồ Hồ Chí Minh");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(22)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_1))
					.addGap(111))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(12)
							.addComponent(lblNewLabel_2)))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		panel_2.setLayout(gl_panel_2);

	}

	private void setFrameIcon(ImageIcon imageIcon) {
		// TODO Auto-generated method stub
		
	}
	
	
	protected void do_btnThietHai_actionPerformed(ActionEvent e) {
		ThietHai th = new ThietHai();
		th.setVisible(true);
		th.trangchu = this;
		this.setVisible(false);
		
	}
	protected void do_btnHopDong_actionPerformed(ActionEvent e) {
		HopDong hd = new HopDong();
		hd.setVisible(true);
		hd.trangChu = this;
		this.setVisible(false);
	}
	protected void do_btnHoaDon_actionPerformed(ActionEvent e) {
		HoaDon hdon = new HoaDon();
		hdon.setVisible(true);
		hdon.trangchu = this;
		this.setVisible(false);
	}
	protected void do_btnKhieuNai_actionPerformed(ActionEvent e) {
		KhieuNai kn = new KhieuNai();
		kn.setVisible(true);
		kn.trangchu = this;
		this.setVisible(false);
	}
	protected void do_btnThanhToan_actionPerformed(ActionEvent e) {
		LSThanhToan tt = new LSThanhToan();
		tt.setVisible(true);
		tt.trangchu = this;
		this.setVisible(false);
	}
	protected void do_btnCSuaTK_actionPerformed(ActionEvent e) {
		ChinhSuaTKUser cs = new ChinhSuaTKUser();
		cs.setVisible(true);
		cs.trangchu = this;
		this.setVisible(false);
	}
	protected void do_btnDangXuat_actionPerformed(ActionEvent e) {
		Layout kn = new Layout();
		kn.setVisible(true);
		kn.trangchu = this;
		this.setVisible(false);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		TaiKhoan dg = new TaiKhoan();
		dg.setVisible(true);
		dg.trangchu = this;
//		this.setVisible(false);
		this.dispose();
	}
}
