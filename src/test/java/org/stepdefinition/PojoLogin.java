package org.stepdefinition;

import org.friend.BaseClassCumb;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoLogin extends BaseClassCumb {

	public PojoLogin() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "(//p[text()='Login /  Register'])[1]")
	private WebElement register;

	@FindBy(xpath = "(//p[text()='Login'])[1])")
	private WebElement login;

	@FindBy(xpath = "//input[@id='dwfrm_login_username']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='dwfrm_login_password']")
	private WebElement passwrd;

    @FindBy(xpath="//button[@name='dwfrm_login_login']")
  
    private WebElement submit;

	public WebElement getRegister() {
		return register;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPasswrd() {
		return passwrd;
	}

	public WebElement getSubmit() {
		return submit;
	}
    
    
    
    
    
    
    
    
    
    
}
