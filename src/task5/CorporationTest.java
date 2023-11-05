package task5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class FakeDate {
    public static Corporation date() {
        Employee employee1 = new Employee();
        employee1.setFirstName("Ivanov");
        employee1.setLastName("Ivan");
        employee1.setPatronymic("Ivanovich");
        employee1.setAge(50);
        Employee employee2 = new Employee();
        employee2.setFirstName("Petrov");
        employee2.setLastName("Petr");
        employee2.setPatronymic("Petrovich");
        employee2.setAge(23);
        Employee employee3 = new Employee();
        employee3.setFirstName("Sidorov");
        employee3.setLastName("Sidor");
        employee3.setPatronymic("Sidorovich");
        employee3.setAge(34);
        Employee employee4 = new Employee();
        employee4.setFirstName("Petrov");
        employee4.setLastName("Petr");
        employee4.setPatronymic("Petrovich");
        employee4.setAge(45);
        Corporation corporation = new Corporation();
        corporation.addEmployee(employee1);
        corporation.addEmployee(employee2);
        corporation.addEmployee(employee3);
        corporation.addEmployee(employee4);


        return corporation;
    }
}

class CorporationTest {
    Corporation corporation = new Corporation();

    @Test
    void searchFirstEmployeeByNameEqualFirstName() {
        Corporation corporation = FakeDate.date();
        String firstName = "Petrov";
        Employee employeeTest = corporation.searchFirstEmployeeByName(firstName, 0, (s, l, a) -> s.getFirstName().equals(l));
        Assert.assertEquals(employeeTest.getFirstName(), firstName);
    }

    @Test
    void searchFirstEmployeeByNameEqualLastName() {
        Corporation corporation = FakeDate.date();
        String lastName = "Petr";
        Employee employeeTest = corporation.searchFirstEmployeeByName(lastName, 0, (s, l, a) -> s.getLastName().equals(l));
        Assert.assertEquals(employeeTest.getLastName(), lastName);
    }

    @Test
    void searchFirstEmployeeByNameEqualPatronymic() {
        Corporation corporation = FakeDate.date();
        String patronymic = "Petrovich";
        Employee employeeTest = corporation.searchFirstEmployeeByName(patronymic, 0, (s, l, a) -> s.getPatronymic().equals(l));
        Assert.assertEquals(employeeTest.getPatronymic(), patronymic);
    }

    @Test
    void searchAllEmployeeByNameEqualFirstName() {

        Corporation corporation = FakeDate.date();
        String firstName = "Petrov";
        ArrayList<Employee> employeesTest = new ArrayList<>();
        employeesTest.add(FakeDate.date().getEmployees().get(1));
        employeesTest.add(FakeDate.date().getEmployees().get(3));
        ArrayList<Employee> result = corporation.searchAllEmployeeByName(firstName, 0, (s, l, a) -> s.getFirstName().equals(l));
        Assert.assertEquals(result.size(), employeesTest.size());
        for (int i = 0; i < result.size(); i++) {
            Assert.assertEquals(employeesTest.get(i).getFirstName(), result.get(i).getFirstName());
        }

    }

    @Test
    void searchAllEmployeeByNameEqualLastName() {

        Corporation corporation = FakeDate.date();
        String lastName = "Petr";
        ArrayList<Employee> employeesTest = new ArrayList<>();
        employeesTest.add(FakeDate.date().getEmployees().get(1));
        employeesTest.add(FakeDate.date().getEmployees().get(3));
        ArrayList<Employee> result = corporation.searchAllEmployeeByName(lastName, 0, (s, l, a) -> s.getLastName().equals(l));
        Assert.assertEquals(result.size(), employeesTest.size());
        for (int i = 0; i < result.size(); i++) {
            Assert.assertEquals(employeesTest.get(i).getLastName(), result.get(i).getLastName());
        }

    }

    @Test
    void searchAllEmployeeByNameEqualPatronymic() {

        Corporation corporation = FakeDate.date();
        String patronymic = "Petrovich";
        ArrayList<Employee> employeesTest = new ArrayList<>();
        employeesTest.add(FakeDate.date().getEmployees().get(1));
        employeesTest.add(FakeDate.date().getEmployees().get(3));
        ArrayList<Employee> result = corporation.searchAllEmployeeByName(patronymic, 0, (s, l, a) -> s.getPatronymic().equals(l));
        Assert.assertEquals(result.size(), employeesTest.size());
        for (int i = 0; i < result.size(); i++) {
            Assert.assertEquals(employeesTest.get(i).getPatronymic(), result.get(i).getPatronymic());
        }

    }

    @Test
    void searchAllEmployeeByNameEqualFirstNameStartsWith() {

        Corporation corporation = FakeDate.date();
        String firstName = "Pet";
        ArrayList<Employee> employeesTest = new ArrayList<>();
        employeesTest.add(FakeDate.date().getEmployees().get(1));
        employeesTest.add(FakeDate.date().getEmployees().get(3));
        ArrayList<Employee> result = corporation.searchAllEmployeeByName(firstName, 0, (s, l, a) -> s.getFirstName().startsWith(l));
        Assert.assertEquals(result.size(), employeesTest.size());
        for (int i = 0; i < result.size(); i++) {
            Assert.assertEquals(employeesTest.get(i).getFirstName(), result.get(i).getFirstName());
        }

    }

    @Test
    void searchAllEmployeeByNameEqualLastNameStartsWith() {

        Corporation corporation = FakeDate.date();
        String lastName = "Pe";
        ArrayList<Employee> employeesTest = new ArrayList<>();
        employeesTest.add(FakeDate.date().getEmployees().get(1));
        employeesTest.add(FakeDate.date().getEmployees().get(3));
        ArrayList<Employee> result = corporation.searchAllEmployeeByName(lastName, 0, (s, l, a) -> s.getLastName().startsWith(l));
        Assert.assertEquals(result.size(), employeesTest.size());
        for (int i = 0; i < result.size(); i++) {
            Assert.assertEquals(employeesTest.get(i).getLastName(), result.get(i).getLastName());
        }

    }

    @Test
    void searchAllEmployeeByNameEqualPatronymicStartsWith() {

        Corporation corporation = FakeDate.date();
        String patronymic = "Petr";
        ArrayList<Employee> employeesTest = new ArrayList<>();
        employeesTest.add(FakeDate.date().getEmployees().get(1));
        employeesTest.add(FakeDate.date().getEmployees().get(3));
        ArrayList<Employee> result = corporation.searchAllEmployeeByName(patronymic, 0, (s, l, a) -> s.getPatronymic().startsWith(l));
        Assert.assertEquals(result.size(), employeesTest.size());
        for (int i = 0; i < result.size(); i++) {
            Assert.assertEquals(employeesTest.get(i).getPatronymic(), result.get(i).getPatronymic());
        }
    }

    @Test
    void searchAllEmployeeByNameEqualPatronymicStartsWithAndAgeIs23() {

        Corporation corporation = FakeDate.date();
        String patronymic = "Petr";
        ArrayList<Employee> employeesTest = new ArrayList<>();
        employeesTest.add(FakeDate.date().getEmployees().get(1));
        ArrayList<Employee> result = corporation.searchAllEmployeeByName(patronymic, 23, (s, l, a) -> s.getPatronymic().startsWith(l) && s.getAge() == a);
        Assert.assertEquals(result.size(), employeesTest.size());
        for (int i = 0; i < result.size(); i++) {
            Assert.assertEquals(employeesTest.get(i).getPatronymic(), result.get(i).getPatronymic());
        }

    }

}