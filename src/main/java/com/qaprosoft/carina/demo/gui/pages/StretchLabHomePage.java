package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class StretchLabHomePage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"hs_menu_wrapper_module_157200394393940_\"]/ul/li[3]/a")
    private ExtendedWebElement locationButton;


    public StretchLabHomePage(WebDriver driver) {
        super(driver);
    }

    public void clickLocationButton(){
        driver.get("https://www.stretchlab.com/location/kirkland");
        locationButton.click();
    }
}
