package entity;

import javax.swing.ImageIcon;

public class ThietHaii {
	private ImageIcon anhThietHai;
	private int soPhong;
	private String Id_NguoiDung;

	
	public ThietHaii() {
	
	}

	public ThietHaii(ImageIcon anhThietHai, int soPhong, String id_NguoiDung) {
		super();
		this.anhThietHai = anhThietHai;
		this.soPhong = soPhong;
		Id_NguoiDung = id_NguoiDung;
	}







	public ImageIcon getAnhThietHai() {
		return anhThietHai;
	}

	public void setAnhThietHai(ImageIcon anhThietHai) {
		this.anhThietHai = anhThietHai;
	}

	public int getSoPhong() {
		return soPhong;
	}

	public void setSoPhong(int soPhong) {
		this.soPhong = soPhong;
	}

	public String getId_NguoiDung() {
		return Id_NguoiDung;
	}

	public void setId_NguoiDung(String id_NguoiDung) {
		Id_NguoiDung = id_NguoiDung;
	}

	@Override
	public String toString() {
		return "ThietHai [anhThietHai=" + anhThietHai + ", soPhong=" + soPhong + "]";
	}



	
	
	
}
