package BT4;

import java.util.Scanner;

public class Hocsinh {
	String MaHS;
	String HT;
	String Lop;
	int soBuoi;
	Scanner sc = new Scanner(System.in);
	public String getMaHS()
	{
		return MaHS;
	}
	public void setMaHS(String x)
	{
		MaHS = x;
	}
	public String HT()
	{
		return HT;
	}
	public void setHT(String y)
	{
		HT = y;
	}
	public int getsoBuoi()
	{
		return soBuoi;
	}
	public void setsobuoi(int b)
	{
		soBuoi = b;
	}
	public String getLop()
	{
		return Lop;
	}
	public void setLop(String a)
	{
		Lop = a;
	}
	int tongtien()
	{
		return soBuoi*30000;
	}
	public String toString()
	{
		return "Ma hoc sinh la:" + MaHS + "\t Ho ten:" + HT +"\t Lop:" +Lop+ "\t So buoi an ban tru:" + soBuoi+ "\t Tong tien an ban tru la:" +tongtien();
	}
}
