package ITFB.autotest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static ITFB.autotest.Setup.driver;

//  Выбор авиарейсов
        public class SelectFlightTest {
            @Test
            public void SelectFlight()

            {


                driver.findElement(By.xpath("//tbody/tr/td[2]/table/tbody/tr[1]/td/img")).

                        isDisplayed();


                driver.findElement(By.xpath("//tbody/tr[2]/td[2]/b/font")).

                        isDisplayed();

                String summaryDepart = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/b/font")).getText();
                Assert.assertEquals("Paris to Seattle", summaryDepart);

                String departDate = driver.findElement(By.xpath("//tbody/tr[5]/td/form/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/b/font")).getText();
                Assert.assertEquals("11/20/2018", departDate);

                WebElement outFlight = driver.findElement(By.xpath("//td/form/table[1]/tbody/tr[9]/td[1]/input"));
                outFlight.click();

                String summaryReturn = driver.findElement(By.xpath("//tbody/tr[5]/td/form/table[2]/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/b/font")).getText();
                Assert.assertTrue("Seattle to Paris", true);

                String returnDate = driver.findElement(By.xpath("//table/tbody/tr[5]/td/form/table[2]/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/b/font")).getText();
                Assert.assertEquals("12/19/2018", returnDate);

                WebElement inFlight = driver.findElement(By.xpath("//td/form/table[2]/tbody/tr[5]/td[1]/input"));
                inFlight.click();

                String departPrice = driver.findElement(By.xpath("//table[1]/tbody/tr[10]/td/font/font/b")).getText();

                String returnPrice = driver.findElement(By.xpath("//table[2]/tbody/tr[6]/td/font/font/b")).getText();

                WebElement reserveFlights = driver.findElement(By.xpath("//td/form/p/input"));
                reserveFlights.click();
            }
        }
