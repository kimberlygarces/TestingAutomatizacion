package co.com.choucair.certification.proyectoBase.stepdefinitions;
import co.com.choucair.certification.proyectoBase.tasks.OpenRegister;
import co.com.choucair.certification.proyectoBase.tasks.OpenUp;
import co.com.choucair.certification.proyectoBase.tasks.RegistrationDate;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairStepDeficitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^The user wants to register a new user on the platform$")
    public void theUserWantsToRegisterANewUserOnThePlatform() {
        OnStage.theActorCalled("Kim").wasAbleTo(
                OpenUp.thePage(),
                OpenRegister.OnThePage()
        );
    }


    @When("^FThe user enters the (.*) data$")
    public void ftheUserEntersTheRegistrationData(String registration) {

        OnStage.theActorInTheSpotlight().attemptsTo(RegistrationDate.the(registration));
    }

    @Then("^End user registration$")
    public void endUserRegistration() {


    }
}
