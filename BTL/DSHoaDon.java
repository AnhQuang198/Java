package QLTTD;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class DSHoaDon  {
	int n;
	static ArrayList<HoaDon> lstHD= new ArrayList<HoaDon>();
	Scanner sc = new Scanner(System.in);
	public DSHoaDon(int n, ArrayList<HoaDon> lstHD) {
		super();
		this.n = n;
		this.lstHD = lstHD;
	}
	
	public DSHoaDon() {
		super();
	}
	
	public void themhd(HoaDon hd){
		lstHD.add(hd);
		
	}
	
	public ArrayList<HoaDon> getHoaDon(){
		return lstHD;
	}
	public void nhap(){
		
		System.out.print("\n Nhap so luong hoa don:");
		n = sc.nextInt();
		for(int i = 1;i<=n;i++)
		{
			HoaDon x = new HoaDon();
			x.nhaphd();
			lstHD.add(x);
		}
	}
	public double tongtien(){
		double tong = 0;
		for(int i=0;i<n;i++){
			tong = tong + lstHD.get(i).sotien();
		}
		System.out.print("\n +Tong tien cac hoa don la:"+tong);
		return tong;
	}
	public void xuat(){
		System.out.println("DANH SACH HOA DON:");
		for(HoaDon hd:lstHD){
			System.out.println(hd);
			System.out.println("\n///////////////////////////");
			}
	}
	
	
	public static boolean luuFile( String path)
	
	{
		try{
			FileOutputStream fos=new FileOutputStream(path);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(lstHD);// 
			fos.close();
			oos.close();
			return true;
			
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
		
	}

	public static void docFile() 
	
	{
		
		try
		{
			FileInputStream fis= new FileInputStream("E:\\Dulieu.txt");
			ObjectInputStream ois= new ObjectInputStream(fis);
			Object data= ois.readObject();
			lstHD=(ArrayList<HoaDon>) data;
			ois.close();
			fis.close();
			System.out.println("DOC FILE  RA MAN HINH");
			for(HoaDon hd:lstHD){
				System.out.println(hd);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	public void xoahoadon(){
		String ma;
		System.out.println("Nhập mã hóa đơn muốn xóa:");
		sc.nextLine();
		ma=sc.nextLine();
		
		for(HoaDon xx:lstHD){
			if(ma.equals(xx.getMaHD())==true){
			int a=lstHD.indexOf(xx);
			lstHD.remove(a);
			break;
			}
		}
		System.out.println("Danh sách hóa đơn sau khi xóa");
		for(HoaDon xx:lstHD){
			System.out.println(xx);
		}
	}
	public void themhoadon(){
		System.out.println("Nhập thông tin hóa đơn muốn thêm vào danh sách:"); 
		HoaDon yy=new HoaDon();
		yy.nhaphd();
		lstHD.add(yy);
		System.out.println("Danh sách hóa đơn sau khi thêm:");
		for(HoaDon yyy:lstHD){
			System.out.println(yyy);
		}
		
	}
	public void sxhoadontheosotien(){
		HoaDon tg=new HoaDon();
		for(int i=0; i<lstHD.size(); i++){
			for(int j=i+1; j<lstHD.size(); j++){
				if(lstHD.get(i).sotien()>lstHD.get(j).sotien()){
					tg=lstHD.get(i);
					lstHD.set(i, lstHD.get(j));
					lstHD.set(j,tg);
				}
			}
			
		}
		System.out.println("Danh sách hóa đơn sắp xếp tăng dần theo số tiền điện:");
		for(HoaDon xx: lstHD){
			System.out.println(xx);
		}
	}
	public void sxhoadontheoten(){
		HoaDon tg=new HoaDon();
		for(int i=0; i<lstHD.size(); i++){
			for(int j=i+1; j<lstHD.size(); j++){
				if(lstHD.get(i).getHoten().compareTo(lstHD.get(j).getHoten())>0){
					tg=lstHD.get(i);
					lstHD.set(i,lstHD.get(j));
					lstHD.set(j,tg);
				}
			}
			
		}
		System.out.println("Danh sách hóa đơn sắp xếp theo tên:");
		for(HoaDon xx: lstHD){
			System.out.println(xx);
		}
	}
	public void suahoadon(){
		HoaDon xx=new HoaDon();
		String s;
		System.out.println("Nhập mã hóa đơn muốn sửa:");
		sc.nextLine();
		s=sc.nextLine();
		int b;
		for(HoaDon yy: lstHD){
			if(s.equals(yy.getMaHD())==true){
				b=lstHD.indexOf(yy);
				lstHD.remove(b);
				System.out.println("Nhập lại thông tin hóa đơn:");
				yy.nhaphd();
				lstHD.add(b,yy);
				break;
			}
		}

		System.out.println("Danh sách cập nhập sau khi sửa:");
		for(HoaDon vv: lstHD){
			System.out.println(vv);
			}
		
		
		
	}
	
}

