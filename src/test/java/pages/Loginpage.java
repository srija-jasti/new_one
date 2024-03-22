package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	
WebDriver driver;


public Loginpage(WebDriver driver) {
		this.driver = driver;
}
	
By user_name=By.id("username");
By pass=By.id("password");
By user_login = By.id("login");

public void u_name(String uName) {
	driver.findElement(user_name).sendKeys(uName);	
	System.out.println("new code");
}

public void password(String pwd) {
	driver.findElement(pass).sendKeys(pwd);
	
}
public void login_button() {
	driver.findElement(user_login).click();	
}


}
