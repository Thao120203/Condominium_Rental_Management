package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class XemPhong extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnDaSD;
	private JButton btnChuaSD;
	public TrangChuADMIN trangchu;
	private JButton btnQuayLai;
	
	

	

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
					XemPhong frame = new XemPhong();
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
	public XemPhong() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(XemPhong.class.getResource("/image/room (2).png")));
		setTitle("Xem Phòng");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		lblNewLabel = new JLabel("Xem Phòng");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		lblNewLabel_1 = new JLabel("Bạn muốn xem phòng");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		btnDaSD = new JButton("Đã Sử Dụng");
		btnDaSD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnDaSD_actionPerformed(e);
			}
		});
		
		
		btnChuaSD = new JButton("Chưa Sử Dụng");
		btnChuaSD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnChuaSD_actionPerformed(e);
			}
		});
	
		
		btnQuayLai = new JButton("Quay Lại\r\n\r\n");
		btnQuayLai.setIcon(new ImageIcon(XemPhong.class.getResource("/image/back-arrow.png")));
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuayLai_actionPerformed(e);
			}
		});
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(52)
							.addComponent(btnDaSD)
							.addGap(90)
							.addComponent(btnChuaSD))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(12)
							.addComponent(btnQuayLai, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(16)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(90)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(15)
							.addComponent(btnDaSD))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(16)
							.addComponent(btnChuaSD)))
					.addGap(39)
					.addComponent(btnQuayLai, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		gl_panel.linkSize(SwingConstants.VERTICAL, new Component[] {btnDaSD, btnChuaSD});
		gl_panel.linkSize(SwingConstants.HORIZONTAL, new Component[] {btnDaSD, btnChuaSD});
		panel.setLayout(gl_panel);
	}

	 
	protected void do_btnDaSD_actionPerformed(ActionEvent e) {
		DaSD Dsd = new DaSD();
		Dsd.setVisible(true);
		Dsd.xemPhong = this;
		this.setVisible(false);
	}
	protected void do_btnChuaSD_actionPerformed(ActionEvent e) {
		ChuaSD Csd = new ChuaSD();
		Csd.setVisible(true);
		Csd.xemPhong = this;
		this.setVisible(false);
	}
	protected void do_btnQuayLai_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		trangchu.setVisible(true);
	}
}
