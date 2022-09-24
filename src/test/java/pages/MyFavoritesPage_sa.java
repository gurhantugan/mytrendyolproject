package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


import java.awt.*;
import java.util.List;

public class MyFavoritesPage_sa {



    @FindBy(xpath = "(//img[@class='boutique__image'])[3]")
    public WebElement pantolon;



   @FindBy(xpath = "(//span[@class='p-icon icon-int-favorites favorite-icon'])[1]")
    public WebElement kalp1;

    @FindBy(xpath = "(//span[@class='p-icon icon-int-favorites favorite-icon'])[2]")
    public WebElement kalp2;

    @FindBy(xpath = "(//span[@class='p-icon icon-int-favorites favorite-icon'])[3]")
    public WebElement kalp3;

    @FindBy(xpath = "(//span[@class='p-icon icon-int-favorites favorite-icon'])[4]")
    public WebElement kalp4;

    @FindBy(xpath = "//div[@class='product-cards']/div")
    public List<WebElement> sectiklerim;

    @FindBy(xpath = "(//i[@class='icon-red-void'])[4]")
    public WebElement iptal;


}
