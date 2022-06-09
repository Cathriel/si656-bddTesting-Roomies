package com.example.demo.selenium;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US15 {
    @Given("el usuario desea cambiar el password de su cuenta y se encuentra en el Inicio de sesion")
    public void elUsuarioDeseaCambiarElPasswordDeSuCuentaYSeEncuentraEnElInicioDeSesion() {
    }

    @When("presiona el boton de Cambiar Contraseña, completa el formulario y presiona el boton Cambiar")
    public void presionaElBotonDeCambiarContraseñaCompletaElFormularioYPresionaElBotonCambiar() {
    }

    @Then("el website registra la nueva contraseña")
    public void elWebsiteRegistraLaNuevaContraseña() {
    }

    @Given("el usuario no ingresa una nueva password")
    public void elUsuarioNoIngresaUnaNuevaPassword() {
    }

    @When("presiona el boton Cambiar")
    public void presionaElBotonCambiar() {
    }

    @Then("se muestra el mensaje Ingresar nueva password")
    public void seMuestraElMensajeIngresarNuevaPassword() {
    }
}
