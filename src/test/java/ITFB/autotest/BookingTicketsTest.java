package ITFB.autotest;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

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

        WebElement loginField = driver.findElement(By.xpath("//tr[2]/td[2]/input"));        // Поиск поля логина
        loginField.sendKeys("test1");                                        // Ввод логина в поле

        WebElement passwordField = driver.findElement(By.xpath("//tr[3]/td[2]/input"));    // поиск поля пароля
        passwordField.sendKeys("test1");

        WebElement loginButton = driver.findElement(By.xpath("//tr[4]/td[2]/div/input"));  // Поиск кнопки login
        loginButton.click();                                                               // и нажатие на нее

        driver.findElement(By.xpath("//td[2]/table/tbody/tr[1]/td/img")).isDisplayed();    // проверка, что авторизация
        Assert.assertTrue(true);                                                  // прошла успешно



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

        Select airline = new Select(driver.findElement(By.xpath("//tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select")));
        airline.selectByVisibleText("Pangea Airlines");

        WebElement ContinueButton = driver.findElement(By.xpath("//tbody/tr[14]/td/input"));
        ContinueButton.click();

        driver.findElement(By.xpath("//tbody/tr/td[2]/table/tbody/tr[1]/td/img")).isDisplayed();
        Assert.assertTrue(true);

    }

    @Test
    public void SelectFlight()
    {

    }


}
