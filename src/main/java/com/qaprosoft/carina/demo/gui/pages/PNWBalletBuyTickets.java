package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PNWBalletBuyTickets extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"menu-item-59220\"]/a/span")
    private ExtendedWebElement seasonTickets;

    @FindBy(xpath = "//*[@id=\"post-20449\"]/div/div[6]/div/div[3]/div/div[1]/a")
    private ExtendedWebElement aMidSummerNightsDreamShowButton;

    @FindBy(xpath = "//*[@id=\"post-124661\"]/div/div[3]/div/div[1]/div/div/a")
    private ExtendedWebElement buyTicketsButton;

    public PNWBalletBuyTickets(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open(){
        driver.get("https://www.pnb.org/");
    }

    public void buyTickets(){
        seasonTickets.click();
        aMidSummerNightsDreamShowButton.click();
        buyTicketsButton.click();
    }

}

