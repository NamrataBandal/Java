package ProgramSimple;

public class repattion {

	public static void main(String[] args) {
		String str="namrata";
		for(int i=0;i<str.length();i++)
		{
			boolean unique = true;
			for(int j=0;j<str.length();j++)
			{
				if(i!=j&& str.charAt(i)==str.charAt(j)){
					unique = false;
					break;
				}
			}
			if(unique){
				System.out.print(str.charAt(i));
			}
		}
		
		// TODO Auto-generated method stub

	}

}
