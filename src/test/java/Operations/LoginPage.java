package Operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Objects.LoginPageLocators;

public class LoginPage {

	public static WebDriver driver;
	static WebElement login;

	// to read properties file
	public static String readpropertiesfile(String key) {
		String value = null;

		try {
			Properties p = new Properties();
			FileInputStream f;
			f = new FileInputStream("E:\\eclipse-workspace\\javademo\\orangehrm_practice\\Config.properties");
			p.load(f);
			value = p.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

	public static void openUrl() {
		System.setProperty(readpropertiesfile("Ckey"), readpropertiesfile("Cpath"));
		driver = new ChromeDriver();
		driver.get(readpropertiesfile("url"));
	}

	public static void clickOn(By element) {
		WebElement ele = driver.findElement(element);
			ele.click();
		
	}

	public static void enterText(By element, String txt) {
		WebElement printtxt = driver.findElement(element);
		printtxt.sendKeys(txt);
	}

	public static boolean verifyElementIsDisplay(By element) {
		boolean ele = driver.findElement(element).isDisplayed();
		return ele;
	}

	public static boolean verifyElementIsEnable(By element) {
		boolean ele = driver.findElement(element).isEnabled();
		return ele;
	}

	public static void verifyTextBoxField(By ele, String txt) {
		if (verifyElementIsEnable(ele) && verifyElementIsDisplay(ele)) {
			enterText(ele, txt);
		} else {
			System.out.println(" TextBox Feild fails");
		}
	}

	public static boolean verifyPageisDisplay(By element, String page) {
		boolean display = driver.findElement(element).isDisplayed();
		if (display) {
			System.out.println(page + "Page succesfully load");

		} else {
			System.out.println(page + "page fail Showing error " );
		}
		return display;
	}

}
