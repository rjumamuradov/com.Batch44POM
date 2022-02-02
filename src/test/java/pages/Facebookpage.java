package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Facebookpage {

    public Facebookpage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "email")
    public WebElement emailKutusu;

    @FindBy(id = "pass")
    public WebElement passKutusu;
    @FindBy(name = "login")
    public WebElement loginButonu;


}
