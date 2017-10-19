package BT4;

import java.util.Scanner;

public class QLDSHS {
	public static void menu()
	{
		System.out.print("\n1.Nhap danh sach hoc sinh");
		System.out.print("\n2.Hien danh sach hoc sinh");
		System.out.print("\n3.Sap xep danh sach hoc sinh theo tong tien ban tru tang dan");
		System.out.print("\n4.Danh sach hoc sinh co so buoi an ban tru tren 20 buoi");
		System.out.print("\n5.Thoat");
	}
	public static void main(String[] args) {
		DSHS hs = new DSHS();
		int chon;
		do{
			menu();
			System.out.print("\n  Hay chon tu 1-5:");
			chon = new Scanner(System.in).nextInt();
			switch(chon){
			case 1:
				hs.nhap();
				break;
			case 2:
				hs.xuat();
				break;
			case 3:
				System.out.print("Danh sach hoc sinh sau khi sap xep la:");
				hs.sapxep();
				hs.xuat();
				break;
			case 4:
				hs.anbantru();
				break;
			}
		}while(chon != 0);
	}
}
