package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import database.ConnectDB;
import entity.HopDongNguoiDung;
import entity.SetHoaDon;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.swing.JRViewer;

public class InHoaDon extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InHoaDon frame = new InHoaDon();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws JRException 
	 */
	public InHoaDon() throws JRException {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		getData();
	}
	public void getData() throws JRException {
		List<Map<String, ?>> list = new ArrayList<>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		String sql ="Select * from UserApp"
				+ " Join Contract on UserApp.Id_User = Contract.Id_User"
				+ " where  UserApp.Fullname ='"+ShareData.Room.getHoTen()+"'";
		String sql2 ="Select * from Bill"
				+ " where  Id_Apt ="+ ShareData.Room.getSophong();
		int xe= 0;
		int dien = 0;
		try(
				var con = ConnectDB.getConnect();
				var ss = con.prepareStatement(sql);	
				var cs = con.prepareStatement(sql2);
		) {
				
			var rs = cs.executeQuery();
			var ks = ss.executeQuery();
			while(rs.next()) {
				map2.put("Ngay", rs.getString("Created_At"));
				map2.put("Phong", rs.getInt("Id_Apt"));
				map2.put("Dien", dien=rs.getInt("Electricity"));
				list.add(map2);
			}
			while(ks.next()) {

				map2.put("Ten", ks.getString("Fullname"));
				if( ks.getInt("Parking_Fee")>0) {
					map2.put("Xe", xe=ks.getInt("Parking_Fee"));
				} else {
					
					map2.put("Xe",xe= 0);
				}
				var tong = xe+dien+ks.getInt("Rent_Apt")
				+Integer.parseInt(ks.getString("Water"))+Integer.parseInt(ks.getString("Garbage_Wifi")); 
				map2.put("Tong", tong);
				list.add(map2);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
			
			
		
		JRDataSource dataSource = new JRBeanCollectionDataSource(list);
		
		String file = "img/reportOrder2.jrxml";
		JasperReport rp = JasperCompileManager.compileReport(file);
		JasperPrint print = JasperFillManager.fillReport(rp, null, dataSource);
		this.getContentPane().add(new JRViewer(print));
		
		this.pack();
	}	
}
