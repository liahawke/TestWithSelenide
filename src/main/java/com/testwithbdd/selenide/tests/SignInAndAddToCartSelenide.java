package com.testwithbdd.selenide.tests;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import com.codeborne.selenide.WebDriverRunner;
import com.testwithbdd.selenide.utils.YamlParser;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class SignInAndAddToCartSelenide {

    // Web Elements
    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    private WebElement loginLink;

    @Test
    public void testOpenSiteAndAddToCart() {

        // Maximize browser window
        Configuration.startMaximized = true;


        // Open URL
        open(YamlParser.getYamlData().getUrl());

        // Initialize WebElements
        page(this);

        // Verify that Login link is visible
        $(loginLink).is(visible);

    }


}
