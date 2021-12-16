import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFileFromTextFile {

	public static void main(String[] args) throws IOException {
		
		//Approach1: Using FileReader BufferReader
		
		//C:\Users\Ashish.Shriwatri\ReadMe.txt
		/*
		FileReader fr = new FileReader("C:\\Users\\Ashish.Shriwatri\\ReadMe.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
			
		}
		br.close();
		
		*/
		//Approach2 File and Scanner
		File file = new File("C:\\Users\\Ashish.Shriwatri\\ReadMe.txt");
		Scanner scn = new Scanner(file);
		
		//Loop Statement
		/*
		while(scn.hasNextLine()) {
			System.out.println(scn.nextLine());
		}
		*/
		
		//Approach3
		scn.useDelimiter("\\Z");
		System.out.println(scn.next());
	}

}
