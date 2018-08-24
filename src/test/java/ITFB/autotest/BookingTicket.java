package ITFB.autotest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static ITFB.autotest.BookingTickets.*;
import static ITFB.autotest.Setup.*;
import static ITFB.autotest.Variables.*;



public class BookingTicket
{

    public void BookingTicketAssert()
        {

        driver.findElement(By.xpath("//td[2]/table/tbody/tr[1]/td/img")).

        isDisplayed();


        String departFlight = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]/b/font")).getText();
        Assert.assertEquals(summaryDepart, departFlight);

            String summaryDepartDate = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/b/font")).getText();
        Assert.assertEquals(departDate, summaryDepartDate);

        summaryDepartFlight = driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]/font/b")).getText();
        Assert.assertEquals("Unified Airlines 363", summaryDepartFlight);

        flightClass = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]/font")).getText();
        Assert.assertEquals("Business", flightClass);

        summaryDepartPrice = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]/font")).getText();
        Assert.assertEquals("281", summaryDepartPrice);

        String returnFlight = driver.findElement(By.xpath("//tbody/tr[4]/td[1]/b/font")).getText();
        Assert.assertEquals(returnFlight, summaryReturn);

        summaryReturnFlight = driver.findElement(By.xpath("//tbody/tr[6]/td[1]/font/font/font[1]/b")).getText();
        Assert.assertEquals("Blue Skies Airlines 631", summaryReturnFlight);

        String summaryClass = driver.findElement(By.xpath("//table/tbody/tr[6]/td[2]/font")).getText();
        Assert.assertEquals(flightClass, summaryClass);

        summaryReturnPrice = driver.findElement(By.xpath("//table/tbody/tr[6]/td[3]/font")).getText();
        Assert.assertEquals("273", summaryReturnPrice);

        passengersCount = driver.findElement(By.xpath("//table/tbody/tr[7]/td[2]/font")).getText();
        Assert.assertEquals("2", passengersCount);

        taxesPrice = driver.findElement(By.xpath("//table/tbody/tr[8]/td[2]/font")).getText();
        Assert.assertEquals("$91", taxesPrice);

        departPrice = departPrice.substring(8);
        int departPriceInt = Integer.parseInt(String.valueOf(departPrice));

        returnPrice = returnPrice.substring(8);
        int returnPriceInt = Integer.parseInt(String.valueOf(returnPrice));

        int passengersCountInt = Integer.parseInt(passengersCount);

        taxesPrice = taxesPrice.substring(1);
        int taxesPriceInt = Integer.parseInt(String.valueOf(taxesPrice));
        int TotalpriceInt = passengersCountInt * (departPriceInt + returnPriceInt) + taxesPriceInt;


        totalPrice = s + Integer.toString(TotalpriceInt);

        summaryTotalPrice = driver.findElement(By.xpath("//table/tbody/tr[9]/td[2]/font/b")).getText();
        Assert.assertEquals(totalPrice, summaryTotalPrice);

        passFirst0 = driver.findElement(By.xpath("//tbody/tr[4]/td/table/tbody/tr[2]/td[1]/input"));
        passFirst0.sendKeys("Ivanov");

        passLast0 = driver.findElement(By.xpath("//tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
        passLast0.sendKeys("Ivan");

        pass0meal = new Select(driver.findElement(By.xpath("//tbody/tr[4]/td/table/tbody/tr[2]/td[3]/select")));
        pass0meal.selectByValue("HNML");

        passFirst1 = driver.findElement(By.xpath("//tbody/tr[5]/td/table/tbody/tr[2]/td[1]/input"));
        passFirst1.sendKeys("Ivanova");

        passLast1 = driver.findElement(By.xpath("//tbody/tr[5]/td/table/tbody/tr[2]/td[2]/input"));
        passLast1.sendKeys("Irina");

        pass1meal = new Select(driver.findElement(By.xpath("//tbody/tr[5]/td/table/tbody/tr[2]/td[3]/select")));
        pass1meal.selectByValue("BLML");

        creditCard = new Select(driver.findElement(By.xpath("//tbody/tr[7]/td/table/tbody/tr[2]/td[1]/select")));
        creditCard.selectByValue("BA");

        creditNumber = driver.findElement(By.xpath("//tbody/tr[7]/td/table/tbody/tr[2]/td[2]/input"));
        creditNumber.sendKeys("5479540454132487");

        cc_exp_dt_mn = new Select(driver.findElement(By.xpath("//tbody/tr[7]/td/table/tbody/tr[2]/td[3]/select[1]")));
        cc_exp_dt_mn.selectByVisibleText("05");

        cc_exp_dt_yr = new Select(driver.findElement(By.xpath("//tbody/tr[7]/td/table/tbody/tr[2]/td[3]/select[2]")));
        cc_exp_dt_yr.selectByVisibleText("2009");


        cc_frst_name = driver.findElement(By.xpath("//tbody/tr[8]/td/table/tbody/tr[2]/td[1]/input"));
        cc_frst_name.sendKeys(frstName);


        cc_mid_name = driver.findElement(By.xpath("//tbody/tr[8]/td/table/tbody/tr[2]/td[2]/input"));
        cc_mid_name.sendKeys(midName);


        cc_last_name = driver.findElement(By.xpath("//tbody/tr[8]/td/table/tbody/tr[2]/td[3]/input"));
        cc_last_name.sendKeys(lastName);
        driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input")).

        clear();


        billAddress1 = driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input"));
        billAddress1.sendKeys(billAddress);
        driver.findElement(By.xpath("//tbody/tr[12]/td[2]/input")).

        clear();


        billCity = driver.findElement(By.xpath("//tbody/tr[12]/td[2]/input"));
        billCity.sendKeys(billCityText);
        driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input[1]")).

        clear();


        billState = driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input[1]"));
        billState.sendKeys(billStateText);
        driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input[2]")).

        clear();


        billZip = driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input[2]"));
        billZip.sendKeys(billZipText);

        billCountry = new Select(driver.findElement(By.xpath("//tbody/tr[14]/td[2]/select")));
        billCountry.selectByVisibleText("UNITED STATES");

        ticketLess = driver.findElement(By.xpath("//tbody/tr[15]/td[2]/input"));
        ticketLess.click();

        driver.findElement(By.xpath("//tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input")).

        clear();

        delAddress1 = driver.findElement(By.xpath("//td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input"));
        delAddress1.sendKeys(delAddress);

        driver.findElement(By.xpath("//tbody/tr[18]/td[2]/input")).

        clear();

        delCity = driver.findElement(By.xpath("//tbody/tr[18]/td[2]/input"));
        delCity.sendKeys(delCityText);

        driver.findElement(By.xpath("//tbody/tr[19]/td[2]/input[1]")).

        clear();

        delState = driver.findElement(By.xpath("//tbody/tr[19]/td[2]/input[1]"));
        delState.sendKeys(delStateText);

        driver.findElement(By.xpath("//tbody/tr[19]/td[2]/input[2]")).

        clear();

        delZip = driver.findElement(By.xpath("//tbody/tr[19]/td[2]/input[2]"));
        delZip.sendKeys(delZipText);

        delCountry = new Select(driver.findElement(By.xpath("//tbody/tr[20]/td[2]/select")));
        delCountry.selectByVisibleText("UNITED STATES");

        WebElement buyFlights = driver.findElement(By.xpath("//tbody/tr[24]/td/input"));
        buyFlights.click();
        }
}
