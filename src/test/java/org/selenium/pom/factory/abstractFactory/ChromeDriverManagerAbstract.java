package org.selenium.pom.factory.abstractFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium.pom.factory.DriverManager;

import java.time.Duration;

public class ChromeDriverManagerAbstract extends DriverManagerAbstract {

    @Override
    protected void startDriver() {
        WebDriverManager.chromedriver().cachePath("Drivers").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        Duration pageLoadTimeout = driver.manage().timeouts().getPageLoadTimeout();
//        Duration scriptTimeout = driver.manage().timeouts().getScriptTimeout();
//        System.out.println("pageLoadTimeout: " +pageLoadTimeout);
//        System.out.println("scriptTimeout: " +scriptTimeout);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
}
