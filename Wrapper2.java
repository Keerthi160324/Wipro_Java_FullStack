package Wrapper;
class Employee implements Cloneable {
    String name;
    int id;
    double salary;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
    public void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}
public class Wrapper2 {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee("M.Bhanu", 1106, 50000);
            Employee empClone = (Employee) emp1.clone();
            emp1.name = "M.Keerthi";
            emp1.id = 1603;
            emp1.salary = 80500;
            System.out.println("Original Employee:");
            emp1.display();
            System.out.println("Cloned Employee:");
            empClone.display();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported.");
        }
    }
}
