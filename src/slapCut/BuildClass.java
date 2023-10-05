package slapCut;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BuildClass {

	
		public static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(option);
			driver.get("https://www.google.com/");
			Thread.sleep(3000);
			driver.navigate().to("https://www.amazon.in/");
			driver.manage().deleteAllCookies();

		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


			Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor)driver;

	js.executeScript("window.scrollBy(0,1300)");



		}

	

	}


