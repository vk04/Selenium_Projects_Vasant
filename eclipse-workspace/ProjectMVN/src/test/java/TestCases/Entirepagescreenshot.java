package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Entirepagescreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Navigate to Web site
		driver.get("http://www.way2automation.com/");
		driver.manage().window().maximize();

		// Take the screen shot of entire page and store it in a object
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);

		// Store the screenshot into a destination folder

		ImageIO.write(screenshot.getImage(), "jpg", new File(".\\Screenshot\\"+fileName));

	}

}
