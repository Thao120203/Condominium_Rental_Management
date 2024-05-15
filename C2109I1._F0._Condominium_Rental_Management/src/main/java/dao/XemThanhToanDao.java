package dao;

import java.awt.Image; 
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import database.ConnectDB;
import entity.ThanhToan;
import entity.ThietHaii;

public class XemThanhToanDao {
	private static CallableStatement createCS(Connection connect) throws SQLException {
		String sql = "SELECT * FROM Payment_History"
				+ ",UserApp where Payment_History.Id_user = UserApp.Id_User";
		
		var cs = connect.prepareCall(sql);
		return cs;
	}
	
	private ImageIcon format = null;
	public List<ThanhToan> getList(){
		List<ThanhToan> list = new ArrayList();
		try(
				var con = ConnectDB.getConnect();
				var cs = createCS(con);
				var rs = cs.executeQuery();
				) {
			while(rs.next()) {
				var th = new ThanhToan();
				th.setId_NguoiDung(rs.getString("Fullname"));
				byte[] imageData = rs.getBytes("Img_File");
				format = new ImageIcon(imageData);
				Image mm = format.getImage();
				Image img = mm.getScaledInstance(100,100,Image.SCALE_SMOOTH );
				ImageIcon image = new ImageIcon(img);
				th.setAnhThanhToan(image);
				th.setNgayThanhToan(LocalDate.parse(rs.getString("Dop")));
				list.add(th);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}


}
