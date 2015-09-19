public class Employee {
	String name;
	String ssn;
	String emailAddress;
	int yearOfBirth;
	int extraVacationDays = 0;
	static int baseVacationDays = 10;

	Employee(String name, String ssn) {
        this.name = name; // "this." helps distinguish between
        this.ssn = ssn; // instance and parameter variables
    }
	
	int getVacationDays() {
		return baseVacationDays + extraVacationDays;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Manager("John", "555-12-345","Manage the Team");
		e1.emailAddress = "john@company.com";
		e1.extraVacationDays = 2;
		e1.print();
		
		Employee e2 = new Employee("Tom", "456-78-901");
		e2.name = "Tom";
		e2.ssn = "456-78-901";
		e2.yearOfBirth = 1974;

		e2.print();
	}

	static int getBaseVacationDays() {
		return baseVacationDays;
	}

	int getExtraVacationDays() {
		return extraVacationDays;
	}

	void setYearOfBirth(int year) {
		yearOfBirth = year;
	}

	public void print() {
        System.out.println("Name: " + name);
        System.out.println("SSN: " + ssn);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Year Of Birth: " + yearOfBirth);
        System.out.println("Vacation Days: " + getVacationDays());
    }
}
