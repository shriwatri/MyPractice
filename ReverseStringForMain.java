package schedular.com.project;

public class ReverseStringForMain {

	public static void main(String[] args) throws InterruptedException {
		String blogName = "java2blog";
        String reverse = "";
        for (int i = blogName.length() - 1; i >= 0; i--) {
            reverse = reverse + blogName.charAt(i);
            System.out.println("Inside Loop: " + reverse);
            Thread.sleep(100);
        }
        System.out.println("Final result Reverse of java2blog is: " + reverse);

	}

}
