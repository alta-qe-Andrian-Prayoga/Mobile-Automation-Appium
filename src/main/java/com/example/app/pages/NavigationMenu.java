package com.example.app.pages;

import com.example.app.base.BasePageObject;
import com.example.app.driver.AndroidDriverInit;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.example.app.driver.AndroidDriverInit.driver;

public class NavigationMenu extends BasePageObject {

    public String getMenuTitleText(){
//        By locator = MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
//        AndroidElement labelMenuTitle = driver.findElement(locator);
//        return labelMenuTitle.getText();
        return getElementText(MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
    }

    public boolean checkHamburberMenuDisplayed(){
        //Explicit wait
        By locator = MobileBy.AccessibilityId("Open navigation drawer");
        WebDriverWait wait = new WebDriverWait(driver, 30, 1000);
        AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return hamburgerBtn.isDisplayed();
    }

    public void clickHamburgerMenu(){
        click(MobileBy.AccessibilityId("Open navigation drawer"));
    }

    public void clickListMenu(){
        click(MobileBy.id("nav_list"));
        waitAbit(3);
    }
}
