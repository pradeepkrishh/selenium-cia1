package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Question1 {
public static void main(String[] args)
{
WebDriverManager.chromedriver().setup();
WebDriver driver;
ChromeOptions co = new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
driver = new ChromeDriver(co);
driver.manage().window().maximize();
driver.navigate().to("https://www.amazon.in/Apple-iPad-Air-10-9-inch-27-69-Wi-Fi/dp/B09V471196?ref_=Oct_DLandingS_D_f4cff20a_63&th=1");
WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
addtocart.click();
WebElement check = driver.findElement(By.xpath("//*[@class=\"a-button-input\"]"));
check.click();
driver.navigate().to("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
WebElement qty = driver.findElement(By.id("a-autoid-0-announce"));
qty.click();
WebElement dty = driver.findElement(By.id("quantity_10"));
dty.click();
WebElement update = driver.findElement(By.id("a-autoid-1-announce"));
update.click();
driver.navigate().to("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
WebElement del = driver.findElement(By.xpath("//*[@class=\"a-color-link\"]"));
del.click();
}
}
