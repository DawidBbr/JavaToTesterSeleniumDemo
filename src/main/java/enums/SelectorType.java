package enums;

public enum SelectorType {
    XPATH("XPATH"),
    ID("ID");

    private final String value;

    SelectorType(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}

