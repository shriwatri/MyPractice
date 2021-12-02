import java.util.function.Predicate;

public class PredicateFunctionDemo {

	public static void main(String[] args) {
		Predicate<String> checkEvenLength = s -> s.length()%2 == 0;
		System.out.println("Predicate check with test method: checkEvenLength.test(\"Ashish Kumar Shriwatri\")  "+checkEvenLength.test("Ashish Kumar Shriwatri"));
		System.out.println("Predicate check with test method: checkEvenLength.test(\"Ashish Kumar\")  "+checkEvenLength.test("AshishKumar") +" and lenght:");

	}

}
