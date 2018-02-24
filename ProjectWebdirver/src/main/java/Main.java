import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = initChromeDriver();

        // Ввод логина и пароля

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("webinar.test@gmail.com");

        WebElement pass = driver.findElement(By.name("passwd"));
        pass.sendKeys("Xcg7299bnSmMuRLp9ITw");

        // Нажатие на кнопку входа

        WebElement button = driver.findElement(By.name("submitLogin"));
        button.click();

        // Задержка 1 секунда для прогружения страницы

        Thread.sleep(1000);

        // Нажатие на пиктограму и кнопку "выход"

        WebElement picture = driver.findElement(By.id("header_employee_box"));
        picture.click();

        WebElement logOut = driver.findElement(By.id("header_logout"));
        logOut.click();
    }

    public static WebDriver initChromeDriver(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        return new ChromeDriver(options);
    }
}
