package co.com.choucair.certification.proyectoBase.tasks;

import co.com.choucair.certification.proyectoBase.userinterface.PageDataRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistrationDate  implements Task {
    public static RegistrationDate the(String registration) {
        return Tasks.instrumented(RegistrationDate.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(
                Enter.theValue("mi nombre").into(PageDataRegister.NAME_INPUT),
                Enter.theValue("mi nombre").into(PageDataRegister.LAST_INPUT),
                Enter.theValue("CRA 4D # 95 - 37").into(PageDataRegister.ADDRESS_INPUT),
                Enter.theValue("kim@mai.com").into(PageDataRegister.EMAIL_INPUT),
                Enter.theValue("3123231323").into(PageDataRegister.PHOME_INPUT),
                Click.on(PageDataRegister.GENDER_INPUT),
                Click.on(PageDataRegister.HOBBIES_INPUT),
                Click.on(PageDataRegister.lANGUAGES_INPUT),
                Click.on(PageDataRegister.lANGUAGES_SELECT_INPUT),
                Click.on(PageDataRegister.YEAR_INPUT),
                Click.on(PageDataRegister.YEAR_SELECT_INPUT),
                Click.on(PageDataRegister.MONT_INPUT),
                Click.on(PageDataRegister.MONT_SELECT_INPUT),
                Click.on(PageDataRegister.DAY_INPUT),
                Click.on(PageDataRegister.DAY_SELECT_INPUT),
                Enter.theValue("12345").into(PageDataRegister.PASSWORD_INPUT),
                Enter.theValue("12345").into(PageDataRegister.PASSWORD_CONFIM_INPUT),
                Click.on(PageDataRegister.REFRESH_INPUT)

                );
    }
}
