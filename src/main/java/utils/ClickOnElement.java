package utils;

import enums.ActionType;
import enums.SelectorType;

import java.util.Objects;

public class ClickOnElement {
    protected String actionName;
    protected ActionType actionType;
    protected String value;
    protected String selectorValue;
    protected SelectorType selectorType;

    public ClickOnElement(String actionName, ActionType actionType) {
        this.actionName = actionName;
        this.actionType = actionType;
    }
    public ClickOnElement(String selectorValue, SelectorType selectorType) {
        this.selectorValue = selectorValue;
        this.selectorType = selectorType;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSelectorValue() {
        return selectorValue;
    }

    public void setSelectorValue(String selectorValue) {
        this.selectorValue = selectorValue;
    }

    public SelectorType getSelectorType() {
        return selectorType;
    }

    public void setSelectorType(SelectorType selectorType) {
        this.selectorType = selectorType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClickOnElement that = (ClickOnElement) o;
        return Objects.equals(actionName, that.actionName) && actionType == that.actionType && Objects.equals(value, that.value) && Objects.equals(selectorValue, that.selectorValue) && selectorType == that.selectorType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionName, actionType, value, selectorValue, selectorType);
    }

    @Override
    public String toString() {
        return "ClickOnElement{" +
                "actionName='" + actionName + '\'' +
                ", actionType=" + actionType +
                ", value='" + value + '\'' +
                ", selectorValue='" + selectorValue + '\'' +
                ", selectorType=" + selectorType +
                '}';
    }
}
