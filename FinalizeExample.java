package schedular.com.project;

 
class FinalizeExample {
	static public int count;
	public void finalize() {
		count++;
		System.out.println("Finalize is called: "+count);
	}

	public static void main(String args[]) {
		System.out.println("Program started -->");
		FinalizeExample f1 = new FinalizeExample();
		FinalizeExample f2 = new FinalizeExample();
		f1 = null;
		f2 = null;
		System.gc();
		System.out.println("Program End <--");
	}
}