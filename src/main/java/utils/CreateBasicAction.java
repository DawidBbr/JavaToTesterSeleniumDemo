package utils;

import enums.ActionType;
import enums.AssertionType;
import enums.SelectorType;

public class CreateBasicAction {

    protected String actionName;
    protected ActionType actionType;
    protected String selectorValue;
    protected SelectorType selectorType;
    protected AssertionType assertionType;

    private CreateBasicAction(CreateBasicAction.CreateBasicActionBuilder builder) {
        this.actionName = builder.actionName;
        this.actionType = builder.actionType;
        this.selectorValue = builder.selectorValue;
        this.selectorType = builder.selectorType;
        this.assertionType = builder.assertionType;
    }

    public String getActionName() {
        return actionName;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public String getSelectorValue() {
        return selectorValue;
    }

    public SelectorType getSelectorType() {
        return selectorType;
    }

    public AssertionType getAssertionType() {
        return assertionType;
    }

    @Override
    public String toString() {
        return "CreateBasicAction{" +
                "actionName='" + actionName + '\'' +
                ", actionType=" + actionType +
                ", selectorValue='" + selectorValue + '\'' +
                ", selectorType=" + selectorType +
                ", assertionType=" + assertionType +
                '}';
    }

    public static class CreateBasicActionBuilder {
        protected String actionName;
        protected ActionType actionType;
        protected String selectorValue;
        protected SelectorType selectorType;
        protected AssertionType assertionType;

        public CreateBasicAction.CreateBasicActionBuilder actionName(final String actionName) {
            this.actionName = actionName;
            return this;
        }

        public CreateBasicAction.CreateBasicActionBuilder actionType(final ActionType actionType) {
            this.actionType = actionType;
            return this;
        }
        public CreateBasicAction.CreateBasicActionBuilder selectorValue(final String selectorValue) {
            this.selectorValue = selectorValue;
            return this;
        }

        public CreateBasicAction.CreateBasicActionBuilder selectorType(final SelectorType selectorType) {
            this.selectorType = selectorType;
            return this;
        }
        public CreateBasicAction.CreateBasicActionBuilder assertionType(final AssertionType assertionType) {
            this.assertionType = assertionType;
            return this;
        }
        public CreateBasicAction build() {
            return new CreateBasicAction(this);
        }
    }
}

