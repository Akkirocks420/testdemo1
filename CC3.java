package practiceprogram;

public class CC3 {
	int w;
	int u;
	
	public CC3() 
	{
		w=500;
		u=600;
	}
	public CC3(int x) 
	{
		w=x;
	}
	public CC3(int x,int y) 
	{
		w=x;
		u=y;
	}

	public static void main(String[] args) 
	{
		CC3 AK=new CC3();
		AK.addit();
		CC3 AKL=new CC3(55);
		AKL.addit();
		CC3 lan=new CC3(55,55);
		lan.addit();
		

	}
    public void addit()
    {
    	int sum=w+u;
    	System.out.println("sum of two digits is "+sum);
    }
}
