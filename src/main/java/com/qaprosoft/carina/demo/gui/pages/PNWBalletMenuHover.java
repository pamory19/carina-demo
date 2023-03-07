package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PNWBalletMenuHover extends AbstractPage {


    public PNWBalletMenuHover(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open(){
        driver.get("https://www.pnb.org/");
    }

    public void hoverOverPerformance(){
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"menu-item-59220\"]/a/span"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
    }
}
