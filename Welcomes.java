
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Welcomes {

	public static void main(String[] args) {
		System.out.println("Welcomes to you in Maxima world!!!!");
		System.out.println("Below is a example of stream distinct:");
		List<String> names = Arrays.asList("Raja","Ram","Sita","Raja","Nanak","Sita");
		names.stream().distinct().forEach(System.out::println);

		List<String> citi = Arrays.asList("Jabalpur","Chhindwara","Pune","Indore","Bhopal","Ahmdabad");
		Long citiCount = citi.stream().distinct().count();
		System.out.println("Here is the output of CitiCount: "+citiCount);
		
		List<String> citis = Arrays.asList("Jabalpur","Chhindwara","Pune","Indore","Bhopal","Ahmdabad");
		
		System.out.println("Here is the output of CitiCount: "+citis.stream().collect(Collectors.toList()));
		
		for(String citiNames: citi) {
			System.out.println(citiNames);
		}
	}

}
