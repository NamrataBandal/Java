package ProgramSimple;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n,temp=0;
		System.out.println("Enter the Number");
		n=cn.nextInt();
		for (int i=2;i<=n-1;i++)
		{
			if(n%i==0){  
				temp=temp+1;
				
			}
		}
			if(temp==0)
			{
				System.out.println(n+" Number is Prime");
			}
			else
			{
				System.out.println(n+" Number is no Prime");
			}
		
		}
	}


