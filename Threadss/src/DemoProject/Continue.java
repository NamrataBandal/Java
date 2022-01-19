package DemoProject;



public class Continue extends StudentResult {
	void otherStudent(){
		System.out.println("Do you want to add another Student?y/n");
		boolean un = true;
		char ch1=cn.next().charAt(0);
		if((ch1!='y')&&(ch1!='Y')){
			un=false;
		}                           
		else
		{
		  infoStudent();
		  nameCourse("MCA");
		  subject();
		  subTotal();
		  percentage();
		}
	}

}
package studentInfo;

import studentInfo.Student;

public class CourseInfo extends Student {

    void report(){
    	//Student st = new Student();
    	//Result br= new Result();
    	System.out.println("                      *****RESULT***** ");
		System.out.println();
		System.out.println("    Roll No:"+sid);
		System.out.println("    Name:"+nm+"        Course: "+co+"   Email Id: "+em);
		System.out.println();
		//ci.line();
		System.out.println("|Subject | Computer |Data Scince|Data Structure|Maths |Java |  C  |");
		//ci.line();
		System.out.println("|Marks   |   "+mc+"     |     "+ sd +"    |     "+std+"       |  "+math+"  |  "+ja+" | "+lc+"  |");
		//ci.line();
		//br.subTotal();
		//br.percentage();
    	//System.out.println("|-----------------------------------------------------------------|");
    }
	public CourseInfo() {
		
		// TODO Auto-generated constructor stub
	}
    

}
