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
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import dao.SetHoaDonDAO;
import dao.SoPhongDao;
import database.ConnectDB;
import helper.RegexConst;
import helper.Validation;
import net.sf.jasperreports.engine.JRException;

import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Component;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

public class GuiHoaDon extends JFrame {

	private JPanel contentPane;
	public TrangChuADMIN trangchu;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField txtThang;
	private JButton btnQuayLai;
	private JLabel lblNewLabel_1;
	private JLabel lblTienPhong;
	private JTextField txtTienPhong;
	private JLabel lblTienXe;
	private JTextField txtTienXe;
	private JLabel lblTienDien;
	private JTextField txtTienDien;
	private JLabel lblTienNuoc;
	private JTextField txtTienNuoc;
	private JLabel lblTienRac;
	private JLabel lblTngTin;
	private JTextField txtTong;
	private JLabel lblThanhTonT;
	private JLabel lblNewLabel_2;
	private JTextField txtHoTen;
	private JComboBox comboBoxRoom;
	private JTextField txtRac;
	private JButton btnIn;

	

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
					GuiHoaDon frame = new GuiHoaDon();
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
	public GuiHoaDon() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(GuiHoaDon.class.getResource("/image/send.png")));
		setResizable(false);
		setTitle("Gửi Hóa Đơn");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 565, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		lblNewLabel = new JLabel("Hóa Đơn Tháng");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtThang = new JTextField();
		txtThang.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtThang.setColumns(10);
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuayLai_actionPerformed(e);
			}
		});
		btnQuayLai.setIcon(new ImageIcon(GuiHoaDon.class.getResource("/image/back-arrow.png")));
		
		lblNewLabel_1 = new JLabel("Tên Người Thuê :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblTienPhong = new JLabel("Tiền Phòng :");
		lblTienPhong.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTienPhong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtTienPhong = new JTextField();
		txtTienPhong.setHorizontalAlignment(SwingConstants.CENTER);
		txtTienPhong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTienPhong.setColumns(10);
		txtTienPhong.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblTienXe = new JLabel("Tiền Xe :");
		lblTienXe.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTienXe.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtTienXe = new JTextField();
		txtTienXe.setHorizontalAlignment(SwingConstants.CENTER);
		txtTienXe.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTienXe.setColumns(10);
		txtTienXe.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblTienDien = new JLabel("Tiền Điện :");
		lblTienDien.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTienDien.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtTienDien = new JTextField();
		txtTienDien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_txtTienDien_actionPerformed(e);
			}
		});
		txtTienDien.setHorizontalAlignment(SwingConstants.CENTER);
		txtTienDien.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTienDien.setColumns(10);
		txtTienDien.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblTienNuoc = new JLabel("Tiền Nước :");
		lblTienNuoc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTienNuoc.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtTienNuoc = new JTextField();
		txtTienNuoc.setHorizontalAlignment(SwingConstants.CENTER);
		txtTienNuoc.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTienNuoc.setColumns(10);
		txtTienNuoc.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblTienRac = new JLabel("Tiền Rác , Wifi :");
		lblTienRac.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTienRac.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblTngTin = new JLabel("Tổng Tiền :");
		lblTngTin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTngTin.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtTong = new JTextField();
		txtTong.setHorizontalAlignment(SwingConstants.CENTER);
		txtTong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTong.setColumns(10);
		txtTong.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		lblThanhTonT = new JLabel("Thanh Toán Từ Ngày 1 Đến Ngày 4 \r\n\r\n");
		lblThanhTonT.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblNewLabel_2 = new JLabel("Số Phòng :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtHoTen = new JTextField();
		txtHoTen.setHorizontalAlignment(SwingConstants.CENTER);
		txtHoTen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtHoTen.setColumns(10);
		txtHoTen.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		
		DefaultComboBoxModel model = new DefaultComboBoxModel();
		model.addElement(null);
		SoPhongDao listPhong = new SoPhongDao();
		listPhong.selectPhong().forEach(
				sp ->{
					if(sp.isTrangThai())
					model.addElement(sp.getSoPhong());
				}
		);		
		comboBoxRoom = new JComboBox(model);
		comboBoxRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxRoomActionPerformed(e);
			}
		});
		
		txtRac = new JTextField();
		txtRac.setHorizontalAlignment(SwingConstants.CENTER);
		txtRac.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtRac.setColumns(10);
		txtRac.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		btnIn = new JButton("In hóa đơn");
		btnIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					do_btnIn_actionPerformed(e);
				} catch (JRException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(txtHoTen, GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
									.addContainerGap(20, Short.MAX_VALUE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(comboBoxRoom, 0, 381, Short.MAX_VALUE)
									.addContainerGap())))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblTienPhong, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtTienPhong, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblTienXe, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtTienXe, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblTienDien, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtTienDien, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblTienNuoc, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtTienNuoc, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblTienRac, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtRac, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblTngTin, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtTong, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(btnQuayLai)
					.addGap(116)
					.addComponent(btnIn, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addGap(210))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblThanhTonT, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE)
					.addGap(110))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNewLabel)
					.addGap(4)
					.addComponent(txtThang, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(364))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtThang, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxRoom, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtHoTen, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addComponent(lblThanhTonT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTienPhong, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTienPhong, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTienXe, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTienXe, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTienDien, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTienDien, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTienNuoc, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTienNuoc, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTienRac, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtRac, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTngTin, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTong, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnQuayLai)
						.addComponent(btnIn, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(32, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
	protected void do_btnQuayLai_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		trangchu.setVisible(true);
	}
	
	protected void comboBoxRoomActionPerformed(ActionEvent e) {
		SetHoaDonDAO shd = new SetHoaDonDAO();
		shd.selectBySoPhong(Integer.parseInt(comboBoxRoom.getSelectedItem().toString())).forEach(
				as ->{
			txtHoTen.setText(as.getHoTen());
			txtTienPhong.setText(as.getTienphong()+"");
			txtTienXe.setText(as.getTienxe()+"");
			txtTienNuoc.setText(as.getTiennuoc()+"");
			txtRac.setText(as.getTienrac_wifi()+"");
			
		}
			
				);
		
		txtTienDien.setEnabled(true);
//		JOptionPane.showMessageDialog(null,comboBoxRoom.getSelectedItem());
	}
	
	protected void do_txtTienDien_actionPerformed(ActionEvent e) {
		var tong = Integer.parseInt(txtTienPhong.getText())+Integer.parseInt(txtTienXe.getText())+Integer.parseInt(txtTienDien.getText())
		+Integer.parseInt(txtTienNuoc.getText())+Integer.parseInt(txtRac.getText()); 
		txtTong.setText(tong+"");
	}
	protected void do_btnIn_actionPerformed(ActionEvent e) throws JRException {
		String a ="";
		Boolean check = true;
		if(!txtThang.getText().equals("")) {
			if(!Validation.checkRegex(RegexConst.THANG, txtThang.getText())) {
				a += "Vui lòng nhập tháng đúng định dạng";
				check = false;
			}
		}else {
			 a += "Vui lòng nhập tháng";
			 check = false;
		}
		
		
		if(!txtHoTen.getText().equals("")) {
			if(!Validation.checkRegex(RegexConst.TEN, txtHoTen.getText())) {
				a += "\n Vui lòng nhập tên đúng định dạng";
				check = false;
			}
		}else {
			 a += "\n Vui lòng nhập tên";
			 check = false;
		}
		
		
		if(!txtTienDien.getText().equals("")) {
			if(!Validation.checkRegex(RegexConst.TT, txtTienDien.getText())) {
				a += "\n Vui lòng nhập tiền điện";
				check = false;
			}
		}else {
			 a += "\n Vui lòng nhập tiền điện";
			 check = false;
		}
		
		String guihoadon = "insert into Bill (Id_Apt,Id_User,[Month],Electricity,Created_At) values (?,?,?,?,GETDATE())";
		int id_user = 0 ;
		int id_phong =0;
		if(check) {
			try (
					var con = ConnectDB.getConnect();
					PreparedStatement cs = con.prepareStatement(guihoadon);
					
					var st = con.createStatement();
					
					){
				
				String searchID_phong = "SELECT * FROM Apartment WHERE  Number_Apt = "+comboBoxRoom.getSelectedItem();
				var rs = st.executeQuery(searchID_phong);
				while (rs.next()) {
					  id_phong = rs.getInt("Id_Apt");
					}
				String update ="UPDATE Apartment SET [Status] = 1 where Id_Apt= "+id_phong;
				st.executeUpdate(update);
				
				String searchID_user = "SELECT * FROM UserApp WHERE  Fullname = '"+txtHoTen.getText()+"'";
				var user = st.executeQuery(searchID_user);
				while (user.next()) {
					  id_user = user.getInt("Id_User");
					}
				cs.setInt(1,id_phong);
				cs.setInt(2,id_user);
				cs.setString(3,txtThang.getText());
				cs.setString(4,txtTienDien.getText());
				cs.executeUpdate();
				
				JOptionPane.showMessageDialog(panel, "Gửi hóa đơn thành công");
				InHoaDon in = new InHoaDon();
				in.setVisible(true);
//				this.setVisible(false);
//				trangchu.setVisible(true);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}else {
			JOptionPane.showMessageDialog(panel, a);
		}
		
	}
}
