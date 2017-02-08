package Book.Chapter_5.abstractClasses;

/**
 * Created by qurub on 08.02.2017.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Student("Vasia", "Programmer");
        people[1]= new Employee("Oleg",45000,1994,4,15);
        for (Person person : people) {
            System.out.println(person.getName()+", "+person.getDescription());
        }
    }
}
