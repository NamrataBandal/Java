package PatternProgram;

public class Pattern6 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int k=3;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int m=1;m<=3;m++)
		{
			for(int n=1;n<=m;n++)
			{
				System.out.print(" ");
			}
			for(int l=3;l>=m;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
