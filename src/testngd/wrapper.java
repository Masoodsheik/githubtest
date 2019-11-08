package testngd;

public class wrapper {

	public static void main(String[] args) {
		
		
		//Wrapper class is class whose object wraps or contains a primitive data type.
		//When we create object of the wrapper class, its contains a fileds and in this
		//filed store the primitive data types
		
		char ch='a';
		Character c=ch;
		System.out.println(c);
		//Autoboxing Automatic conversion of primitive data type to corresponding 
		//wrapper classes
		
		Hello obj=new Hello();
		System.out.println(obj.x);
	}
	
}

class Hello{
	public int x;
}
