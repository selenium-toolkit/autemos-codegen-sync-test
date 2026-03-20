package com.example.tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.net.URL;

public class EriBankPaymentPage {

    private AppiumDriver<MobileElement> driver;
    private EriBankPaymentPage pageObject;

    @BeforeEach
    public void setUp() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("app", "/path/to/app.apk");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        pageObject = new EriBankPaymentPage(driver);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testPhoneTextFieldType() {
        pageObject.typePhoneTextField("test value");
    }

    @Test
    public void testPhoneTextFieldClear() {
        pageObject.clearPhoneTextField();
    }

    @Test
    public void testPhoneTextFieldGetValue() {
        pageObject.getPhoneTextFieldValue();
    }

    @Test
    public void testNameTextFieldType() {
        pageObject.typeNameTextField("test value");
    }

    @Test
    public void testNameTextFieldClear() {
        pageObject.clearNameTextField();
    }

    @Test
    public void testNameTextFieldGetValue() {
        pageObject.getNameTextFieldValue();
    }

    @Test
    public void testAmountTextFieldType() {
        pageObject.typeAmountTextField("test value");
    }

    @Test
    public void testAmountTextFieldClear() {
        pageObject.clearAmountTextField();
    }

    @Test
    public void testAmountTextFieldGetValue() {
        pageObject.getAmountTextFieldValue();
    }

    @Test
    public void testCountryButtonClick() {
        pageObject.clickCountryButton();
    }

    @Test
    public void testCountryButtonIsEnabled() {
        pageObject.isCountryButtonEnabled();
    }

    @Test
    public void testSendPaymentButtonClick() {
        pageObject.clickSendPaymentButton();
    }

    @Test
    public void testSendPaymentButtonIsEnabled() {
        pageObject.isSendPaymentButtonEnabled();
    }


}