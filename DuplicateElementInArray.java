import java.util.HashSet;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		//String str[] = {"Java","c","c++","Java","Python","c++", "scala"};
		String str[] = {"Java","c","c++"};
		//Approach 1
	/*	boolean flag = false;
		for(int i=0; i < str.length; i++) {
			for(int j=i+1 ; j < str.length;j++) {
				if(str[i]==str[j]) {
					System.out.println("Found duplicate element:"+str[i]);
					flag=true;
				} 
				
			}
		}
		if(flag==false) {
			System.out.println("Duplicate element not found.");
		} */
		
		//Approach 2 using HashSet
		HashSet<String> langs = new HashSet<String>();
		boolean flag = false;
		for(String s: str) {
			if(langs.add(s)==false) {
				System.out.println("Found duplicate element:"+s);
				flag=true;
			}
			
		}
		if(flag==false) {
			System.out.println("NOT FOUND ANY Duplicate ELEMENT.");
		}
		
	} 

}
