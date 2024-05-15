package entity;

public class PhongSD {
	private int soPhong;
	private int id_SoPhong;
	private boolean trangThai;
	
	public PhongSD() {
	}

	
	
	public PhongSD(int soPhong, int id_SoPhong, boolean trangThai) {
		super();
		this.soPhong = soPhong;
		this.id_SoPhong = id_SoPhong;
		this.trangThai = trangThai;
	}



	public int getSoPhong() {
		return soPhong;
	}



	public void setSoPhong(int soPhong) {
		this.soPhong = soPhong;
	}



	public int getId_SoPhong() {
		return id_SoPhong;
	}



	public void setId_SoPhong(int id_SoPhong) {
		this.id_SoPhong = id_SoPhong;
	}



	public boolean isTrangThai() {
		return trangThai;
	}



	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}



	@Override
	public String toString() {
		return "Phòng Đã Thuê:" + " phòng "+ soPhong ;
	}

}
