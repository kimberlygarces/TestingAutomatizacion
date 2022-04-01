package co.com.choucair.certification.proyectoBase.questions;

import  co.com.choucair.certification.proyectoBase.userinterface.registerPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean>{
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String nameUser = Text.of(registerPage.REGISTER_BUTTON)
                .viewedBy(actor).asString();

        boolean result;
        if(question.equals(nameUser)){
            result = true;
        }else {
            result = false;
        }
            return true;
    }
}
