package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			Employee employee = new Employee();

			System.out.print("Name: ");
			employee.name = sc.nextLine();

			System.out.print("Gross Salary: ");
			employee.grossSalary = sc.nextDouble();

			System.out.print("Tax: ");
			employee.tax = sc.nextDouble();

			System.out.print("Employee: " + employee.name + ", $ " + String.format("%.2f", employee.netSalary()));

			System.out.print("\n" + "Which percentage to increase salary? ");
			double percentage = sc.nextDouble();
			employee.increaseSalary(percentage);

			System.out.print(employee.netSalaryPlusPercentage());
		}

	}

}
