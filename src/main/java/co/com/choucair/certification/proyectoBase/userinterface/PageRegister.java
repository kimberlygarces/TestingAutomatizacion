package co.com.choucair.certification.proyectoBase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class PageRegister extends PageObject {
    public static final Target REGISTER_BUTTON =
            Target.the("Button register new").
            located(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[2]/a"));
}
