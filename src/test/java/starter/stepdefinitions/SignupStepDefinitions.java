package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import starter.navigation.NavigateTo;
import starter.navigation.UTestHomePage;
import starter.questions.WelcomePage;
import starter.questions.dashboard.OverviewData;
import starter.questions.signUp.SignUpOverviewData;
import starter.tasks.signup.DoSignUpStep1;
import starter.tasks.signup.DoSignUpStep2;
import starter.tasks.signup.DoSignUpStep3;
import starter.tasks.signup.DoSignUpStep4;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class SignupStepDefinitions {

    @Given("(.*) is in the home page")
    public void isInTheHomePage(String name) {
        theActorCalled(name).attemptsTo(
                NavigateTo.theUTestGoHomePage()
        );
    }

    @And("He clicks the sign up button")
    public void heClicksTheSignUpButton() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(UTestHomePage.SIGNUP_BUTTON)
        );
    }

    @And("He sees the first registration step")
    public void heSeesTheFirstRegistrationStep() {
        theActorInTheSpotlight().should(
                seeThat("The first step title", SignUpOverviewData.Step1Title(),
                        equalTo("Tell us about yourself"))
        );
    }

    @And("He fills the first form step")
    public void heFillsTheFirstFormStep() {
        theActorInTheSpotlight().attemptsTo(
                DoSignUpStep1.withData("Diego", "Alvarez","test@g.com",
                        "August", "1", "1995", "Spanish")
        );
    }

    @And("He sees the second registration step")
    public void heSeesTheSecondRegistrationStep() {
        theActorInTheSpotlight().should(
                seeThat("The second step title",
                        SignUpOverviewData.Step2Title(),
                        equalTo("Add your address"))
        );
    }

    @And("He fills the second form step")
    public void heFillsTheSecondFormStep() {
        theActorInTheSpotlight().attemptsTo(
                DoSignUpStep2.withData("Medell\u00EDn", "050015","Colombia")
        );
    }

    @And("He sees the third registration step")
    public void heSeesTheThirdRegistrationStep() {
        theActorInTheSpotlight().should(
                seeThat("The third step title", SignUpOverviewData.Step3Title(),
                        equalTo("Tell us about your devices"))
        );
    }

    @And("He fills the third form step")
    public void heFillsTheThirdFormStep() {
        theActorInTheSpotlight().attemptsTo(
                DoSignUpStep3.withData("Xubuntu", "Xubuntu 16.04", "Spanish",
                        "Xiaomi", "Redmi Note 8", "Android 10")
        );
    }

    @And("He sees the fourth registration step")
    public void heSeesTheFourthRegistrationStep() {
        theActorInTheSpotlight().should(
                seeThat("The third step title", SignUpOverviewData.Step4Title(),
                        equalTo("The last step"))
        );
    }

    @When("He fills the fourth form step")
    public void heFillsTheFourthFormStep() {
        theActorInTheSpotlight().attemptsTo(
                DoSignUpStep4.withData("Thevfxis55*")
        );
    }

    @Then("he sees the welcome message page")
    public void heSeesTheWelcomeMessagePage() {
        theActorInTheSpotlight().should(
                seeThat("The welcome message",
                        WelcomePage.title(),
                        equalTo("Welcome to the world's largest community of freelance software testers!"))
        );
    }
}
