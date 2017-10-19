package Bai10;

import java.util.Scanner;

public class TLTEST {
	static public void menu() {
		System.out.println("1.Nhap danh sach cac tu lanh:");
		System.out.println("2.In danh sach:");
		System.out.println("3.Liet ke ds tu lanh theo hang sx:");
		System.out.println("4.Tong tien cac tu lanh:");
		System.out.println("5.in cac danh sach tu lanh co dung tích tren 200 lit:");
		System.out.println("6.SX ds cac tu lanh theo thu tu giam dan so luong:");
		System.out.println("7.Thoat");
	}
	public static void main(String[] args) {
			menu();
			DSTULANH ds = new DSTULANH();
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
						ds.nhap();
						break;
						
					}
					case 2:
					{
						System.out.print("\nDanh sach tu lanh vua nhap: ");
						ds.xuat();
						break;
					}
					case 3:
					{
						ds.LietKeds();
						ds.xuat();
						break;
					}
					case 4:
					{
						ds.TinhTong();
						break;
					}
					case 5:
					{
						ds.inTL();
						break;
					}
					case 6:
					{
						ds.SapXep();
						System.out.println("\n Danh sach sau khi sap xep: ");
						ds.xuat();
						break;
					}
					case 7:
					{
						
						break;
					}
				}
			}while(luachon != 7);
	}
}
