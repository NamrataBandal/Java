package DemoProject;

import java.util.Scanner;

public class BaseClassStudent {
	int rollno;
	String name;
    int contact;
	String email;
	String course;
	Scanner cn=new Scanner(System.in);
	void infoStudent(){
		System.out.println("Enter the Roll Number Of Student : ");
		rollno=cn.nextInt();
		System.out.println("Enter the Name Of Student : ");
		name=cn.next();
		System.out.println("Enter the Contact Number Of Student : ");
		contact=cn.nextInt();
		System.out.println("Enter the Email ID of Student : ");
		email=cn.next();
		
	}
	void nameCourse(String course) {
    	//co = course;
		System.out.println("Course Name is : "+course);		
	}
	

}
package studentInfo;

import java.util.Scanner;

public class Student {
    int rollno;
	String name;
    int contact;
	String email;
	public static String nm;
	public static String em;
	public static int sid,mc,sd,std,math,lc,ja;
	int total;
	int per;
	static int pr;
	String course;
	static String co;
	Scanner cn=new Scanner(System.in);
	public int getRollno()
	{
		System.out.println("Enter the Roll Number Of Student : ");
		rollno=cn.nextInt();
		sid = rollno;
		return rollno;
	}
	public void setRollno(int rollno)
	{
		this.rollno = rollno;
	}
	public String getName() {
		
		System.out.println("Enter the Name Of Student : ");
		name=cn.next();
		this.nm=name;
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContact() {
		System.out.println("Enter the Contact Number Of Student : ");
		contact=cn.nextInt();
		return contact;
	}
	public void setContact(int contact) {
		
		this.contact = contact;
	}
	public String getEmail() {
		System.out.println("Enter the Email ID of Student : ");
		email=cn.next();
		em=email;
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	void nameCourse(String course) {
    	co = course;
		System.out.println("Course Name is : "+course);	
		
	}
    int cm,ds,dts,jl,cl,maths;
    
	public int getCm() {
		System.out.println("Enter the mark of Computer ");
    	cm =cn.nextInt();
    	mc=cm;
		return cm;
	}
	public int getDs() {
		System.out.println("Enter the mark of Data Scince ");
    	ds =cn.nextInt();
    	sd=ds;
		return ds;
	}
	
	public int getDts() {
		System.out.println("Enter the mark of Data Structure ");
    	dts =cn.nextInt();
    	std = dts;
		return dts;
	}
	
	public int getJl() {
		System.out.println("Enter the mark of Java Language ");
    	jl =cn.nextInt();
    	ja=jl;
		return jl;
	}
	
	public int getCl() {
		System.out.println("Enter the mark of C Language ");
    	cl =cn.nextInt();
    	lc=cl;
		return cl;
	}
	public int getMaths() {
		System.out.println("Enter the mark of Maths ");
        maths =cn.nextInt();
        math=maths;
		return maths;
	}
	/*void subject(){
    	//System.out.println("Enter the mark of Computer ");
    	//cm =cn.nextInt();
    	System.out.println("Enter the mark of Data Scince ");
    	ds =cn.nextInt();
    	System.out.println("Enter the mark of Data Structure ");
    	dts =cn.nextInt();
    	System.out.println("Enter the mark of Maths ");
        maths =cn.nextInt();
    	System.out.println("Enter the mark of Java Language ");
    	jl =cn.nextInt();
    	System.out.println("Enter the mark of C Language ");
    	cl =cn.nextInt();
    	System.out.println();	
    }*/
	

}
