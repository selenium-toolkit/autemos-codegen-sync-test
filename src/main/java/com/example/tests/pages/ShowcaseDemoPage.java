package com.example.tests;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;

public class ShowcaseDemoPage  {
    private final Page page;

    private Locator heroHeading;

    private Locator loginButton;

    private Locator getStartedButton;

    private Locator ctaLearnMore;

    private Locator navBar;

    public ShowcaseDemoPage(Page page)  {
        this.page = page;
        this.heroHeading = page.locator("//h1[contains(text(),'Autonomous Test')]");
        this.loginButton = page.locator("//a[contains(text(),'Login')]");
        this.getStartedButton = page.locator("//a[contains(text(),'Get Started')]");
        this.ctaLearnMore = page.locator("//a[contains(text(),'Learn More')]");
        this.navBar = page.locator("//nav[contains(@class,'fixed')]");
    }

    public void clickLoginButton()  {
        loginButton.click();
    }

    public void clickGetStartedButton()  {
        getStartedButton.click();
    }

    public void clickCtaLearnMore()  {
        ctaLearnMore.click();
    }

    public void clickNavBar()  {
        navBar.click();
    }

    public String getNavBarText()  {
        return navBar.textContent();
    }

    public boolean isNavBarDisplayed()  {
        return navBar.isVisible();
    }
}