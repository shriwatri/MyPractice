import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StudentListTest {

	public static void main(String[] args) {
		System.out.println("Program started----->");
		
		Student s1 = new Student("Ashish", 1);
		Student s2 = new Student("Rajesh", 2);
		Student s3 = new Student("Anupam", 3);
		Student s4 = new Student("Sonali", 1);
		Student s5 = new Student("Lokesh", 2);
		Student s6 = new Student("Yashashvee", 3);
		Student s7 = new Student("Prisha", 3);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		studentList.add(s7);
		
		Map<Integer,List<Student>> map = new HashMap<>();
		studentList.forEach(item->{
			if(map.get(item.getRegion())==null) {
				List<Student> studentListRegionSpecific = new ArrayList<>();
				studentListRegionSpecific.add(item);
				map.put(item.getRegion(), studentListRegionSpecific);
			}else {
				map.get(item.getRegion()).add(item);
			}
		});
		
		System.out.println("===================================================");
		Iterator <Integer> it1 = map.keySet().iterator();       //keyset is a method  
		int count=0;
		while(it1.hasNext())  
		{  
			System.out.println("Count: "+count++);
		int key=(int)it1.next();  
		//System.out.println("Roll no.: "+key+"     name: "+map.get(key));
		//for(Student str:map.get(key) ) {
			
			//System.out.println(str.getName()+" and " +str.getRegion());
			System.out.println(map.get(key));
		//}
		System.out.println("map inside list");
		ArrayList<Student> al = new ArrayList<Student>();
	 al.addAll(map.get(key));
	 for(Student s:al) {
		 System.out.println("Inside while");
		 System.out.println(al);
	 }
	 
		} 
		
		System.out.println("===================================================");
		
		System.out.println(map);
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();  //implements map interface  
		hm.put(110,"Ravi");  
		hm.put(120,"Prateek");  
		hm.put(130, "Davesh");    
		hm.put(140, "Kamal");  
		hm.put(150, "Pawan");  
		hm.put(150, "Rajesh");
		Iterator <Integer> it = hm.keySet().iterator();       //keyset is a method  
		while(it.hasNext())  
		{  
		int key=(int)it.next();  
		System.out.println("Roll no.: "+key+"     name: "+hm.get(key));  
		}  
		}  

	

	
}
