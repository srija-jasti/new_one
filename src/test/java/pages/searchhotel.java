package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class searchhotel {
	WebDriver driver;

public searchhotel(WebDriver driver) {
		this.driver = driver;
}
By location_select = By.id("location");
By hotel_select = By.id("hotels");
By search_select = By.id("Submit");

public void location(String place) {
	WebElement location_dropdown  = driver.findElement(location_select);
	Select loc_dropdown = new Select(location_dropdown);
	loc_dropdown.selectByVisibleText(place);
	
}

//public void hotel(String hotels) {
//	WebElement hotel_dropdown  = driver.findElement(hotel_select);
//	Select loc_dropdown = new Select(hotel_dropdown);
//	loc_dropdown.selectByVisibleText(hotels);
//	
//}


public void clickSearch() {
	driver.findElement(search_select).click();
}

public void hotel(String hotels) {
	// TODO Auto-generated method stub
	WebElement hotel_dropdown  = driver.findElement(hotel_select);
	Select loc_dropdown = new Select(hotel_dropdown);
	loc_dropdown.selectByVisibleText(hotels);
	
}
}
