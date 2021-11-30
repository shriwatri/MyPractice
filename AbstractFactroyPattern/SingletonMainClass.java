
public class SingletonMainClass {

	public static void main(String[] args) {
		SingletonClass singletonObject = SingletonClass.getInstance();
		singletonObject.simpleMethod();
		
		SingletonClass singletonObject2 = SingletonClass.getInstance();
		singletonObject2.simpleMethod();
	}

}
