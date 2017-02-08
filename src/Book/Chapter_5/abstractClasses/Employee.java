package Book.Chapter_5.abstractClasses;

import java.time.LocalDate;

/**
 * Created by qurub on 08.02.2017.
 */
public class Employee extends Person {
    private double salary;
    private LocalDate hireday;

    /**
     *
     * @param name
     * @param salary
     * @param year
     * @param month
     * @param day
     */
    public Employee(String name, double salary, int year,int month, int day) {
        super(name);
        this.salary = salary;
        hireday = LocalDate.of(year,month,day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireday() {
        return hireday;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f",salary);
    }
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
