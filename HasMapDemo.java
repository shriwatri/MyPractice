import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMapDemo {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("Ashish", 100);
		m.put("Rajesh", 200);
		m.put("Yashashvee", 300);
		m.put("Anupam", 400);
		m.put("Prisha", 500);
		m.put("Raj", 500);
		m.put("Abhinav", 500);
		System.out.println(m);
		System.out.println(m.put("Raj", 700));
		Set s = m.keySet();
		System.out.println(s);
		Collection c = m.values();
		System.out.println(c);
		Set s1 = m.entrySet();
		System.out.println(s1);
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey()+"----"+m1.getValue());
			if(m1.getKey().equals("Raj")) {
				m1.setValue(600);
			}
			
		}
		System.out.println(m);
		System.out.println("=====For Each======");
		m.forEach((k,v)-> {
			  System.out.format("key: %s, value: %d%n", k, v);
		});

	}

}
