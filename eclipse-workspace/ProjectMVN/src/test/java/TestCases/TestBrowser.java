package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser {
	
@Test
	public void TestNglearning() throws InterruptedException {

		int list;

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();
		
		SoftAssert softAssert=new SoftAssert();

		System.out.println(driver.getTitle());
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		Thread.sleep(3000);

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		Thread.sleep(3000);

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		// get no of Add to cart buttons
		list = driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']")).size();
		System.out.println(list);
		
		softAssert.assertEquals(list, 5,"Count Mismatch");
		
		
		WebElement element = driver.findElement(By.className("product_sort_container"));

		Select dropdown = new Select(element);
		dropdown.selectByValue("hilo");
		WebElement element1 = driver.findElement(By.className("product_sort_container"));
		System.out.println(element1.getAttribute("data-test"));
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
		String item = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-fleece-jacket']")).getText();
		Thread.sleep(3000);
		softAssert.assertEquals(item, "REMOV","Name mismacth");
		
		softAssert.assertAll();
		driver.close();
	}

}
