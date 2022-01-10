import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateElementInArray {

	public static void main(String[] args) {
		String duplicates[] = new String[] {"Java","Spring","Hibernate","Java", "Struts","Hibernate"};
		Set nonDuplicateSet = new HashSet<>();
		Set duplicateSet = new HashSet<>();
		for(String str:duplicates) {
			if(!nonDuplicateSet.contains(str)) {
				nonDuplicateSet.add(str);
			}else {
				duplicateSet.add(str);
			}
		}
		System.out.println(duplicateSet);		
	}

}
