package co.com.choucair.certification.proyectoBase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageDataRegister extends PageObject {
    public static final Target NAME_INPUT = Target.the("name user")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
    public static final Target LAST_INPUT = Target.the("name user")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
    public static final Target ADDRESS_INPUT = Target.the("name user")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea"));
    public static final Target EMAIL_INPUT = Target.the("name user")
            .located(By.xpath("//*[@id=\"eid\"]/input"));
    public static final Target PHOME_INPUT = Target.the("name user")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
    public static final Target GENDER_INPUT = Target.the("name user")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
    public static final Target HOBBIES_INPUT = Target.the("name user")
            .located(By.xpath("//*[@id=\"checkbox1\"]"));
    public static final Target lANGUAGES_INPUT = Target.the("name user")
            .located(By.xpath("//*[@id=\"msdd\"]"));
    public static final Target lANGUAGES_SELECT_INPUT = Target.the("name user")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a"));

    public static final Target YEAR_INPUT = Target.the("name user")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
    public static final Target YEAR_SELECT_INPUT = Target.the("name user")
            .located(By.xpath("//*[@id=\"yearbox\"]/option[80]"));
    public static final Target MONT_INPUT = Target.the("name user")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
    public static final Target MONT_SELECT_INPUT = Target.the("name user")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[13]"));
    public static final Target DAY_INPUT = Target.the("name user")
            .located(By.xpath("//*[@id=\"daybox\"]"));
    public static final Target DAY_SELECT_INPUT = Target.the("name user")
            .located(By.xpath("//*[@id=\"daybox\"]/option[6]"));

    public static final Target PASSWORD_INPUT = Target.the("name user")
            .located(By.xpath("//*[@id=\"firstpassword\"]"));
    public static final Target PASSWORD_CONFIM_INPUT = Target.the("name user")
            .located(By.xpath("//*[@id=\"secondpassword\"]"));
    public static final Target REFRESH_INPUT = Target.the("name user")
            .located(By.xpath("//*[@id=\"Button1\"]"));

}
