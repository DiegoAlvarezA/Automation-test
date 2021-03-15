package starter.ui.signup;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpStep2 {

    public static final Target TITLE = Target.the("Title")
            .located(By.xpath("//span[contains(text(),'Add your address')]"));

    public static final Target CITY = Target.the("City")
            .located(By.id("city"));

    public static final Target POSTAL_CODE = Target.the("City")
            .located(By.id("zip"));

    public static final Target COUNTRY_FIELD = Target.the("Country field")
            .located(By.cssSelector("span[aria-label='Select a country']"));

    public static final Target COUNTRY_INPUT = Target.the("Country field")
            .located(By.cssSelector("input[placeholder='Select a country']"));
}
