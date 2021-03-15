package starter.ui.signup;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpStep1 {

    public static final Target TITLE = Target.the("Title")
            .located(By.xpath("//span[contains(text(),'Tell us about yourself')]"));

    public static final Target FIRST_NAME = Target.the("First name")
            .located(By.id("firstName"));

    public static final Target LAST_NAME = Target.the("Last name")
            .located(By.id("lastName"));

    public static final Target EMAIL = Target.the("Email address")
            .located(By.id("email"));

    public static final Target BIRTH_MONTH = Target.the("Birth month")
            .located(By.id("birthMonth"));

    public static final Target BIRTH_DAY = Target.the("Birth day")
            .located(By.id("birthDay"));

    public static final Target BIRTH_YEAR = Target.the("Birth year")
            .located(By.id("birthYear"));

    public static final Target LANGUAGE_LIST = Target.the("Languages (spoken)")
            .located(By.cssSelector("input[aria-label='Select box']"));

    public static final Target NEXT_BUTTON = Target.the("Next button")
            .located(By.cssSelector("a[class^='btn btn-blue']"));
}
