package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {

            //driver objesi boş olduğunda chrome driver'ı oluşturur ve onu döner
            driver = new ChromeDriver();
        }

        return driver;
    }
}
