package ProgramSimple;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cn=new Scanner(System.in);
		String str;
		System.out.println("Enter The String");//i am from india
		str=cn.next();
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}

	}

}
