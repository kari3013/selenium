package seleniumHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Software\\Driver\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

    }
}
