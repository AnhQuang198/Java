package BT5;

import java.util.Scanner;

public class HCNTest {
	public static void main(String[] args) {
		HCN a = new HCN();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chieu dai HCN:");
		a.setCD(sc.nextFloat());
		System.out.print("Nhap chieu rong HCN:");
		a.setCR(sc.nextFloat());
		System.out.println(""+a.getCD());
		System.out.println(""+a.getCR());
		System.out.println(""+a.toString());
	}
}
