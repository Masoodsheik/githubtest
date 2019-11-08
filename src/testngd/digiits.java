package testngd;

public class digiits {

	public static void main(String[] args) {
		
		String str="dfas432fas342";
		
		String res="";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			
			Character ch=str.charAt(i);
			
			if(Character.isDigit(ch)) {
				
				res=res+ch;
				sum=sum+Integer.parseInt(String.valueOf(ch));
				//sum=sum+res;
			}
		}
		System.out.println(sum);
	}
	
}
