package com.example.tests;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PlaygroundShopPageTest {
    private static Playwright playwright;
    private static Browser browser;
    private BrowserContext context;
    private Page page;
    private PlaygroundShopPage playgroundShopPage;

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
        page.navigate("https://autemos.selementrix.tech/demo/playground");
        playgroundShopPage = new PlaygroundShopPage(page);
    }

    @AfterEach
    void closeContext() {
        context.close();
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
    public void testProductCardHeadphonesClick() {
        pageObject.clickProductCardHeadphones();
    }

    @Test
    public void testProductCardHeadphonesIsEnabled() {
        pageObject.isProductCardHeadphonesEnabled();
    }

    @Test
    public void testProductCardTShirtClick() {
        pageObject.clickProductCardTShirt();
    }

    @Test
    public void testProductCardTShirtIsEnabled() {
        pageObject.isProductCardTShirtEnabled();
    }

    @Test
    public void testQuantityIncreaseClick() {
        pageObject.clickQuantityIncrease();
    }

    @Test
    public void testQuantityIncreaseIsEnabled() {
        pageObject.isQuantityIncreaseEnabled();
    }

    @Test
    public void testAddToCartBtnClick() {
        pageObject.clickAddToCartBtn();
    }

    @Test
    public void testAddToCartBtnIsEnabled() {
        pageObject.isAddToCartBtnEnabled();
    }

    @Test
    public void testCartIconClick() {
        pageObject.clickCartIcon();
    }

    @Test
    public void testCartIconIsEnabled() {
        pageObject.isCartIconEnabled();
    }

    @Test
    public void testCheckoutBtnClick() {
        pageObject.clickCheckoutBtn();
    }

    @Test
    public void testCheckoutBtnIsEnabled() {
        pageObject.isCheckoutBtnEnabled();
    }

    @Test
    public void testCheckoutNameType() {
        pageObject.typeCheckoutName("test value");
    }

    @Test
    public void testCheckoutNameClear() {
        pageObject.clearCheckoutName();
    }

    @Test
    public void testCheckoutNameGetValue() {
        pageObject.getCheckoutNameValue();
    }

    @Test
    public void testCheckoutEmailType() {
        pageObject.typeCheckoutEmail("test value");
    }

    @Test
    public void testCheckoutEmailClear() {
        pageObject.clearCheckoutEmail();
    }

    @Test
    public void testCheckoutEmailGetValue() {
        pageObject.getCheckoutEmailValue();
    }

    @Test
    public void testCheckoutAddressType() {
        pageObject.typeCheckoutAddress("test value");
    }

    @Test
    public void testCheckoutAddressClear() {
        pageObject.clearCheckoutAddress();
    }

    @Test
    public void testCheckoutAddressGetValue() {
        pageObject.getCheckoutAddressValue();
    }

    @Test
    public void testPlaceOrderBtnClick() {
        pageObject.clickPlaceOrderBtn();
    }

    @Test
    public void testPlaceOrderBtnIsEnabled() {
        pageObject.isPlaceOrderBtnEnabled();
    }

    @Test
    public void testCategoryFilterType() {
        pageObject.typeCategoryFilter("test value");
    }

    @Test
    public void testCategoryFilterClear() {
        pageObject.clearCategoryFilter();
    }

    @Test
    public void testCategoryFilterGetValue() {
        pageObject.getCategoryFilterValue();
    }

    @Test
    public void testQuantityDecreaseClick() {
        pageObject.clickQuantityDecrease();
    }

    @Test
    public void testQuantityDecreaseIsEnabled() {
        pageObject.isQuantityDecreaseEnabled();
    }

    @Test
    public void testContinueShoppingBtnClick() {
        pageObject.clickContinueShoppingBtn();
    }

    @Test
    public void testContinueShoppingBtnIsEnabled() {
        pageObject.isContinueShoppingBtnEnabled();
    }

    @Test
    public void testCheckoutPaymentType() {
        pageObject.typeCheckoutPayment("test value");
    }

    @Test
    public void testCheckoutPaymentClear() {
        pageObject.clearCheckoutPayment();
    }

    @Test
    public void testCheckoutPaymentGetValue() {
        pageObject.getCheckoutPaymentValue();
    }


}