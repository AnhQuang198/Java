package Bai10;

import java.util.Scanner;

public class MATHANG {
	private String TenHang;
	private String maHang;
	private String nuocSX;
	
	MATHANG(){
		
	}
	MATHANG(String TenHang, String maHang, String nuocSX){
		this.TenHang = TenHang;
		this.maHang = maHang;
		this.nuocSX = nuocSX;
	}
	public String getTenHang() {
		return TenHang;
	}
	public void setTenHang(String tenHang) {
		TenHang = tenHang;
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getNuocSX() {
		return nuocSX;
	}
	public void setNuocSX(String nuocSX) {
		this.nuocSX = nuocSX;
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Ten hang: ");
		TenHang = sc.nextLine();
		System.out.print("Nhap ma hang: ");
		maHang = sc.nextLine();
		System.out.print("Nhap nuoc SX: ");
		nuocSX = sc.nextLine();
		
	}
	public void xuat(){
		System.out.print("\n + Ten hang: "+TenHang+"\n + ma hang: "+maHang+"\n + nuocSX: "+nuocSX);
	}
}
