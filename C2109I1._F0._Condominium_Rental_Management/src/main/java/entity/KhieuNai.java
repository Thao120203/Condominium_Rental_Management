package entity;

public class KhieuNai {
	private String noiDung;
	private String Id_NguoiDung;
	
	public KhieuNai() {
		
	}
	public KhieuNai(String noiDung, String id_NguoiDung) {
		this.noiDung = noiDung;
		this.Id_NguoiDung = id_NguoiDung;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public String getId_NguoiDung() {
		return Id_NguoiDung;
	}
	public void setId_NguoiDung(String string) {
		Id_NguoiDung = string;
	}
	@Override
	public String toString() {
		return "KhieuNai [noiDung=" + noiDung + ", Id_NguoiDung=" + Id_NguoiDung + "]";
	}
	
	
	
}
