package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;

import database.ConnectDB;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JDesktopPane;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class HopDong extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel_1;
	private JLabel lblNha;
	private JLabel lblSphong;
	private JLabel lnlnv;
	private JLabel lblNgayH;
	private JLabel lblTiphong;
	private JLabel lblTienC;
	private JLabel lblTienX;
	private JLabel lblTienD;
	private JLabel lblTienNuoc;
	private JLabel lblTienRac;
	private JLabel lblNguoiO;
	private JLabel lblCKThanhToan;
	private JButton btnQuayLai;
	private JLabel lblNgySinh;
	private JLabel lblSt;
	public Trangchu trangChu;
	private JLabel lblHoTen;
	private JLabel lblCCCD;
	private JLabel lblDT;
	private JLabel lblPhong;
	private JLabel lblNgayVao;
	private JLabel lblNgayHet;
	private JLabel lblTienPhong;
	private JLabel lblTienCoc;
	private JLabel lblTienXe;
	private JLabel lblTienDien;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNguoio;
	private JLabel lblNewLabel_15;

	
	
	

	public Trangchu getTrangChu() {
		return trangChu;
	}

	public void setTrangChu(Trangchu trangChu) {
		this.trangChu = trangChu;
	}

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					HopDong frame = new HopDong();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public HopDong() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(HopDong.class.getResource("/image/contract.png")));
		setTitle("Hợp Đồng");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 130));
		panel.setBackground(new Color(211, 211, 211));
		contentPane.add(panel, BorderLayout.NORTH);
		
		scrollPane = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(253)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addGap(320))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(22, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(32))
		);
		
		lblNewLabel = new JLabel("");
		scrollPane.setViewportView(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(HopDong.class.getResource("/image/noavatar (1).jpg")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.setLayout(gl_panel);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 204));
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		panel_2 = new JPanel();
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setIcon(new ImageIcon(HopDong.class.getResource("/image/back-arrow.png")));
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuayLai_actionPerformed(e);
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(btnQuayLai, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 428, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnQuayLai)
					.addContainerGap(67, Short.MAX_VALUE))
		);
		
		lblNewLabel_1 = new JLabel("Thông Tin Hợp Đồng");
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1.setLabelFor(this);
		
		lblNha = new JLabel("Họ Và Tên :");
		lblNha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNha.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblSphong = new JLabel("Số Phòng :");
		lblSphong.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSphong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lnlnv = new JLabel("Ngày Vào :");
		lnlnv.setHorizontalAlignment(SwingConstants.RIGHT);
		lnlnv.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblNgayH = new JLabel("Ngày Hết Hạn :");
		lblNgayH.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNgayH.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblTiphong = new JLabel("Tiền Phòng :");
		lblTiphong.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTiphong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblTienC = new JLabel("Tiền Cọc :");
		lblTienC.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTienC.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblTienX = new JLabel("Tiền Xe :");
		lblTienX.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTienX.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblTienD = new JLabel("Tiền Điện :");
		lblTienD.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTienD.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblTienNuoc = new JLabel("Tiền Nước :");
		lblTienNuoc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTienNuoc.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblTienRac = new JLabel("Tiền Rác ,Wifi :");
		lblTienRac.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTienRac.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblNguoiO = new JLabel("Số Người Ở :");
		lblNguoiO.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNguoiO.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblCKThanhToan = new JLabel("Chu Kỳ Thanh Toán :");
		lblCKThanhToan.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCKThanhToan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblNgySinh = new JLabel("Số CCCD :");
		lblNgySinh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNgySinh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblSt = new JLabel("Số ĐT :");
		lblSt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSt.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblHoTen = new JLabel("");
		lblHoTen.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoTen.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		lblHoTen.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblCCCD = new JLabel("");
		lblCCCD.setHorizontalAlignment(SwingConstants.CENTER);
		lblCCCD.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCCCD.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblDT = new JLabel("");
		lblDT.setHorizontalAlignment(SwingConstants.CENTER);
		lblDT.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblDT.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblPhong = new JLabel("");
		lblPhong.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPhong.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblNgayVao = new JLabel("");
		lblNgayVao.setHorizontalAlignment(SwingConstants.CENTER);
		lblNgayVao.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNgayVao.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblNgayHet = new JLabel("");
		lblNgayHet.setHorizontalAlignment(SwingConstants.CENTER);
		lblNgayHet.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNgayHet.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblTienPhong = new JLabel("");
		lblTienPhong.setHorizontalAlignment(SwingConstants.CENTER);
		lblTienPhong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTienPhong.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblTienCoc = new JLabel("");
		lblTienCoc.setHorizontalAlignment(SwingConstants.CENTER);
		lblTienCoc.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTienCoc.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblTienXe = new JLabel("");
		lblTienXe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTienXe.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTienXe.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblTienDien = new JLabel("4000 VND/1kg");
		lblTienDien.setHorizontalAlignment(SwingConstants.CENTER);
		lblTienDien.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTienDien.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblNewLabel_12 = new JLabel("100000 VND");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_12.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblNewLabel_13 = new JLabel("100000 VND");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_13.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblNguoio = new JLabel("");
		lblNguoio.setHorizontalAlignment(SwingConstants.CENTER);
		lblNguoio.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNguoio.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblNewLabel_15 = new JLabel("Từ Ngày 1-5 Mỗi Tháng\r\n");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNha, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblSphong, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
									.addComponent(lnlnv, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE)
									.addComponent(lblNgayH, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
									.addComponent(lblTiphong, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
									.addComponent(lblTienC, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE)
									.addComponent(lblTienX, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE)
									.addComponent(lblTienD, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE)
									.addComponent(lblTienNuoc, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE)
									.addComponent(lblTienRac, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
									.addComponent(lblCKThanhToan, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(lblNgySinh, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSt, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNguoiO, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblHoTen, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
								.addComponent(lblNewLabel_15, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNguoio, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTienDien, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTienXe, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTienCoc, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTienPhong, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNgayHet, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNgayVao, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPhong, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDT, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCCCD, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblNewLabel_1))
					.addContainerGap(113, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNha)
						.addComponent(lblHoTen, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNgySinh, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCCCD, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSt, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDT, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblSphong)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lnlnv)
								.addComponent(lblNgayVao, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNgayH)
								.addComponent(lblNgayHet, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTiphong)
								.addComponent(lblTienPhong, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTienC)
								.addComponent(lblTienCoc, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTienX)
								.addComponent(lblTienXe, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTienD)
								.addComponent(lblTienDien, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblPhong, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblTienNuoc)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTienRac)
								.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNguoiO)
								.addComponent(lblNguoio, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCKThanhToan)
								.addComponent(lblNewLabel_15, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(84, Short.MAX_VALUE))
		);
		gl_panel_2.linkSize(SwingConstants.VERTICAL, new Component[] {lnlnv, lblNgayH, lblTiphong, lblTienC, lblTienX, lblTienD, lblTienNuoc, lblTienRac, lblNguoiO, lblCKThanhToan});
		gl_panel_2.linkSize(SwingConstants.VERTICAL, new Component[] {lblNha, lblSphong});
		gl_panel_2.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNha, lblSphong, lnlnv, lblNgayH, lblTiphong, lblTienC, lblTienX, lblTienD, lblTienNuoc, lblTienRac, lblNguoiO, lblCKThanhToan});
		panel_2.setLayout(gl_panel_2);
		panel_1.setLayout(gl_panel_1);
		loadData();
	}
	protected void do_btnQuayLai_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		trangChu.setVisible(true);
	}
	
	public void loadData() {
		try (
		    	var con = ConnectDB.getConnect();
		    	var st = con.createStatement();
				var h = con.createStatement();){
				String searchSQL = "SELECT * FROM [Contract] "
		    			+ "  JOIN UserApp ON [Contract].Id_User = UserApp.Id_User"
		    			+ "  JOIN Apartment on [Contract].Id_Apt = Apartment.Id_Apt"
		    			+ "  WHERE  Phone = '"+ ShareData.Login.getPhone() +"'";
				String sql="SELECT * FROM Bill "
						+ "JOIN UserApp on Bill.Id_User = UserApp.Id_User "
						+ "WHERE  Phone = '"+ ShareData.Login.getPhone()+"'";
				var rs = st.executeQuery(searchSQL);
				var ts = h.executeQuery(sql);
				
				if (rs.next()) {
				lblHoTen.setText(rs.getString("Fullname"));
				lblCCCD.setText(rs.getString("CI_Card"));
				lblDT.setText(rs.getString("Phone"));
				lblPhong.setText(rs.getString("Number_Apt"));
				lblNgayVao.setText(rs.getString("Entry_Date"));
				lblNgayHet.setText(rs.getString("Exp_Date"));
				lblTienPhong.setText(rs.getString("Rent_Apt")+" "+"VND");
				lblTienCoc.setText(rs.getString("Deposit")+" "+"VND");
				lblTienXe.setText(rs.getString("Parking_Fee")==null?"0":rs.getString("Parking_Fee")+" "+"VND");
				
				lblNguoio.setText(rs.getString("Num_Occupants"));

				} 
//				if (ts.next()) {
//				lblTienDien.setText(ts.getString("Electricity")+"/1kg");
//				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
	}
}
