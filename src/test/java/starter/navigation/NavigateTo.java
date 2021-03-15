package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theUTestGoHomePage() {
        return Task.where("{0} opens the UTest home page",
                Open.browserOn().the(UTestHomePage.class)
        );
    }
}
