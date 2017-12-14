package QLTTD;
import java.io.Serializable;
import java.util.Scanner;

	public class HoaDon extends HoTieuThu implements Serializable {
		private String maHD;
		private String date;
		private float cSC;
		private float cSM;
		private float tiendien;
		static float thueGTGT = (float) 0.1;
		public HoaDon(){
			super();
		}
		public HoaDon(String ht,String sdt,String dc,String mct,String mhd,String ngay,float csc,float csm, float st){
			super();
			this.setHoten(ht);
			this.setDiaChi(dc);
			this.setMaCT(mct);
			this.setSoDT(sdt);
			this.maHD = mhd;
			this.date = ngay;
			this.cSC = csc;
			this.cSM = csm;
			this.tiendien=st;
		}
		public String getMaHD(){
			return maHD;
		}
		public void setMaHD(String mhd){
			this.maHD = mhd;
		}
		public String getDate(){
			return date;
		}
		public void setDate(String ngay){
			this.date = ngay;
		}
		public float getCSC(){
			return cSC;
		}
		public void setCSC(float csc){
			this.cSC = csc;
		}
		public float getCSM(){
			return cSM;
		}
		public void setCSM(float csm){
			this.cSM = csm;
		}
		public float sotien(float a,float b){
			float c=b-a;
			if(c < 100)
			{
				return c*1500+(c*1500*thueGTGT);
			}
			if(c >= 100 && c < 400)
			{
				return c*2500+(c*2500*thueGTGT);
			}
			if(c >= 400)
			{
				return (c)*3000+(c*3000*thueGTGT);
			}
			return sotien(c, c);
		}
		public void nhaphd(){
			super.nhap();
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap ma hoa don:");
			maHD = sc.nextLine();
			System.out.println("Nhap thang thu tien dien:");
			date = sc.nextLine();
			System.out.println("Nhap chi so cu:");
			cSC = sc.nextFloat();
			System.out.println("Nhap chi so moi:");
			cSM = sc.nextFloat();
			System.out.println("----------------------");
		}
		public String toString(){
			super.xuat();
			return "\n +MA HOA DON:"+maHD+"\n +THANG THU TIEN DIEN:"+date+"\n +CHI SO CU"+cSC+"\n +CHI SO MOI:"+cSM+"\n TIEN DIEN:"+sotien();
		
		}
}


