package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class StretchLabLocationPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"hs_cos_wrapper_widget_1575349413111\"]/div[1]/div/section/div[2]/div/div[1]/div/div/div/div/div/div[2]/div/div[1]/form/div[2]/div/input")
    private ExtendedWebElement locationSearchBar;

    @FindBy(xpath = "//*[@id=\"hs_cos_wrapper_widget_1575349413111\"]/div[1]/div/section/div[2]/div/div[1]/div/div/div/div/div/div[2]/div/div[1]/form/div[2]/div/button")
    private ExtendedWebElement locationSearchButton;

    public StretchLabLocationPage(WebDriver driver) {
        super(driver);
    }

    public void stretchLabLocationFinder(String zipCode) {
        locationSearchBar.type(zipCode);
        locationSearchButton.click();
    }
}

