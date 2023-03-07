package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParisWebSampleTest implements IAbstractTest {

    @Test
    public void testLoginPage(){

        System.setProperty("web-driver.chrome.driver", "/Users/parisamory/Documents/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();

        SaltAndStrawLoginPage loginPage = new SaltAndStrawLoginPage(driver);
        loginPage.login("apamory@gmail.com", "12345");

    }

    @Test
    public void testStretchLabHomeAndLocationPage(){

        System.setProperty("web-driver.chrome.driver", "/Users/parisamory/Documents/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();
        StretchLabHomePage homePage = new StretchLabHomePage(driver);
        homePage.clickLocationButton();

        StretchLabLocationPage locationPage = new StretchLabLocationPage(driver);
        locationPage.stretchLabLocationFinder("98040");
    }

    @Test
    public void testStretchLabClassSchedule(){

        System.setProperty("web-driver.chrome.driver", "/Users/parisamory/Documents/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();
        StretchLabClassSchedule classSchedule = new StretchLabClassSchedule(driver);
        classSchedule.open();
        classSchedule.stretchLabClassPicker();
        classSchedule.selectInstructor("Alicia");
    }

    @Test
    public void testPNWBalletTickets(){

        System.setProperty("web-driver.chrome.driver", "/Users/parisamory/Documents/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();
        PNWBalletMenuHover balletTickets = new PNWBalletMenuHover(driver);
        balletTickets.open();
        balletTickets.hoverOverPerformance();
    }

    @Test
    public void testPNWBalletBuyTickets(){

        System.setProperty("web-driver.chrome.driver", "/Users/parisamory/Documents/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();
        PNWBalletBuyTickets balletTickets = new PNWBalletBuyTickets(driver);
        balletTickets.open();
        balletTickets.buyTickets();
    }

    @Test
    public void testShopAppleStore(){

        System.setProperty("web-driver.chrome.driver", "/Users/parisamory/Documents/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();
        ShopAppleStore appleStore = new ShopAppleStore(driver);
        appleStore.open();
        appleStore.shopTheLatest();
    }


}
