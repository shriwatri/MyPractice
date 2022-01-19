import java.util.Scanner;

public class CelciusDemo {

	public static void main(String[] args) {
		float temp;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the temperature to find out celcius");
		temp = scn.nextFloat();
		temp=((temp-32)*5)/9;
		System.out.println("Temperature in celcious "+temp);

	}

}
