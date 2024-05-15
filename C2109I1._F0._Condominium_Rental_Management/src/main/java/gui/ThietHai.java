package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.border.MatteBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import database.ConnectDB;
import helper.RegexConst;
import helper.Validation;
import entity.ThietHaii;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Toolkit;

public class ThietHai extends JFrame {
	
	
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	JPanel panel_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	public Trangchu trangchu;
	private JScrollPane scrollPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnThucHien;
	private JTextField txtThietHai;
	private JLabel lblAnh;
	private String newImg;
	private byte[] pimage;
	
	
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
//					ThietHai frame = new ThietHai();
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
	public ThietHai() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ThietHai.class.getResource("/image/abandoned-house.png")));
		setTitle("Thiệt Hại");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 636);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		contentPane.add(panel, BorderLayout.NORTH);
		
		lblNewLabel1 = new JLabel("");
		lblNewLabel1.setIcon(new ImageIcon(ThietHai.class.getResource("/image/Apartment-icon.png")));
		
		lblNewLabel_1 = new JLabel("35/6 Đường D5, Phường 25 ,Quận Bình Thạnh ,Thành Phồ Hồ Chí Minh");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		lblNewLabel_2 = new JLabel("APTECH HOME");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 661, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(22)
					.addComponent(lblNewLabel1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2))
					.addGap(111))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 87, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel1)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(12)
							.addComponent(lblNewLabel_1)))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		lblNewLabel_3 = new JLabel("Thiệt Hại ");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_4 = new JLabel("Thiệt Hại Trước Khi Thuê");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblNewLabel_5 = new JLabel("Hình Ảnh Thiệt Hại");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		scrollPane = new JScrollPane();
		
		btnNewButton = new JButton("Tải Ảnh");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		
		btnNewButton_1 = new JButton("Quay Lại");
		btnNewButton_1.setIcon(new ImageIcon(ThietHai.class.getResource("/image/back-arrow.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_1_actionPerformed(e);
			}
		});
		
		btnThucHien = new JButton("Thực Hiện");
		btnThucHien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnThucHien_actionPerformed(e);
			}
		});
		btnThucHien.setIcon(new ImageIcon(ThietHai.class.getResource("/image/check (2).png")));
		
		txtThietHai = new JTextField();
		txtThietHai.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(21)
							.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(10)
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
									.addGap(52)
									.addComponent(btnNewButton))
								.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(9)
									.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
									.addGap(121)
									.addComponent(btnThucHien))
								.addComponent(txtThietHai, GroupLayout.PREFERRED_SIZE, 466, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(txtThietHai, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addGap(42))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnNewButton)
							.addGap(52)
							.addComponent(btnThucHien, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(40))))
		);
		
		lblAnh = new JLabel("");
		scrollPane.setViewportView(lblAnh);
		gl_panel_1.linkSize(SwingConstants.VERTICAL, new Component[] {btnNewButton_1, btnThucHien});
		gl_panel_1.linkSize(SwingConstants.HORIZONTAL, new Component[] {btnNewButton_1, btnThucHien});
		panel_1.setLayout(gl_panel_1);
	}

	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
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
			JOptionPane.showMessageDialog(rootPane,"ảnh không đúng định dạng","", 1);
		}
		
		
	}
	protected void do_btnThucHien_actionPerformed(ActionEvent e) {
		if(checkSpam()<3) {
		
		String a ="";
		Boolean check = true;
		if(!txtThietHai.getText().equals("")) {
			if(!Validation.checkRegex(RegexConst.TH, txtThietHai.getText())) {
				a += "Vui lòng không nhập quá 180 kí tự";
				check = false;
			}
		}else {
			 a += "Vui lòng nhập thiệt hại";
			 check = false;
		}
		
		String thiethai = "insert into Damage_Apt(Id_Apt,Id_User,Img_Add,Img_File,Created_At) values (?,?,?,?,GETDATE())";
		int id_user = 0 ;
		String hoten ;
		int id_phong = 0 ;

		File f = new File(newImg);
		
		if(check) {
			try (
					var con = ConnectDB.getConnect();
					InputStream is = new FileInputStream(f);
					PreparedStatement cs = con.prepareStatement(thiethai);
					var st = con.createStatement();
					
					){
				
				 	
				String searchID_user = "SELECT * FROM UserApp WHERE Phone = "+ShareData.Login.getPhone();
				var user = st.executeQuery(searchID_user);
				while (user.next()) {
					  id_user = user.getInt("Id_User");
					}
				
				String searchID_phong = "SELECT * FROM [Contract] WHERE Id_User = "+id_user;
				var rs = st.executeQuery(searchID_phong);
				while (rs.next()) {
					  id_phong = rs.getInt("Id_Apt");
					}
				
//				var anh = new ThietHaii();
				
				cs.setInt(1,id_phong);
				cs.setInt(2,id_user);
//				anh.setAnhThietHai(newImg);
				cs.setString(3,newImg);
				cs.setBlob(4, is);
				
				cs.executeUpdate();
				JOptionPane.showMessageDialog(panel, "Gửi thiệt hại thành công");
				this.setVisible(false);
				trangchu.setVisible(true);
				
			} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
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
				PreparedStatement cs = con.prepareCall("{call limitDamage_Apt(?,'"+day+"')}");
				
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
