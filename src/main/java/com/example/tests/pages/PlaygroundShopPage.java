package com.example.tests;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;

public class PlaygroundShopPage  {
    private final Page page;

    private Locator searchInput;

    private Locator productCardHeadphones;

    private Locator productCardTShirt;

    private Locator quantityIncrease;

    private Locator addToCartBtn;

    private Locator cartIcon;

    private Locator checkoutBtn;

    private Locator checkoutName;

    private Locator checkoutEmail;

    private Locator checkoutAddress;

    private Locator placeOrderBtn;

    private Locator categoryFilter;

    private Locator quantityDecrease;

    private Locator continueShoppingBtn;

    private Locator checkoutPayment;

    public PlaygroundShopPage(Page page)  {
        this.page = page;
        this.searchInput = page.locator("[data-testid=\"search-input\"]");
        this.productCardHeadphones = page.locator("[data-testid=\"product-card-p1\"]");
        this.productCardTShirt = page.locator("[data-testid=\"product-card-p4\"]");
        this.quantityIncrease = page.locator("[data-testid=\"quantity-increase\"]");
        this.addToCartBtn = page.locator("[data-testid=\"add-to-cart-btn\"]");
        this.cartIcon = page.locator("[data-testid=\"cart-icon\"]");
        this.checkoutBtn = page.locator("[data-testid=\"checkout-btn\"]");
        this.checkoutName = page.locator("[data-testid=\"checkout-name\"]");
        this.checkoutEmail = page.locator("[data-testid=\"checkout-email\"]");
        this.checkoutAddress = page.locator("[data-testid=\"checkout-address\"]");
        this.placeOrderBtn = page.locator("[data-testid=\"place-order-btn\"]");
        this.categoryFilter = page.locator("[data-testid=\"category-filter\"]");
        this.quantityDecrease = page.locator("[data-testid=\"quantity-decrease\"]");
        this.continueShoppingBtn = page.locator("[data-testid=\"continue-shopping-btn\"]");
        this.checkoutPayment = page.locator("[data-testid=\"checkout-payment\"]");
    }

    public void typeSearchInput(String text)  {
        searchInput.fill(text);
    }

    public String getSearchInputValue()  {
        return searchInput.inputValue();
    }

    public void clearSearchInput()  {
        searchInput.clear();
    }

    public void clickProductCardHeadphones()  {
        productCardHeadphones.click();
    }

    public boolean isProductCardHeadphonesEnabled()  {
        return productCardHeadphones.isEnabled();
    }

    public void clickProductCardTShirt()  {
        productCardTShirt.click();
    }

    public boolean isProductCardTShirtEnabled()  {
        return productCardTShirt.isEnabled();
    }

    public void clickQuantityIncrease()  {
        quantityIncrease.click();
    }

    public boolean isQuantityIncreaseEnabled()  {
        return quantityIncrease.isEnabled();
    }

    public void clickAddToCartBtn()  {
        addToCartBtn.click();
    }

    public boolean isAddToCartBtnEnabled()  {
        return addToCartBtn.isEnabled();
    }

    public void clickCartIcon()  {
        cartIcon.click();
    }

    public boolean isCartIconEnabled()  {
        return cartIcon.isEnabled();
    }

    public void clickCheckoutBtn()  {
        checkoutBtn.click();
    }

    public boolean isCheckoutBtnEnabled()  {
        return checkoutBtn.isEnabled();
    }

    public void typeCheckoutName(String text)  {
        checkoutName.fill(text);
    }

    public String getCheckoutNameValue()  {
        return checkoutName.inputValue();
    }

    public void clearCheckoutName()  {
        checkoutName.clear();
    }

    public void typeCheckoutEmail(String text)  {
        checkoutEmail.fill(text);
    }

    public String getCheckoutEmailValue()  {
        return checkoutEmail.inputValue();
    }

    public void clearCheckoutEmail()  {
        checkoutEmail.clear();
    }

    public void typeCheckoutAddress(String text)  {
        checkoutAddress.fill(text);
    }

    public String getCheckoutAddressValue()  {
        return checkoutAddress.inputValue();
    }

    public void clearCheckoutAddress()  {
        checkoutAddress.clear();
    }

    public void clickPlaceOrderBtn()  {
        placeOrderBtn.click();
    }

    public boolean isPlaceOrderBtnEnabled()  {
        return placeOrderBtn.isEnabled();
    }

    public void typeCategoryFilter(String text)  {
        categoryFilter.fill(text);
    }

    public String getCategoryFilterValue()  {
        return categoryFilter.inputValue();
    }

    public void clearCategoryFilter()  {
        categoryFilter.clear();
    }

    public void clickQuantityDecrease()  {
        quantityDecrease.click();
    }

    public boolean isQuantityDecreaseEnabled()  {
        return quantityDecrease.isEnabled();
    }

    public void clickContinueShoppingBtn()  {
        continueShoppingBtn.click();
    }

    public boolean isContinueShoppingBtnEnabled()  {
        return continueShoppingBtn.isEnabled();
    }

    public void typeCheckoutPayment(String text)  {
        checkoutPayment.fill(text);
    }

    public String getCheckoutPaymentValue()  {
        return checkoutPayment.inputValue();
    }

    public void clearCheckoutPayment()  {
        checkoutPayment.clear();
    }
}