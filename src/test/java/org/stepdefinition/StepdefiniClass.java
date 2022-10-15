package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.friend.BaseClassCumb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefiniClass extends BaseClassCumb {
	PojoLogin pj = new PojoLogin();

	@Given("User will launch the chrome  brower and pass the url and maximise the window")
	public void user_will_launch_the_chrome_brower_and_pass_the_url_and_maximise_the_window() {

		launchBrowse();
		launchUrl("https://www.icing.com/");
	}

	@When("User should cilck the SignIn or RegisterLink")
	public void user_should_cilck_the_SignIn_or_RegisterLink() throws InterruptedException {
		Thread.sleep(2000);

		WebElement reg = driver.findElement(By.xpath("(//p[text()='Login /  Register'])[1]"));
		click(reg);

		WebElement lgn = driver.findElement(By.xpath("(//p[text()='Login'])[1]"));
		click(lgn);
	}

	@When("user enter the valid username and valid password")
	public void user_enter_the_valid_username_and_valid_password() throws InterruptedException {
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@id='dwfrm_login_username']"));
		passtxt(name, "prncjessica@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@id='dwfrm_login_password']"));
		passtxt(pass, "Tester@123");
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
		WebElement submit = driver.findElement(By.xpath("//button[@name='dwfrm_login_login']"));
		click(submit);

	}

	@When("user  should click forgotton password")
	public void user_should_click_forgotton_password() {
		WebElement rst = driver.findElement(By.xpath("//a[@id='password-reset']"));
		rst.click();

			}

	@When("user should the valid id")
	public void user_should_the_valid_id() {
		WebElement email = driver.findElement(By.xpath("//input[@id=\"dwfrm_requestpassword_email\"]"));
		passtxt(email, "prncjessica@gmail.com");
		
		driver.findElement(By.xpath("//button[@name='dwfrm_requestpassword_send']")).click();

	}

	

	@Then("user should move to the valid credential page")
	public void user_should_move_to_the_valid_credential_page() {

	}

}
