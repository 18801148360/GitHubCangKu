package cn.gloryroad.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cn.gloryroad.webdriver.baseapi.WebdriverBaseApi;

public class JiChuPage extends BasePage{	
	
	public JiChuPage(WebdriverBaseApi driver){
		super(driver);
	}
	
	/**
	 * 修改基础信息的企业联系人
	 * @param lianxiren
	 * 
	 */
	public void bianjiqiye(String lianxiren){
		driver.clear(By.xpath("//span[text()='企业联系人']/input"));
		driver.sendKeys(By.xpath("//span[text()='企业联系人']/input"), lianxiren);
		driver.click(By.xpath("//button[text()='保  存']"));
	}
}
