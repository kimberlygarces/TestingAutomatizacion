package co.com.choucair.certification.proyectoBase.tasks;

import co.com.choucair.certification.proyectoBase.userinterface.PageRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OpenRegister implements Task {
    public static OpenRegister OnThePage() {
        return Tasks.instrumented(OpenRegister.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(PageRegister.REGISTER_BUTTON));
    }
}
