import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WordReverse {

	public static void main(String[] args) {
		String str = "Welcome to Java world";
		String splitArray[] = str.split(" ");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(now);
		for (int i = splitArray.length-1; i >=0 ; i--) {
			System.out.println(splitArray[i]);
			
		}
		 System.out.println(now);
	}

}
