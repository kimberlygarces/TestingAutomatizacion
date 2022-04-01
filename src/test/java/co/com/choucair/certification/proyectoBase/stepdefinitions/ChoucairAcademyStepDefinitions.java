package co.com.choucair.certification.proyectoBase.stepdefinitions;

import co.com.choucair.certification.proyectoBase.model.DataRegister;
import co.com.choucair.certification.proyectoBase.questions.Answer;
import co.com.choucair.certification.proyectoBase.tasks.OpenUp;
import co.com.choucair.certification.proyectoBase.tasks.Registro;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^that Kim wants to sign up for automationtesting$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<DataRegister> DataRegister) throws Exception{

        OnStage.theActorCalled("Kim").wasAbleTo(OpenUp.thePage(), Registro.
                OnThePage(DataRegister.get(0).getNAME(),
                        DataRegister.get(0).getLAST(),
                        DataRegister.get(0).getEMAIL(),
                        DataRegister.get(0).getPHONE()
                        ));
    }

    @When("^Find the automationtesting page and fill in the fields$")
    public void findTheAutomationtestingPageAndFillInTheFields(List<DataRegister> DataRegister) throws Exception{

        OnStage.theActorCalled("Kim").wasAbleTo(OpenUp.thePage(), Registro.
                OnThePage(DataRegister.get(0).getNAME(),
                        DataRegister.get(0).getLAST(),
                        DataRegister.get(0).getEMAIL(),
                        DataRegister.get(0).getPHONE()
                ));

    }

    @Then("^Completing the registration of the (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaconBanColombia(String question) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }
}
