package dao;

import java.util.ArrayList;
import java.util.List;

import database.ConnectDB;
import database.ConnectDBFromProperties;
import entity.SetHoaDon;
import gui.ShareData;

public class SetHoaDonDAO {
	List<SetHoaDon> listSetHoaDon;
	
	public List<SetHoaDon> selectBySoPhong(int soPhong){
		listSetHoaDon = new ArrayList<SetHoaDon>();
		try(
				var con = ConnectDB.getConnect();
				var cs = con.prepareCall("{call getDataWithNumber_Apt(?)}");	
		) {
				cs.setInt(1,soPhong);
			var rs = cs.executeQuery();
			while(rs.next()) {
				SetHoaDon shd = new SetHoaDon();
				shd.setHoTen(rs.getString("Fullname"));
				shd.setTienphong(rs.getInt("Rent_Apt"));
				shd.setTiencoc(rs.getInt("Deposit"));
				shd.setTienxe(rs.getInt("Parking_Fee"));
				shd.setTiennuoc(rs.getInt("Water"));
				shd.setTienrac_wifi(rs.getInt("Garbage_Wifi"));
				shd.setSophong(soPhong);
				ShareData.Room=shd;
				listSetHoaDon.add(shd);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return listSetHoaDon;
	}
}
