package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_sa {

            @FindBy(id = "emaillogin")
            public WebElement emailBOX;

            @FindBy(id = "passwordlogin")
            public WebElement passwordBOX;

            @FindBy(xpath = "//p[.=\"LOG IN\"]")
            public WebElement loginBTM;


}
