package org.selenium.pom.tests;

import io.qameta.allure.*;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.pages.SearchResultPage;
import org.selenium.pom.pages.StorePage;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("My Epic")
@Feature("My Feature")
public class SearchTest extends BaseTest {

    //    @Test
//    public void searchWithPartialMatch(){
//        String searchFor = "Blue";
//        StorePage storePage = new StorePage(getDriver()).
//                load().
//                search(searchFor);
//        Assert.assertEquals(storePage.getTitle(), "Search results: “" + searchFor + "”");
//    }
    @Story("My story")
    @Test
    @TmsLink("111")
    @Issue("2222")
    @Link("http://google.com")
    @Description("Search with partial match")
    public void searchWithPartialMatch() {
        String searchFor = "Blue";
        new StorePage(getDriver()).load().search(searchFor);
        SearchResultPage searchResultPage = new SearchResultPage(getDriver()).load();
        Assert.assertEquals(searchResultPage.getTitle(), "Search results: “" + searchFor + "”");
    }
}
