package ProgramSimple;

public class Fibonacciseries extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		try{
	int a=0,b=1;
	int c;
	System.out.print(a+" "+b+" ");
	for(int i=1;i<=10;i++)
	{
		c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
	}
	}
		catch(Exception ex)
		{
			ex.printStackTrace();		}
	}

}
