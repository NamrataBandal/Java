package studentInfo;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner cn=new Scanner(System.in);
		Result ci=new Result();
		char ch1;
		boolean un = true;
		do{
		ci.getRollno();
		ci.getName();
		ci.getContact();
		ci.getEmail();
		ci.nameCourse("MCA");
		ci.subject();
		/*System.out.println("*****RESULT***** ");
		System.out.println("Roll No:"+ci.sid);
		System.out.println("Name:"+ci.nm);
		System.out.println("Computer: "+ci.cm);
		System.out.println("Data Scince: "+ci.ds);
		System.out.println("Data Structure: "+ci.dts);
		System.out.println("Maths: "+ci.maths);
		System.out.println("Java: "+ci.jl);
		System.out.println("c :"+ci.cl);*/
		System.out.println("                      *****RESULT***** ");
		System.out.println();
		System.out.println("    Roll No:"+ci.sid);
		System.out.println("    Name:"+ci.nm+"        Course: "+ci.co+"   Email Id: "+ci.em);
		System.out.println();
		ci.line();
		System.out.println("|Subject | Computer |Data Scince|Data Structure|Maths |Java |  C  |");
		ci.line();
		System.out.println("|Marks   |   "+ci.cm+"     |     "+ci.ds+"    |     "+ci.dts+"       |  "+ci.maths+"  |  "+ci.jl+" | "+ci.cl+"  |");
		ci.line();
		ci.subTotal();
		ci.percentage();
		System.out.println();
		System.out.println("Do you want to add another Student?y/n");
		
		//Student s = new Student() ;
		 ch1=cn.next().charAt(0);
		}
		while (ch1!='n'&&ch1!='N');
		{
			un=false;
			System.out.println("Records Successfully Save....!");
		}
		cn.close();

	}
}