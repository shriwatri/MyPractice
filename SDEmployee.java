
public class SDEmployee implements Cloneable {
	private int empId;
	private String empName;
	private String company;
	private SDAddress address;
	
	
	public SDEmployee(int empId, String empName, String company, SDAddress address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.company = company;
		this.address = address;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		SDEmployee emp =(SDEmployee) super.clone();
		emp.setAddress((SDAddress)address.clone());
		return emp;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public SDAddress getAddress() {
		return address;
	}
	public void setAddress(SDAddress address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "SDEmployee [empId=" + empId + ", empName=" + empName + ", company=" + company + ", address=" + address
				+ "]";
	}
	
	

}
