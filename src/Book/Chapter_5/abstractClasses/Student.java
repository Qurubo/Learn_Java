package Book.Chapter_5.abstractClasses;

public class Student extends Person {
    private String major;
    /**
     *
     * @param name Student Name
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
