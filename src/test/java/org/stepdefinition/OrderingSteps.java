package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.friend.BaseClassCumb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class OrderingSteps extends BaseClassCumb {

	@Given("User should  launch  brower and pass the url and maximise the window")
	public void user_should_launch_brower_and_pass_the_url_and_maximise_the_window() {
		launchBrowse();
		launchUrl("https://www.icing.com/");

	}

	@When("User should cilck the LogIn or Register")
	public void user_should_cilck_the_LogIn_or_Register() throws InterruptedException {

		Thread.sleep(2000);

		WebElement reg = driver.findElement(By.xpath("(//p[text()='Login /  Register'])[1]"));
		click(reg);

		WebElement lgn = driver.findElement(By.xpath("(//p[text()='Login'])[1]"));
		click(lgn);

	}

	@When("user  should type the valid username and valid password")
	public void user_should_type_the_valid_username_and_valid_password() throws InterruptedException {
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@id='dwfrm_login_username']"));
		passtxt(name, "prncjessica@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@id='dwfrm_login_password']"));
		passtxt(pass, "Tester@123");

	}

	@When("user  should click  login button")
	public void user_should_click_login_button() {

		WebElement submit = driver.findElement(By.xpath("//button[@name='dwfrm_login_login']"));
		click(submit);

	}

	@When("user should enter the product name into searchbox")
	public void user_should_enter_the_product_name_into_searchbox() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='textsearch _ar_hide_']")).click();
//		driver.findElement(By.xpath("(//input[@class='textsearch _ar_hide_']")).sendKeys("Bracelet");
		driver.findElement(By.xpath("//a[contains(text(),' Brac')]")).click();
		
	}

	@When("user should click the search button")
	public void user_should_click_the_search_button() throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("user should select the product and click the product")
	public void user_should_select_the_product_and_click_the_product() {

	}

	@Then("user should move to the product page")
	public void user_should_move_to_the_product_page() {

	}

}
