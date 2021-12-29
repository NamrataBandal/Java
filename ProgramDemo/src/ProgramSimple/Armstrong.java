package ProgramSimple;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int n,t1,t2,leg=0,rem;
		Scanner cn=new Scanner(System.in);
		System.out.println("Enter the Number");
		n=cn.nextInt();
		t1=n;
		while(t1!=0){
			t1=t1/10;  //153/10=15;15/10=1;1/10=0;
			leg = leg+1;  //0+1=1;1+1=2;2=1=3
		}
		t2=n;  //t2=153
		int arm=0;
		while(t2!=0){
			int mult=1;
			rem=t2%10;  //153%10=3;15%10=5;1%10=1
		for(int i=1;i<=leg;i++){
			mult = mult*rem; //1*3=3,3*3=9,9*3=27;1*5=5,5*5=25,25*5=125;1*1=1,1*1=1,1*1=1
		}
		arm=arm+mult;  //0+27=27;27+125=152;152+1=153
		t2=t2/10; //153/10=15;15/10=1;1/10=0
		
		}
		if(n==arm){
			System.out.println(n+"Number is Armstrong");
			
		}
		else{
			System.out.println("Number is Not Armstrong");
		}
	}

}
