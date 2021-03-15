package starter.questions.signUp;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import starter.ui.signup.SignUpStep1;
import starter.ui.signup.SignUpStep2;
import starter.ui.signup.SignUpStep3;
import starter.ui.signup.SignUpStep4;

public class SignUpOverviewData {

    public static Question<String> Step1Title() {
        return actor -> TextContent.of(SignUpStep1.TITLE).viewedBy(actor).asString();
    }

    public static Question<String> Step2Title() {
        return actor -> TextContent.of(SignUpStep2.TITLE).viewedBy(actor).asString();
    }

    public static Question<String> Step3Title() {
        return actor -> TextContent.of(SignUpStep3.TITLE).viewedBy(actor).asString();
    }

    public static Question<String> Step4Title() {
        return actor -> TextContent.of(SignUpStep4.TITLE).viewedBy(actor).asString();
    }
}
