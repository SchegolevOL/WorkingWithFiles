package task5;

import java.util.ArrayList;

interface SearchEmployee{
    public boolean search(Employee employee, String name, int age);
}
public class Corporation {
    private ArrayList<Employee>employees;

    public Corporation() {
        this.employees = new ArrayList<>();
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
    public Employee searchFirstEmployeeByName(String name, int age, SearchEmployee s){

        for (Employee item:
                employees) {
            if (s.search(item, name, age))
            {
               return item;
            }
        }
        return null;
    }
    public ArrayList <Employee> searchAllEmployeeByName(String name, int age, SearchEmployee s){
        ArrayList<Employee> searsEmployees = new ArrayList<>();
        for (Employee item:
             employees) {
            if (s.search(item, name, age))
            {
                searsEmployees.add(item);
            }
        }
        return searsEmployees;
    }

}
