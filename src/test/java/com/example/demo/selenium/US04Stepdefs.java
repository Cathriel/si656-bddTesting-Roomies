package com.example.demo.selenium;

import com.example.demo.GenericWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class US04Stepdefs {

    public static WebDriver webDriver;

    public US04Stepdefs() {
        webDriver = GenericWebDriver.getWebDriver();
    }


    @Given("el usuario se encuentra en la vista principal")
    public void elUsuarioSeEncuentraEnLaVistaPrincipal() {
        webDriver.get("https://roomiesfrontend.web.app/");
        webDriver.manage().window().maximize();
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/div[2]/span/a[2]")).click();
    }

    @When("selecciona los filtros sobre las caracteristicas del inmueble que desea alquilar")
    public void seleccionaLosFiltrosSobreLasCaracteristicasDelInmuebleQueDeseaAlquilar() {

        WebElement autocomplete=webDriver.findElement(By.xpath("//*[@id=\"input-64\"]"));
        autocomplete.sendKeys("Lima"+ Keys.ENTER);
    }

    @Then("se muestran todos los inmuebles que posean tales caracteristicas")
    public void seMuestranTodosLosInmueblesQuePoseanTalesCaracteristicas() {

        String text=webDriver.findElement(By.xpath("//*[@id=\"input-64\"]")).getAttribute("value");
        Assertions.assertEquals("Lima",text);
    }

    @Given("el usuario se encuentra en la seccion Buscar Inmueble")
    public void elUsuarioSeEncuentraEnLaSeccionBuscarInmueble() {
        webDriver.get("https://roomiesfrontend.web.app/");
        webDriver.manage().window().maximize();
        webDriver.findElement(By.linkText("BUSCAR INMUEBLE")).click();
        int segundos = 200;
        webDriver.manage().timeouts().implicitlyWait(segundos, TimeUnit.SECONDS);
    }

    @When("selecciona el anuncio del inmueble")
    public void seleccionaElAnuncioDelInmueble() {
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div/div/div[1]/div/div[6]/button/span")).click();
    }

    @Then("se muestran imagenes y videos")
    public void seMuestranImagenesYVideos() {
        String title = webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/button[1]/span")).getText();
        Assertions.assertEquals("Fotos", title);
    }

    @Then("se muestran otras viviendas similares en la parte inferior")
    public void seMuestranOtrasViviendasSimilaresEnLaParteInferior() {
        String title = webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[1]/h1")).getText();
        Assertions.assertEquals("Propiedades que te puedan interesar", title);
    }
}
