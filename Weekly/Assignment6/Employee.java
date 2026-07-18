package Assignment6;

public class Employee {
	
    int empId;
    String name;
    double salary;
    
   public static String companyName = "ABC Technologies";

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public static void displayCompany() {
        System.out.println("Company Name : " + companyName);
    }


    public void displayEmployee() {
        System.out.println("\nEmployee Details");
        System.out.println("----------------");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
    }

    public static void main(String[] args) {
        Employee.displayCompany();
        Employee emp1 = new Employee(1, "A", 50000.0);
        Employee emp2 = new Employee(2, "B", 62000.0);
        Employee emp3 = new Employee(3, "C", 58000.0);

        emp1.displayEmployee();
        emp2.displayEmployee();
        emp3.displayEmployee();
    }
}