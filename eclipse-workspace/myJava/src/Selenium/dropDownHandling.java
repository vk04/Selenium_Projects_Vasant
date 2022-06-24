package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownHandling {

	public static void main(String[] args) throws InterruptedException {
		//Launch chrome
				System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				
				//Navigate to website
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				driver.manage().window().maximize();
				
				//Get WebElement Object and store element properties 
				
				WebElement element= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
                
				//Use Select Class for handling Dropdown which is having <select> tag
				Select dropdown=new Select(element);
                
				dropdown.selectByValue("USD");
              System.out.println(element.getText());
              
              driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
              Thread.sleep(2000);
              driver.findElement(By.xpath("(//a[normalize-space()='Bhopal (BHO)'])[1]")).click();
              Thread.sleep(2000);
              driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
	}

}
