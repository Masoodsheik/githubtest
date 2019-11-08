package testngd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class stringtest {

	public static void main(String[] args) throws IOException {

		File fsys = new File("D:\\Hello.txt");
		BufferedReader br = new BufferedReader(new FileReader(fsys));
		String str;
		int countword=0;
		int paragraphcount=0;
		int chcount=0;
		int countwords=0;
		while((str=br.readLine())!=null) {
			
			if(str.equals("")) {
				
				paragraphcount++;
			}
			if(!str.equals("")) {
				chcount+=str.length();
				String [] words=str.split("\\s+");
				countword+=words.length;
			}
		}
		
		System.out.println("Paragraph"+paragraphcount);
		System.out.println("Char"+chcount);
		System.out.println("Words"+countword);
		br.close();
		
	}

}
