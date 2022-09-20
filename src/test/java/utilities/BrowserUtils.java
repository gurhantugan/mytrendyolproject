package utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {


    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

          /*   Method info:  Name: switchWindowAndVerify
            • Return type: void
            • Arg1: WebDriver
            • Arg2: String expectedInUrl
            • Arg3: String expectedTitle
        */
    /*Bu method 3 argument kabul ediyor.
     * WebDriver,
     * expectedInUrl: to check if url contains given Srting
     * expectedInTitle: to check if actualTitle contain given String */


    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle) {

        Set<String> windows = Driver.getDriver().getWindowHandles();

        for (String each : windows) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());
            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break; // break the loop stay on etsy
            }


        }


        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }

    public static void verifyTitle(String expectedTitle) {

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }

    public static void verifyURLContains(String expectedInURL){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL));
    }

    public static List<String> dropdownOptionsAsString(WebElement dropdownElement){

        Select select = new Select(dropdownElement);
        List<WebElement> actualOptionAsWebElement  = select.getOptions();

        System.out.println(" ????? "+actualOptionAsWebElement);  // List Of WebElement cikar

        // List of WE, List of String Cevirme

        List<String> actualOptionAsString  = new ArrayList<>(); // Bos bor alan olusturdum

        for (WebElement each : actualOptionAsWebElement) {
            actualOptionAsString.add(each.getText());  // Her bir WE text kismini aldim (In String) ve Bos List alana add yaptim
        }


        return actualOptionAsString;

    }

    public static void clickRadioButton(List<WebElement> radioBTMs, String attributeValue){

        for (WebElement each : radioBTMs) {
            if(each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                each.click();
            }


        }

    }




}