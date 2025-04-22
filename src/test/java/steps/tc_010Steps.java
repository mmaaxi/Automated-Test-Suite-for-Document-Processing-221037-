package steps;

import io.cucumber.java.en.*;
import pages.TC_010Page;

public class TC_010Steps {

    TC_010Page page = new TC_010Page();

    @Given("el usuario ha cargado y procesado los documentos")
    public void cargarYProcesarDocumentos() {
        page.cargarDocumentos();
        page.procesarDocumentos();
    }

    @When("se completa el procesamiento de documentos")
    public void completarProcesamiento() {
        page.verificarProcesamientoCompleto();
    }

    @Then("el sistema debe generar el 'Slip de salida'")
    public void generarSlipDeSalida() {
        page.verificarGeneracionSlipSalida();
    }

    @And("guardar los documentos originales en el historial de la solicitud")
    public void guardarDocumentosEnHistorial() {
        page.verificarDocumentosGuardadosEnHistorial();
    }

    @And("guardar los datos extraídos en el historial de la solicitud")
    public void guardarDatosExtraidosEnHistorial() {
        page.verificarDatosExtraidosGuardadosEnHistorial();
    }
}