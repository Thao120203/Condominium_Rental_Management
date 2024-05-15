package dao;

import java.util.ArrayList;
import java.util.List;

import database.ConnectDB;
import entity.PhongTrong;

public class PhongTrongDao {
	public static List<PhongTrong> getList(){
		List<PhongTrong> list = new ArrayList();
		try(
		    	var con = ConnectDB.getConnect();
		    	var st = con.createStatement();){
		    	String searchSQL = "SELECT * FROM Apartment WHERE  [Status] = 0";
				var rs = st.executeQuery(searchSQL);
			while(rs.next()) {
				var peo = new PhongTrong();
				peo.setSoPhong(rs.getInt("Number_Apt"));
				list.add(peo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
