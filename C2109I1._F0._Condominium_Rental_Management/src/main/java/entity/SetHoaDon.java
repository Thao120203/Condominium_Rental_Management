package entity;

public class SetHoaDon {
	private String hoTen;
	private int tienphong;
	private int tiencoc;
	private int tienxe;
	private int tiennuoc;
	private int tienrac_wifi;
	private int sophong;
	
	public SetHoaDon() {
		
	}

	public SetHoaDon(String hoTen, int tienphong, int tiencoc, int tienxe, int tiennuoc, int tienrac_wifi,
			int sophong) {
	
		this.hoTen = hoTen;
		this.tienphong = tienphong;
		this.tiencoc = tiencoc;
		this.tienxe = tienxe;
		this.tiennuoc = tiennuoc;
		this.tienrac_wifi = tienrac_wifi;
		this.sophong = sophong;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTienphong() {
		return tienphong;
	}

	public void setTienphong(int tienphong) {
		this.tienphong = tienphong;
	}

	public int getTiencoc() {
		return tiencoc;
	}

	public void setTiencoc(int tiencoc) {
		this.tiencoc = tiencoc;
	}

	public int getTienxe() {
		return tienxe;
	}

	public void setTienxe(int tienxe) {
		this.tienxe = tienxe;
	}

	public int getTiennuoc() {
		return tiennuoc;
	}

	public void setTiennuoc(int tiennuoc) {
		this.tiennuoc = tiennuoc;
	}

	public int getTienrac_wifi() {
		return tienrac_wifi;
	}

	public void setTienrac_wifi(int tienrac_wifi) {
		this.tienrac_wifi = tienrac_wifi;
	}

	public int getSophong() {
		return sophong;
	}

	public void setSophong(int sophong) {
		this.sophong = sophong;
	}

	@Override
	public String toString() {
		return "SetHoaDon [hoTen=" + hoTen + ", tienphong=" + tienphong + ", tiencoc=" + tiencoc + ", tienxe=" + tienxe
				+ ", tiennuoc=" + tiennuoc + ", tienrac_wifi=" + tienrac_wifi + ", sophong=" + sophong + "]";
	}
	
	
}
