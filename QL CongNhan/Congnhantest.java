package BT6;

import static java.lang.System.exit;
import java.util.Scanner;


public class Congnhantest {
	public static void menu(){
        System.out.println("1.nhap danh sach cong nhan:");
        System.out.println("2.hien thi danh sach cong nhan:");
        System.out.println("3.hien danh sach cong nhan co muc luong lon hon s:");
        System.out.println("4.thoat");
    }
    public static void main(String[] args) {
        menu();
        int tiep;
        CongNhaninfo cnf=new CongNhaninfo();
        do{
            System.out.println("\n----vui long nhap 1/2/3/4----");
            tiep = new Scanner(System.in).nextInt();
            if(tiep<1 || tiep>4)
            System.out.println("so nhap khong hop le!!");
            else
                 switch(tiep){
                     case 1:
                            cnf.nhapDS();
                            break;
                     case 2:
                            cnf.hienDS();
                            break;
                     case 3:
                            cnf.hienLuong();
                            break;
                     case 4:
                            exit(0);
                            break;
                 }
        }
        while(tiep!=0);
    }
    
}
