import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOddDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number to find out odd or even");
		Integer input =Integer.parseInt( br.readLine());
		if(input%2==0) {
			System.out.println(input+" is even number.");
		}else {
			System.out.println(input+" is odd number.");
		}

	}

}
