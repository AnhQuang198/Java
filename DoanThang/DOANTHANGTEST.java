package Bai7;

import java.util.Scanner;

public class DOANTHANGTEST {
	public static void menu(){
		System.out.println("1.Nhap danh sach cac doan thang:");
		System.out.println("2.Hien danh sach cac doan thang:");
		System.out.println("3.Doan thang co do dai lon nhat:");
		System.out.println("4.Tong do dai cac doan thang:");
		System.out.println("5.Thoat");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chon;
		menu();
		do{
			System.out.print("Hay chon tu 1-5");
			chon = sc.nextInt();
			DSDT dt = new DSDT();
			switch(chon){
				case 1:
					dt.nhapds();
					break;
				case 2:
					dt.xuat();
					break;
				case 3:
					dt.dtmax();
					break;
				case 4:
					dt.tongdodai();
					break;
				case 5:
					System.exit(0);
					break;
			}
		}while(chon!=0);
	}
}
