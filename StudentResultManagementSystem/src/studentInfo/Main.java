package studentInfo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cn=new Scanner(System.in);
		Result ci=new Result();
		ci.getRollno();
		ci.getName();
		ci.getContact();
		ci.getEmail();
		ci.nameCourse("MCA");
		ci.subject();
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
		cn.close();

	}
}
