package hit.lab2;

import java.text.NumberFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		double currentSalary;
		double raise = 200;
		double newSalary;
		String rating;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the current salar:");
		currentSalary = scan.nextDouble();
		System.out.println("Enter the performance rating(Excellent,good,or poor):");
		rating = scan.nextLine();
		newSalary = currentSalary + raise;
		NumberFormat money =NumberFormat.getCurrencyInstance();
		System.out.println();
		System.out.println("Current Salary:"+money.format(currentSalary));
		System.out.println("Amount of your raise:"+money.format(raise));
		System.out.println("your new salary:"+money.format(newSalary));
		System.out.println();

	}

}
