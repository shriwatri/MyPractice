import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) throws IOException {
		Path pathToFile = Paths.get("wordFile.txt");
		System.out.println(pathToFile.toAbsolutePath());
		/*
		 * Stream<String> lines = Files.lines(Paths.get("Files/wordFile.txt"));
		 * 
		 * lines.sorted() .filter(l -> l.length() > 0) .forEach(x ->
		 * System.out.println(x+", ")); lines.close();
		 */
		
		/*
		 * List<String> words = Files.lines(Paths.get("Files/wordFile.txt")) .filter(s
		 * -> s.contains("vee")) .collect(Collectors.toList()); words.forEach(x ->
		 * System.out.println(x + ", "));
		 */
		
		Stream<String> rows = Files.lines(Paths.get("Files/stockData.csv"));
		//int rowCount = (int)rows
		//.map(x -> x.split(","))		
		
		rows.map(x -> x.split(","))
				.filter(x -> x.length > 5)
				.filter(x -> Integer.parseInt(x[1].trim()) > 18)
				.forEach(x -> System.out.println(x[0].trim() + " "+x[2].trim() + " "+x[3].trim()));
		
			//	.count();
		//System.out.println(rowCount+" good rows");
		
		rows.close();
		
		 
		

	}

}
