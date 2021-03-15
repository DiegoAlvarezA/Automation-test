package starter.tasks.signup;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.webelements.Checkbox;
import starter.ui.signup.SignUpStep1;
import starter.ui.signup.SignUpStep2;
import starter.ui.signup.SignUpStep4;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoSignUpStep4 implements Task {

    private final String password;

    public DoSignUpStep4(String password) {
        this.password = password;
    }

    public static Performable withData(String password) {
        return instrumented(DoSignUpStep4.class, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(SignUpStep4.PASSWORD),
                Enter.theValue(password).into(SignUpStep4.CONFIRM_PASSWORD),
                Click.on(SignUpStep4.CHECKBOX_TERMS_OF_USE),
                Click.on(SignUpStep4.CHECKBOX_PRIVACY_POLICY),
                Click.on(SignUpStep1.NEXT_BUTTON)
        );
    }
}
