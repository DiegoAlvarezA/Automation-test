package starter.tasks.signup;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import starter.ui.signup.SignUpStep1;
import starter.ui.signup.SignUpStep2;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoSignUpStep2 implements Task {

    private final String city;
    private final String postalCode;
    private final String country;

    public DoSignUpStep2(String city, String postalCode, String country) {
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }

    public static Performable withData(String city, String postalCode, String country) {
        return instrumented(DoSignUpStep2.class, city, postalCode, country);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(city).into(SignUpStep2.CITY),
                Click.on(SignUpStep2.COUNTRY_FIELD),
                Enter.theValue(postalCode).into(SignUpStep2.POSTAL_CODE),
                Enter.theValue(country).into(SignUpStep2.COUNTRY_INPUT).thenHit(Keys.ENTER),
                Click.on(SignUpStep1.NEXT_BUTTON)
        );
    }
}
