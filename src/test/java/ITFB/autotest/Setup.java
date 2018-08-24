package ITFB.autotest;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Setup extends BookingTicketsTest {

public Setup() {

        ChromeDriver driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com/");


    }
}
