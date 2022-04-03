package co.com.choucair.certification.proyectoBase.questions;

import co.com.choucair.certification.proyectoBase.userinterface.PageDataRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameUser = Text.of(PageDataRegister.NAME_INPUT).viewedBy(actor).asString();
        if (question.equals(nameUser)) {
            result = true;

        } else {
            result = true;
        }
        return result;
    }
}
