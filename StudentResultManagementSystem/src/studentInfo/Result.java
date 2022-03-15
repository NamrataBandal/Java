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
		if(cm>=35&&ds>=35&&dts>=35&&jl>=35&&cl>=35&&maths>=35)
		{
			if(pr>=35){
			if(per>=75&&per<=100){
			System.out.println("  Result : Pass With A Grade ");
			}
			else if(per>=45&&per<=74){
				System.out.println("  Result : Pass With B Grade ");
				}
			else if(per>=35&&per<=45){
				System.out.println("  Result : Pass With C Grade ");
				}
			}
		}
		if(per>35||cm<35&&ds<35&&dts<35&&jl<35&&cl<35&&maths<35){
			 if(dts<=35&&cm<=35){
				System.out.println("  Result : fail in Two Subject data Structure and Computer");
				}
			 else if(dts<=35&&ds<=35){
					System.out.println("  Result : fail in Two Subject data Structure and Data Scince");
					}
			 else if(dts<=35&&jl<=35){
					System.out.println("  Result : fail in Two Subject data Structure and Java Language");
					}
			 else if(dts<=35&&cl<=35){
					System.out.println("  Result : fail in Two Subject data Structure and C language");
					}
			 else if(ds<=35&&cm<=35){
					System.out.println("  Result : fail in Two Subject Data Scince and Computer");
					}
				 else if(jl<=35&&cm<=35){
						System.out.println("  Result : fail in Two Subject Java Language and Computer");
						}
				 else if(cm<=35&&jl<=35){
						System.out.println("  Result : fail in Two Subject Computer and Java Language");
						}
				 else if(cm<=35&&cl<=35){
						System.out.println("  Result : fail in Two Subject Computer and C language");
						}
				 else if(cm<=35&&maths<=35){
					System.out.println("  Result : fail in Two Subject Computer and Maths");
					}
			 else if(cm<=35){
				System.out.println("  Result : fail in Computer");
				}
			else if(ds<=35){
				System.out.println("  Result : fail in Data Scince");
				}
			else if(dts<=35){
				System.out.println("  Result : fail in data Structure");
				}
			else if(jl<=35){
				System.out.println("  Result : fail in Java Language");
				}
			else if(cl<=35){
				System.out.println("  Result : fail in C Language");
				}
			else if(maths<=35){
				System.out.println("  Result : fail in maths");
				}
			
		}
		
	}
	public void line() {
		System.out.println("|-----------------------------------------------------------------|");
		
	}
	

}