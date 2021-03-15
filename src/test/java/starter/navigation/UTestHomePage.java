package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com")
public class UTestHomePage extends PageObject {

    public static final Target SIGNUP_BUTTON = Target.the("Sign up button")
            .located(By.cssSelector("a.unauthenticated-nav-bar__sign-up"));
}
