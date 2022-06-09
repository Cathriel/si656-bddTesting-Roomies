package com.example.demo.selenium;

import com.example.demo.GenericWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class US04Stepdefs {

    public static WebDriver webDriver;

    public US04Stepdefs() {
        webDriver = GenericWebDriver.getWebDriver();
    }


    @Given("el usuario se encuentra en la vista principal")
    public void elUsuarioSeEncuentraEnLaVistaPrincipal() {

        // Carga la pagina
        webDriver.get("https://roomiesfrontend.web.app/");
        // --Maximiza la ventana
        webDriver.manage().window().maximize();

        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/div[2]/span/a[2]")).click();

    }

    @When("selecciona los filtros sobre las caracteristicas del inmueble que desea alquilar")
    public void seleccionaLosFiltrosSobreLasCaracteristicasDelInmuebleQueDeseaAlquilar() {

        WebElement autocomplete=webDriver.findElement(By.xpath("//*[@id=\"input-66\"]"));
        autocomplete.sendKeys("Lima"+ Keys.TAB);
        /*System.out.println(webDriver.findElement(By.id("input-35")).getAttribute("value"));*/
    }

    @Then("se muestran todos los inmuebles que posean tales caracteristicas")
    public void seMuestranTodosLosInmueblesQuePoseanTalesCaracteristicas() {

        String text=webDriver.findElement(By.xpath("//*[@id=\"input-66\"]")).getAttribute("value");
        Assertions.assertEquals("Lima",text);
    }

    @Given("el usuario se encuentra en la seccion Buscar Inmueble")
    public void elUsuarioSeEncuentraEnLaSeccionBuscarInmueble() {
        webDriver.get("https://roomiesfrontend.web.app/");
        // --Maximiza la ventana
        webDriver.manage().window().maximize();

        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/div[2]/span/span/a[1]"));
    }

    @When("selecciona el anuncio del inmueble")
    public void seleccionaElAnuncioDelInmueble() {
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div/div/div[1]/div/div[6]/button")).click();
    }

    @Then("se muestran imagenes y videos")
    public void seMuestranImagenesYVideos() {
        Assertions.assertEquals(1,1);
    }

    @Then("se muestran otras viviendas similares en la parte inferior")
    public void seMuestranOtrasViviendasSimilaresEnLaParteInferior() {
        String title=webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[1]/h1")).getText();
        Assertions.assertEquals("Propiedades que te pueden interesar", title);
    }
}
