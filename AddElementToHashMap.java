import java.util.HashMap;

public class AddElementToHashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Raja", 1);
		hm.put("Raja2", 2);
		hm.put("Raja3", 3);
		
		
		System.out.println(hm);
		hm.put("Raja", 0);
		hm.put("Raja2", 21);
		hm.put("Raja3", 31);
		System.out.println(hm);
	}

}
