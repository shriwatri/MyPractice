
public class CountCharOccurance {

	public static void main(String[] args) {
		String s = "Java programming oops concepts ";
		int totalCount=s.length();
		int totalCountAfterRemove=s.replaceAll("a", "").length();
		int count = totalCount-totalCountAfterRemove;
		System.out.println("number of occurance of a is: "+ count);

	}

}
