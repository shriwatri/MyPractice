import java.util.stream.IntStream;

public class StreamParallelStream {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10).forEach(t -> System.out.println( Thread.currentThread().getName() +": "+t));
		System.out.println("===============Parallel Stream====================");
		IntStream.rangeClosed(1, 10).parallel().forEach(t -> System.out.println( Thread.currentThread().getName() +": "+t));
		System.out.println("System Processor Runtime.getRuntime().availableProcessors(): "+Runtime.getRuntime().availableProcessors());
	}

}
