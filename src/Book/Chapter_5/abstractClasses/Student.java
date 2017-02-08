package Book.Chapter_5.abstractClasses;

/**
 * Created by qurub on 08.02.2017.
 */
public class Student extends Person {
    private String major;
    /**
     *
     * @param name Имя студента
     * @param major Специализация студента
     */
    public Student(String name, String major) {
        super(name);
        this.major = major;
    }
    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}
