package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class login_pom {
@FindBy(how=How.XPATH,using="//input[@name='email']")private WebElement txt_email;
@FindBy(how=How.XPATH,using="//input[@name='pass']")private WebElement txt_pass;
@FindBy(how=How.XPATH,using="//button[@name='login']")private WebElement but_in;
public WebElement getTxt_email() {
	return txt_email;
}

public WebElement getTxt_pass() {
	return txt_pass;
}

public WebElement getBut_in() {
	return but_in;
}

}
