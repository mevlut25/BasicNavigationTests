package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

//1. Create class BrowserFactory under utilities package.
//2. Create a public static method get Driver which takes a string argument.
//3. If you are using Windows,and if  the String argument is`safari`,return null.
// If you are using Mac, and if the String argument is `edge`, return null.
//NOTE For this step, you need to research how to find out your operating system programmatically using Java.
public class BrowserFactory {
    public static WebDriver getDriver(String browserType) {
        String osName = System.getProperty("os.name");
        if ((osName.startsWith("window") && browserType.equalsIgnoreCase("safari")) ||
                osName.startsWith("mac") && browserType.equalsIgnoreCase("edge")) {
            return null;
            //4. In all other cases,return a new Web Driver object for ChromeDriver, FirefoxDriver,
            // EdgeDriver or SafariDriver based on the value of the string argument.
            //NOTE For this exercise, you need to research how to launch Edge using Selenium
            // if you are using Windows.
            //NOTE For this exercise, you need to research how to launch Safari using Selenium
            // if you are using Mac.
        } else if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        } else if (browserType.equalsIgnoreCase("safari")) {
            WebDriverManager.safaridriver().setup();
            return new SafariDriver();
        }
        return null;

    }
}
