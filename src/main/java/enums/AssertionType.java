package enums;

public enum AssertionType {
    URL_IS("URL is"),
    URL_IS_NOT("URL is not"),
    ELEMENT_DISPLAYED("Element displayed"),
    ELEMENT_IS_NOT_DISPLAYED("Element is not displayed"),
    ELEMENT_TEXT_IS("Element text is"),
    ELEMENT_TEXT_DOES_NOT("Element text does not");

    private final String value;

    AssertionType(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
