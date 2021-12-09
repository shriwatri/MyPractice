import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumberAndString {

	public static void main(String[] args) {
		Random rand = new Random();
		/*
		int rand_int =rand.nextInt(100);
		System.out.println("Random int number is: "+rand_int);
		*/
		
		/*double rand_dbl =rand.nextDouble();
		System.out.println("Random int number is: "+rand_dbl);
		*/
		
		//Approach 2 Math
		//System.out.println(Math.random());
		
		//Approach 3 Apache common lang API
		
		/*String randNum =RandomStringUtils.randomNumeric(5);
		System.out.println("Random number with Apache Common lang: "+ randNum);
		
		*/
		String randStr = RandomStringUtils.randomAlphabetic(5);
		System.out.println(randStr);

	}

}
