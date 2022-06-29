package org.selenium.pom.pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.pages.CartPage;

public class ProductThumbnail extends BasePage {
    private final By viewCartLink = By.cssSelector("a[title='View cart']");

    private final String ADD_TO_CART_BTN_PATTERN = "a[aria-label='Add “%s” to your cart']";

    public ProductThumbnail(WebDriver driver) {
        super(driver);
    }

//    private By getAddToCartBtnElement(String productName){
//        return By.cssSelector("a[aria-label='Add “" + productName + "” to your cart']");
//    }

    public ProductThumbnail clickAddToCartBtn(String productName){
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector(String.format(ADD_TO_CART_BTN_PATTERN, productName)))).click();
        return this;
    }

    public CartPage clickViewCart(){
        wait.until(ExpectedConditions.elementToBeClickable(viewCartLink)).click();
        return new CartPage(driver);
    }
}
