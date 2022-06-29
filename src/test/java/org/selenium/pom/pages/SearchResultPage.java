package org.selenium.pom.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.pages.components.ProductThumbnail;


public class SearchResultPage extends StorePage {

//    private final By title = By.cssSelector(".woocommerce-products-header__title.page-title");
//
//    public String getSearchResultTitle(){
//        return wait.until(ExpectedConditions.elementToBeClickable(title)).getText();
//    }
    public ProductThumbnail getProductThumbnail() {
        return productThumbnail;
    }

    private ProductThumbnail productThumbnail;

    public SearchResultPage(WebDriver driver) {
        super(driver);
        productThumbnail = new ProductThumbnail(driver);
    }
    @Step
    public SearchResultPage load(){
        load("/?s");
        return this;
    }
//
//    public String getSearchResultTitle(){
//        return wait.until(ExpectedConditions.elementToBeClickable(title)).getText();
//    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
