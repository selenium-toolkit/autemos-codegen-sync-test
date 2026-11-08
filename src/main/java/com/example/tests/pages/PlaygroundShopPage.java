// @autemos pageObject=PlaygroundShopPage generator=2
package com.example.tests.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;

public class PlaygroundShopPage  {
    private final Page page;

    public Locator firstProduct;

    public Locator categoryFilter;

    public Locator quantityDecrease;

    public Locator continueShoppingBtn;

    public Locator checkoutPayment;

    public Locator divElement;

    public Locator placeOrderBtn;

    public Locator productCardHeadphones;

    public Locator quantityIncrease;

    public Locator searchInput;

    public Locator productCardTShirt;

    public Locator addToCartBtn;

    public Locator cartIcon;

    public Locator checkoutBtn;

    public Locator checkoutName;

    public Locator checkoutEmail;

    public Locator checkoutAddress;

    public PlaygroundShopPage(Page page)  {
        this.page = page;
        // @autemos pageObjectField=firstProduct
        this.firstProduct = page.locator("xpath=//*[normalize-space()='Wireless Headphones']");
        // @autemos pageObjectField=categoryFilter
        this.categoryFilter = page.locator("[data-testid=\"category-filter\"]");
        // @autemos pageObjectField=quantityDecrease
        this.quantityDecrease = page.locator("[data-testid=\"quantity-decrease\"]");
        // @autemos pageObjectField=continueShoppingBtn
        this.continueShoppingBtn = page.locator("[data-testid=\"continue-shopping-btn\"]");
        // @autemos pageObjectField=checkoutPayment
        this.checkoutPayment = page.locator("[data-testid=\"checkout-payment\"]");
        // @autemos pageObjectField=divElement
        this.divElement = page.locator("div.flex div.fixed");
        // @autemos pageObjectField=placeOrderBtn
        this.placeOrderBtn = page.locator("[data-testid=\"place-order-btn\"]");
        // @autemos pageObjectField=productCardHeadphones
        this.productCardHeadphones = page.locator("[data-testid='product-card-p1']");
        // @autemos pageObjectField=quantityIncrease
        this.quantityIncrease = page.locator("button[data-testid='quantity-increase']");
        // @autemos pageObjectField=searchInput
        this.searchInput = page.locator("input[placeholder='Search products...']");
        // @autemos pageObjectField=productCardTShirt
        this.productCardTShirt = page.locator("[data-testid='product-card-p4']");
        // @autemos pageObjectField=addToCartBtn
        this.addToCartBtn = page.locator("button[data-testid='add-to-cart-btn']");
        // @autemos pageObjectField=cartIcon
        this.cartIcon = page.locator("button[data-testid='cart-icon']");
        // @autemos pageObjectField=checkoutBtn
        this.checkoutBtn = page.locator("[data-testid='checkout-btn']");
        // @autemos pageObjectField=checkoutName
        this.checkoutName = page.locator("[data-testid=\"checkout-name\"]");
        // @autemos pageObjectField=checkoutEmail
        this.checkoutEmail = page.locator("[data-testid=\"checkout-email\"]");
        // @autemos pageObjectField=checkoutAddress
        this.checkoutAddress = page.locator("[data-testid=\"checkout-address\"]");
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

    public void typeDivElement(String text)  {
        divElement.fill(text);
    }

    public String getDivElementValue()  {
        return divElement.inputValue();
    }

    public void clearDivElement()  {
        divElement.clear();
    }

    public void clickPlaceOrderBtn()  {
        placeOrderBtn.click();
    }

    public boolean isPlaceOrderBtnEnabled()  {
        return placeOrderBtn.isEnabled();
    }

    public void clickProductCardHeadphones()  {
        productCardHeadphones.click();
    }

    public boolean isProductCardHeadphonesEnabled()  {
        return productCardHeadphones.isEnabled();
    }

    public void clickQuantityIncrease()  {
        quantityIncrease.click();
    }

    public boolean isQuantityIncreaseEnabled()  {
        return quantityIncrease.isEnabled();
    }

    public String getSearchInputText()  {
        return searchInput.innerText();
    }

    public boolean isSearchInputDisplayed()  {
        return searchInput.isVisible();
    }

    public void typeSearchInput(String text)  {
        searchInput.fill(text);
    }

    public void clickProductCardTShirt()  {
        productCardTShirt.click();
    }

    public boolean isProductCardTShirtEnabled()  {
        return productCardTShirt.isEnabled();
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
}