package cn.gloryroad.webdriver.baseapi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * 该框架的设计思路分析：
 * 1、先写一个Webdriverbaseapi类，声明WebDriver driver对象，并构造实例化driver
 * 2、在写一个basePage类，声明Webdriverbaseapi driver对象，并构造实例化 driver
 * 3、写一个HomePage类，继承basePage类，并构造实例化driver，及super（driver），在该页面对象中，写进入各页面的方法并返回新页面对象并传入driver
 * 4、写各个页面对象类，继承basePage，并构造实例化driver，写该页面中各种操作，调用时调用baseapi中的方法
 * 5、写一个BaseCase类，声明WebDriver driver对象，写个beforeSuite方法，指定driver为浏览器driver；同时写个InitWebdriverTest继承baseCase，
 * 给driver赋值指定为firefox浏览器对象，并调用baseCase类中的beforeSuite方法获取driver。
 * 
 * @author CWB_PC
 *
 */
public class WebdriverBaseApi {
	
	private WebDriver driver;
	public WebdriverBaseApi(WebDriver driver){
		this.driver=driver;
		
	}
	
	/**
	 * rewrite the click method,click on the element to be find by By</BR>
	 * 
	 * @param by
	 * 	   the locator you want to find the element
	 * @param timeout
	 *    超时时间，单位：秒
	 */
	public void click(By by){
		driver.findElement(by).click();
	}
	/**
	 * @param by
	 * 
	 */
//	public void click(By by){
//		click(by,0);
//	}
	
	/**
	 * 封装输入操作
	 * @param by
	 * @param text
	 */
	public void sendKeys(By by,String text){
		driver.findElement(by).sendKeys(text);
	}
	
	/**
	 * 清空输入框
	 * @param by
	 * 
	 */
	public void clear(By by){
		driver.findElement(by).clear();
	}
	
}
