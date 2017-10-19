package BT6;

public class Congnhan {
	public int luongCoBan = 1150;
	   public float heSoLuong;
	   public String HoTen;

	    public float getHeSoLuong() {
	        return heSoLuong;
	    }

	    public void setHeSoLuong(float heSoLuong) {
	        this.heSoLuong = heSoLuong;
	    }

	    public String getHoTen() {
	        return HoTen;
	    }

	    public void setHoTen(String HoTen) {
	        this.HoTen = HoTen;
	    }
	    public float tinhLuong(){
	        float luong;
	        luong=luongCoBan*heSoLuong;
	        return (float)luong;
	    }
	    public String toString(){
	        return "\nnhan vien:"+HoTen+"\the so luong:"+heSoLuong+"\tmuc luong:"+tinhLuong();  
	    }
	    
}
