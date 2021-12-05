package schedular.com.project;

import java.io.Serializable;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class MyMainSchedular implements Serializable{

	public static void main(String[] args) throws SchedulerException {
		System.out.println("Starting point.....");
		JobDetail jd = JobBuilder.newJob(MyObject.class).build();
		Trigger t = TriggerBuilder.newTrigger().withIdentity("AshishCroneTrigger")
				.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(05)
						.repeatForever()).build();
		Scheduler s = StdSchedulerFactory.getDefaultScheduler();
		
		s.start();
		s.scheduleJob(jd, t);
		

	}

}
