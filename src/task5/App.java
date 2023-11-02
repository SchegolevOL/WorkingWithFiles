package task5;

public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setFirstName("aaaa");
        employee1.setLastName("bbbb");
        employee1.setPatronymic("ssss");
        employee1.setAge(50);
        Employee employee2 = new Employee();
        employee2.setFirstName("aaadfga");
        employee2.setLastName("bbfgbb");
        employee2.setPatronymic("sdfgsss");
        employee2.setAge(23);
        Employee employee3 = new Employee();
        employee3.setFirstName("re");
        employee3.setLastName("erer");
        employee3.setPatronymic("sserersdss");
        employee3.setAge(34);
        Corporation corporation = new Corporation();
        corporation.addEmployee(employee1);
        corporation.addEmployee(employee2);
        corporation.addEmployee(employee3);
        corporation.printEmployees();

    }
}
