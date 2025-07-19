package Employee;
public class Employee{
int empNo;
    String empName;
    String joinDate;
    char desigCode;
    String department;
    int basic;
    int hra;
    int it;
    public Employee(int empNo, String empName, String joinDate, char desigCode, String department, int basic, int hra, int it) {
        this.empNo = empNo;
        this.empName = empName;
        this.joinDate = joinDate;
        this.desigCode = desigCode;
        this.department = department;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }
    public static void main(String[] args) {
        Employee emp = new Employee(101, "John Doe", "2023-01-15", 'M', "IT", 50000, 10000, 5000);
        System.out.println("Employee Details:");
        System.out.println("Emp No: " + emp.empNo);
        System.out.println("Name: " + emp.empName);
        System.out.println("Join Date: " + emp.joinDate);
        System.out.println("Designation Code: " + emp.desigCode);
        System.out.println("Department: " + emp.department);
        System.out.println("Basic: " + emp.basic);
        System.out.println("HRA: " + emp.hra);
        System.out.println("IT: " + emp.it);
    }
}
