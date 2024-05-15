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
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import database.ConnectDB;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Date;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class HoaDon extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lbltx;
	private JLabel lbltd;
	private JLabel lbltn;
	private JLabel lblTienRac;
	private JLabel lbltp;
	private JLabel lblTngTin;
	private JLabel lblNewLabel_2;
	public Trangchu trangchu;
	private JButton btnQuayLai;
	private JLabel lblHoTen;
	private JLabel lblThang;
	private JLabel lblSoPhong;
	private JLabel lblTienPhong;
	private JLabel lblTienXe;
	private JLabel lblTienDien;
	private JLabel lblTienNuoc;
	private JLabel lblRac;
	private JLabel lblTong;
	private JLabel lblThanhTonT;

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
					HoaDon frame = new HoaDon();
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
	public HoaDon() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(HoaDon.class.getResource("/image/receipt.png")));
		setTitle("Hóa Đơn");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		lblNewLabel = new JLabel("Hóa Đơn Tháng");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		lblNewLabel_1 = new JLabel("Số Phòng :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lbltx = new JLabel("Tiền Xe :");
		lbltx.setHorizontalAlignment(SwingConstants.RIGHT);
		lbltx.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lbltd = new JLabel("Tiền Điện :");
		lbltd.setHorizontalAlignment(SwingConstants.RIGHT);
		lbltd.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lbltn = new JLabel("Tiền Nước :");
		lbltn.setHorizontalAlignment(SwingConstants.RIGHT);
		lbltn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblTienRac = new JLabel("Tiền Rác ,Wifi :");
		lblTienRac.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTienRac.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lbltp = new JLabel("Tiền Phòng :");
		lbltp.setHorizontalAlignment(SwingConstants.RIGHT);
		lbltp.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblTngTin = new JLabel("Tổng Tiền :");
		lblTngTin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTngTin.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblNewLabel_2 = new JLabel("Tên Người Thuê :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setIcon(new ImageIcon(HoaDon.class.getResource("/image/back-arrow.png")));
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuayLai_actionPerformed(e);
			}
		});
		
		lblHoTen = new JLabel("");
		lblHoTen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHoTen.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblThang = new JLabel("");
		lblThang.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblThang.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblSoPhong = new JLabel("");
		lblSoPhong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSoPhong.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblTienPhong = new JLabel("");
		lblTienPhong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTienPhong.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblTienXe = new JLabel("");
		lblTienXe.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTienXe.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblTienDien = new JLabel("");
		lblTienDien.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTienDien.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblTienNuoc = new JLabel("");
		lblTienNuoc.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTienNuoc.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblRac = new JLabel("");
		lblRac.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblRac.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblTong = new JLabel("");
		lblTong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTong.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblThanhTonT = new JLabel("Thanh Toán Từ Ngày 1 Đến Ngày 4 Mỗi Tháng\r\n \r\n");
		lblThanhTonT.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblThang, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(lblSoPhong, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblNewLabel_2)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(lblHoTen, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lbltp, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblTienPhong, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(lblThanhTonT, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(12, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lbltd)
									.addGap(18)
									.addComponent(lblTienDien, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblTngTin, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblTong, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblTienRac, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lbltn, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblRac, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTienNuoc, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lbltx)
									.addGap(18)
									.addComponent(lblTienXe, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(18, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnQuayLai)
							.addContainerGap(334, Short.MAX_VALUE))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(19)
							.addComponent(lblThang, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
					.addGap(35)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSoPhong, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblHoTen, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addComponent(lblThanhTonT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lbltp, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTienPhong, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(4)
							.addComponent(lbltx, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblTienXe, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lbltd, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTienDien, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lbltn, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTienNuoc, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTienRac, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRac, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(12)
							.addComponent(lblTngTin, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblTong, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
					.addGap(35)
					.addComponent(btnQuayLai)
					.addContainerGap(60, Short.MAX_VALUE))
		);
		gl_panel.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNewLabel_1, lbltx, lbltd, lbltn, lblTienRac, lbltp, lblTngTin, lblNewLabel_2});
		panel.setLayout(gl_panel);
		loadData();
	}
	protected void do_btnQuayLai_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		trangchu.setVisible(true);
	}
	public void loadData() {
		LocalDate a = LocalDate.now();
		StringTokenizer ntn = new StringTokenizer(a.toString(),"-");
		String day = ntn.nextToken();
		String month =ntn.nextToken();
		String yead = ntn.nextToken();
		try (
		    	var con = ConnectDB.getConnect();
		    	var st = con.createStatement();
				var h = con.createStatement();){
				String sql = "SELECT * FROM [Contract] "
		    			+ "  JOIN UserApp ON [Contract].Id_User = UserApp.Id_User"
		    			+ "  JOIN Apartment on [Contract].Id_Apt = Apartment.Id_Apt"
		    			+ "  WHERE  Phone = '"+ ShareData.Login.getPhone() +"'";
				String searchSQL="SELECT * FROM Bill "
						+ "JOIN UserApp on Bill.Id_User = UserApp.Id_User "
						+ "WHERE  Phone = '"+ ShareData.Login.getPhone()+"' AND Bill.Month ="+month;
				var rs = st.executeQuery(searchSQL);
				var ts = h.executeQuery(sql);
				
					if (rs.next()) {
					lblThang.setText(rs.getString("Month"));
					lblTienDien.setText(rs.getString("Electricity"));
					} else {
						lblThang.setText("0");
					lblTienDien.setText("0");
					}
				if (ts.next()) {
				lblHoTen.setText(ts.getString("Fullname"));
				lblSoPhong.setText(String.valueOf(ts.getString("Number_Apt")));
				lblTienPhong.setText(String.valueOf(ts.getInt("Rent_Apt")));
				lblTienXe.setText(String.valueOf(ts.getString("Parking_Fee")==null?"0":ts.getString("Parking_Fee")));
				lblTienNuoc.setText(String.valueOf(ts.getString("Water")));
				lblRac.setText(String.valueOf(ts.getString("Garbage_Wifi")));
				if(lblThang.getText().equals("0")) {
					lblTong.setText("0");
				} else {
					var tong= (Integer.parseInt(lblTienDien.getText()) + Integer.parseInt(lblTienPhong.getText()) +Integer.parseInt(lblTienXe.getText()) 
					+ Integer.parseInt(lblTienNuoc.getText())+ Integer.parseInt(lblRac.getText()));
					lblTong.setText(tong+"");
				}
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
	}
}
