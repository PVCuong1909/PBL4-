package model.bean;

public class InforSV {
	private String masv;
	private String hoten;
	private String congviec;
	private String diachi;
	private String sdt;
	private String email;
		
	public InforSV(String masv, String hoten, String congviec, String diachi, String sdt, String email) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.congviec = congviec;
		this.diachi = diachi;
		this.sdt = sdt;
		this.email = email;
	}
	
	public String getMaSV() {
		return masv;
	}
	
	public void setMaSV(String masv) {
		this.masv = masv;
	}
	
	public String getHoTen() {
		return hoten;
	}
	
	public void setHoTen(String hoten) {
		this.hoten = hoten;
	}
	
	public String getCongViec() {
		return congviec;
	}
	
	public void setCongViec(String congviec) {
		this.congviec = congviec;
	}
	
	public String getDiaChi() {
		return diachi;
	}
	
	public void setDiaChi(String diachi) {
		this.diachi = diachi;
	}
	
	public String getSDT() {
		return sdt;
	}
	
	public void setSDT(String sdt) {
		this.sdt = sdt;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
