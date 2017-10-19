package Bai7;

import java.util.Scanner;

public class DOANTHANG {
	public String tenDt;
	Scanner sc = new Scanner(System.in);
	DIEM A = new DIEM();
	DIEM B = new DIEM();
	public void dtinf(){
		/*System.out.println("Nhap toa do xA:");
		A.setX(sc.nextInt());
		System.out.println("Nhap toa do yA:");
		A.setY(sc.nextInt());
		System.out.println("Nhap toa do xB:");
		B.setX(sc.nextInt());
		System.out.println("Nhap toa do yB:");
		B.setY(sc.nextInt());*/
		A.toado();
		B.toado();
	}
	public void setTenDt(String x){
		tenDt = x;
	}
	public float dodai(){
		float x1 = A.getX();
		float x2 = B.getX();
		float y1 = A.getY();
		float y2 = B.getY();
		return (float) Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
	}
	public String toString(){
		return "\nToa do diem A:"+A.toString()+"\n Toa do diem B:"+B.toString()+"\n Do dai doan thang:"+dodai();
	}
}
