package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.Loginpage;
import pages.searchhotel;

public class NewTest {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
		String url = "https://adactinhotelapp.com/";
		driver.get(url);
		Loginpage lp = new Loginpage(driver);
		lp.u_name("vasuvespag");
		lp.password("vasu1234");
		lp.login_button();
		
		searchhotel sh = new searchhotel(driver);
		sh.location("Sydney");
		
		sh.hotel("Hotel Sunshine");
		
		sh.clickSearch();
		
  }
  
  
}
