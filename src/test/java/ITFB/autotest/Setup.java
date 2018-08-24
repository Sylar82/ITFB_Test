package ITFB.autotest;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.concurrent.TimeUnit;

public class Setup {

    public static WebDriver driver;


    @BeforeClass


    public static void setup() {


        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com/");

        static String departPrice ;
        static String summaryDepartFlight;
        static String flightClass;
        static String summaryDepart;
        static String departDate;
        static String summaryReturn;
        static String returnDate;
        static String departPrice;
        static String returnPrice;
        static String passengersCount;
        static String totalPrice;
        static String taxesPrice;
        static String summaryTotalPrice;
        static String summaryReturnPrice;
        static String summaryReturnFlight;
        static String summaryDepartPrice;
        static String s = "$";
        static String departingConfirmation;
        static String departingConfirmationAssert;
        static String returningConfirmation;
        static String returningConfirmationAssert;
        static String passengersCountAssert;
        static String summaryPassengersCount;
        static String toBilled;
        static String toBilledAssert;
        static String billCityText = "Albuquerque";
        static String billStateText = "New Mexico";
        static String billZipText = "94089";
        static String delAddress = "1225 Borregas Ave.";
        static String delCityText = "Boston";
        static String delStateText = "Massachusetts";
        static String delZipText = "91089";
        static String frstName = "Ivan";
        static String midName = "Ivanovich";
        static String lastName = "Ivanov";
        static String billAddress = "1085 Borregas Ave.";
        static String delConfirmationAddress;
        static String delConfirmation;
        static String totalTaxes;
        static String totalTaxesConfirmation;
        static String totalPriceConfirmation;
        static WebElement outFlight;
        static WebElement passFirst0;
        static WebElement passLast0;
        static WebElement passFirst1;
        static WebElement passLast1;
        static WebElement creditNumber;
        static WebElement cc_frst_name;
        static WebElement cc_mid_name;
        static WebElement cc_last_name;
        static WebElement billAddress1;
        static WebElement billCity;
        static WebElement billState;
        static WebElement billZip;
        static WebElement ticketLess;
        static WebElement delAddress1;
        static WebElement delCity;
        static WebElement delState;
        static WebElement delZip;
        static WebElement buyFlights;
        static WebElement backToHome;
        static Select airline;
        static Select pass0meal;
        static Select pass1meal;
        static Select creditCard;
        static Select cc_exp_dt_mn;
        static Select cc_exp_dt_yr;
        static Select billCountry;
        static Select delCountry;



    }
}
