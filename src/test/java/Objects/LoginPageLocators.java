package Objects;

import org.openqa.selenium.By;

public class LoginPageLocators {

	public static By username = By.id("txtUsername");
	public static By password = By.id("txtPassword");
	public static By loginBtn = By.id("btnLogin");
   // public static By dashboard= By.xpath("//*[@id=\"content\"]/div/div[1]/h1");
    public static By dashboardkeyword= By.partialLinkText("Welcome");
    public static By loginFailMsg= By.id("spanMessage");
}
