package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.PhongSDDao;
import dao.PhongTrongDao;
import database.ConnectDB;
import entity.PhongSD;
import entity.PhongTrong;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class DaSD extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtNum;
	public XemPhong xemPhong;
	private JLabel lblNewLabel_2;
	private JComboBox comboBoxDaSd;
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
					DaSD frame = new DaSD();
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
	public DaSD() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DaSD.class.getResource("/image/used.png")));
		setTitle("Phòng Đã Sử Dụng");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 283);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		lblNewLabel = new JLabel("Phòng Đã Sử Dụng");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_1 = new JLabel("Tổng số phòng đã sử dụng :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		txtNum = new JTextField();
		txtNum.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Các Phòng Đã Sử Dụng :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		comboBoxDaSd = new JComboBox();
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setIcon(new ImageIcon(DaSD.class.getResource("/image/back-arrow.png")));
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuayLai_actionPerformed(e);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(175)
							.addComponent(txtNum, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxDaSd, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnQuayLai)))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(8)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtNum, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxDaSd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addComponent(btnQuayLai)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		loadPhongSD();
		showPhongSD();
	}

	protected void do_btnQuayLai_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		xemPhong.setVisible(true);
	}
	
	public int loadPhongSD() {
		int pt = 0;
		try (
		    	var con = ConnectDB.getConnect();
		    	var st = con.createStatement();){
		    	String searchSQL = "SELECT COUNT(Id_Apt) FROM Apartment WHERE [Status] = 1";
				var rs = st.executeQuery(searchSQL);
				while (rs.next()) {
					pt = rs.getInt(1);
				}
				txtNum.setText(pt+""); 
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e);
			}
		return pt;
	}
	private void showPhongSD() {
		List<PhongSD> data = PhongSDDao.getList();
		for (var phong : data) {
			comboBoxDaSd.addItem(phong);
		}
	}
}
