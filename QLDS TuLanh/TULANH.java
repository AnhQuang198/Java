package Bai10;

import java.util.Scanner;

public class TULANH extends MATHANG{
	private int dungTich;
	private String mauSac;
	private String hangSX;
	private int Soluong;
	private float Dongia;
	
	TULANH(){
		
	}
	TULANH(String TenHang, int maHang, String nuocSX, int dungTich, 
			String mauSac, String hangSX, int Soluong, float Dongia){
		super();
		this.dungTich = dungTich;
		this.mauSac = mauSac;
		this.hangSX = hangSX;
		this.Soluong = Soluong;
		this.Dongia = Dongia;
	}
	
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}
	public String getHangSX() {
		return hangSX;
	}
	public void setHangSX(String hangSX) {
		this.hangSX = hangSX;
	}
	public int getSoluong() {
		return Soluong;
	}
	public void setSoluong(int soluong) {
		Soluong = soluong;
	}
	public float ThanhTien() {
		return Soluong*Dongia;
	}
	public void Nhap() {
		super.Nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap dung tich: ");
		dungTich = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap mau sac: ");
		mauSac = sc.nextLine();
		System.out.print("Nhap hang SX: ");
		hangSX = sc.nextLine();
		System.out.print("Nhap so luong: ");
		Soluong = sc.nextInt();
		System.out.print("Nhap Don gia: ");
		Dongia = sc.nextFloat();
	}
	public String toString(){
		super.xuat();
		return "\n + dung tich : "+dungTich +"\n + mau sac : "+mauSac+"\n + hangSX : "+hangSX
				+ "\n + Soluong : "+Soluong+"\n + Dongia : "+Dongia+"\n + Thanh tien :"+ThanhTien();
    }
		
}
