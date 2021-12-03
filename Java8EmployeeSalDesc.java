import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8EmployeeSalDesc {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, 5000));
		empList.add(new Employee(2, 3000));
		empList.add(new Employee(3, 3500));
		empList.add(new Employee(4, 1000));
		empList.add(new Employee(5, 2000));
		empList.add(new Employee(6, 2400));
		empList.add(new Employee(6, 4000));
		
		List<Employee> empSortedList= empList.stream()
				.sorted((o1, o2) ->(int) (o2.getSalary() -o1.getSalary()))
			//	.limit(3)  //To get 3 employees,who have highest salary
				.skip(3)  //To get employees salary after 3rd highest salary
				.collect(Collectors.toList());
		System.out.println(empSortedList);
	}

}
