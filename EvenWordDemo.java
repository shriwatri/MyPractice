
public class EvenWordDemo {

	public static void main(String[] args) {
		String str = "Hello Worlds we are welcomes you";
		for(String s : str.split(" ")) {
			if(s.length()%2==0) {
				System.out.println(s);
			}
			
		}

	}

}
