package Book.Chapter_6.interfaces;

import java.util.Arrays;

/**
 * Created by Kirill on 25.02.2017.
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker",35000);
        staff[1] = new Employee("Carl Cracker",55000);
        staff[2] = new Employee("Tony Tester", 95000);

        Arrays.sort(staff);

        for (Employee employee : staff) {
            System.out.println("name= "+ employee.getName()+", salary="+employee.getSalary());
        }
    }
}
