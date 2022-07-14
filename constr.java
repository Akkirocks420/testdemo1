package practiceprogram;

public class constr {

	public static void main(String[] args) {
		constr C=new constr();
		C.sub();
		add();

	}
    public static void add() 
    {
		int a=56;
		int b=56;
		System.out.println("add = "+(a+b));
	}
	public void sub() 
	{
		 int a=45;
		 int b=55;
		 System.out.println("sub ="+(a-b));
	}	
	
}
