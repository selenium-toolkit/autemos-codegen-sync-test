package com.example.tests;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;

public class ContactFormPage  {
    private final Page page;

    private Locator messageInput;

    private Locator topicDropdown;

    private Locator otherOption;

    private Locator firstNameInput;

    private Locator lastNameInput;

    private Locator phoneInput;

    private Locator emailInput;

    private Locator submitButton;

    public ContactFormPage(Page page)  {
        this.page = page;
        this.messageInput = page.locator("#HJprwhZIuGpwqiyCflS3");
        this.topicDropdown = page.locator("div.multiselect.multi_select_form");
        this.otherOption = page.locator("#HJprwhZIuGpwqiyCflS3-3");
        this.firstNameInput = page.locator("#first_name");
        this.lastNameInput = page.locator("#last_name");
        this.phoneInput = page.locator("#phone");
        this.emailInput = page.locator("#email");
        this.submitButton = page.locator("xpath=//button[contains(.,'Submit')]");
    }

    public void typeMessageInput(String text)  {
        messageInput.fill(text);
    }

    public String getMessageInputValue()  {
        return messageInput.inputValue();
    }

    public void clearMessageInput()  {
        messageInput.clear();
    }

    public void selectTopicDropdownByValue(String value)  {
        topicDropdown.selectOption(new SelectOption().setValue(value));
    }

    public void selectTopicDropdownByText(String text)  {
        topicDropdown.selectOption(new SelectOption().setLabel(text));
    }

    public void typeFirstNameInput(String text)  {
        firstNameInput.fill(text);
    }

    public String getFirstNameInputValue()  {
        return firstNameInput.inputValue();
    }

    public void clearFirstNameInput()  {
        firstNameInput.clear();
    }

    public void typeLastNameInput(String text)  {
        lastNameInput.fill(text);
    }

    public String getLastNameInputValue()  {
        return lastNameInput.inputValue();
    }

    public void clearLastNameInput()  {
        lastNameInput.clear();
    }

    public void typePhoneInput(String text)  {
        phoneInput.fill(text);
    }

    public String getPhoneInputValue()  {
        return phoneInput.inputValue();
    }

    public void clearPhoneInput()  {
        phoneInput.clear();
    }

    public void typeEmailInput(String text)  {
        emailInput.fill(text);
    }

    public String getEmailInputValue()  {
        return emailInput.inputValue();
    }

    public void clearEmailInput()  {
        emailInput.clear();
    }

    public void clickSubmitButton()  {
        submitButton.click();
    }

    public boolean isSubmitButtonEnabled()  {
        return submitButton.isEnabled();
    }
}