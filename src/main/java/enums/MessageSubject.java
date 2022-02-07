package enums;

public enum MessageSubject {
    CUSTOMER_SERVICE("Customer service"),
    WEBMASTER("Webmaster");

    private final String value;

    MessageSubject(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static void main(String[] args) {
    }
}
