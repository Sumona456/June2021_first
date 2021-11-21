package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yakte_33bzdux\\Junejune2021_Selenium\\1st_Selenium_Project\\driver\\chromedriver.exe");
		//get website
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//find elements and perform actions
		driver.findElement(By.name("q")).sendKeys("selenium");
		//get maximize
		
		driver.manage().window().maximize();
		driver.findElement(By.name("btnK")).click();
		
		

	}

}
