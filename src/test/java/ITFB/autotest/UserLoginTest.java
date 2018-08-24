package ITFB.autotest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static ITFB.autotest.Setup.driver;

public class UserLogin {

        @Test
        public void BookingTicketsTest() {




            WebElement loginField = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input"));
            loginField.sendKeys("test1");

            WebElement passwordField = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input"));
            passwordField.sendKeys("test1");

            WebElement loginButton = driver.findElement(By.xpath("//tr[4]/td[2]/div/input"));
            loginButton.click();

            driver.findElement(By.xpath("//td[2]/table/tbody/tr[1]/td/img")).isDisplayed();
        }
    }
