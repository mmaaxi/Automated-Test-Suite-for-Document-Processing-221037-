package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.tc_001Page;

public class tc_001Steps {

    tc_001Page page = new tc_001Page();

    @Given("I am on the document upload page")
    public void navigateToDocumentUploadPage() {
        page.navigateToUploadPage();
    }

    @When("I select the 'cargar documentos' option")
    public void selectCargarDocumentosOption() {
        page.selectCargarDocumentos();
    }

    @Then("I should see options for single file upload and multiple file upload")
    public void validateUploadOptions() {
        Assert.assertTrue(page.isSingleFileOptionAvailable());
        Assert.assertTrue(page.isMultipleFileOptionAvailable());
    }

    @When("I choose 'carga en un solo archivo'")
    public void selectSingleFileUploadOption() {
        page.chooseSingleFileUpload();
    }

    @Then("I should see a single box to upload the file")
    public void validateSingleFileBoxVisibility() {
        Assert.assertTrue(page.isSingleFileBoxVisible());
    }

    @When("I choose 'cargar documentos por separado'")
    public void selectMultipleFileUploadOption() {
        page.chooseMultipleFileUpload();
    }

    @Then("I should see multiple boxes for each required document")
    public void validateMultipleFileBoxVisibility() {
        Assert.assertTrue(page.areMultipleFileBoxesVisible());
    }
}