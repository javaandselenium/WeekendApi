package jacksonSeralization;

public class Project {
	String employeeName;
	int employeeage;
	double empSalary;
	int teamSize;
	
	public Project(String employeeName, int employeeage, double empSalary, int teamSize) {
		super();
		this.employeeName = employeeName;
		this.employeeage = employeeage;
		this.empSalary = empSalary;
		this.teamSize = teamSize;
	}
	
	public Project() {
	
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeage() {
		return employeeage;
	}

	public void setEmployeeage(int employeeage) {
		this.employeeage = employeeage;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	
	
}
