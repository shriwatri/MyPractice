
public class SingletonClass {
	
	//1. Create a private static variable once, this instance will get memory once
	private static SingletonClass singletonInstance = new SingletonClass();

	//2. Create a private constructor
	private SingletonClass() {
		
	}
	
	//Get the only object available 
	public static SingletonClass getInstance() {
		return singletonInstance;
	}
	
	public void simpleMethod() {
		System.out.println("hashcode of singleton object: "+ singletonInstance);
	}

}
