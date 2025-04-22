package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {

    WebDriver driver;

    private By uploadButton = By.id("uploadButton");
    private By fileInput = By.id("fileInput");
    private By filePreview = By.id("filePreview");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadFile(String filePath) {
        WebElement uploadElement = driver.findElement(fileInput);
        uploadElement.sendKeys(filePath);
    }

    public boolean isFileUploaded() {
        return driver.findElement(uploadButton).isDisplayed();
    }

    public boolean isFilePreviewCorrect() {
        WebElement previewElement = driver.findElement(filePreview);
        String fileName = previewElement.getAttribute("data-filename");
        String fileSize = previewElement.getAttribute("data-filesize");
        String fileType = previewElement.getAttribute("data-filetype");
        
        return fileName != null && fileSize != null && fileType != null;
    }
}