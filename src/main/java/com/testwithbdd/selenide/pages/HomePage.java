package com.testwithbdd.selenide.pages;

import com.testwithbdd.selenide.base.BaseClass;

public class HomePage extends AbstractPage {

    /**
     * Constructor
     *
     * @param testClass
     */
    public HomePage(BaseClass testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(divPage);
    }
}
