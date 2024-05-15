package entity;

import java.time.LocalDate;

import javax.swing.ImageIcon;

public class ThanhToan {
	private ImageIcon anhThanhToan;
	private LocalDate NgayThanhToan;
	private String id_NguoiDung;
	
	
	public ThanhToan() {
	}



	public ThanhToan(ImageIcon anhThanhToan, LocalDate ngayThanhToan, String id_NguoiDung) {
		this.anhThanhToan = anhThanhToan;
		NgayThanhToan = ngayThanhToan;
		this.id_NguoiDung = id_NguoiDung;
	}



	public ImageIcon getAnhThanhToan() {
		return anhThanhToan;
	}



	public void setAnhThanhToan(ImageIcon anhThanhToan) {
		this.anhThanhToan = anhThanhToan;
	}



	public LocalDate getNgayThanhToan() {
		return NgayThanhToan;
	}



	public void setNgayThanhToan(LocalDate ngayThanhToan) {
		NgayThanhToan = ngayThanhToan;
	}



	public String getId_NguoiDung() {
		return id_NguoiDung;
	}



	public void setId_NguoiDung(String id_NguoiDung) {
		this.id_NguoiDung = id_NguoiDung;
	}



	@Override
	public String toString() {
		return "ThanhToan [anhThanhToan=" + anhThanhToan + ", NgayThanhToan=" + NgayThanhToan + ", id_NguoiDung="
				+ id_NguoiDung + "]";
	}
	
	
	
}
