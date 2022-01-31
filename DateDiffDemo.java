import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DateDiffDemo {

	public static void main(String[] args) {
		LocalDateTime d1 = LocalDateTime.of(2022,12,1, 11,20,20);
		LocalDateTime d2 = LocalDateTime.of(2022,12,1, 12,20,20);
		Duration duration = Duration.between(d1, d2);
		System.out.println(duration.getSeconds());
		LocalDate ld1 = LocalDate.of(2020, 10, 23);
		LocalDate ld2 = LocalDate.of(2022, 01, 1);
		Period period = Period.between(ld1, ld2);
		System.out.println("Number of days="+period.getDays());
		System.out.println("Number of Years="+period.getYears());
		System.out.println("Number of Months="+period.getMonths());
		
				

	}

}
