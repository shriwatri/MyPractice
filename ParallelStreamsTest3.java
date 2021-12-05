package schedular.com.project;

//An example of parallelStream() method

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class ParallelStreamsTest3 {

	public static void main(String[] args) throws IOException {

		// Create a File object
		File fileName = new File("C:\\Users\\Ashish.Shriwatri\\PS.txt");

		// Create a List
		// Using readAllLines() read the lines of the text file
		List<String> text = Files.readAllLines(fileName.toPath());
		
		// Using parallelStream() to create parallel streams
		text.parallelStream().forEach(System.out::println);
	}
}

