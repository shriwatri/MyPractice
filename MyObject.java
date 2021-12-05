package schedular.com.project;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyObject implements Job {
	static int counter =0;

	@Override 
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("Hurry this is my first Job is running by schedular !!!!");
		System.out.println("The time is now:" + new Date());
		System.out.println("Program runs number of times: "+ counter++);
		
	}

}
