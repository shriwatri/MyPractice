package schedular.com.project;

//An example to understand the parallel() method

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ParallelStreamTest {

	public static void main(String[] args) throws IOException {

		// Create a File object
		File fileName = new File("C:\\Users\\Ashish.Shriwatri\\Textfile.txt");
		
		// Create a Stream of String type
		// Using the lines() method to read one line at a time
		// from the text file
		Stream<String> text = Files.lines(fileName.toPath());
		
		// Use StreamObject.parallel() to create parallel streams
		// Use forEach() to print the lines on the console
		text.parallel().forEach(System.out::println);
		
		// Close the Stream
		text.close();
	}
}

