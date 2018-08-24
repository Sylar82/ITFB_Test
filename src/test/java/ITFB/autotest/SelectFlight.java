package ITFB.autotest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//  Выбор авиарейсов
        public class SelectFlight extends BookingTicketsTest {

          static String summaryDepart;
          static String departDate;
          static String summaryReturn;
          static String departPrice;
          static String returnPrice;
          static String returnDate;

            public SelectFlight(ChromeDriver driver)

            {


                driver.findElement(By.xpath("//tbody/tr/td[2]/table/tbody/tr[1]/td/img")).

                        isDisplayed();


                driver.findElement(By.xpath("//tbody/tr[2]/td[2]/b/font")).

                        isDisplayed();

                summaryDepart = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/b/font")).getText();
                Assert.assertEquals("Paris to Seattle", summaryDepart);

                departDate = driver.findElement(By.xpath("//tbody/tr[5]/td/form/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/b/font")).getText();
                Assert.assertEquals("11/20/2018", departDate);

                WebElement outFlight = driver.findElement(By.xpath("//td/form/table[1]/tbody/tr[9]/td[1]/input"));
                outFlight.click();

                summaryReturn = driver.findElement(By.xpath("//tbody/tr[5]/td/form/table[2]/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/b/font")).getText();
                Assert.assertTrue("Seattle to Paris", true);

                returnDate = driver.findElement(By.xpath("//table/tbody/tr[5]/td/form/table[2]/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/b/font")).getText();
                Assert.assertEquals("12/19/2018", returnDate);

                WebElement inFlight = driver.findElement(By.xpath("//td/form/table[2]/tbody/tr[5]/td[1]/input"));
                inFlight.click();

                departPrice = (driver.findElement(By.xpath("//table[1]/tbody/tr[10]/td/font/font/b")).getText());

                returnPrice = driver.findElement(By.xpath("//table[2]/tbody/tr[6]/td/font/font/b")).getText();

                WebElement reserveFlights = driver.findElement(By.xpath("//td/form/p/input"));
                reserveFlights.click();
            }
        }
