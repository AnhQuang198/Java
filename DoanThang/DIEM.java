package Bai7;

import java.util.Scanner;

public class DIEM {
	int x,y;
	public DIEM(){
		x = 0;
		y = 0;
	}
	public DIEM(int m, int n){
		x = m;
		y = n;
	}
	public void toado(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao toa do:");
		System.out.print("Nhap vao x:");
		x = sc.nextInt();
		System.out.print("Nhap vao y:");
		y = sc.nextInt();
	}
	public int getX(){
		return x;
	}
	public void setX(int n){
		x = n;
	}
	public int getY(){
		return y;
	}
	public void setY(int m){
		y = m;
	}
	public String toString(){
		return "x ="+x+"y="+y;
	}
}
