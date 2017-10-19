package Bai10;

import java.util.ArrayList;
import java.util.Scanner;

public class DSTULANH {
	int n;
	ArrayList<TULANH> lstTL;
	public void DSTL(){
		
		lstTL = new ArrayList<TULANH>();
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Nhap so luong tu lanh:");
		n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			TULANH x = new TULANH();
			x.Nhap();
			lstTL.add(x);
		}
	}
	public void xuat()
	{
		System.out.print("\n DS tu lanh");
		for(int i=0;i<n;i++)
			System.out.print(lstTL.get(i).toString());
	}
	public double TinhTong() {
		 double Tong = 0;
		 for(int i=0; i<lstTL.size(); i++)
		 {
			 Tong = Tong + lstTL.get(i).ThanhTien();
		 }
		 System.out.println("Tong tien cac tu lanh:"+Tong);
		 
		return Tong; 
	 }
   public void inTL() {
   	System.out.print("\nCac tu lanh co dung tich >200 lit: ");
   	for(int i=0; i<lstTL.size(); i++)
		 {
			 if(lstTL.get(i).getDungTich() > 200) {
				lstTL.get(i).toString();
			 }
		 }

   }
   public void SapXep() {
   	for(int i=0; i<lstTL.size()-1; i++) {
   		for(int j=i+1; j<lstTL.size(); j++) {
   			if(lstTL.get(i).getSoluong() < lstTL.get(j).getSoluong()) {
   				TULANH tam = new TULANH();
   				tam = lstTL.get(i);
   				lstTL.set(j, tam);
   				lstTL.set(j, lstTL.get(i));
   			}
   		}
   	}
   }
   public void LietKeds() {
   	String hsx;
   	Scanner sc = new Scanner(System.in);
   	System.out.print("Nhap hang sx: ");
   	sc.nextLine();
   	hsx = sc.nextLine();
   	for(int i=0; i<lstTL.size(); i++)
		 {
			 if(lstTL.get(i).getHangSX() == hsx ) {
				 lstTL.get(i).toString();
			}
		}
   }
}
