package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignInPage extends BasePage{

    @FindBy(id = "emaillogin")
    public WebElement emailBox;

    @FindBy(id="passwordlogin")
    public WebElement passwordBox;

   @FindBy(xpath = "//p[text()='LOG IN']")
    public WebElement loginButton;
}
