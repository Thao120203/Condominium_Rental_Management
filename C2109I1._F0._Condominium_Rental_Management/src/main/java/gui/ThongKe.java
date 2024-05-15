package gui;

import java.awt.EventQueue;
import java.sql.Date;
import java.text.DecimalFormat;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.ThongKeDao;
import dao.XemThietHaiDao;
import entity.SetHoaDon;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;	
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class ThongKe extends JFrame {

	private JPanel contentPane;
	public TrangChuADMIN trangchu;
	private JPanel panel;
	private JLabel lblTong;
	private JLabel lblThoiGian;
	private JComboBox comboQuy;
	private JButton btnTim;
	private JScrollPane scrollPane;
	private JTable table;
	private JScrollBar scrollBar;
	private List<entity.ThongKe> thongke;
	private JLabel lblNewLabel;
	private JComboBox comboNam;
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
					ThongKe frame = new ThongKe();
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
	public ThongKe() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ThongKe.class.getResource("/image/statistics-market-icon.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 658);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 596, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(40, Short.MAX_VALUE))
		);
		
		lblTong = new JLabel("Tong doanh thu: 0");
		lblTong.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		lblThoiGian = new JLabel("Thống kê theo tháng");
		lblThoiGian.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		comboQuy = new JComboBox();
		comboQuy.setModel(new DefaultComboBoxModel(new String[] {"null", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboQuy.setForeground(Color.BLACK);
		comboQuy.setEditable(true);
		comboQuy.setBackground(new Color(255, 255, 255));
		
		btnTim = new JButton("Tìm Kiếm");
		btnTim.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnTimActionPerformed(e);
			}
		});
		
		scrollPane = new JScrollPane();
		
		lblNewLabel = new JLabel("Năm : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		comboNam = new JComboBox();
		comboNam.setModel(new DefaultComboBoxModel(new String[] {"null","2020", "2021", "2022", "2023", "2024", "2025"}));
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuayLai_actionPerformed(e);
			}
		});
		btnQuayLai.setIcon(new ImageIcon(ThongKe.class.getResource("/image/back-arrow.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTong, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(11)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblThoiGian, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(comboQuy, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
									.addGap(26)
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(comboNam, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
									.addComponent(btnTim, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
									.addGap(184))))))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(250)
					.addComponent(btnQuayLai, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(350, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblThoiGian, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboQuy, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTim)
						.addComponent(lblNewLabel)
						.addComponent(comboNam, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 442, GroupLayout.PREFERRED_SIZE)
					.addGap(21)
					.addComponent(lblTong, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnQuayLai, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(48))
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		loadThongKe();
	}
	public void loadThongKe() {
		DefaultTableModel model = new DefaultTableModel() {
			public Class<?> getColumnClass(int column){
				switch(column) {
				case 0: return Integer.class;
				case 1: return Integer.class;
				case 2: return Integer.class;
				default:
					return String.class;
				}
			}
		};
		model.addColumn("Tháng");
		model.addColumn("Phòng");
		model.addColumn("Thành tiền");
		
	
		ThongKeDao dao = new ThongKeDao(); 
		dao.getList().forEach(
			tk -> model.addRow(new Object[] {
				tk.getNgay(),
				tk.getSoPhong(),
				tk.getTienDien()+tk.getTienNuoc()+tk.getTienPhong()+tk.getTienRac_wifi()+tk.getTienXe()
			})
		);
		
		table.setModel(model);
		table.setRowHeight(60);
		tong();
	}

	private void tong() {
		DecimalFormat x = new DecimalFormat("###,###,###");
		int tong =0;
		for(int i=0;i<table.getRowCount();i++) {
			 tong+= Integer.parseInt(table.getValueAt(i,2).toString());
		}
		lblTong.setText("Tổng doanh thu: "+tong+" VND");
	}
	
	protected void btnTimActionPerformed(ActionEvent e) {
		String Month = (String) comboQuy.getSelectedItem();
		String Year = (String) comboNam.getSelectedItem();
		if(Year!="null" || Month=="null" && Year=="null") {
			thongke = new ThongKeDao().find(Month,Year);
			DefaultTableModel model = new DefaultTableModel() {
				public Class<?> getColumnClass(int column){
					switch(column) {
					case 0: return Integer.class;
					case 1: return Integer.class;
					case 2: return Integer.class;
					default:
						return String.class;
					}
				}
			};
			model.addColumn("Tháng");
			model.addColumn("Phòng");
			model.addColumn("Thành tiền");
			model.setRowCount(0);
			for (entity.ThongKe tk:thongke) {
				model.addRow(new Object[] {
						
						tk.getNgay(),
						tk.getSoPhong(),
						tk.getTienDien()+tk.getTienNuoc()+tk.getTienPhong()+tk.getTienRac_wifi()+tk.getTienXe()
				});
			}
			table.setModel(model);
			table.setRowHeight(60);
			tong();
		}	else {
			JOptionPane.showMessageDialog(contentPane,"Vui lòng chọn năm");
		}
		
		
	}
	protected void do_btnQuayLai_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		trangchu.setVisible(true);
	}
}
