package com.example.tests;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class HomePageTest {
    private static Playwright playwright;
    private static Browser browser;
    private BrowserContext context;
    private Page page;
    private HomePage homePage;

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
    void createContextAndPage() {
        context = browser.newContext();
        page = context.newPage();
        page.navigate("https://example.com");
        homePage = new HomePage(page);
    }

    @AfterEach
    void closeContext() {
        context.close();
    }

    @Test
    public void testContactLinkClick() {
        pageObject.clickContactLink();
    }

    @Test
    public void testContactLinkGetText() {
        pageObject.getContactLinkText();
    }

    @Test
    public void testContactLinkGetHref() {
        pageObject.getContactLinkHref();
    }


}