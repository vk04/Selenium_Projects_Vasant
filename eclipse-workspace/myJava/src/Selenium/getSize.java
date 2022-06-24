package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class getSize {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Navigate to website
		driver.get("https://www.saucedemo.com/");
		

		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		//get no of Add to cart buttons
	int list=	driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']")).size();
		System.out.println(list);
		//Thread.sleep(2000);
		Assert.assertEquals(list, 6);
WebElement element= driver.findElement(By.className("product_sort_container"));
		
		Select dropdown=new Select(element);
		dropdown.selectByValue("hilo");
		WebElement element1= driver.findElement(By.className("product_sort_container"));
		System.out.println(element1.getAttribute("data-test"));
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
		String item= driver.findElement(By.xpath("//button[@id='remove-sauce-labs-fleece-jacket']")).getText();
		//Thread.sleep(3000);
		Assert.assertEquals(item, "REMOVE");
		
		driver.close();
		
		
	}

}
