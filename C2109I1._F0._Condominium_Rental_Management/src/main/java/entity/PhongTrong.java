package entity;

public class PhongTrong {
	private int soPhong;
	private int trangThai;
	
	public PhongTrong() {
	}

	public PhongTrong(int soPhong, int trangThai) {
		this.soPhong = soPhong;
		this.trangThai = trangThai;
	}

	
	public int getSoPhong() {
		return soPhong;
	}

	public void setSoPhong(int soPhong) {
		this.soPhong = soPhong;
	}

	public int getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}

	@Override
	public String toString() {
		return "Phòng Trống:" + " phòng "+ soPhong ;
	}
	
}
