public class Manager extends Employee {
	private String responsibility;

	public Manager(String name, String ssn, String responsibility) {
		super(name, ssn);
		this.responsibility = responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public String getResponsibility() {
		return this.responsibility;
	}

	public void print() {
		super.print();
		print(responsibility);
	}

	public void print(String header) {
		System.out.println("******* Responsibility:" + header + "*******");
	}
}
