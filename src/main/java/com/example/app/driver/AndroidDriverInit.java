package com.example.app.driver;

import com.example.app.properties.AppiumProperties;
import com.example.app.properties.PropertiesReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverInit {

    //variable /instance variable
    public static AndroidDriver<AndroidElement>driver;

    //method /fungsi
    public static void initalize(){

        //load yaml
        AppiumProperties appiumProperties = PropertiesReader.readAppiumProperties();

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, appiumProperties.getPlatformName());
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, appiumProperties.getDeviceName());
        caps.setCapability(MobileCapabilityType.UDID, appiumProperties.getUdid());
        caps.setCapability(MobileCapabilityType.APP, appiumProperties.getApp());
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, appiumProperties.getNewCommandTimeout());
        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, appiumProperties.getAutoGrantPermissions());

        try {
            driver = new AndroidDriver<AndroidElement>(new URL(appiumProperties.getAppiumUrl()), caps);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } catch (MalformedURLException e){
            e.printStackTrace();
        }

    }
    public static void destroy(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.quit();

    }
}
