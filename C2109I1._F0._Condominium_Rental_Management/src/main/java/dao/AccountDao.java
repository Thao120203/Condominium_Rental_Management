package dao;

import java.sql.CallableStatement; 
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.ConnectDB;
import database.ConnectDBFromProperties;
import entity.Account;

import entity.PhongTrong;
import gui.ShareData;

public class AccountDao {
	public static List<Account> getList(){
		List<Account> list = new ArrayList();
		
		try(
		    	var con = ConnectDB.getConnect();
		    	var st = con.createStatement();){
		    	String searchSQL = "SELECT * FROM UserApp"
		    			+ " join Apartment on Id_User=Id_User"
		    			+ " WHERE [Level]= null";
				var rs = st.executeQuery(searchSQL);
			while(rs.next()) {
				var acc = new Account();
				acc.setPhone(rs.getString("Phone"));
				acc.setCCCD(rs.getString("CI_Card"));
				list.add(acc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<Account> getListCCCD(){
		List<Account> list = new ArrayList();
		
		try(
		    	var con = ConnectDB.getConnect();
		    	var st = con.createStatement();){
		    	String searchSQL = "SELECT * FROM UserApp";
				var rs = st.executeQuery(searchSQL);
			while(rs.next()) {
				var acc = new Account();
				acc.setPhone(rs.getString("Phone"));
				acc.setCCCD(rs.getString("CI_Card"));
				list.add(acc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public Account checkLogin(String phone) throws Exception{
		String sql = "select Phone , Pass ,[Level] from UserApp"
				+ " where Phone = ? ";
		try (
				Connection con = ConnectDB.getConnect();
				PreparedStatement pstmt = con.prepareStatement(sql);
				){
			pstmt.setString(1, phone);
			try(ResultSet rs = pstmt.executeQuery())
			{	
				if(rs.next()) {
					Account acc= new Account();
					acc.setPhone(phone);
					acc.setQuyenhan(rs.getInt("Level"));
		
//					acc.setCCCD(rs.getString("CCCD"));
					return acc;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
