package Bai7;

import java.util.Scanner;

public class DSDT {
	public int n;
	DOANTHANG a[];
	Scanner sc = new Scanner(System.in);
	public DOANTHANG dtinf(){
		DOANTHANG k = new DOANTHANG();
		System.out.print("Nhap vao ten doan thang:");
		k.setTenDt(sc.nextLine());
		k.dtinf();
		return k;
	}
	public void nhapds(){
		System.out.print("Nhap vao so doan thang:");
		n = sc.nextInt();
		sc.nextLine();
		a = new DOANTHANG[n];
		for(int i = 0;i<n;i++)
			a[i] = dtinf();
	}
	public void xuat(){
		for(int i=0;i<n;i++)
			a[i].toString();
	}
	public void dtmax(){
		DOANTHANG dt = a[0];
		for(int i=0;i<n;i++)
			if(a[i].dodai() > dt.dodai())
				dt = a[i];
		System.out.println("Doan thang co do dai lon nhat la:" +dt.toString());
	}
	public float tongdodai(){
		float tong = 0;
		for(int i = 0;i<n;i++)
			tong = tong + a[i].dodai();
		return tong;
	}
}
