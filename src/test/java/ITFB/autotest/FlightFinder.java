package ITFB.autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static ITFB.autotest.Setup.driver;

public class FlightFinder {

    public void FlightDetails()

    {


        WebElement typeButton = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/b/font/input[2]"));
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

        Select airline = new Select(driver.findElement(By.xpath("//tbody/tr[10]/td[2]/select")));
        airline.selectByVisibleText("Pangea Airlines");

        WebElement ContinueButton = driver.findElement(By.xpath("//tbody/tr[14]/td/input"));
        ContinueButton.click();
    }

}
