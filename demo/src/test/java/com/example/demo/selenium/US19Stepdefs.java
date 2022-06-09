package com.example.demo.selenium;

import com.example.demo.GenericWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class US19Stepdefs {

    public static WebDriver webDriver;

    public US19Stepdefs() {
        webDriver = GenericWebDriver.getWebDriver();
    }
    @Given("el arrendatario ha visto cierta cantidad de anuncios previamente")
    public void elArrendatarioHaVistoCiertaCantidadDeAnunciosPreviamente() {
        // Carga la pagina
        webDriver.get("https://roomiesfrontend.web.app/");
        // --Maximiza la ventana
        webDriver.manage().window().maximize();

        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/div[2]/span/a[2]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div/div/div[1]/div/div[6]/button")).click();
    }

    @When("acceda al apartado de Inico")
    public void accedaAlApartadoDeInico() {
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/div[2]/span/a[1]")).click();

    }

    @Then("inmuebles similares son mostrados")
    public void inmueblesSimilaresSonMostrados() {
        String title=webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[1]")).getText();
        Assertions.assertEquals("Inmuebles similares a los que visitaste", title);
    }

    @Given("el arrendatario no ha visto ningun anuncio previamente")
    public void elArrendatarioNoHaVistoNingunAnuncioPreviamente() {


    }

    @When("acceda al apartado de Inicio")
    public void accedaAlApartadoDeInicio() {
        // Carga la pagina
        webDriver.get("https://roomiesfrontend.web.app/");
        // --Maximiza la ventana
        webDriver.manage().window().maximize();
    }

    @Then("no es mostrado ningun inmueble como similar")
    public void noEsMostradoNingunInmuebleComoSimilar() {

    }
}
