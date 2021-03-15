package starter.tasks.signup;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.signup.SignUpStep1;
import starter.ui.signup.SignUpStep3;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoSignUpStep3 implements Task {

    private final String os;
    private final String version;
    private final String language;
    private final String device;
    private final String deviceModel;
    private final String deviceOs;

    public DoSignUpStep3(String os, String version, String language,
                         String device, String deviceModel, String deviceOs) {
        this.os = os;
        this.version = version;
        this.language = language;
        this.device = device;
        this.deviceModel = deviceModel;
        this.deviceOs = deviceOs;
    }

    public static Performable withData(String os, String version, String language,
                                       String device, String deviceModel, String deviceOs) {
        return instrumented(DoSignUpStep3.class, os, version, language,
                device, deviceModel, deviceOs);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SignUpStep3.OS_FIELD),
                Click.on(SignUpStep3.selectOption(os)),
                Click.on(SignUpStep3.VERSION_FIELD),
                Click.on(SignUpStep3.selectOption(version)),
                Click.on(SignUpStep3.LANGUAGE_FIELD),
                Click.on(SignUpStep3.selectOption(language)),
                Click.on(SignUpStep3.DEVICE_FIELD),
                Click.on(SignUpStep3.selectOption(device)),
                Click.on(SignUpStep3.DEVICE_MODEL_FIELD),
                Click.on(SignUpStep3.selectOption(deviceModel)),
                Click.on(SignUpStep3.DEVICE_OS_FIELD),
                Click.on(SignUpStep3.selectOption(deviceOs)),
                Click.on(SignUpStep1.NEXT_BUTTON)
        );
    }
}
