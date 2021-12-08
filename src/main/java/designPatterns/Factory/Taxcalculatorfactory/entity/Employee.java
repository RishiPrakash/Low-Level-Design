package designPatterns.Factory.Taxcalculatorfactory.entity;

public class Employee {
    String name;
    int ID;
    EmployeeType type;
    int salary;

    public Employee(String name, int ID, EmployeeType type, int salary) {
        this.name = name;
        this.ID = ID;
        this.type = type;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
