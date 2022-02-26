package enums;

public enum ActionType {
    NAVIGATE_TO_URL("Navigate to URL"),
    CLICK_ON_ELEMENT("Click on element"),
    FILL_INPUT("Fill input"),
    MANUAL_ACTIVITY("Manual activity"),
    ASSERTION("Assertion");

    private final String value;

    ActionType(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
