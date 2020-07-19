package testOne;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BasePage;

public class LoginPage extends BasePage {

	
	@Test
	public void login() {
		System.out.println("hello this is google project");
	}
	
	@Test(dependsOnMethods="login")
	public void enterText() {
		System.out.println("The second method enter text started");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello World");
		System.out.println(" The Enter Text Method closedaaaaa ");
	}
	
}
