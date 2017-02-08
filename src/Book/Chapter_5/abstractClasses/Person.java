package Book.Chapter_5.abstractClasses;

/**
 * Created by qurub on 08.02.2017.
 */
public abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }
    public abstract String getDescription();
}
