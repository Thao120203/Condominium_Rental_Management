package dao;

import java.util.ArrayList;
import java.util.List;

import database.ConnectDB;
import entity.Account;
import entity.HopDongNguoiDung;
import gui.ShareData;

public class HopDongDao {
	public static List<HopDongNguoiDung> getList(){
		List<HopDongNguoiDung> list = new ArrayList();
		
		try(
		    	var con = ConnectDB.getConnect();
		    	var st = con.createStatement();){
		    	String searchSQL = "SELECT * FROM [Contract]"
		    			+ " join UserApp on [Contract].Id_User=UserApp.Id_User"
		    			+ " join Apartment on [Contract].Id_Apt=Apartment.Id_Apt"
		    			+ " ";
				var rs = st.executeQuery(searchSQL);
			while(rs.next()) {
				var acc = new HopDongNguoiDung();
				acc.setSoPhong(rs.getInt("Number_Apt"));
				acc.setCccd(rs.getString("CI_Card"));
				list.add(acc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
