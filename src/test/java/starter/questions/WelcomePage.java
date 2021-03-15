package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class WelcomePage {

    public static Question<String> title() {
        return actor -> TextContent.of(starter.ui.WelcomePage.WELCOME_MESSAGE).viewedBy(actor).asString();
    }
}
