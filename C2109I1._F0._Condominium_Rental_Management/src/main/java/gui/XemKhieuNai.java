package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.XemKhieuNaiDao;

import java.awt.CardLayout;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.ListSelectionModel;

public class XemKhieuNai extends JFrame {

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
					XemKhieuNai frame = new XemKhieuNai();
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
	public XemKhieuNai() {
		setTitle("Xem Thiệt Hại");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(XemKhieuNai.class.getResource("/image/complaint (2).png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, "name_1160814025452900");
		panel.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		table.setFont(new Font("Times New Roman", Font.BOLD, 16));
		scrollPane.setViewportView(table);
		
		panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.SOUTH);
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setIcon(new ImageIcon(XemKhieuNai.class.getResource("/image/back-arrow.png")));
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuayLai_actionPerformed(e);
			}
		});
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
			
				default:
					return String.class;
				}
			}
		};
		model.addColumn("Tên Người Dùng");
		model.addColumn("Nội Dung");
		
		
		
		XemKhieuNaiDao dao = new XemKhieuNaiDao();
		dao.getList().forEach(
			pro -> model.addRow(new Object[] {
				pro.getId_NguoiDung(),
				pro.getNoiDung().toString(),
				
			})
		);
		table.setModel(model);
		table.setRowHeight(60);
	}
}
