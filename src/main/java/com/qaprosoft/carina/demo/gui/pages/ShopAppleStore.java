package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ShopAppleStore extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"globalnav-submenu-link-store\"]/div/div/div[1]/ul/li[1]/a")
    private ExtendedWebElement shopTheLatest;

    public ShopAppleStore(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open(){
        driver.get("https://www.apple.com/");
    }

    public void shopTheLatest(){
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"globalnav-list\"]/li[2]/div/div/div[1]/ul/li[1]/a/span[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        shopTheLatest.click();
    }

}