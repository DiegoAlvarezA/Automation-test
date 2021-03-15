package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WelcomePage {

    public static final Target WELCOME_MESSAGE = Target.the("Welcome message")
            .located(By.tagName("h1"));
}
