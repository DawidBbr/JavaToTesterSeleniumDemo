package enums;

public enum DayOfBirth {
    DAY1("1"),
    DAY2("2"),
    DAY3("3"),
    DAY4("4"),
    DAY5("5"),
    DAY6("6"),
    DAY7("7"),
    DAY8("8"),
    DAY9("9"),
    DAY10("10"),
    DAY11("11"),
    DAY12("12"),
    DAY13("13"),
    DAY14("14"),
    DAY15("15"),
    DAY16("16"),
    DAY17("17"),
    DAY18("18"),
    DAY19("19"),
    DAY20("20"),
    DAY21("21"),
    DAY22("22"),
    DAY23("23"),
    DAY24("24"),
    DAY25("25"),
    DAY26("26"),
    DAY27("27"),
    DAY28("28"),
    DAY29("29"),
    DAY30("30"),
    DAY31("31");

    private final String name;

    DayOfBirth(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
