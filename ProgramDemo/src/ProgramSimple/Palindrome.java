package ProgramSimple;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner cn=new Scanner(System.in);
		int num,rem,rev = 0;
		System.out.println("Enter the Number");
		num=cn.nextInt();
		int temp;
		temp=num;
		while(temp!=0){
			rem=temp % 10 ;
			rev=rev*10+rem;
			temp=temp / 10;
			
		}if(rev==num){
			System.out.println("Number is Palindrome");
		}
		else{
			System.out.println("Number is Not Palindrome");
		}

	}

}
