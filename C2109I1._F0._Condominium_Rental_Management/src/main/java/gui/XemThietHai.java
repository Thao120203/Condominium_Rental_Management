package gui;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.XemThietHaiDao;

import java.awt.CardLayout;
import javax.swing.JSpinner;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class XemThietHai extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JScrollBar scrollBar;
	private JTable table;
	public TrangChuADMIN trangchu;
	private JPanel panel_2;
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
					XemThietHai frame = new XemThietHai();
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
	public XemThietHai() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(XemThietHai.class.getResource("/image/abandoned-house.png")));
		setTitle("Xem Thiệt Hại");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, "name_1157684777127700");
		panel.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.SOUTH);
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuayLai_actionPerformed(e);
			}
		});
		btnQuayLai.setIcon(new ImageIcon(XemThietHai.class.getResource("/image/back-arrow.png")));
		panel_2.add(btnQuayLai);
		loadKhieuNai();
	}
	protected void do_btnQuayLai_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		trangchu.setVisible(true);
	}
	
	public void loadKhieuNai() {
		DefaultTableModel model = new DefaultTableModel() {
			public Class<?> getColumnClass(int column){
				switch(column) {
				case 0:
					return Integer.class;
				case 1:
					return String.class;
				case 2: return ImageIcon.class;
				default:
					return ImageIcon.class;
				}
			}
		};
		model.addColumn("Tên Người Dùng");
		model.addColumn("Số Phòng");
		model.addColumn("Hình Ảnh");
		
		
		XemThietHaiDao dao = new XemThietHaiDao();
		dao.getList().forEach(
			pro -> model.addRow(new Object[] {
				pro.getId_NguoiDung(),
				pro.getSoPhong(),
				pro.getAnhThietHai(),
				
			})
		);
		table.setModel(model);
		table.setRowHeight(60);
	}
}
