package BT6;

import java.util.Scanner;

public class CongNhaninfo {
	public int n;
    Congnhan CN[];
    Scanner in = new Scanner(System.in);
    public Congnhan congNhaninf(){
        Congnhan cn=new Congnhan();
        in.nextLine();
        System.out.println("nhap vao ho va ten cau cong nhan:");
        cn.setHoTen(in.nextLine());
        System.out.println("nhap vao he so luong:");
        cn.setHeSoLuong(in.nextFloat());
        return cn;
    }
    public void nhapDS(){
        System.out.println("nhap vao so cong nhan:");
        n=in.nextInt();
        CN = new Congnhan[n];
        if(n<1 || n>20)
            System.out.println("so cong nhan khong hop le!!");
        else
            for(int i=0;i<n;i++)
                CN[i]=congNhaninf();      
    }
      public void hienDS(){
        for(int i=0;i<n;i++)
            System.out.print("" + CN[i].toString());
    }
      public void hienLuong(){
          float s;
          System.out.println("nhap vao muc luong:");
          s=in.nextFloat();
          for(int i=0;i<n;i++)
              if(CN[i].tinhLuong()>s)
                  System.out.print(""+CN[i].toString());
      }
}
