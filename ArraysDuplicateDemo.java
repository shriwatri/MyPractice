import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysDuplicateDemo {

	public static void main(String[] args) {
		String[] duplicates =new String[] {"java","python","c","c++","java"};
		List<String> dupList = Arrays.asList(duplicates);
		Set<String> dupSet = new HashSet<String>(dupList);
		if(dupList.size()!=dupSet.size()) {
			System.out.println("The array contains duplicate elements.");
		}else {
			System.out.println("The array doesn't contains duplicate.");
		}

	}

}
