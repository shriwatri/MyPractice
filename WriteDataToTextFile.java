import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("C:\\\\Users\\\\Ashish.Shriwatri\\\\WriteMe.txt");
		BufferedWriter br = new BufferedWriter(fr);
		br.write("Welcome to Java coding");
		br.write("Love 2 code.");
		br.write("Consistency is a important.");
		br.write("Slow and Steady win the race.");
		
		System.out.println("Finished text file writing. ");
		br.close();
	}

}
