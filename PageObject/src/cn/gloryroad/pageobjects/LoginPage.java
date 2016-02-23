package cn.gloryroad.pageobjects;

import org.openqa.selenium.By;
import cn.gloryroad.webdriver.baseapi.WebdriverBaseApi;

public class LoginPage extends BasePage {
	
	
	public LoginPage(WebdriverBaseApi driver){
		super(driver);
	
	}
	
	public void inputUserName(String userName){
		driver.sendKeys(By.name("userName"), userName);
	}
	
	public void inputPassWord(String passWord){
		driver.sendKeys(By.name("password"), passWord);
	}
	
	public void clickLoginButton(){
		driver.click(By.xpath("//button[text()='µÇÂ¼']"));
	}
	
	public void login(String userName,String passWord){
		inputUserName(userName);
		inputPassWord(passWord);
		clickLoginButton();
	}
	
	/**
	 * µÇÂ¼³É¹¦
	 * 
	 * @param userName
	 * @param passWord
	 * @return
	 * 
	 */
	public HomePage loginOK(String userName,String passWord){
		login(userName,passWord);
		return new HomePage(driver);
	}
	
	
	
	
}
