package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTest {
    public static void Test(String DriverType) throws InterruptedException {
        System.out.println("This test is running on "+DriverType);
        //1. Create class NavigationTests under tests package.
        //2. Automate the provided test case using 3 different browsers.
        WebDriver driver= BrowserFactory.getDriver(DriverType);
        driver.manage().window().maximize();
        //2. Go to website https://google.com
        driver.get("https://google.com");
        String firstTitleOfGoogle=driver.getTitle();
        //4. Go to https://etsy.com
        //5. Save the title in a string variable
        Thread.sleep(3000);
        driver.get("https://etsy.com");
        String firstTitleOfEtsy=driver.getTitle();
        //6. Navigate back to previous page
        //7. Verify that title is  same is in step3
        Thread.sleep(3000);
        driver.navigate().back();
        String secondTitleOfGoogle=driver.getTitle();
        StringUtility.verifyEquals(secondTitleOfGoogle,firstTitleOfGoogle);
        //8. Navigate forward to previous page
        //9. Verify that title is same is in step5
        driver.navigate().forward();
        String secondTitleOfEtsy=driver.getTitle();
        StringUtility.verifyEquals(secondTitleOfEtsy,firstTitleOfEtsy);
        System.out.println("------------------------------------------");
        driver.close();
    }

    public static void main(String[] args) throws InterruptedException {
        Test("chrome");
        Test("safari");
        Test("firefox");
    }
}
