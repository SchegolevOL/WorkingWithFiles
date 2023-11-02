package task5;

import java.util.ArrayList;

public class Corporation {
    private ArrayList<Employee>employees;

    public Corporation() {
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
    public void deleteEmployee(Employee employee) {
        this.employees.remove(employee);
    }
    public void printEmployees() {
        for (Employee employee:
             this.employees) {
            System.out.println(employee.toString());;
        }
    }

}
