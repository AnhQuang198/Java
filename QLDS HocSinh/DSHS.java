package Bai12;

import java.util.ArrayList;
import java.util.Scanner;

public class DSHS {
	int n;
	ArrayList<HOCSINH> lstHS;
	public void DSHS(){
		lstHS = new ArrayList<HOCSINH>();
	}
	public void nhapds()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Nhap so luong hoc sinh:");
		n = sc.nextInt();
		lstHS = new ArrayList(n);
		for(int i=0;i<n;i++)
		{
			HOCSINH x = new HOCSINH();
			x.Nhap();
			lstHS.add(x);
		}
	}
	public void xuatds()
	{
		System.out.print("\n DS hoc sinh:");
		for(int i=0;i<n;i++)
			System.out.print(lstHS.get(i).toString());
	}
	public void Sapxep(){
		for(int i=0;i<lstHS.size()-1;i++)
			for(int j =i+1;j<lstHS.size();j++)
				if(lstHS.get(i).Tenlop.compareTo(lstHS.get(j).Tenlop)>0) {
    				HOCSINH tam = new HOCSINH();
    				tam = lstHS.get(i);
    				lstHS.set(j, lstHS.get(i));
    				lstHS.set(j, tam);
				}
	}
}
