package Bai12;

import java.util.Scanner;

public class HOCSINH extends NGUOI{
	public String Tenlop;
	public HOCSINH(){
		
	}
	public HOCSINH(String hoten, String gioitinh, String tl){
		super(hoten,gioitinh);
		Tenlop = tl;
	}
	public void Nhap(){
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Nhap ten lop:");
		Tenlop = sc.nextLine();
	}
	public String toString(){
		super.xuat();
		return "\n + Ten lop:" + Tenlop;
	}
}
