// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
public class PrimeirotesteTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void primeiroteste() {
    driver.get("http://localhost:4200/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.cssSelector(".btn-secondary-prioridade > .mat-button-wrapper")).click();
    driver.findElement(By.cssSelector(".btn-secondary-normal > .mat-button-wrapper")).click();
    driver.findElement(By.cssSelector(".btn-secondary-prioridade > .mat-button-wrapper")).click();
    driver.findElement(By.cssSelector(".mat-select-arrow")).click();
    driver.findElement(By.cssSelector("#mat-option-1 > .mat-option-text")).click();
    driver.findElement(By.cssSelector(".btn-secondary-prioridade > .mat-button-wrapper")).click();
    driver.findElement(By.cssSelector(".btn-secondary-prioridade > .mat-button-wrapper")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".btn-secondary-normal > .mat-button-wrapper"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".btn-secondary-normal > .mat-button-wrapper")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".btn-secondary-normal > .mat-button-wrapper"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".btn-secondary-normal > .mat-button-wrapper")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".btn-secondary-normal")).click();
    js.executeScript("window.scrollTo(0,224)");
    js.executeScript("window.scrollTo(0,272)");
    driver.findElement(By.cssSelector(".btn-secondary-normal")).click();
    driver.findElement(By.cssSelector(".btn-secondary-prioridade")).click();
    js.executeScript("window.scrollTo(0,320)");
    {
      WebElement element = driver.findElement(By.cssSelector(".btn-secondary > .mat-button-wrapper"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".btn-secondary > .mat-button-wrapper")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".btn-secondary > .mat-button-wrapper"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".btn-secondary > .mat-button-wrapper")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".btn-secondary > .mat-button-wrapper"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector(".btn-secondary > .mat-button-wrapper")).click();
    driver.findElement(By.cssSelector(".btn-secondary > .mat-button-wrapper")).click();
    driver.findElement(By.cssSelector(".btn-secondary > .mat-button-wrapper")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".btn-secondary"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".btn-secondary")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".btn-secondary > .mat-button-wrapper"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".btn-secondary > .mat-button-wrapper")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("app-root")).click();
    driver.findElement(By.cssSelector("app-root")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("app-root"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector("app-root")).click();
    driver.findElement(By.cssSelector("app-root")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("app-root"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
  }
}
