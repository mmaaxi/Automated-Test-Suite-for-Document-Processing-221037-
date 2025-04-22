package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_002Page;

public class tc_002Steps {

    WebDriver driver = new ChromeDriver();
    tc_002Page uploadPage = new tc_002Page(driver);

    @Given("the user is on the file upload page")
    public void userIsOnFileUploadPage() {
        uploadPage.navigateToUploadPage();
    }

    @When("the user selects a PDF/DOCX file within 50 MB")
    public void userSelectsAValidFile() {
        uploadPage.uploadFile("path/to/valid/file.pdf");
    }

    @Then("the file is uploaded successfully")
    public void fileIsUploadedSuccessfully() {
        Assert.assertTrue("File is not uploaded successfully", uploadPage.isFileUploaded());
    }

    @Then("the preview displays the file name, size, and type")
    public void previewDisplaysFileDetails() {
        Assert.assertTrue("File preview is not correct", uploadPage.isFilePreviewCorrect());
    }
}