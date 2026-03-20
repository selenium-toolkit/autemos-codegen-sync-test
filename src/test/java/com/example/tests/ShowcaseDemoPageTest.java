package com.example.tests;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ShowcaseDemoPageTest {
    private static Playwright playwright;
    private static Browser browser;
    private BrowserContext context;
    private Page page;

    @BeforeAll
    static void launchBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
    }

    @AfterAll
    static void closeBrowser() {
        playwright.close();
    }

    @BeforeEach
    void createContext() {
        context = browser.newContext();
        page = context.newPage();
    }

    @AfterEach
    void closeContext() {
        context.close();
    }

        @Test
    public void testHeroHeadingClick() {
        pageObject.clickHeroHeading();
    }

    @Test
    public void testHeroHeadingGetText() {
        pageObject.getHeroHeadingText();
    }

    @Test
    public void testLoginButtonClick() {
        pageObject.clickLoginButton();
    }

    @Test
    public void testLoginButtonGetText() {
        pageObject.getLoginButtonText();
    }

    @Test
    public void testLoginButtonGetHref() {
        pageObject.getLoginButtonHref();
    }

    @Test
    public void testGetStartedButtonClick() {
        pageObject.clickGetStartedButton();
    }

    @Test
    public void testGetStartedButtonGetText() {
        pageObject.getGetStartedButtonText();
    }

    @Test
    public void testGetStartedButtonGetHref() {
        pageObject.getGetStartedButtonHref();
    }

    @Test
    public void testCtaLearnMoreClick() {
        pageObject.clickCtaLearnMore();
    }

    @Test
    public void testCtaLearnMoreGetText() {
        pageObject.getCtaLearnMoreText();
    }

    @Test
    public void testCtaLearnMoreGetHref() {
        pageObject.getCtaLearnMoreHref();
    }

    @Test
    public void testNavBarClick() {
        pageObject.clickNavBar();
    }

    @Test
    public void testNavBarGetText() {
        pageObject.getNavBarText();
    }


}