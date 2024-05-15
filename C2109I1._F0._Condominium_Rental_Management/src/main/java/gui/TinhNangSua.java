package gui;

import java.awt.EventQueue;

import entity.Account;
import entity.HopDongNguoiDung;
import helper.RegexConst;
import helper.Validation;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import dao.AccountDao;
import database.ConnectDB;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import java.awt.ComponentOrientation;

public class TinhNangSua extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnQuayLai;
	private JButton btnThucHien;
	private JPanel panel_1;
	private JLabel lblNgayThue;
	private JLabel lblDiaChi;
	private JLabel lblNgaySinh;
	private JLabel lblGiiTnh;
	private JLabel lblSoPhong;
	private JLabel lblSoDT;
	private JTextField textHKTT;
	private JTextField textSDT;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JLabel lblHVTn;
	private JTextField textHoTen;
	private JLabel lblSCccd;
	private JTextField textCCCD;
	public TinhNang trangchu;
	private JTextField textNguoiO;
	private JLabel lblSNgi;
	private JComboBox cbbGioiTinh;
	private JDateChooser dtcNgaySinh;
	private JDateChooser dtcNgayVao;
	private JDateChooser dtcNgayHet;
	
	

	public TinhNang getTrangchu() {
		return trangchu;
	}

	public void setTrangchu(TinhNang trangchu) {
		this.trangchu = trangchu;
	}

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TinhNangSua frame = new TinhNangSua();
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
	public TinhNangSua() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TinhNangSua.class.getResource("/image/user (3).png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuayLai_actionPerformed(e);
			}
		});
		btnQuayLai.setIcon(new ImageIcon(TinhNangSua.class.getResource("/image/back-arrow.png")));
		
		btnThucHien = new JButton("Thực Hiện");
		btnThucHien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnThucHienActionPerformed(e);
			}
		});
		btnThucHien.setIcon(new ImageIcon(TinhNangSua.class.getResource("/image/check (2).png")));
		
		panel_1 = new JPanel();
		panel_1.setFont(new Font("Sylfaen", Font.PLAIN, 19));
		
		lblNgayThue = new JLabel("Ngày Vào Thuê :");
		lblNgayThue.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNgayThue.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblDiaChi = new JLabel("Địa Chỉ :");
		lblDiaChi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiaChi.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblNgaySinh = new JLabel("Ngày Sinh :");
		lblNgaySinh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNgaySinh.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblGiiTnh = new JLabel("Giới Tính ;");
		lblGiiTnh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGiiTnh.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblSoPhong = new JLabel("Ngày Hết Hạn :");
		lblSoPhong.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoPhong.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		lblSoDT = new JLabel("SỐ ĐT :");
		lblSoDT.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoDT.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		textHKTT = new JTextField();
		textHKTT.setHorizontalAlignment(SwingConstants.LEFT);
		textHKTT.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textHKTT.setColumns(10);
		
		textSDT = new JTextField();
		textSDT.setHorizontalAlignment(SwingConstants.LEFT);
		textSDT.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textSDT.setColumns(10);
		
		lblHVTn = new JLabel("Họ Và Tên ;");
		lblHVTn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHVTn.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		textHoTen = new JTextField();
		textHoTen.setHorizontalAlignment(SwingConstants.LEFT);
		textHoTen.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textHoTen.setColumns(10);
		
		lblSCccd = new JLabel("Số CCCD :");
		lblSCccd.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSCccd.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		textCCCD = new JTextField();
		textCCCD.setHorizontalAlignment(SwingConstants.LEFT);
		textCCCD.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textCCCD.setColumns(10);
		
		textNguoiO = new JTextField();
		textNguoiO.setHorizontalAlignment(SwingConstants.LEFT);
		textNguoiO.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textNguoiO.setColumns(10);
		
		lblSNgi = new JLabel("Số Phòng :");
		lblSNgi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSNgi.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		cbbGioiTinh = new JComboBox();
		cbbGioiTinh.setModel(new DefaultComboBoxModel(new String[] {"", "nam", "nu"}));
		
		dtcNgaySinh = new JDateChooser();
		dtcNgaySinh.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		dtcNgayVao = new JDateChooser();
		dtcNgayVao.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		dtcNgayHet = new JDateChooser();
		dtcNgayHet.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(lblSoDT, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
										.addComponent(lblNgaySinh, GroupLayout.PREFERRED_SIZE, 82, Short.MAX_VALUE)
										.addComponent(lblSCccd, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textSDT, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
										.addComponent(textCCCD, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
										.addComponent(dtcNgaySinh, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblHVTn, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textHoTen, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)))
							.addGap(403))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
									.addGroup(gl_panel_1.createSequentialGroup()
										.addComponent(lblNgayThue, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(dtcNgayVao, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED))
									.addGroup(gl_panel_1.createSequentialGroup()
										.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
											.addComponent(lblGiiTnh, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
											.addComponent(lblDiaChi, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
											.addComponent(textHKTT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(cbbGioiTinh, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblSNgi, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblSoPhong, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(textNguoiO, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
										.addComponent(dtcNgayHet, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE))))
							.addContainerGap(71, Short.MAX_VALUE))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHVTn, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textHoTen, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSoDT)
						.addComponent(textSDT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNgaySinh)
						.addComponent(dtcNgaySinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSCccd, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textCCCD, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGiiTnh)
						.addComponent(cbbGioiTinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDiaChi)
						.addComponent(textHKTT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNgayThue)
						.addComponent(dtcNgayVao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblSoPhong)
						.addComponent(dtcNgayHet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textNguoiO, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSNgi, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_1.linkSize(SwingConstants.HORIZONTAL, new Component[] {textHKTT, textSDT});
		gl_panel_1.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNgayThue, lblDiaChi, lblNgaySinh, lblSoPhong, lblSoDT});
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(23)
							.addComponent(btnQuayLai)
							.addGap(114)
							.addComponent(btnThucHien))
						.addComponent(panel_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 564, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 391, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnQuayLai)
						.addComponent(btnThucHien, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(23))
		);
		panel.setLayout(gl_panel);
		
		panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("Thông tin Cần Sửa");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		panel_2.add(lblNewLabel);
		loadData();
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
		    			+ "  WHERE  CI_Card = '"+ ShareData.Edit.getCccd()+"'";
				var rs = st.executeQuery(searchSQL);
				if (rs.next()) {
				textHoTen.setText(rs.getString("Fullname"));
				textSDT.setText(rs.getString("Phone"));
				var ngaysinh = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("Dob"));
				var ngayvao = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("Entry_Date"));
				var ngayhet = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("Exp_Date"));

				dtcNgaySinh.setDate(ngaysinh);
				textCCCD.setText(rs.getString("CI_Card"));
				dtcNgayVao.setDate(ngayvao);
				dtcNgayHet.setDate(ngayhet);
				cbbGioiTinh.setSelectedItem(rs.getString("Gender"));
				textHKTT.setText(rs.getString("Address"));
				textNguoiO.setText(rs.getString("Number_Apt"));
				} 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
	}

	protected void btnThucHienActionPerformed(ActionEvent e) {
		String a ="";
		Boolean check = true;
		int soPhong_ht= 0;
		String checkPhong = "SELECT * FROM Apartment WHERE Number_Apt = ?";
		var ngaysinh= new SimpleDateFormat("yyyy-MM-dd").format(dtcNgaySinh.getDate());
		var ngayvao = new SimpleDateFormat("yyyy-MM-dd").format(dtcNgayVao.getDate());
		var ngayhet = new SimpleDateFormat("yyyy-MM-dd").format(dtcNgayHet.getDate());
		if(!textNguoiO.getText().equals("")) {
			try (
			    	var con = ConnectDB.getConnect();
			    	var st = con.createStatement();
					PreparedStatement sp = con.prepareStatement(checkPhong);
					){
					String searchSQL = "SELECT * FROM [Contract] "
			    			+ "  JOIN UserApp ON [Contract].Id_User = UserApp.Id_User"
			    			+ "  JOIN Apartment on [Contract].Id_Apt = Apartment.Id_Apt"
			    			+ "  WHERE  CI_Card = '"+ ShareData.Edit.getCccd()+"'";
					var rs = st.executeQuery(searchSQL);
					sp.setInt(1,Integer.parseInt(textNguoiO.getText()));
					var sPhong = sp.executeQuery();
					while(rs.next()) {
						soPhong_ht = rs.getInt("Number_Apt");
						var ngaysinh_sql = rs.getString("Dob");
						var ngayvao_sql = rs.getString("Entry_Date");
						var ngayhet_sql = rs.getString("Exp_Date");
						
						
					if(textHoTen.getText().equals(rs.getString("Fullname"))
							&&textSDT.getText().equals(rs.getString("Phone"))
							&&ngaysinh.equals(ngaysinh_sql)
							&&textCCCD.getText().equals(rs.getString("CI_Card"))
							&&ngayvao.equals(ngayvao_sql)
							&&ngayhet.equals(ngayhet_sql)
							&&cbbGioiTinh.getSelectedItem().equals(rs.getString("Gender"))
							&&textHKTT.getText().equals(rs.getString("Address"))
							&&textNguoiO.getText().equals(rs.getString("Number_Apt"))) {
							a += "\n Bạn không chỉnh sữa";
						 	check = false;
						}else if(!textCCCD.getText().equals(rs.getString("CI_Card"))||!textSDT.getText().equals(rs.getString("Phone"))
								&&textNguoiO.getText().equals(rs.getString("Number_Apt"))
								&&textHoTen.getText().equals(rs.getString("Fullname"))
								&&ngaysinh.equals(ngaysinh_sql)
								&&ngayvao.equals(ngayvao_sql)
								&&ngayhet.equals(ngayhet_sql)
								&&cbbGioiTinh.getSelectedItem().equals(rs.getString("Gender"))
								&&textHKTT.getText().equals(rs.getString("Address"))){
								List<Account> data = AccountDao.getListCCCD();
								for (var ccd : data) {
									
									if(ccd.getCCCD().equals(textCCCD.getText()) && textSDT.getText().equals(rs.getString("Phone"))) {
										a += "\n CCCD đã tồn tại";
										 check = false;
									}
								}
								for (var ac : data) {
									if(ac.getPhone().equals(textSDT.getText())&& textCCCD.getText().equals(rs.getString("CI_Card"))) {
										a += "\n SDT đã tồn tại";
										 check = false;
									}		
								}
								for (var acc : data) {
									if(acc.getPhone().equals(textSDT.getText())&& acc.getCCCD().equals(textCCCD.getText())) {
										a += "\n SDT đã tồn tại \n CCCD đã tồn tại";
										 check = false;
										}
									}
								if(!textCCCD.getText().equals("")) {
									if(!Validation.checkRegex(RegexConst.CCCD, textCCCD.getText())) {
										a += "\n Vui lòng nhập số CCCD có 12 số";
										check = false;
									}
								}else {
									 a += "\n Vui lòng nhập số CCCD";
									 check = false;
								}
								if(!textSDT.getText().equals("")) {
									if(!Validation.checkRegex(RegexConst.SDT, textSDT.getText())) {
										a += "Vui lòng nhập số điện thoại có 10 số";
										check = false;
									}
								}else {
									 a += "Vui lòng nhập số điện Thoại";
									 check = false;
								}
						}else if(!textNguoiO.getText().equals(rs.getString("Number_Apt"))||(textCCCD.getText().equals(rs.getString("CI_Card"))
									&&textSDT.getText().equals(rs.getString("Phone"))
									&&textHoTen.getText().equals(rs.getString("Fullname"))
									&&ngaysinh.equals(ngaysinh_sql)
									&&ngayvao.equals(ngayvao_sql)
									&&ngayhet.equals(ngayhet_sql)
									&&cbbGioiTinh.getSelectedItem().equals(rs.getString("Gender"))
									&&textHKTT.getText().equals(rs.getString("HKTT")))){
								while(sPhong.next()) {
									if(sPhong.getInt("Status") == 1 ) {
										 a += "\n Phòng đã có người ở";
										 check = false;
									}
									if(!textNguoiO.getText().equals("")) {
										if(!Validation.checkRegex(RegexConst.SP, textNguoiO.getText())) {
											a += "\n Vui lòng nhập số phòng";
											check = false;
										}
									}else {
										 a += "\n Vui lòng nhập số phòng";
										 check = false;
									}
									
								}
							}else {
								List<Account> data = AccountDao.getListCCCD();
								for (var ac : data) {
									
									if(ac.getCCCD().equals(textCCCD.getText())) {
										a += "\n CCCD đã tồn tại";
										 check = false;
									}
									if(ac.getPhone().equals(textSDT.getText())) {
										a += "\n SDT đã tồn tại";
										 check = false;
									}
									
								}
								while(sPhong.next()) {
									if(sPhong.getInt("Status") == 1 ) {
										 a += "\n Phòng đã có người ở";
										 check = false;
									}
								}
								if(!textNguoiO.getText().equals("")) {
									if(!Validation.checkRegex(RegexConst.SP, textNguoiO.getText())) {
										a += "\n Vui lòng nhập số phòng";
										check = false;
									}
								}else {
									 a += "\n Vui lòng nhập số phòng";
									 check = false;
								}
								if(!textSDT.getText().equals("")) {
									if(!Validation.checkRegex(RegexConst.SDT, textSDT.getText())) {
										a += "Vui lòng nhập số điện thoại có 10 số";
										check = false;
									}
								}else {
									 a += "Vui lòng nhập số điện Thoại";
									 check = false;
								}
								if(!textHoTen.getText().equals("")) {
									if(!Validation.checkRegex(RegexConst.TEN, textHoTen.getText())) {
										a += "\n Vui lòng nhập họ và tên tối thiểu 5 ký tự và tối đa 25 ký tự";
										check = false;
									}
								}else {
									 a += "\n Vui lòng nhập họ và tên";
									 check = false;
								}
								if(!textCCCD.getText().equals("")) {
									if(!Validation.checkRegex(RegexConst.CCCD, textCCCD.getText())) {
										a += "\n Vui lòng nhập số CCCD có 12 số";
										check = false;
									}
								}else {
									 a += "\n Vui lòng nhập số CCCD";
									 check = false;
								}

								if(!textHKTT.getText().equals("")) {
									if(!Validation.checkRegex(RegexConst.DC, textHKTT.getText())) {
										a += "\n Vui lòng nhập địa chỉ tối thiểu 5 ký tự và tối đa 25 ký tự";
										check = false;
									}
								}else {
									 a += "\n Vui lòng nhập địa chỉ";
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
								
							}
					}
						
				} catch (Exception e2) {
					e2.printStackTrace();
				}
		}else {
			 a += "\n Vui lòng nhập số phòng";
			 check = false;
		}
		
		if(check) {
			int id_user = 0;
			int id_phong= 0;
					
			String nd = "update UserApp set Fullname = ?,"
					+ " Phone = ?,Dob = ?,CI_Card = ?,Gender = ? ,[Address] = ?"
					+ " where CI_Card = ?";
			String hd = "update [Contract] set Id_Apt = ?,Entry_Date = ?,Exp_Date = ?"
					+ " where Id_User = ?" ;
			String updateSophongtrong ="UPDATE Apartment  SET [Status] = 0 where Number_Apt = ?";
			try (
					var con = ConnectDB.getConnect();
					PreparedStatement ps = con.prepareStatement(nd);
					PreparedStatement p = con.prepareStatement(hd);
					PreparedStatement sp = con.prepareStatement(updateSophongtrong);
					var rs = con.createStatement();
					){
				sp.setInt(1,soPhong_ht);
				sp.executeUpdate();
				
				String searchID_nguoi = "SELECT * FROM UserApp WHERE  CI_Card = '"+ShareData.Edit.getCccd()+"'";
				var idn = rs.executeQuery(searchID_nguoi);
				while (idn.next()) {	
					id_user = idn.getInt("Id_User");	
					}
				String searchID_phong = "SELECT * FROM Apartment WHERE  Number_Apt = "+textNguoiO.getText();
				var idp = rs.executeQuery(searchID_phong);
				while (idp.next()) {
					  id_phong = idp.getInt("Id_Apt");
					}
				String update ="UPDATE Apartment SET [Status] = 1 where Id_Apt = "+id_phong;
				rs.executeUpdate(update);
				p.setString(2, ngayvao);
				p.setInt(1, id_phong);
				p.setString(3, ngayhet);
				p.setInt(4, id_user);
				p.executeUpdate();
				
				
				ps.setString(1,textHoTen.getText());
				ps.setString(2,textSDT.getText());
				ps.setString(3,ngaysinh);
				ps.setString(4,textCCCD.getText());
				ps.setString(5,cbbGioiTinh.getSelectedItem().toString());
				ps.setString(6,textHKTT.getText());
				ps.setString(7,ShareData.Edit.getCccd());
				ps.executeUpdate();
				JOptionPane.showMessageDialog(panel, "Sửa thành công");
				this.setVisible(false);
				ChinhSuaTK ed = new ChinhSuaTK();
				ed.setVisible(true);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}else {
			JOptionPane.showMessageDialog(panel, a);
		}
		
		
}
}
