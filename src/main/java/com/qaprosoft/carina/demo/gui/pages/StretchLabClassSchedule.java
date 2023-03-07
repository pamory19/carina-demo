package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StretchLabClassSchedule extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"hs_cos_wrapper_widget_1572005486263\"]/section/div[2]/div/div[1]/section/div/div/div/a[2]")
    private ExtendedWebElement viewScheduleButton;

    @FindBy(xpath = "//*[@id=\"location-service-scheduler\"]/div/div[1]/div[1]/div[2]/div[1]")
    private ExtendedWebElement classDurationButton;


    public StretchLabClassSchedule(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open(){
        driver.get("https://www.stretchlab.com/location/kirkland");
    }

    public void stretchLabClassPicker(){
        viewScheduleButton.click();
        classDurationButton.click();
    }


    public void selectInstructor(String instructorName){
        List<WebElement> instructors = driver.findElements(By.xpath("//*[@id=\"location-service-scheduler\"]/div/div[1]/div[2]/select/option"));
        for (WebElement instructor : instructors){
            String currentName = instructor.getText();
            if (currentName.equalsIgnoreCase(instructorName)){
                instructor.click();
                break;
            }
        }
    }


}
