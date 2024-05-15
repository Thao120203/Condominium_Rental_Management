package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import database.ConnectDB;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class TinhNang extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnXoa;
	public ChinhSuaTK trangchu;
	private JButton btnQuayLai;
	
	

	public ChinhSuaTK getTrangchu() {
		return trangchu;
	}

	public void setTrangchu(ChinhSuaTK trangchu) {
		this.trangchu = trangchu;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TinhNang frame = new TinhNang();
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
	public TinhNang() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TinhNang.class.getResource("/image/user (3).png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		lblNewLabel = new JLabel("Bạn Muốn Chỉnh Sửa Hay Xóa Tài Khoản");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		btnNewButton = new JButton("Chỉnh Sửa");
		btnNewButton.setIcon(new ImageIcon(TinhNang.class.getResource("/image/edit (1).png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		
		btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnXoa_actionPerformed(e);
			}
		});
		btnXoa.setIcon(new ImageIcon(TinhNang.class.getResource("/image/delete.png")));
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setIcon(new ImageIcon(TinhNang.class.getResource("/image/back-arrow.png")));
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuayLai_actionPerformed(e);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 388, GroupLayout.PREFERRED_SIZE)
							.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addGap(36)
								.addComponent(btnNewButton)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnXoa)
								.addGap(37)))
						.addComponent(btnQuayLai))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addComponent(lblNewLabel)
					.addGap(42)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnXoa))
					.addGap(27)
					.addComponent(btnQuayLai)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		TinhNangSua kn = new TinhNangSua();
		kn.setVisible(true);
		kn.trangchu = this;
		this.setVisible(false);
	}
	protected void do_btnQuayLai_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		trangchu.setVisible(true);
	}
	protected void do_btnXoa_actionPerformed(ActionEvent e) {
		int id_user = 0 ;
		int id_phong = 0;
		if(JOptionPane.showConfirmDialog(btnNewButton,"bạn có chắc muốn xóa không")==JOptionPane.YES_OPTION) {
			
		String hd = "delete from [Contract] where Id_User = ?";
		String nd = "delete from UserApp where Id_User = ?";
		String kn = "delete from Complain where Id_User = ?";
		String hdon = "delete from Bill where Id_User = ?";
		String th = "delete from Damage_Apt where Id_User = ?";
		String tt = "delete from Payment_History where Id_User = ?";
		String update ="UPDATE Apartment SET [Status] = 0 where Number_Apt =? ";
		try(
				var con = ConnectDB.getConnect();
				PreparedStatement dh = con.prepareStatement(hd);
				PreparedStatement dn = con.prepareStatement(nd);
				PreparedStatement hoadon = con.prepareStatement(hdon);
				PreparedStatement thiethai = con.prepareStatement(th);
				PreparedStatement thanht = con.prepareStatement(tt);
				PreparedStatement nk = con.prepareStatement(kn);
				PreparedStatement phong = con.prepareStatement(update);

				var rs = con.createStatement()
				) {
			
				String searchID_nguoi = "SELECT Id_User FROM UserApp WHERE CI_Card = '"+ShareData.Edit.getCccd()+"'";
				var idn = rs.executeQuery(searchID_nguoi);
				while (idn.next()) {	
					id_user = idn.getInt("Id_User");	
				}
//				String searchID_phong = "SELECT Id_Phong FROM HopDong WHERE Id_NguoiDung ="+id_user;
//				var id = rs.executeQuery(searchID_phong);
//				while (id.next()) {	
//					id_phong = id.getInt("Id_NguoiDung");	
//					}
				phong.setInt(1, ShareData.Edit.getSoPhong());
				phong.executeUpdate();
				dh.setInt(1, id_user);
				dh.executeUpdate();
				nk.setInt(1, id_user);
				nk.executeUpdate();
				hoadon.setInt(1, id_user);
				hoadon.executeUpdate();
				thiethai.setInt(1, id_user);
				thiethai.executeUpdate();
				thanht.setInt(1, id_user);
				thanht.executeUpdate();
				dn.setInt(1, id_user);
				dn.executeUpdate();
				
				
				JOptionPane.showMessageDialog(btnNewButton, "xoa thanh cong");
				this.setVisible(false);
				TrangChuADMIN tc = new TrangChuADMIN();
				tc.setVisible(true);
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		}
	}
	
	
}
