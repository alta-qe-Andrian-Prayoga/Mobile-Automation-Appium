package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;

public class CalculatorPage extends BasePageObject {

    public void inputNumberOne(int a){
//        By locator = MobileBy.id("et_1");
//        AndroidElement txtFieldNumberOne = driver.findElement(locator);
//        txtFieldNumberOne.clear();
//        txtFieldNumberOne.sendKeys(Integer.toString(a));
        type(MobileBy.id("et_1"), Integer.toString(a));
    }

    public void selectSpinner(){
        click(MobileBy.id("spinner_1"));
    }

    public void selectAdd(){
        click(MobileBy.xpath("//android.widget.TextView[@index='0']"));
    }

    public void selectMinus(){
        click(MobileBy.xpath("//android.widget.TextView[@index='1']"));
    }

    public void selectDivided(){
        click(MobileBy.xpath("//android.widget.TextView[@index='2']"));
    }

    public void selectMultiplied(){
        click(MobileBy.xpath("//android.widget.TextView[@index='3']"));
    }

    public void inputNumberTwo(int b){
        type(MobileBy.id("et_2"), Integer.toString(b));
    }

    public void clickButtonTotal(){
        click(MobileBy.id("acb_calculate"));
    }

    public String viewResult(){
        return getElementText(MobileBy.id("tv_result"));
    }

}
