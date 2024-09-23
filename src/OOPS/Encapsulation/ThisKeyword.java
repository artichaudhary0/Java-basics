package OOPS.Encapsulation;

import java.util.Scanner;

// Employee
public class ThisKeyword {
    private String employeeName;
    private int id ;
    private double salary;

    public ThisKeyword(int id,String employeeName,  double salary) {
        this.id = id;
        this.employeeName = employeeName;
        this.salary = salary;
    }


    public void setEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee details: ");
        System.out.println("Employee Id : ");
        this.id = sc.nextInt();
        System.out.println("Employee Name: " );
        this.employeeName = sc.next();
        System.out.println("Employee Salary: " );
        this.salary = sc.nextDouble();
    }

    // getter
    public void displayEmployeeDetails() {
        System.out.println("Employee Id : "+id);
        System.out.println("Employee Name : "+employeeName);
        System.out.println("Employee Salary : "+salary);
    }

    public int getId() {
        return id;
    }
    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(1,"John Smith",50000);
        obj.setEmployeeDetails();
//        obj.displayEmployeeDetails();
        System.out.println("Employee Id : "+obj.getId());
        System.out.println("Employee Name : "+obj.getEmployeeName());
        System.out.println("Employee Salary : "+obj.getSalary());
    }
}
