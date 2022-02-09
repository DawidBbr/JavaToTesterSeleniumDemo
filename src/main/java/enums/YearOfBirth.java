package enums;

public enum YearOfBirth {

    BORNIN1990("1990"),
    BORNIN1991("1991"),
    BORNIN1992("1992"),
    BORNIN1993("1993"),
    BORNIN1994("1994"),
    BORNIN1995("1995"),
    BORNIN1996("1996"),
    BORNIN1997("1997"),
    BORNIN1998("1998"),
    BORNIN1999("1999"),
    BORNIN2000("2000");


    private final String name;

    YearOfBirth(String year) {
        this.name = year;
    }

    public String getName() {
        return name;
    }
}
