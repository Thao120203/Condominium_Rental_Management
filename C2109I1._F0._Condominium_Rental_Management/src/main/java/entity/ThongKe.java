package entity;

import java.sql.Date;
import java.time.LocalDate;

public class ThongKe {
	private int thanhTien;
	private int ngay;
	private int soPhong;
	private int tienPhong;
	
	private int tienXe;
	private int tienNuoc;
	private int tienRac_wifi;
	private int tienDien;
	public ThongKe() {}
	public ThongKe(int thanhTien, int ngay, int soPhong, int tienPhong, int tienXe, int tienNuoc,
			int tienRac_wifi, int tienDien) {
		
		this.thanhTien = thanhTien;
		this.ngay = ngay;
		this.soPhong = soPhong;
		this.tienPhong = tienPhong;
		
		this.tienXe = tienXe;
		this.tienNuoc = tienNuoc;
		this.tienRac_wifi = tienRac_wifi;
		this.tienDien = tienDien;
	}
	public int getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(int thanhTien) {
		this.thanhTien = thanhTien;
	}
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int i) {
		this.ngay = i;
	}
	public int getSoPhong() {
		return soPhong;
	}
	public void setSoPhong(int soPhong) {
		this.soPhong = soPhong;
	}
	public int getTienPhong() {
		return tienPhong;
	}
	public void setTienPhong(int tienPhong) {
		this.tienPhong = tienPhong;
	}
	
	public int getTienXe() {
		return tienXe;
	}
	public void setTienXe(int tienXe) {
		this.tienXe = tienXe;
	}
	public int getTienNuoc() {
		return tienNuoc;
	}
	public void setTienNuoc(int tienNuoc) {
		this.tienNuoc = tienNuoc;
	}
	public int getTienRac_wifi() {
		return tienRac_wifi;
	}
	public void setTienRac_wifi(int tienRac_wifi) {
		this.tienRac_wifi = tienRac_wifi;
	}
	public int getTienDien() {
		return tienDien;
	}
	public void setTienDien(int tienDien) {
		this.tienDien = tienDien;
	}
	@Override
	public String toString() {
		return "ThongKe [thanhTien=" + thanhTien + ", ngay=" + ngay + ", soPhong=" + soPhong + ", tienPhong="
				+ tienPhong + ", tienXe=" + tienXe + ", tienNuoc=" + tienNuoc
				+ ", tienRac_wifi=" + tienRac_wifi + ", tienDien=" + tienDien + "]";
	}
	
}
