package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import database.ConnectDB;
import helper.RegexConst;
import helper.Validation;

import java.awt.CardLayout;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Component;
import com.toedter.calendar.JDateChooser;

public class LSThanhToan extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtSoPhong;
	private JLabel lblNewLabel_5;
	private JScrollPane scrollPane;
	private JButton btnTaiAnh;
	private JButton btnThucHien;
	private JButton btnQuayLai;
	public Trangchu trangchu;
	private JLabel lblAnh;
	private String newImg;
	private byte[] pimage;
	private JDateChooser dtcNgay;
	

	public Trangchu getTrangchu() {
		return trangchu;
	}

	public void setTrangchu(Trangchu trangchu) {
		this.trangchu = trangchu;
	}

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					LSThanhToan frame = new LSThanhToan();
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
	public LSThanhToan() {
		setTitle("Thanh Toán");
		setIconImage(Toolkit.getDefaultToolkit().getImage(LSThanhToan.class.getResource("/image/credit-card.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, "name_1133000003186100");
		
		lblNewLabel = new JLabel("Thanh Toán");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_1 = new JLabel("Số Phòng :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_2 = new JLabel("Thanh Toán Ngày:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtSoPhong = new JTextField();
		txtSoPhong.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtSoPhong.setHorizontalAlignment(SwingConstants.LEFT);
		txtSoPhong.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Hình Ảnh Hóa Đơn");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		scrollPane = new JScrollPane();
		
		btnTaiAnh = new JButton("Tải Ảnh ");
		btnTaiAnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		btnTaiAnh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		btnThucHien = new JButton("Thực Hiện ");
		btnThucHien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnThucHien_actionPerformed(e);
			}
		});
		btnThucHien.setIcon(new ImageIcon(LSThanhToan.class.getResource("/image/check (2).png")));
		btnThucHien.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuayLai_actionPerformed(e);
			}
		});
		btnQuayLai.setIcon(new ImageIcon(LSThanhToan.class.getResource("/image/back-arrow.png")));
		btnQuayLai.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		dtcNgay = new JDateChooser();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(dtcNgay, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(txtSoPhong))
					.addContainerGap(219, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(4)
					.addComponent(btnQuayLai)
					.addGap(52)
					.addComponent(btnThucHien, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(147, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
					.addGap(302))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnTaiAnh)
					.addGap(63))
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtSoPhong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(dtcNgay, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(58)
							.addComponent(btnTaiAnh))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
					.addGap(43)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnQuayLai)
						.addComponent(btnThucHien, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(36))
		);
		gl_panel.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNewLabel_1, lblNewLabel_2});
		
		lblAnh = new JLabel("");
		scrollPane.setViewportView(lblAnh);
		panel.setLayout(gl_panel);
	}
	protected void do_btnQuayLai_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		trangchu.setVisible(true);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		JFileChooser jfile = new JFileChooser("c://");
		
		FileNameExtensionFilter filter = new FileNameExtensionFilter("*.image","jpg","png");
		jfile.addChoosableFileFilter(filter);
		
		int result = jfile.showSaveDialog(null);

		File selecteFile = jfile.getSelectedFile();
		String filename = selecteFile.getName();
		
		
		if(filename.endsWith(".jpg")||filename.endsWith(".png")||filename.endsWith(".JPG")||filename.endsWith(".Png")) {
			if(result == JFileChooser.APPROVE_OPTION) {
				String path = selecteFile.getAbsolutePath();
				ImageIcon myImage = new ImageIcon(path);
				
				Image img = myImage.getImage();
				Image newImage = img.getScaledInstance(lblAnh.getWidth(), lblAnh.getHeight(), Image.SCALE_SMOOTH);
				
				newImg = jfile.getSelectedFile().getAbsolutePath();
				
				ImageIcon image = new ImageIcon(newImage);
				lblAnh.setIcon(image);
			}
			
		}else {
			JOptionPane.showMessageDialog(rootPane,"Ảnh không đúng định dạng","", 1);
		}
		
		
	}
	protected void do_btnThucHien_actionPerformed(ActionEvent e) {
		if(checkSpam()<3) {
		String a ="";
		Boolean check = true;
		if(!txtSoPhong.getText().equals("")) {
			if(!Validation.checkRegex(RegexConst.SP, txtSoPhong.getText())) {
				a += "Số phòng không hợp lệ";
				check = false;
			}
		}else {
			 a += "Vui lòng nhập số phòng";
			 check = false;
		}
		if(dtcNgay.getDate()==null) {
			 a += "\n Vui lòng nhập ngày";
			 check = false;
		}
		String thanhtoan = "insert into Payment_History (Id_Apt,Id_User,Dop,Img_Add,Img_File,Created_At) values (?,?,?,?,?,GETDATE())";
		int id_user = 0 ;
		File f = new File(newImg);
		if(check) {
			var ngay = new SimpleDateFormat("yyyy-MM-dd").format(dtcNgay.getDate());
			try (
					var con = ConnectDB.getConnect();
					PreparedStatement cs = con.prepareStatement(thanhtoan);
					InputStream is = new FileInputStream(f);
					var st = con.createStatement();
					
					){
				
				String searchID_user = "SELECT * FROM UserApp WHERE Phone = "+ShareData.Login.getPhone();
				var user = st.executeQuery(searchID_user);
				while (user.next()) {
					  id_user = user.getInt("Id_User");
					}
				cs.setString(1,txtSoPhong.getText());
				cs.setInt(2,id_user);
				cs.setString(3,ngay);
				cs.setString(4,newImg);
				cs.setBlob(5,is);
				
				cs.executeUpdate();
				JOptionPane.showMessageDialog(panel, "Gửi thanh toán thành công");
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
				PreparedStatement cs = con.prepareCall("{call limitPayment_History(?,'"+day+"')}");
				
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
