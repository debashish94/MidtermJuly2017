package design;

import java.util.Random;
import java.util.Scanner;

public abstract class EmployeeAbstract implements Employee{


    private int id;
    private String name;
    private String department;
    private int baseSalary;
    private int performance;



    public EmployeeAbstract(int id) {
        this(id, "Unknown");
    }



    public EmployeeAbstract(int id, String name) {
        this.id = id;
        this.name = name;
        Random random = new Random();
        baseSalary = 20000 + random.nextInt(10000);
        performance = random.nextInt(5);
    }



    @Override
    public int employeeId() {
        return id;
    }

    @Override
    public String employeeName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public String getDepartment() {
        return department;
    }

    public int getPerformance() {
        return performance;
    }

    @Override
    public void assignDepartment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter departement: ");
        this.department = sc.nextLine();
    }



    @Override
    public int calculateSalary() {
        return baseSalary;
    }
}
