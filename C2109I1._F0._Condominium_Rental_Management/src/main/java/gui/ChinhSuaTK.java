package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.HopDongDao;
import entity.HopDongNguoiDung;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JComboBox;

public class ChinhSuaTK extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	public TrangChuADMIN trangchu;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnQuayLai;
	private JComboBox comboBoxCCCD;
	
	

	
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
					ChinhSuaTK frame = new ChinhSuaTK();
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
	public ChinhSuaTK() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ChinhSuaTK.class.getResource("/image/user (3).png")));
		setTitle("Chỉnh Sửa Tài Khoản");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 284);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, BorderLayout.CENTER);
		
		lblNewLabel = new JLabel("Chọn Số CCCD Để Chỉnh Sửa Thông Tin Phòng :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		btnNewButton = new JButton("Thực Hiện");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		btnNewButton.setIcon(new ImageIcon(ChinhSuaTK.class.getResource("/image/check (2).png")));
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setIcon(new ImageIcon(ChinhSuaTK.class.getResource("/image/back-arrow.png")));
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuayLai_actionPerformed(e);
			}
		});
		
		comboBoxCCCD = new JComboBox();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(30)
							.addComponent(btnQuayLai)
							.addGap(45)
							.addComponent(btnNewButton))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(comboBoxCCCD, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(72)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboBoxCCCD, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnNewButton, 0, 0, Short.MAX_VALUE)
						.addComponent(btnQuayLai, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(43, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		showCCCD();
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		TinhNang tn = new TinhNang();
		ShareData.Edit = (HopDongNguoiDung) comboBoxCCCD.getSelectedItem();
		tn.setVisible(true);
		tn.trangchu = this;
		this.setVisible(false);
	}
	protected void do_btnQuayLai_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		trangchu.setVisible(true);
	}
	
	private void showCCCD() {
		List<HopDongNguoiDung> data = HopDongDao.getList();
		for (var ac : data) {
			comboBoxCCCD.addItem(ac);
//			ShareData.Edit = ac;
		}
	}
}
