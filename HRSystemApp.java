class Employee {
    private String name;
    private int id;
    protected double salary;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        setSalary(salary);
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 500.0;
        }
    }
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: $" + salary);
    }
    public double calculateBonus() {
        return salary * 0.10;
    }
    public double calculateBonus(double extraBonus) {
        return (salary * 0.10) + extraBonus;
    }
}
class Manager extends Employee {
    private String department;
    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }
    @Override
    public void displayInfo() {
        System.out.println("----- Manager Details -----");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
    }
}
class Developer extends Employee {
    private String programmingLanguage;
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void displayInfo() {
        System.out.println("----- Developer Details -----");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Salary: $" + salary);
        System.out.println("Specialization: " + programmingLanguage);
    }
}
public class HRSystemApp {
    public static void main(String[] args) {
        Manager mgr = new Manager("Sara", 101, 50000, "Human Resources");
        Developer dev = new Developer("David", 102, 40000, "Java");
        System.out.println("Checking Bonus Formats:");
        System.out.println(mgr.getName() + " Standard Bonus: $" + mgr.calculateBonus());
        System.out.println(dev.getName() + " Performance-Adjusted Bonus: $" + dev.calculateBonus(2000));
        System.out.println("\n---------------------------------------------\n");
        Employee[] corporateTeam = new Employee[2];
        corporateTeam[0] = mgr;
        corporateTeam[1] = dev;
        System.out.println("Processing System Roster Dynamically:");
        for (Employee emp : corporateTeam) {
            emp.displayInfo(); 
            System.out.println();
        }
    }
}