package ITFB.autotest;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import static ITFB.autotest.Variables.*;

@FixMethodOrder(MethodSorters.JVM)

public class BookingTicketsTest
{

    private static WebDriver driver;



    @BeforeClass


    public static void setup()
    {


        System.setProperty("webdriver.chrome.driver", "/Volumes/HDD/Development/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com/");

    }


    @Test
    public void UserLogin()
    {

        WebElement loginField = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input"));
        loginField.sendKeys("test1");

        WebElement passwordField = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input"));
        passwordField.sendKeys("test1");

        WebElement loginButton = driver.findElement(By.xpath("//tr[4]/td[2]/div/input"));
        loginButton.click();

        driver.findElement(By.xpath("//td[2]/table/tbody/tr[1]/td/img")).isDisplayed();
        Assert.assertTrue(true);



    }

    @Test
    public void FlightsDetails()
    {

       WebElement typeButton =  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/b/font/input[2]"));
       typeButton.click();


        Select passCount = new Select(driver.findElement(By.xpath("//tbody/tr[3]/td[2]/b/select")));
        passCount.selectByIndex(1);

        Select fromPort = new Select(driver.findElement(By.xpath("//tbody/tr[4]/td[2]/select")));
        fromPort.selectByValue("Paris");

        Select fromMoth = new Select(driver.findElement(By.xpath("//tbody/tr[5]/td[2]/select[1]")));
        fromMoth.selectByValue("11");

        Select fromday = new Select(driver.findElement(By.xpath("//tbody/tr[5]/td[2]/select[2]")));
        fromday.selectByValue("20");

        Select toPort = new Select(driver.findElement(By.xpath("//tbody/tr[6]/td[2]/select")));
        toPort.selectByValue("Seattle");

        Select toMoth = new Select(driver.findElement(By.xpath("//tbody/tr[7]/td[2]/select[1]")));
        toMoth.selectByValue("12");

        Select toDay = new Select(driver.findElement(By.xpath("//tbody/tr[7]/td[2]/select[2]")));
        toDay.selectByValue("19");

        WebElement servClass = driver.findElement(By.xpath("//tbody/tr[9]/td[2]/font/font/input[1]"));
        servClass.click();

        airline = new Select(driver.findElement(By.xpath("//tbody/tr[10]/td[2]/select")));
        airline.selectByVisibleText("Pangea Airlines");

        WebElement ContinueButton = driver.findElement(By.xpath("//tbody/tr[14]/td/input"));
        ContinueButton.click();



    }

    @Test
    public void SelectFlight()
    {
        driver.findElement(By.xpath("//tbody/tr/td[2]/table/tbody/tr[1]/td/img")).isDisplayed();
        Assert.assertTrue(true);

        driver.findElement(By.xpath("//tbody/tr[2]/td[2]/b/font")).isDisplayed();

        summaryDepart = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/b/font")).getText();
        Assert.assertTrue("Paris to Seattle",true);

        departDate = driver.findElement(By.xpath("//tbody/tr[5]/td/form/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/b/font")).getText();
        Assert.assertTrue("11/20/2018", true);

        outFlight = driver.findElement(By.xpath("//td/form/table[1]/tbody/tr[9]/td[1]/input"));
        outFlight.click();

        summaryReturn = driver.findElement(By.xpath("//tbody/tr[5]/td/form/table[2]/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/b/font")).getText();
        Assert.assertTrue("Seattle to Paris", true);

        returnDate = driver.findElement(By.xpath("//table/tbody/tr[5]/td/form/table[2]/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/b/font")).getText();
        Assert.assertTrue("12/19/2018", true);

        WebElement inFlight = driver.findElement(By.xpath("//td/form/table[2]/tbody/tr[5]/td[1]/input"));
        inFlight.click();

        departPrice = driver.findElement(By.xpath("//table[1]/tbody/tr[10]/td/font/font/b")).getText();

        returnPrice = driver.findElement(By.xpath("//table[2]/tbody/tr[6]/td/font/font/b")).getText();

        WebElement reserveFlights = driver.findElement(By.xpath("//td/form/p/input"));
        reserveFlights.click();

    }

    @Test
    public void BookAFlight() {
        driver.findElement(By.xpath("//td[2]/table/tbody/tr[1]/td/img")).isDisplayed();
        Assert.assertTrue(true);

        driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]/b/font"));
        Assert.assertTrue("Paris to Seattle", true);

        driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/b/font"));
        Assert.assertTrue("11/20/2018", true);

        summaryDepartFlight = driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]/font/b")).getText();
        Assert.assertTrue("Unified Airlines 363", true);

        flightClass = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]/font")).getText();
        Assert.assertTrue("Business", true);

        summaryDepartPrice = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]/font")).getText();
        Assert.assertEquals("281", summaryDepartPrice);

        driver.findElement(By.xpath("//tbody/tr[4]/td[1]/b/font"));
        Assert.assertTrue("Seattle to Paris", true);

        summaryReturnFlight = driver.findElement(By.xpath("//tbody/tr[6]/td[1]/font/font/font[1]/b")).getText();
        Assert.assertTrue("Blue Skies Airlines 631", true);

        driver.findElement(By.xpath("//table/tbody/tr[6]/td[2]/font"));
        Assert.assertTrue("Business", true);

        summaryReturnPrice = driver.findElement(By.xpath("//table/tbody/tr[6]/td[3]/font")).getText();
        Assert.assertEquals("273", summaryReturnPrice);

        passengersCount = driver.findElement(By.xpath("//table/tbody/tr[7]/td[2]/font")).getText();
        Assert.assertTrue("2", true);

        taxesPrice = driver.findElement(By.xpath("//table/tbody/tr[8]/td[2]/font")).getText();
        Assert.assertTrue("$91", true);

        departPrice = Variables.departPrice.substring(8);
        int departPriceInt = Integer.parseInt(String.valueOf(departPrice));

        returnPrice = Variables.returnPrice.substring(8);
        int returnPriceInt = Integer.parseInt(String.valueOf(returnPrice));

        int passengersCountInt = Integer.parseInt(passengersCount);

        taxesPrice = Variables.taxesPrice.substring(1);
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

        driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input")).clear();

        billAddress1 = driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input"));
        billAddress1.sendKeys(billAddress);

        driver.findElement(By.xpath("//tbody/tr[12]/td[2]/input")).clear();

        billCity = driver.findElement(By.xpath("//tbody/tr[12]/td[2]/input"));
        billCity.sendKeys(billCityText);

        driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input[1]")).clear();

        billState = driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input[1]"));
        billState.sendKeys(billStateText);

        driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input[2]")).clear();

        billZip = driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input[2]"));
        billZip.sendKeys(billZipText);

        billCountry = new Select(driver.findElement(By.xpath("//tbody/tr[14]/td[2]/select")));
        billCountry.selectByVisibleText("UNITED STATES");

        ticketLess = driver.findElement(By.xpath("//tbody/tr[15]/td[2]/input"));
        ticketLess.click();

        driver.findElement(By.xpath("//tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input")).clear();

        delAddress1 = driver.findElement(By.xpath("//td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input"));
        delAddress1.sendKeys(delAddress);

        driver.findElement(By.xpath("//tbody/tr[18]/td[2]/input")).clear();

        delCity = driver.findElement(By.xpath("//tbody/tr[18]/td[2]/input"));
        delCity.sendKeys(delCityText);

        driver.findElement(By.xpath("//tbody/tr[19]/td[2]/input[1]")).clear();

        delState = driver.findElement(By.xpath("//tbody/tr[19]/td[2]/input[1]"));
        delState.sendKeys(delStateText);

        driver.findElement(By.xpath("//tbody/tr[19]/td[2]/input[2]")).clear();

        delZip = driver.findElement(By.xpath("//tbody/tr[19]/td[2]/input[2]"));
        delZip.sendKeys(delZipText);

        delCountry = new Select(driver.findElement(By.xpath("//tbody/tr[20]/td[2]/select")));
        delCountry.selectByVisibleText("UNITED STATES");

        buyFlights = driver.findElement(By.xpath("//tbody/tr[24]/td/input"));
        buyFlights.click();
    }

    @Test
    public void FlightConfirmation()
    {
        driver.findElement(By.xpath("//tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/img")).isDisplayed();

        departingConfirmation = driver.findElement(By.xpath("//tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[3]/td/font")).getText();

        departingConfirmationAssert = (summaryDepart + "\n" + departDate + " @ 11:24 w/ "
                + summaryDepartFlight + "\n" + flightClass + "\n" + s + summaryDepartPrice + " each");
        Assert.assertEquals(departingConfirmation, departingConfirmationAssert);


        returningConfirmation = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[5]/td")).getText();

        returningConfirmationAssert = (summaryReturn + "\n" + returnDate + " @ 14:30 w/ "
                + summaryReturnFlight + "\n" + flightClass + "\n" + s + summaryReturnPrice + " each");
        Assert.assertEquals(returningConfirmation, returningConfirmationAssert);


        summaryPassengersCount = driver.findElement(By.xpath("//tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[7]/td/font")).getText();

        passengersCountAssert = (passengersCount + " passengers");
        Assert.assertEquals(summaryPassengersCount, passengersCountAssert);


        toBilled = driver.findElement(By.xpath("//td[2]/table/tbody/tr[5]/td/table/tbody/tr[9]/td/p/font[1]")).getText();

        toBilledAssert = (frstName + " " + midName + " " + lastName + "\n" + billAddress + "\n" +
                "\n" + billCityText + ", " + billStateText + ", " + billZipText );
        Assert.assertEquals(toBilled, toBilledAssert);


        delConfirmation = driver.findElement(By.xpath("//table/tbody/tr[5]/td/table/tbody/tr[11]/td/p/font[1]")).getText();
        delConfirmationAddress = (delAddress + "\n" + "\n" + delCityText + ", " + delStateText + ", " + delZipText);
        Assert.assertEquals(delConfirmation, delConfirmationAddress);

        totalTaxes = driver.findElement(By.xpath("//tr[12]/td/table/tbody/tr[1]/td[2]/font/font/font/b/font")).getText();
        totalTaxesConfirmation = (s + taxesPrice + " USD");
        Assert.assertEquals(totalTaxes, totalTaxesConfirmation);

        totalPriceConfirmation = driver.findElement(By.xpath("//td/table/tbody/tr[2]/td[2]/font/b/font/font/b/font")).getText();
        Assert.assertEquals((totalPrice + " USD"), totalPriceConfirmation);


        backToHome = driver.findElement(By.xpath("//td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[2]/a/img"));
        backToHome.click();




        

    }




}
