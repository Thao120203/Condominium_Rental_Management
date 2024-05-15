package dao;

import java.awt.Image;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import database.ConnectDB;

import entity.ThongKe;

public class ThongKeDao {
	private static CallableStatement createCS(Connection connect) throws SQLException {
		String sql = "SELECT * FROM Apartment"
    			+ "  Join Bill on Bill.Id_Apt = Apartment.Id_Apt"
				+ "  Join Contract on Contract.Id_Apt = Apartment.Id_Apt";
		
		
		var cs = connect.prepareCall(sql);
		return cs;
	}


	public List<ThongKe> getList(){
		List<ThongKe> list = new ArrayList();
		
		try( 
				var con = ConnectDB.getConnect();
				var cs = createCS(con);
				var rs = cs.executeQuery();
				
				) {
			while(rs.next()) {
				var th = new ThongKe();
				th.setSoPhong(rs.getInt("Number_Apt"));
				th.setNgay(rs.getInt("Month"));
				th.setTienDien(rs.getInt("Electricity"));
				th.setTienPhong(rs.getInt("Rent_Apt"));
				th.setTienXe(rs.getInt("Parking_Fee"));
				th.setTienNuoc(rs.getInt("Water"));
				th.setTienRac_wifi(rs.getInt("Garbage_wifi"));
				list.add(th);
			}
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		return list;
	}
	public List<ThongKe> find(String Month,String Year){
		List<ThongKe> list = new ArrayList<>() ;
		String find = "SELECT * FROM Apartment"
    			+ "  Join Bill on Bill.Id_Apt = Apartment.Id_Apt"
				+ "  Join Contract on Contract.Id_Apt = Apartment.Id_Apt"
				+ "	 Where Month like ? and Created_At like ?";
		try	{
				var con = ConnectDB.getConnect();
				PreparedStatement ps = con.prepareStatement(find);
				
				if(Month=="null") {
					ps.setString(1,"%%");
				} else ps.setString(1,Month+"%");
				if(Year=="null") {
					ps.setString(2,"%%");
				} else ps.setString(2,"%"+Year+"%");
				var rs = ps.executeQuery();
				
			while(rs.next()) {
				
				var th = new ThongKe();
				th.setSoPhong(rs.getInt("Number_Apt"));
				th.setNgay(rs.getInt("Month"));
				th.setTienDien(rs.getInt("Electricity"));
				th.setTienPhong(rs.getInt("Rent_Apt"));
				th.setTienXe(rs.getInt("Parking_Fee"));
				th.setTienNuoc(rs.getInt("Water"));
				th.setTienRac_wifi(rs.getInt("Garbage_wifi"));
				list.add(th);
			}
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		return list;
	}
}
