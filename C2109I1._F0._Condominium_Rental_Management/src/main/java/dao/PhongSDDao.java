package dao;

import java.util.ArrayList;
import java.util.List;

import database.ConnectDB;
import entity.PhongSD;


public class PhongSDDao {
	public static List<PhongSD> getList(){
		List<PhongSD> list = new ArrayList();
		try(
		    	var con = ConnectDB.getConnect();
		    	var st = con.createStatement();){
		    	String searchSQL = "SELECT * FROM Apartment WHERE  [Status] = 1";
				var rs = st.executeQuery(searchSQL);
			while(rs.next()) {
				var peo = new PhongSD();
				peo.setSoPhong(rs.getInt("Number_Apt"));
				list.add(peo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
