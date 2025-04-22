package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_010Page {

    WebDriver driver;

    By cargaDocumentos = By.id("cargaDocumentos");
    By procesamientoCompleto = By.id("procesamientoCompleto");
    By slipSalida = By.id("slipSalida");
    By historialDocumentos = By.id("historialDocumentos");
    By historialDatos = By.id("historialDatos");

    public TC_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void cargarDocumentos() {
        driver.findElement(cargaDocumentos).click();
    }

    public void procesarDocumentos() {
        // Implementación del procesamiento de documentos
    }

    public void verificarProcesamientoCompleto() {
        driver.findElement(procesamientoCompleto).isDisplayed();
    }

    public void verificarGeneracionSlipSalida() {
        driver.findElement(slipSalida).isDisplayed();
    }

    public void verificarDocumentosGuardadosEnHistorial() {
        driver.findElement(historialDocumentos).isDisplayed();
    }

    public void verificarDatosExtraidosGuardadosEnHistorial() {
        driver.findElement(historialDatos).isDisplayed();
    }
}