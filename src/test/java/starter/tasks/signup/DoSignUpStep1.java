package starter.tasks.signup;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import starter.ui.signup.SignUpStep1;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoSignUpStep1 implements Task {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String month;
    private final String day;
    private final String year;
    private final String language;

    public DoSignUpStep1(String firstName, String lastName, String email,
                         String month, String day, String year,
                         String language) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
        this.language = language;
    }

    public static Performable withData(String firstName, String lastName, String email,
                                       String month, String day, String year,
                                       String language) {
        return instrumented(DoSignUpStep1.class, firstName, lastName, email,
                month, day, year, language);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(SignUpStep1.FIRST_NAME),
                Enter.theValue(lastName).into(SignUpStep1.LAST_NAME),
                Enter.theValue(email).into(SignUpStep1.EMAIL),
                SelectFromOptions.byVisibleText(month).from(SignUpStep1.BIRTH_MONTH),
                SelectFromOptions.byVisibleText(day).from(SignUpStep1.BIRTH_DAY),
                SelectFromOptions.byVisibleText(year).from(SignUpStep1.BIRTH_YEAR),
                Enter.theValue(language).into(SignUpStep1.LANGUAGE_LIST).thenHit(Keys.ENTER),
                Click.on(SignUpStep1.NEXT_BUTTON)
        );
    }
}
