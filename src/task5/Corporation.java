package task5;

import java.io.*;
import java.util.ArrayList;

interface SearchEmployee {
    public boolean search(Employee employee, String name, int age);
}

public class Corporation implements Serializable {
    private ArrayList<Employee> employees;

    public Corporation() {
        this.employees = new ArrayList<>();
    }

    public Corporation(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {

            this.employees = ((Corporation) ois.readObject()).getEmployees();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }

    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
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
        for (Employee employee :
                this.employees) {
            System.out.println(employee.toString());
            ;
        }
    }

    public Employee searchFirstEmployeeByName(String name, int age, SearchEmployee s) {

        for (Employee item :
                employees) {
            if (s.search(item, name, age)) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<Employee> searchAllEmployeeByName(String name, int age, SearchEmployee s) {
        ArrayList<Employee> searsEmployees = new ArrayList<>();
        for (Employee item :
                employees) {
            if (s.search(item, name, age)) {
                searsEmployees.add(item);
            }
        }
        return searsEmployees;
    }

    public Employee searchFirstEmployeeByName(String name, SearchEmployee s) {

        for (Employee item :
                employees) {
            if (s.search(item, name, 0)) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<Employee> searchAllEmployeeByName(String name, SearchEmployee s) {
        ArrayList<Employee> searsEmployees = new ArrayList<>();
        for (Employee item :
                employees) {
            if (s.search(item, name, 0)) {
                searsEmployees.add(item);
            }
        }
        return searsEmployees;
    }

    public boolean writingToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/task5/corporation.dat"))) {

            oos.writeObject(this);
            System.out.println("File has been written");
            return true;
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
            return false;
        }
    }
    public static boolean searchArrayWritingToFile(String path, ArrayList<Employee> employees){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {

            oos.writeObject(employees);
            System.out.println("File has been written");
            return true;
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
            return false;
        }
    }
    public static ArrayList<Employee> readingFromFile(String path){
        ArrayList<Employee> employees = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {

            employees = ((ArrayList<Employee>) ois.readObject());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
        return employees;
    }
}
