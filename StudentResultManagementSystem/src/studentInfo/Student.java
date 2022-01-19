package studentInfo;

import java.util.Scanner;

public class Student {
	private int rollno;
	private String name;
	private int contact;
	private String email;
	public static String nm,em;
	public static int sid;
	Scanner cn=new Scanner(System.in);
	public int getRollno() {
		System.out.println("Enter the Roll Number Of Student : ");
		rollno=cn.nextInt();
		sid = rollno;
		return rollno;
	}
	public String getName() {
		System.out.println("Enter the Name Of Student : ");
		name=cn.next();
		nm=name;
		return name;
	}
	public int getContact() {
		System.out.println("Enter the Contact Number Of Student : ");
		contact=cn.nextInt();
		return contact;
	}
	public String getEmail() {
		System.out.println("Enter the Email ID of Student : ");
		email=cn.next();
		em=email;
		return email;
	}

}