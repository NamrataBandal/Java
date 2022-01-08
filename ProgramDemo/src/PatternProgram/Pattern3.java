package PatternProgram;

public class Pattern3 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int m=1;m<=3;m++)
		{
			for(int n=3;n>=m;n--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
