package utils;

import enums.ActionType;
import enums.SelectorType;

import java.util.Objects;

public class FillInput {
    protected String actionName;
    protected ActionType actionType;
    protected String selectorValue;
    protected SelectorType selectorType;

    public FillInput(String actionName, ActionType actionType) {
        this.actionName = actionName;
        this.actionType = actionType;
    }
    public FillInput(String selectorValue, SelectorType selectorType) {
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
        FillInput fillInput = (FillInput) o;
        return Objects.equals(actionName, fillInput.actionName) && actionType == fillInput.actionType && Objects.equals(selectorValue, fillInput.selectorValue) && selectorType == fillInput.selectorType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionName, actionType, selectorValue, selectorType);
    }

    @Override
    public String toString() {
        return "FillInput{" +
                "actionName='" + actionName + '\'' +
                ", actionType=" + actionType +
                ", selectorValue='" + selectorValue + '\'' +
                ", selectorType=" + selectorType +
                '}';
    }
}
