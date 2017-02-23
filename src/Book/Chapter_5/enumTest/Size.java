package Book.Chapter_5.enumTest;

/**
 * Created by Kirill on 24.02.2017.
 */
enum Size {
    SMALL("S"),MEDIUM("M"),lARGE("L"),EXTRA_LARGE("XL");
    private String abbreviation;

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
