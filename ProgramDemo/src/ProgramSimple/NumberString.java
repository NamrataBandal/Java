package ProgramSimple;
public class NumberString {

	public static void main(String[] args) {
		Alphabet1 obj=new Alphabet1();
		obj.uniqueVowel("abaacab");
		obj.uniqueConsonant("abaacab");
	}

}
class Alphabet1{
	int a=0;
	int c=0;
	void uniqueVowel(String str){
		StringBuffer sb1= new StringBuffer();
		str.chars().distinct().forEach(c ->sb1.append((char)c));
		//System.out.println(sb1);
		int len = sb1.length();
		for(int i=0;i<=len-1;i++){
			if(sb1.charAt(i)=='a'||sb1.charAt(i)=='e'||sb1.charAt(i)=='o'||sb1.charAt(i)=='i'||sb1.charAt(i)=='u')
			{
				a=a+1;
				
			}
		}
		System.out.println(a);
		
	}
	void uniqueConsonant(String str){
		StringBuffer sb1= new StringBuffer();
		str.chars().distinct().forEach(c ->sb1.append((char)c));
		//System.out.println(sb1);
		int len = sb1.length();
		for(int i=0;i<len;i++){
			if(sb1.charAt(i)=='a'||sb1.charAt(i)=='e'||sb1.charAt(i)=='o'||sb1.charAt(i)=='i'||sb1.charAt(i)=='u')
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
