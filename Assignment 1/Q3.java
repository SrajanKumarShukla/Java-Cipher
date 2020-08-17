/*Write a program, creating an Employee class containing details of empId, empName,
empDesignation, empSalary and empLocation. Create necessary methods like getters, setters
and toString. Create 10 instances of the same.
The problem is to generate stream of all the instances and do the following operations:
	a. Print the name of all the employees.
	b. Print all the salaries which are greater than 50,000/-
	c. Print all the locations starting with the letter ‘M’
	d. Print all the designations ending with ‘E’*/
import java.util.Scanner;
public class Employee {
    int empId;
    String empName;
    float empSalary;
    String empDesignation;
    String empLocation;
    public void getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the empid :: ");
        empId = in.nextInt();
        System.out.print("Enter the name :: ");
        empName = in.next();
        System.out.print("Enter the salary :: ");
        empSalary = in.nextFloat();
        System.out.print("Enter the Designation :: ");
        empDesignation = in.next();
        System.out.print("Enter the Location :: ");
        empLocation = in.next();
    }
    public void setnames() {
        System.out.println("Employee name = " + empName);
    }
    public void setsalary() {
        if(empSalary>50000) {
            System.out.println("Employee salary = " + empSalary);
        }
    }
    public void setloc() {
        if(empLocation.charAt(1)=='M'|| empLocation.charAt(1)=='m') {
            System.out.println("Employee salary = " + empLocation);
        }
    }
    public void setdesig() {
        if(empDesignation.charAt(empDesignation.length()-1)=='E'|| empDesignation.charAt(empDesignation.length()-1)=='e') {
            System.out.println("Employee salary = " + empDesignation);
        }
    }
    public static void main(String[] args) {
        Employee[] e = new Employee[10];
        System.out.println("Entered data for 10 employees");
        for(int i=0; i<10; i++) {

            e[i] = new Employee();
            e[i].getInput();
        }
        System.out.println("Printing the name of all the employees.");
        for(int i=0; i<10; i++) {
            e[i].setnames();
        }
        System.out.println("Printing all the salaries which are greater than 50,000/-");
        for(int i=0; i<10; i++) {
            e[i].setsalary();
        }
        System.out.println("Printing all the locations starting with the letter ‘M’");
        for(int i=0; i<10; i++) {

            e[i].setloc();
        }
        System.out.println("Printing all the designations ending with ‘E’");
        for(int i=0; i<10; i++) {

            e[i].setdesig();
        }
    }
}
