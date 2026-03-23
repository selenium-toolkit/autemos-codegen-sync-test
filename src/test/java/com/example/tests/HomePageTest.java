package com.example.tests;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
d
public class HomePageTest {
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

    @Test
    public void testMindsetLinkClick() {
        pageObject.clickMindsetLink();
    }

    @Test
    public void testMindsetLinkGetText() {
        pageObject.getMindsetLinkText();
    }

    @Test
    public void testMindsetLinkGetHref() {
        pageObject.getMindsetLinkHref();
    }

    @Test
    public void testServicesSectionClick() {
        pageObject.clickServicesSection();
    }

    @Test
    public void testServicesSectionGetText() {
        pageObject.getServicesSectionText();
    }

    @Test
    public void testSearchInputType() {
        pageObject.typeSearchInput("test value");
    }

    @Test
    public void testSearchInputClear() {
        pageObject.clearSearchInput();
    }

    @Test
    public void testSearchInputGetValue() {
        pageObject.getSearchInputValue();
    }

    @Test
    public void testBoltCuttersLinkClick() {
        pageObject.clickBoltCuttersLink();
    }

    @Test
    public void testBoltCuttersLinkGetText() {
        pageObject.getBoltCuttersLinkText();
    }

    @Test
    public void testBoltCuttersLinkGetHref() {
        pageObject.getBoltCuttersLinkHref();
    }


}
// FINAL_VERIFY_MARKER