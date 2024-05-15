package dao;

import java.util.ArrayList;
import java.util.List;

import database.ConnectDB;
import database.ConnectDBFromProperties;
import entity.PhongSD;

public class SoPhongDao {
	private List<PhongSD> listPhong;
	
	public List<PhongSD> selectPhong(){
		listPhong = new ArrayList<PhongSD>();
		try(
				var con = ConnectDB.getConnect();
				var cs = con.prepareCall("{Call selPhong}");
				var rs = cs.executeQuery();
		) {
			while(rs.next()) {
				PhongSD phong = new PhongSD();
				phong.setId_SoPhong(rs.getInt("Id_Apt"));
				phong.setSoPhong(rs.getInt("Number_Apt"));
				phong.setTrangThai(rs.getBoolean("Status"));
		
				listPhong.add(phong);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return listPhong;
	}
	
}
