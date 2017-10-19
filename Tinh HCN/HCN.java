package BT5;

public class HCN {
	private float CD;
	private float CR;
	public float getCD()
	{
		return CD;
	}
	public void setCD(float x)
	{
		this.CD = x;
	}
	public float getCR()
	{
		return CR;
	}
	public void setCR(float y)
	{
		this.CR = y;
	}
	float chuvi()
	{
		return (CD + CR)*2;
	}
	float dientich()
	{
		return (CD*CR);
	}
	public String toString()
	{
		return "Chieu dai HCH la:"+ CD + "\t Chieu rong HCN la:" + CR + "\t Dien tich la:" + dientich() + "\t Chu vi la:" + chuvi();
	}
}

