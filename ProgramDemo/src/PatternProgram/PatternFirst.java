package PatternProgram;

import java.util.Scanner;

public class PatternFirst {

	public static void main(String[] args) {
		Scanner cn=new Scanner(System.in);
		int n;
		System.out.println("Enter the total row");
		n=cn.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		

	}

}
