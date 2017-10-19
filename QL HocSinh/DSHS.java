package BT4;

import java.util.Scanner;

public class DSHS {
	public int n;
	Hocsinh a[];
	Scanner sc = new Scanner (System.in);
	public Hocsinh hsinf()
	{
		Hocsinh hs =new Hocsinh();
		System.out.print("Nhap Ma Hoc Sinh:");
		hs.setMaHS(sc.nextLine());
		sc.nextLine();
		System.out.print("Nhap Ho Ten:");
		hs.setHT(sc.nextLine());
		System.out.print("Nhap Lop:");
		hs.setLop(sc.nextLine());
		System.out.print("Nhap so buoi an ban tru:");
		hs.setsobuoi(sc.nextInt());
		return hs;
	}
	public void nhap()
	{
		System.out.print("Nhap vao so hoc sinh");
		n = sc.nextInt();
		a = new Hocsinh[n];
		for(int i=0;i<n;i++)
			a[i] = hsinf();
	}
	public void xuat()
	{
		for(int i=0;i<n;i++)
			a[i].toString();
	}
	public void sapxep()
	{
		Hocsinh tg = new Hocsinh();
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
				if(a[i].tongtien() > a[j].tongtien())
				{
					tg = a[i];
					a[i] = a[j];
					a[j] = tg;
				}
	}
	public void anbantru()
	{
		for(int i=0;i<n;i++)
			if(a[i].soBuoi > 20)
			{
				System.out.println("Hoc sinh co so buoi an ban tru tren 20 buoi la:" + a[i].toString());
			}
	}
}
