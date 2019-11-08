package testngd;

import java.util.HashMap;
import java.util.Map;

public class dupli {

	public static void main(String[] args) {
		String str="fasfgwerqtretfsdf";
		
		Map<Character,Integer> objchar=new HashMap<Character,Integer>();
		char[] charr=str.toCharArray();
		
		for(char ch:charr) {
	
			if(Character.isAlphabetic(ch)) {
				
				if(objchar.containsKey(ch)) {
					
					objchar.put(ch, objchar.get(ch)+1);
					
				}else {
					objchar.put(ch, 1);
				}
				
			}
		}
		System.out.println(objchar);
	}
}
