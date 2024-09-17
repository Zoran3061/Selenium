package Selenium.Zadatak;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak {
	


	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        driver.manage().window().maximize();
        //try {
            // Step 1: Login
            driver.get("http://ibweb25.saga.rs/PRODUCT/Retail/Retail/home/login?r=%2fPRODUCT%2fRetail%2fRetail%2f");
         // Step 1: Enter Username
            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernameInput")));
            usernameField.sendKeys("testproduct");
         // Step 2: Enter password
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwordInput")));
            passwordField.sendKeys("Test123");  
         // Step 3. Clikc on button Login
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-attr='button-login']")));
            loginButton.click();
        
            WebElement scrollableContainer1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".sf-menu.main-nav")));
            JavascriptExecutor js1 = (JavascriptExecutor) driver;
            js1.executeScript("arguments[0].scrollIntoView(true);", scrollableContainer1);
         // Step 4: Click on Payments
            WebElement paymentsTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/PRODUCT/Retail/Retail/user/placanja']")));
            js1.executeScript("arguments[0].scrollIntoView(true);", paymentsTab);
            paymentsTab.click();
         // Step 5: Click on Internal Payments
            WebElement internalPaymentsOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/PRODUCT/Retail/Retail/user/placanja/internal_transfer' and @data-page-id='137467']")));
            js1.executeScript("arguments[0].scrollIntoView(true);", internalPaymentsOption);
            internalPaymentsOption.click();
         // Step 6: View offerd acconts
            WebElement accountToFrom = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".account-card-btn.account-btn-next.relative.element-border.background-5")));
            accountToFrom.click();
         // Step 7: Choose an Acccount
            WebElement switchAccounts = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".account-intro-inner.flex-layout.flex-center.space-between.lastBorder")));
            switchAccounts.click();
         // Step 8: Fill reference field
            WebElement referenceField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-attr='input-reference']")));
            referenceField.sendKeys("Evo za ispit");
            js1.executeScript("arguments[0].scrollIntoView(true);", referenceField);
         // Step 9: Fill date field
            WebElement date = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".input-1.input-page-text.hasDatepicker")));
            js1.executeScript("arguments[0].scrollIntoView(true);", date);
            date.clear();
            date.sendKeys("17.09.2024");
            date.sendKeys(Keys.ENTER);
         // Step 10: Fill the amount of money
            WebElement amountField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputAmount")));
            amountField.clear();
            js1.executeScript("arguments[0].scrollIntoView(true);", amountField);
            amountField.sendKeys("1000.00");
         // Step 11: Click on Execute button
            WebElement executeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-attr='button-submit']")));
            executeButton.click(); 
         // Step 11: Click on Confirm Button
            WebElement confirmButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-attr='confirmExchange']")));
            confirmButton.click();
	}
	

}
