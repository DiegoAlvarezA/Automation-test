package starter.ui.signup;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpStep4 {

    public static final Target TITLE = Target.the("Title")
            .located(By.xpath("//span[contains(text(),'The last step')]"));

    public static final Target PASSWORD = Target.the("Password")
            .located(By.id("password"));

    public static final Target CONFIRM_PASSWORD = Target.the("Confirm password")
            .located(By.id("confirmPassword"));

    public static final Target CHECKBOX_TERMS_OF_USE = Target.the("Terms of " +
            "use")
            .located(By.id("termOfUse"));

    public static final Target CHECKBOX_PRIVACY_POLICY = Target.the("Privacy " +
            "& Security Policy")
            .located(By.id("privacySetting"));
}
