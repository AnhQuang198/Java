package Bai12;

import java.util.Scanner;

public class HSTEST {
	static public void menu() {
		System.out.println("1.Nhap n hs cua cac lop");
		System.out.println("2.In danh sach ");
		System.out.println("3.Sap xep dshs theo ten lop");
		System.out.println("4.Thoat");
	}
	public static void main(String[] args) {
		menu();
		DSHS ds = new DSHS();
		Scanner sc = new Scanner(System.in);
		int luachon;
		do
		{
			System.out.println("\n Nhap lua chon cua ban: ");
			luachon = sc.nextInt();
			switch(luachon) 
			{
				case 1:
				{
					ds.nhapds();
					break;
					
				}
				case 2:
				{
					System.out.print("\nDanh sach hs vua nhap: ");
					ds.xuatds();
					break;
				}
				case 3:
				{
					System.out.print("\nDanh sach hs da sx: ");
					ds.Sapxep();
					ds.xuatds();
					break;
				}
				
				case 4:
				{
					break;
				}
			}
		}while(luachon != 4);
	}
}
