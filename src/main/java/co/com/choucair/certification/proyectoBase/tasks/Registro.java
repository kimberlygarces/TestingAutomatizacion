package co.com.choucair.certification.proyectoBase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Registro implements Task {
    private  String name;
    private String last;
    private String email;
    private String phone;

    public Registro(String name, String last, String email, String phone) {
        this.name = name;
        this.last = last;
        this.email = email;
        this.phone = phone;
    }

    private co.com.choucair.certification.proyectoBase.userinterface.registerPage registerPage;
    public static Registro OnThePage(String name, String last, String email, String phone) {

        return Tasks.instrumented(Registro.class, name, last, email , phone);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(registerPage.REGISTER_BUTTON),
                Enter.theValue("Ingresar Nombre").into(registerPage.NAME_INPUT),
                Enter.theValue("Ingresar Aplellido").into(registerPage.LAST_INPUT),
                Enter.theValue("kimberly@mail.com").into(registerPage.EMAIL_BUTTON),
                Enter.theValue("3135098673").into(registerPage.PHONE_IMPUT),

                Click.on(registerPage.GENDER_RADIUS),
                Click.on(registerPage.SUBMIT_BOTTON)
        );

    }
}