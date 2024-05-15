package entity;

public class Account {
	private String phone;
	private String password;
	private int quyenhan;
	private String CCCD;
	private int soPhong;
	private int status;
	
	public Account() {}

	
	public Account(String phone, String password, int quyenhan, String cCCD, int soPhong, int status) {
		this.phone = phone;
		this.password = password;
		this.quyenhan = quyenhan;
		CCCD = cCCD;
		this.soPhong = soPhong;
		this.status = status;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getQuyenhan() {
		return quyenhan;
	}


	public void setQuyenhan(int quyenhan) {
		this.quyenhan = quyenhan;
	}


	public String getCCCD() {
		return CCCD;
	}


	public void setCCCD(String cCCD) {
		CCCD = cCCD;
	}


	public int getSoPhong() {
		return soPhong;
	}


	public void setSoPhong(int soPhong) {
		this.soPhong = soPhong;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Account [CCCD=" + CCCD + ", soPhong=" + soPhong + "]";
	}	
	
}
