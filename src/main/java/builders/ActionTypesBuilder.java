package builders;

import utils.CreateBasicAction;

public class ActionTypesBuilder {
    public static CreateBasicAction.CreateBasicActionBuilder getDataActionTypesBuilder() {
        CreateBasicAction.CreateBasicActionBuilder dataActionTypes =
                new CreateBasicAction.CreateBasicActionBuilder();
        return dataActionTypes;
    }
}
