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
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;

import database.ConnectDB;

import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class TaiKhoanAdmin extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JPanel panel_1;
	private JLabel lblHVTn;
	private JLabel lblHoTen;
	private JLabel lblSoDT;
	private JLabel lblDT;
	private JLabel lbldc;
	private JLabel lblDiaChi;
	private JLabel lblGiiTnh;
	private JLabel lblSCccd;
	private JLabel lblNgayS;
	private JLabel lblGioiTinh;
	private JLabel lblNgaySinh;
	private JLabel lblCCCD;
	private JButton btnDoiMK;
	private JButton btnQuayLai;
	public TrangChuADMIN trangchu;
	private JLabel lblNewLabel;
	
	

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
					TaiKhoanAdmin frame = new TaiKhoanAdmin();
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
	public TaiKhoanAdmin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TaiKhoanAdmin.class.getResource("/image/used.png")));
		setTitle("Tài Khoản");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 130));
		panel.setBackground(new Color(169, 169, 169));
		contentPane.add(panel, BorderLayout.NORTH);
		
		scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(211, 211, 211));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(234)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(246, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(19)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(30, Short.MAX_VALUE))
		);
		
		lblNewLabel = new JLabel("");
		scrollPane.setViewportView(lblNewLabel);
		lblNewLabel.setBackground(new Color(211, 211, 211));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(TaiKhoanAdmin.class.getResource("/image/noavatar (1).jpg")));
		panel.setLayout(gl_panel);
		
		panel_1 = new JPanel();
		panel_1.setFont(new Font("Sylfaen", Font.PLAIN, 19));
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		lblHVTn = new JLabel("Họ Và Tên :");
		lblHVTn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHVTn.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblHoTen = new JLabel("");
		lblHoTen.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoTen.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblHoTen.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblSoDT = new JLabel("SỐ ĐT ;");
		lblSoDT.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoDT.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblDT = new JLabel("");
		lblDT.setHorizontalAlignment(SwingConstants.CENTER);
		lblDT.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblDT.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lbldc = new JLabel("Địa Chỉ :");
		lbldc.setHorizontalAlignment(SwingConstants.RIGHT);
		lbldc.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblDiaChi = new JLabel("");
		lblDiaChi.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiaChi.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblDiaChi.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblGiiTnh = new JLabel("Giới Tính :");
		lblGiiTnh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGiiTnh.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblSCccd = new JLabel("Số CCCD :");
		lblSCccd.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSCccd.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblNgayS = new JLabel("Ngày Sinh ;");
		lblNgayS.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNgayS.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblGioiTinh = new JLabel("");
		lblGioiTinh.setHorizontalAlignment(SwingConstants.CENTER);
		lblGioiTinh.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblGioiTinh.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblNgaySinh = new JLabel("");
		lblNgaySinh.setHorizontalAlignment(SwingConstants.CENTER);
		lblNgaySinh.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNgaySinh.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblCCCD = new JLabel("");
		lblCCCD.setHorizontalAlignment(SwingConstants.CENTER);
		lblCCCD.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblCCCD.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		btnDoiMK = new JButton("Đổi Mật Khẩu");
		btnDoiMK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnDoiMK_actionPerformed(e);
			}
		});
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setIcon(new ImageIcon(TaiKhoanAdmin.class.getResource("/image/back-arrow.png")));
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
							.addGap(35)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblHVTn, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblHoTen, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblSoDT, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblDT, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNgayS, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblNgaySinh, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblSCccd, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblCCCD, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblGiiTnh, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblGioiTinh, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lbldc, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblDiaChi, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(69)
							.addComponent(btnDoiMK))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(18)
							.addComponent(btnQuayLai, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(48)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblHVTn)
						.addComponent(lblHoTen, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSoDT)
						.addComponent(lblDT, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNgayS)
						.addComponent(lblNgaySinh, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSCccd)
						.addComponent(lblCCCD, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblGiiTnh)
						.addComponent(lblGioiTinh, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbldc)
						.addComponent(lblDiaChi, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnDoiMK)
					.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
					.addComponent(btnQuayLai)
					.addGap(23))
		);
		panel_1.setLayout(gl_panel_1);
		loadData();
	}

	protected void do_btnDoiMK_actionPerformed(ActionEvent e) {
		ChinhSuaTKAdmin kn = new ChinhSuaTKAdmin();
		kn.setVisible(true);
		kn.trangchu = this;
		this.setVisible(false);
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
				} 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
	}
}
