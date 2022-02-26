package utils;

import enums.ActionType;
import java.util.Objects;

public class NavigateToUrl {

    protected String actionName;
    protected ActionType actionType;
    protected String value;

    public NavigateToUrl(String actionName, ActionType actionType) {
        this.actionName = actionName;
        this.actionType = actionType;
    }
    public NavigateToUrl(String value) {
        this.value = value;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NavigateToUrl that = (NavigateToUrl) o;
        return Objects.equals(actionName, that.actionName) && actionType == that.actionType && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionName, actionType, value);
    }

    @Override
    public String toString() {
        return "NavigateToUrl{" +
                "actionName='" + actionName + '\'' +
                ", actionType=" + actionType +
                ", value='" + value + '\'' +
                '}';
    }
}
