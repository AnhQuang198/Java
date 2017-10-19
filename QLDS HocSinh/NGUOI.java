package Bai12;

import java.util.Scanner;

public class NGUOI {
	private String Hoten;
	private String Gioitinh;
	public NGUOI(){
	
	}
	public NGUOI(String ht, String gt){
		Hoten = ht;
		Gioitinh = gt;
	}
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Nhap ho ten:");
		Hoten = sc.nextLine();
		System.out.print("\n Nhap gioi tinh:");
		Gioitinh = sc.nextLine();
	}
	public void xuat(){
		System.out.print("\n + Ho ten:" +Hoten+ "\n + Gioi tinh:" +Gioitinh);
	}
}
