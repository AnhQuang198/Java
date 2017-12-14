package QLTTD;
import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	

		public static void menu()
		{
			System.out.println("\n1.Nhap danh sach hoa don:");
			System.out.println("2.In danh sach:");
			System.out.println("3.Tong tien cac hoa don:");
			System.out.println("4. Luu file");
			System.out.println("5. Doc file");
			System.out.println("6. Xóa hóa đơn theo mã");
			System.out.println("7. Thêm hóa đơn vào danh sách");
			System.out.println("8. Sắp xếp hóa đơn theo số tiền điện tăng dần:");
			System.out.println("9. Sắp xếp hóa đơn theo tên (a->z)");
			System.out.println("10. Sửa hóa đơn bất kỳ");
			System.out.println("Nhan 0 de thoat");
		}
		public static void main(String[] args) {
			menu();
			
			DSHoaDon a = new DSHoaDon();
			Scanner sc = new Scanner(System.in);
			int chon;
			do
			{
				System.out.println("\n Nhap lua chon cua ban:");
				chon = sc.nextInt();
				switch(chon)
				{
				case 1:
					a.nhap();
					break;
				case 2:
					a.xuat();
					break;
				case 3:
					a.tongtien();
					break;
				case 4:
					
					boolean kt=a.luuFile("E:\\Dulieu.txt");
					if(kt=true){
						System.out.println("Luu file thang cong");
					}
					else
					{
						System.out.println("Luu file that bai");
					}
					break;
				case 5:
					a.docFile();
					break;
				case 6:
					a.xoahoadon();
					break;
				case 7:
					a.themhoadon();
					break;
				case 8:
					a.sxhoadontheosotien();
					break;
				case 9:
					a.sxhoadontheoten();
					break;
				case 10:
					a.suahoadon();
					break;
				case 0:
					
					break;
				
				}menu();
			}while(chon!=0);
		}
}


