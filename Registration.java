package seleniumHomework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Software\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[1]/div/span[2]/input")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Karishma");
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("23");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("June");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1990");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[5]/input")).sendKeys("krpatel2kr6@yahoo.com");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[4]/div[2]/div[1]/input")).sendKeys("Kari&3013");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Kari&3013");
        driver.findElement(By.id("register-button")).click();








    }
}
