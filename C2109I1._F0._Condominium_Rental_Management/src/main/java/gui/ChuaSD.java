package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.PhongTrongDao;
import database.ConnectDB;
import entity.PhongTrong;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class ChuaSD extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JComboBox textPhongTrong;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textNum;
	public XemPhong xemPhong;
	private JButton btnQuayLai;

	
	
	
	public XemPhong getXemPhong() {
		return xemPhong;
	}

	public void setXemPhong(XemPhong xemPhong) {
		this.xemPhong = xemPhong;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChuaSD frame = new ChuaSD();
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
	public ChuaSD() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ChuaSD.class.getResource("/image/do-not.png")));
		setBackground(new Color(240, 248, 255));
		setTitle("Tài Khoản Chưa Sử Dụng");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 270);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		lblNewLabel = new JLabel("Các Phòng Chưa Sử Dụng :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		textPhongTrong = new JComboBox();
		textPhongTrong.setForeground(new Color(0, 0, 0));
		
		lblNewLabel_1 = new JLabel("Tổng Số Phòng Chưa Sử Dụng :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		lblNewLabel_2 = new JLabel("Phòng Chưa Sử Dụng");
		lblNewLabel_2.setBackground(new Color(102, 204, 204));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		textNum = new JTextField();
		textNum.setDisabledTextColor(new Color(0, 0, 0));
		textNum.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textNum.setForeground(new Color(255, 255, 255));
		textNum.setEnabled(false);
		textNum.setColumns(10);
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setIcon(new ImageIcon(ChuaSD.class.getResource("/image/back-arrow.png")));
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
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textNum, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textPhongTrong, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(123, Short.MAX_VALUE))
				.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnQuayLai)
					.addContainerGap(373, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(textNum, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPhongTrong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
					.addComponent(btnQuayLai)
					.addGap(21))
		);
		gl_contentPane.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNewLabel, lblNewLabel_1});
		contentPane.setLayout(gl_contentPane);
		loadPhongTrong();
		showPhongTrong();

	}

	protected void do_btnQuayLai_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		xemPhong.setVisible(true);
	}
	public int loadPhongTrong() {
		int pt = 0;
		try (
		    	var con = ConnectDB.getConnect();
		    	var st = con.createStatement();){
		    	String searchSQL = "SELECT COUNT(Id_Apt) FROM Apartment WHERE [Status] = 0";
				var rs = st.executeQuery(searchSQL);
				while (rs.next()) {
					pt = rs.getInt(1);
				}
				textNum.setText(pt+""); 
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e);
			}
		return pt;
	}
	private void showPhongTrong() {
		List<PhongTrong> data = PhongTrongDao.getList();
		for (var phong : data) {
			textPhongTrong.addItem(phong);
		}
	}
}
