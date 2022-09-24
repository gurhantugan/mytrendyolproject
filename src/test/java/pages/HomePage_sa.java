package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_sa {


    @FindBy(css = ".font-icon.icon-web-header-account")
    public WebElement userIcon;

    @FindBy(css = ".icon.fav-icon")
    public WebElement favoritesIcon;




}
