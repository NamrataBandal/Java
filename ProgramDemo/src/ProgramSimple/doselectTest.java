package ProgramSimple;

import java.util.HashSet;

public class doselectTest {

	public static void main(String[] args) {
		Alphabet obj=new Alphabet();
		obj.uniqueVowel("aeeibac");
		obj.uniqueConsonant("aeiop");
		// TODO Auto-generated method stub

	}

}
class Alphabet{
	String str;
	int a=0;
	char st;
    
	void uniqueVowel(String str){
		int len = str.length();
		HashSet<Character> h = new HashSet<>();
		//int i=len-1;
		for(int i=len-1;i>=0;i--){
		
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='u')
			{
				a=a+1;
				
			}
			
		}
		
		System.out.println(a);
	}
	void uniqueConsonant(String str){
		int len = str.length();
		HashSet<Character> h = new HashSet<>();
		//int i=len-1;
		int c=0;
		for(int i=len-1;i>=0;i--){
		
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='u')
			{
				int temp =0;
				
			}
			else
			{
				c=c+1;
			}
			
		}
		
		System.out.print(c);
	}
}

/*package ProgramSimple;

import java.util.HashSet;

public class doselectTest {

	public static void main(String[] args) {
		Alphabet obj=new Alphabet();
		obj.uniqueVowel("aeibac");
		// TODO Auto-generated method stub

	}

}
class Alphabet{
	String str;
	int a=0;
	char st;
    
	void uniqueVowel(String str){
		int len = str.length();
		HashSet<Character> h = new HashSet<>();
		//int i=len-1;
		for(int i=len-1;i>=0;i--){
		
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='u')
			{
				st=str.charAt(i);
				if(a==2)
				{
					System.out.print("a");
				}
				//a=a+1;
				System.out.print(st);
			}
		}
		
	}
}


st=str.charAt(i);
				if(a==2)
				{
					System.out.print("a");
				}

*/
