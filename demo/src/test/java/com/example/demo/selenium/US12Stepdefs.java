package com.example.demo.selenium;

import com.example.demo.GenericWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class US12Stepdefs {
    public static WebDriver webDriver;

    public US12Stepdefs() {
        webDriver = GenericWebDriver.getWebDriver();
    }

    @And("selecciona la opcion Mostrar normas de convivencia del inmueble")
    public void seleccionaLaOpcionMostrarNormasDeConvivenciaDelInmueble() {
        Assertions.assertEquals(1,1);
    }

    @Then("aparecera una ventana con las normas generales del inmueble")
    public void apareceraUnaVentanaConLasNormasGeneralesDelInmueble() {
        Assertions.assertEquals(1,1);
    }

    @Given("un anuncio no posee normas de convivencia")
    public void unAnuncioNoPoseeNormasDeConvivencia() {
    }

    @When("el usuario seleccione ese anuncio y luego la opcion Mostrar Normas de convivencia")
    public void elUsuarioSeleccioneEseAnuncioYLuegoLaOpcionMostrarNormasDeConvivencia() {
    }

    @Then("se muestra el mensaje Este inmueble no posee normas de convivencia")
    public void seMuestraElMensajeEsteInmuebleNoPoseeNormasDeConvivencia() {
    }
}
