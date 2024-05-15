package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.XemThanhToanDao;
import dao.XemThietHaiDao;

import java.awt.CardLayout;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class XemThanhToan extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JScrollBar scrollBar;
	public TrangChuADMIN trangchu;
	private JPanel panel_2;
	private JButton btnNewButton;
	private JTable table;
	
	

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
					XemThanhToan frame = new XemThanhToan();
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
	public XemThanhToan() {
		setTitle("Xem Thanh Toán");
		setIconImage(Toolkit.getDefaultToolkit().getImage(XemThanhToan.class.getResource("/image/credit-card.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, "name_1253365161360800");
		panel.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.SOUTH);
		
		btnNewButton = new JButton("Quay Lại");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		btnNewButton.setIcon(new ImageIcon(XemThanhToan.class.getResource("/image/back-arrow.png")));
		panel_2.add(btnNewButton);
		loadThanhToan();
	}

	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		trangchu.setVisible(true);
	}
	public void loadThanhToan() {
		DefaultTableModel model = new DefaultTableModel() {
			public Class<?> getColumnClass(int column){
				switch(column) {
				case 0:
					return Integer.class;
				case 1:
					return ImageIcon.class;
				case 2:
					return String.class;	
				default:
					return String.class;
				}
			}
		};
		model.addColumn("Tên Người Dùng");
		model.addColumn("Hinh Anh");
		model.addColumn("Ngày Thanh Toán");
		
		
		
		XemThanhToanDao dao = new XemThanhToanDao();
		dao.getList().forEach(
			pro -> model.addRow(new Object[] {
				pro.getId_NguoiDung(),
				pro.getAnhThanhToan(),
				pro.getNgayThanhToan(),
				
			})
		);
		table.setModel(model);
		table.setRowHeight(60);
	}
}
