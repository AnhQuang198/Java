package QLTTD;

import java.io.Serializable;
import java.util.Scanner;

public class HoTieuThu implements Serializable{
	private String hoTen;
	private String diaChi;
	private String maCT;
	private String soDT;
	
	public HoTieuThu() {
		super();
	}
	HoTieuThu(String ht,String dc,String mct){
		this.hoTen = ht;
		this.diaChi = dc;
		this.maCT = mct;
	}
	public String getHoten(){
		return hoTen;
	}
	public void setHoten(String ht){
		this.hoTen = ht;
	}
	public String getDiaChi(){
		return diaChi;
	}
	public void setDiaChi(String dc){
		this.diaChi = dc;
	}
	public String getMaCT(){
		return maCT;
	}
	public void setMaCT(String mct){
		this.maCT = mct;
	}
	public String getSoDT(){
		return soDT;
	}
	public void setSoDT(String x){
		this.soDT = x;
	}
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten chu ho:");
		hoTen = sc.nextLine();
		System.out.println("Nhap dia chi:");
		diaChi = sc.nextLine();
		System.out.println("Nhap ma cong to:");
		maCT = sc.nextLine();
		System.out.println("Nhap SDT:");
		soDT = sc.nextLine();
	}
	public void xuat(){
		System.out.print("\n +TEN CHU HO:"+this.getHoten()+"\n +DIA CHI:"+this.getDiaChi()+"\n +MA CONG TO:"+maCT+"\n +SDT:"+soDT);
	}
}
