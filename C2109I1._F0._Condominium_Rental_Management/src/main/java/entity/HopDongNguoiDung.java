package entity;

public class HopDongNguoiDung {
	private String cccd;
	private int SoPhong;
	
	public HopDongNguoiDung() {
	}

	public HopDongNguoiDung(String cccd, int soPhong) {
		this.cccd = cccd;
		SoPhong = soPhong;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public int getSoPhong() {
		return SoPhong;
	}

	public void setSoPhong(int soPhong) {
		SoPhong = soPhong;
	}

	@Override
	public String toString() {
		return "HopDong [cccd=" + cccd + ", SoPhong=" + SoPhong + "]";
	}
	
	
}
