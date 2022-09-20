package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserOwnPage extends BasePage{



    @FindBy(css = ".font-icon.icon-web-header-account")
    public WebElement humanAvatar;

    @FindBy(xpath = "//span[text()='Sign Out']")
    public WebElement signOutButton;
}
