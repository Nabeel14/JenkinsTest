package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Utilities;

public class LandingPage {
	
	public static WebDriver driver= Utilities.driver;
	public static WebDriverWait wait = new WebDriverWait(driver, 40);
	public static  void openAccountDrawer(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Open account drawer']"))).click();
	}
	public static  void clickSignInButton(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@aria-label='Sign In']"))).click();
	}
	public static void fillLogin(String username, String password){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']"))).sendKeys(username);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']"))).sendKeys(password);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
	}
	public static void verifyWrongUsernamePasswordError(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Enter valid email.')]")));

	}
}
