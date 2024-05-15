package dao;

import java.awt.Image;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import database.ConnectDB;
import entity.KhieuNai;
import entity.ThietHaii;
import gui.ShareData;

public class XemThietHaiDao {
	private static CallableStatement createCS(Connection connect) throws SQLException {
		String sql = "SELECT * FROM Damage_Apt"
    			+ "  join Apartment on Damage_Apt.Id_Apt= Apartment.Id_Apt"
    			+ "  join UserApp on UserApp.Id_User = Damage_Apt.Id_User";
		
		var cs = connect.prepareCall(sql);
		return cs;
	}
	private ImageIcon format = null;

	public List<ThietHaii> getList(){
		List<ThietHaii> list = new ArrayList();
		
		try(
				var con = ConnectDB.getConnect();
				var cs = createCS(con);
				var rs = cs.executeQuery();
				
				) {
			while(rs.next()) {
				var th = new ThietHaii();
				th.setId_NguoiDung(rs.getString("Fullname"));
				th.setSoPhong(rs.getInt("Number_Apt"));
				byte[] imageData = rs.getBytes("Img_File");
				format = new ImageIcon(imageData);
				Image mm = format.getImage();
				Image img = mm.getScaledInstance(100,100,Image.SCALE_SMOOTH );
				ImageIcon image = new ImageIcon(img);
				th.setAnhThietHai(image);
				list.add(th);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
