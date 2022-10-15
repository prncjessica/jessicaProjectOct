package org.friend;





	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.time.Duration;
	import java.util.Date;
	import java.util.List;
	import java.util.Set;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClassCumb {  

		public static WebDriver driver;
		public static Actions a;
		public static Robot r;
		public static Alert al;
		public static Select s;
		public static JavascriptExecutor js;

		public static void launchBrowse() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}

		public static void edgeBrowser() {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();

		}

		public static void launchUrl(String Url) {
			driver.get(Url);
		}

		public static void passtxt(WebElement ele, String value) {
			ele.sendKeys(value);
		}

		public static void click(WebElement ele) {
			ele.click();
		}

		public static void moveCourser(WebElement ele) {
			a = new Actions(driver);
			a.moveToElement(ele).perform();
		}

		public static void rightClick(WebElement ele) {
			a = new Actions(driver);
			a.contextClick(ele).perform();
		}

		public static void doubleClick(WebElement ele) {
			a = new Actions(driver);

			a.doubleClick(ele).perform();

		}

		public static void dradDrop(WebElement ele, WebElement ele1) {
			a = new Actions(driver);
			a.dragAndDrop(ele, ele1);

		}

		public static void enter() throws AWTException {
			r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

		}

		public static void tab() throws AWTException {
			r = new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}

		public static void copy() throws AWTException {
			r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
		}

		public static void paste() throws AWTException {
			r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);

		}

		public static void cut() throws AWTException {
			r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_X);
			r.keyRelease(KeyEvent.VK_X);
			r.keyRelease(KeyEvent.VK_CONTROL);

		}

		public static void down() throws AWTException {
			r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}

		public static void accept() {
			al = driver.switchTo().alert();
			al.accept();

		}

		public static void dismiss() {
			al = driver.switchTo().alert();
			al.dismiss();

		}

		public static void sendkeys(String value) {
			al = driver.switchTo().alert();
			String text = al.getText();
			System.out.println(text);

		}

		public static void screen(String name) throws IOException {

			TakesScreenshot ts = (TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\user\\eclipse-workspace\\CucumberFrame\\target\\Screenshot" + name + ".png");
			FileUtils.copyFile(temp, dest);

		}

		public static void setattribute(String value, String passvalue, WebElement ele) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setattribute,(" + value + "," + passvalue + ")", ele);

		}

		public static void returnvalue(String passvalue, WebElement ele) {
			js = (JavascriptExecutor) driver;
			js.executeScript("return arguments[0].getattribute,(" + passvalue + ")", ele);

		}

		public static void scrollup(WebElement ele) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", ele);

		}

		public static void jsclick(WebElement ele) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ele);

		}

		public static void frameid(WebElement ele) {

			driver.switchTo().frame(ele);
		}

		public static void frameWeb(WebElement ele) {

			driver.switchTo().frame(ele);

		}

		public static void frameint(WebElement ele) {

			driver.switchTo().frame(ele);

		}

		public static void frameToParent() {

			driver.switchTo().parentFrame();
		}

		public static void frameToHtml() {

			driver.switchTo().defaultContent();
		}


		public static void fluentWait(int sec) {
			FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(sec));
		}

		public static void getParentWindow() {

			String parent = driver.getWindowHandle();
			System.out.println(parent);

		}

		public static void getallWindow() {

			Set<String> allwindows = driver.getWindowHandles();
			for (String eachwin : allwindows) {
				System.out.println(eachwin);
			}

		}

		public static void currentWindow() {

			String parent = driver.getWindowHandle();
			Set<String> allwindows = driver.getWindowHandles();
			for (String eachwin : allwindows) {
				if (parent != eachwin) {
					driver.switchTo().window(eachwin);

				}
			}

		}

		public static void selectByIndex(WebElement ele, int num) {
			s = new Select(ele);
			s.selectByIndex(num);
		}

		public static void selectValue(WebElement ele, String value) {
			s = new Select(ele);
			s.selectByValue(value);
		}

		public static void getOptions(WebElement ele, String value) {
			s = new Select(ele);
			List<WebElement> options = s.getOptions();
		}

		public static void firstSelected(WebElement ele) {
			s = new Select(ele);
			WebElement firstOption = s.getFirstSelectedOption();
		}

		public static void deselect(WebElement ele, String value) {
			s = new Select(ele);
			s.deselectByValue(value);
		}

		
}

	

