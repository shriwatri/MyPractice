
public class LinearSearch {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60};
		int search_element = 80;
		boolean flag=false;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==search_element) {
				flag=true;
				System.out.println(search_element+" Element found in position:"+i);
			}
		}
		if(flag==false) {
			System.out.println("Element Not found.");
		}

	}

}
