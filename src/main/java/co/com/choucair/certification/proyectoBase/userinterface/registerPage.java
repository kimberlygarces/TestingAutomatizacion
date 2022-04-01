package co.com.choucair.certification.proyectoBase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class registerPage extends PageObject {
    public static final Target REGISTER_BUTTON = Target.the( "select the register button")
            .located(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[2]/a"));
    public static final Target NAME_INPUT = Target.the( "select the register button")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
    public static final Target LAST_INPUT = Target.the( "select the register button")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
    public static final Target EMAIL_BUTTON = Target.the( "select the register button")
            .located(By.xpath("//*[@id=\"eid\"]/input"));
    public static final Target PHONE_IMPUT = Target.the( "select the register button")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
    public static final Target GENDER_RADIUS = Target.the( "select the register button")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
    public static final Target SUBMIT_BOTTON = Target.the( "select the register button")
            .located(By.id("Button1"));


}
