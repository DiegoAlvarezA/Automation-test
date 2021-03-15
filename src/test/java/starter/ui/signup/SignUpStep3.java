package starter.ui.signup;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpStep3 {

    public static final Target TITLE = Target.the("Title")
            .located(By.xpath("//span[contains(text(),'Tell us about your devices')]"));

    public static final Target OS_FIELD = Target.the("OS field")
            .located(By.cssSelector("span[aria-label='Select OS']"));

    public static final Target VERSION_FIELD = Target.the("OS field")
            .located(By.cssSelector("span[aria-label='Select a Version']"));

    public static final Target LANGUAGE_FIELD = Target.the("Language field")
            .located(By.cssSelector("span[aria-label='Select OS language']"));

    public static final Target DEVICE_FIELD = Target.the("Device " +
            "field")
            .located(By.cssSelector("span[aria-label='Select Brand']"));

    public static final Target DEVICE_MODEL_FIELD = Target.the("Device model " +
            "field")
            .located(By.cssSelector("span[aria-label='Select a Model']"));

    public static final Target DEVICE_OS_FIELD = Target.the("Device os " +
            "field")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]"));

    public static Target selectOption(String value) {
        return Target.the("Option")
                .located(By.xpath("//div[contains(text(),'"+ value + "')]"));
    }
}
