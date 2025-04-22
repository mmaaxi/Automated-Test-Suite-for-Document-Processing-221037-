package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {

    WebDriver driver;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectCargarDocumentos() {
        WebElement cargarDocOption = driver.findElement(By.id("cargarDocumentos"));
        cargarDocOption.click();
    }

    public boolean isSingleFileOptionAvailable() {
        WebElement singleFileOption = driver.findElement(By.id("singleFileOption"));
        return singleFileOption.isDisplayed();
    }

    public boolean isMultipleFileOptionAvailable() {
        WebElement multipleFileOption = driver.findElement(By.id("multipleFileOption"));
        return multipleFileOption.isDisplayed();
    }

    public void chooseSingleFileUpload() {
        WebElement singleFileOption = driver.findElement(By.id("singleFileOption"));
        singleFileOption.click();
    }

    public boolean isSingleFileBoxVisible() {
        WebElement singleFileBox = driver.findElement(By.id("singleFileBox"));
        return singleFileBox.isDisplayed();
    }

    public void chooseMultipleFileUpload() {
        WebElement multipleFileOption = driver.findElement(By.id("multipleFileOption"));
        multipleFileOption.click();
    }

    public boolean areMultipleFileBoxesVisible() {
        WebElement multipleFileBoxes = driver.findElement(By.id("multipleFileBoxes"));
        return multipleFileBoxes.isDisplayed();
    }
}