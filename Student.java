
public class Student {
	private String name;
	private int region;
	
	public Student(String name, int region) {
		super();
		this.name = name;
		this.region = region;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegion() {
		return region;
	}
	public void setRegion(int region) {
		this.region = region;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", region=" + region + "]";
	}
	
	

}
