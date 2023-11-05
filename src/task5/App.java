package task5;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Corporation corporation = new Corporation();
        corporation = FakeDate.date();
        ArrayList<Employee> save = new ArrayList<>();
        save = corporation.searchAllEmployeeByName("Petrov",(s, l, a) -> s.getFirstName().equals(l));
        Corporation.searchArrayWritingToFile("src/task5/search.dat", save);
        ArrayList<Employee> e = new ArrayList<>();
        e = Corporation.readingFromFile("src/task5/search.dat");
        System.out.println(e);
    }
}
