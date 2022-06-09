package com.example.demo.selenium;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US20 {
    @Given("el arrendador ha publicado un par de anuncios en la plataforma")
    public void elArrendadorHaPublicadoUnParDeAnunciosEnLaPlataforma() {
    }

    @When("acceda a la seccion Mis anuncios")
    public void accedaALaSeccionMisAnuncios() {
    }

    @Then("le aparecera la lista de sus anuncios publicados")
    public void leApareceraLaListaDeSusAnunciosPublicados() {
    }

    @Given("el arrendador no ha publicado ningun anuncio en la plataforma")
    public void elArrendadorNoHaPublicadoNingunAnuncioEnLaPlataforma() {
    }

    @Then("aparecera el mensaje Aun no has hecho ningun anuncio")
    public void apareceraElMensajeAunNoHasHechoNingunAnuncio() {
    }
}
