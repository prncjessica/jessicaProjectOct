package org.stepdefinition;

import java.util.List;

import org.friend.BaseClassCumb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class StepScenario extends BaseClassCumb {

	@Given("User should launch the chrome  brower and pass the url and maximise the window")
	public void user_should_launch_the_chrome_brower_and_pass_the_url_and_maximise_the_window() {

		launchBrowse();
		launchUrl("https://www.icing.com/");

	}

	@When("User should cilck the SignIn or Register")
	public void user_should_cilck_the_SignIn_or_Register() throws InterruptedException {
		Thread.sleep(2000);

		WebElement reg = driver.findElement(By.xpath("(//p[text()='Login /  Register'])[1]"));
		click(reg);

		WebElement lgn = driver.findElement(By.xpath("(//p[text()='Login'])[1]"));
		click(lgn);

	}

	@When("user enter the invalid {string} and invalid {string}")
	public void user_enter_the_invalid_and_invalid(String s1, String s2) throws InterruptedException {

		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@id='dwfrm_login_username']"));
		passtxt(name, s1);

		WebElement pass = driver.findElement(By.xpath("//input[@id='dwfrm_login_password']"));
		passtxt(pass, s2);

	}

	@When("user  should click the login button")
	public void user_should_click_the_login_button() {
		WebElement submit = driver.findElement(By.xpath("//button[@name='dwfrm_login_login']"));
		click(submit);

	}

	@Then("user should move to the invalid credential page")
	public void user_should_move_to_the_invalid_credential_page() {
	}

	@When("user enter the valid username and invalid password")
	public void user_enter_the_valid_username_and_invalid_password(io.cucumber.datatable.DataTable d) {
	 
	List<String> li = d.asList();
	String str1 = li.get(0);
	String str2 = li.get(1);
	
	WebElement name = driver.findElement(By.xpath("//input[@id='dwfrm_login_username']"));
	passtxt(name, str1);

	WebElement pass = driver.findElement(By.xpath("//input[@id='dwfrm_login_password']"));
	passtxt(pass, str2);

	
	}

	
	
	
}
