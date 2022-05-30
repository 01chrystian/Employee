package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
    public double salary;

	public double netSalary() {
		return this.salary = grossSalary - tax;
	}

	public void increaseSalary(double percentage) {
		this.grossSalary /= percentage;
	}

	public String netSalaryPlusPercentage() {
		return "Updated data: " + name + ", $ " + String.format("%.2f", salary + grossSalary);

	}
}
