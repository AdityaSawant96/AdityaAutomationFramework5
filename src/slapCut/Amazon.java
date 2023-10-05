package slapCut;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Amazon {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	Thread.sleep(2000);
	WebElement xyz= driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[5]"));
	xyz.click();
	//WebElement xyz= driver.findElement
	
	WebElement narazo= driver.findElement(By.xpath("(//li[@class=\"a-tab-heading htw-tab-heading\"])[2]"));
	narazo.click();
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor)driver;

	js.executeScript("window.scrollBy(0,1300)");
	
	}
}
