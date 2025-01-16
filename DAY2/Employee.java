
class Employee {
    protected String name;
    protected int id;
    protected String designation;
    protected double basicSalary;
    public Employee(String name, int id, String designation, double basicSalary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.basicSalary = basicSalary;
    }
    public double calculateSalary() {
        return basicSalary;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }
}
class FullTimeEmployee extends Employee {
    private double HRA; 
    private double DA; 
    public FullTimeEmployee(String name, int id, String designation, double basicSalary, double HRA, double DA) {
        super(name, id, designation, basicSalary);
        this.HRA = HRA;
        this.DA = DA;
    }
    @Override
    public double calculateSalary() {
        return basicSalary + HRA + DA;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("HRA: " + HRA);
        System.out.println("DA: " + DA);
    }
}
class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private double hoursWorked;

    public PartTimeEmployee(String name, int id, String designation, double hourlyWage, double hoursWorked) {
        super(name, id, designation, 0);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hourly Wage: " + hourlyWage);
        System.out.println("Hours Worked: " + hoursWorked);
    }
}
public class PayrollSystem {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("John Doe", 101, "Software Engineer", 50000, 10000, 5000);
        fullTimeEmp.displayDetails();
        System.out.println("Full Time Employee Salary: " + fullTimeEmp.calculateSalary());

        System.out.println("\n--------------------------------------\n");

        PartTimeEmployee partTimeEmp = new PartTimeEmployee("Jane Smith", 102, "Freelancer", 20, 80);  // 80 hours worked
        partTimeEmp.displayDetails();
        System.out.println("Part Time Employee Salary: " + partTimeEmp.calculateSalary());
    }
}
