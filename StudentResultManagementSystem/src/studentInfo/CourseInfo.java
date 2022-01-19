package studentInfo;

import java.lang.invoke.SwitchPoint;

public class CourseInfo extends Student
{
	String course;
	static String co;
	int cm,ds,dts,jl,cl,maths;
    void nameCourse(String course)
    {
    	co = course;
		System.out.println("Course Name is : "+course);	
		
	}
    void subject()
    {
    	System.out.println("Enter the mark of Computer ");
    	cm =cn.nextInt();
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
    	
    }
    
   
    

}