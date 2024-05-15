package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import database.ConnectDB;
import database.ConnectDBFromProperties;
import entity.KhieuNai;
import entity.PhongTrong;

public class XemKhieuNaiDao {
	private static CallableStatement createCS(Connection connect) throws SQLException {
		String sql = "SELECT UserApp.Fullname,Complain.Content FROM Complain"
    			+ "  ,UserApp where Complain.Id_User = UserApp.Id_User";
		
		var cs = connect.prepareCall(sql);
		return cs;
	}
	

	public List<KhieuNai> getList(){
		List<KhieuNai> list = new ArrayList();
		try(
				var con = ConnectDB.getConnect();
				var cs = createCS(con);
				var rs = cs.executeQuery();
				) {
			while(rs.next()) {
				var kn = new KhieuNai();
				kn.setId_NguoiDung(rs.getString("Fullname"));
				kn.setNoiDung(rs.getString("Content"));
				
				list.add(kn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
