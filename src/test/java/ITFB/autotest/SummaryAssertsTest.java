package ITFB.autotest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static ITFB.autotest.Setup.driver;

public class SummaryAssertsTest {
    @Test
    public void SummaryAssert()

    {

        driver.findElement(By.xpath("//tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/img")).

                isDisplayed();

        String departingConfirmation = driver.findElement(By.xpath("//tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[3]/td/font")).getText();

        String departingConfirmationAssert = (summaryDepart + "\n" + departDate + " @ 11:24 w/ "
                + summaryDepartFlight + "\n" + flightClass + "\n" + s + summaryDepartPrice + " each");
        Assert.assertEquals(departingConfirmation, departingConfirmationAssert);


        String returningConfirmation = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[5]/td")).getText();

        String returningConfirmationAssert = (summaryReturn + "\n" + returnDate + " @ 14:30 w/ "
                + summaryReturnFlight + "\n" + flightClass + "\n" + s + summaryReturnPrice + " each");
        Assert.assertEquals(returningConfirmation, returningConfirmationAssert);


        String summaryPassengersCount = driver.findElement(By.xpath("//tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[7]/td/font")).getText();

        String passengersCountAssert = (passengersCount + " passengers");
        Assert.assertEquals(summaryPassengersCount, passengersCountAssert);


        String toBilled = driver.findElement(By.xpath("//td[2]/table/tbody/tr[5]/td/table/tbody/tr[9]/td/p/font[1]")).getText();

        String toBilledAssert = (frstName + " " + midName + " " + lastName + "\n" + billAddress + "\n" +
                "\n" + billCityText + ", " + billStateText + ", " + billZipText);
        Assert.assertEquals(toBilled, toBilledAssert);


        String delConfirmation = driver.findElement(By.xpath("//table/tbody/tr[5]/td/table/tbody/tr[11]/td/p/font[1]")).getText();
        String delConfirmationAddress = (delAddress + "\n" + "\n" + delCityText + ", " + delStateText + ", " + delZipText);
        Assert.assertEquals(delConfirmation, delConfirmationAddress);

        String totalTaxes = driver.findElement(By.xpath("//tr[12]/td/table/tbody/tr[1]/td[2]/font/font/font/b/font")).getText();
        String totalTaxesConfirmation = (s + taxesPrice + " USD");
        Assert.assertEquals(totalTaxes, totalTaxesConfirmation);

        String totalPriceConfirmation = driver.findElement(By.xpath("//td/table/tbody/tr[2]/td[2]/font/b/font/font/b/font")).getText();
        Assert.assertEquals((totalPrice + " USD"), totalPriceConfirmation);


        WebElement backToHome = driver.findElement(By.xpath("//td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[2]/a/img"));
        backToHome.click();

        driver.quit();
    }
}
