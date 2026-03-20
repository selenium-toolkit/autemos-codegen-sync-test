package com.example.tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.net.URL;

public class EriBankDialogsPage {

    private AppiumDriver<MobileElement> driver;
    private EriBankDialogsPage pageObject;

    @BeforeEach
    public void setUp() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("app", "/path/to/app.apk");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        pageObject = new EriBankDialogsPage(driver);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testCountryListSwitzerlandClick() {
        pageObject.clickCountryListSwitzerland();
    }

    @Test
    public void testCountryListSwitzerlandIsEnabled() {
        pageObject.isCountryListSwitzerlandEnabled();
    }

    @Test
    public void testConfirmYesButtonClick() {
        pageObject.clickConfirmYesButton();
    }

    @Test
    public void testConfirmYesButtonIsEnabled() {
        pageObject.isConfirmYesButtonEnabled();
    }


}