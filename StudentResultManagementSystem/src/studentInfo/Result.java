package studentInfo;

import java.lang.invoke.SwitchPoint;

public class Result extends CourseInfo {
	int total;
	int per;
	static int pr;
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
	}
	

}