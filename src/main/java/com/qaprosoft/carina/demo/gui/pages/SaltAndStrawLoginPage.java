package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class SaltAndStrawLoginPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"CustomerEmail\"]")
    private ExtendedWebElement loginInput;

    @FindBy(xpath = "//*[@id=\"CustomerPassword\"]")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[4]/div/input")
    private ExtendedWebElement loginButton;

    public SaltAndStrawLoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        driver.get("https://saltandstraw.com/account/login?return_url=%2Faccount");
        loginInput.type(email);
        passwordInput.type(password);
        loginButton.click();
    }

}
