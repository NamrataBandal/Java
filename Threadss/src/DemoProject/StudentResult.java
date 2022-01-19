package DemoProject;

public class StudentResult extends BaseClassStudent {
	int total;
	int per;
	static int pr;
	int cm,ds,dts,jl,cl,maths;
	void subject(){
		StringBuffer br= new StringBuffer();
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
	void subTotal(){
		total=cm+ds+dts+jl+cl+maths;
		System.out.println();
		System.out.println("  Total ="+total+"/600");
		System.out.println();
	}
   void percentage(){
		
		per=((total*100)/600);
		System.out.println("  Percentage = "+per+" %");
		pr=per;
		if(pr>=35)
		{
			System.out.println("  Result : Pass");
		}
		else{
		System.out.println("  Result : fail");
		}
	}
   

}
package studentInfo;

import java.lang.invoke.SwitchPoint;

public class Result extends Student {
	void subTotal(){
		total=cm+ds+dts+jl+cl+maths;
		System.out.println();
		System.out.println("  Total ="+total+"/600");
		System.out.println();
	}
   void percentage(){
		
		per=((total*100)/600);
		System.out.println("  Percentage = "+per+" %");
		pr=per;
		if(pr>=35)
		{
			System.out.println("  Result : Pass");
		}
		else{
		System.out.println("  Result : fail");
		}
	}
    void otherStudent(){
		System.out.println("Do you want to add another Student?y/n");
		boolean un = true;
		Student s = new Student() ;
		char ch1=cn.next().charAt(0);
		if((ch1!='y')&&(ch1!='Y')){
			un=false;
		}
		else
		{
		  getRollno();
		  getName();
		  getContact();
		  getEmail();
		  nameCourse("MCA");
		  getCm();
		  getDs();
		  getDts();
		  getJl();
		  getCl();
		  getMaths();
		  
		}
	}

}

