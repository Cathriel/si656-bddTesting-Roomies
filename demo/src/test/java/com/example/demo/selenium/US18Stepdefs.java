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

public class US18Stepdefs {

    public static WebDriver webDriver;

    public US18Stepdefs() {
        webDriver = GenericWebDriver.getWebDriver();
    }


    @Given("el usuario quiere usar los filtros al momento de hacer su busqueda")
    public void elUsuarioQuiereUsarLosFiltrosAlMomentoDeHacerSuBusqueda() {
        // Carga la pagina
        webDriver.get("https://roomiesfrontend.web.app/");
        // --Maximiza la ventana
        webDriver.manage().window().maximize();

        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/div[2]/span/a[2]")).click();



    }

    @When("empieza a llenar el formulario de filtros")
    public void empiezaALlenarElFormularioDeFiltros() {
        WebElement autocomplete=webDriver.findElement(By.xpath("//*[@id=\"input-66\"]"));
        autocomplete.sendKeys("Lima"+ Keys.TAB);
        /*System.out.println(webDriver.findElement(By.id("input-35")).getAttribute("value"));*/

    }

    @Then("los resultados de la busqueda comienzan a reducirse")
    public void losResultadosDeLaBusquedaComienzanAReducirse() {

        String text=webDriver.findElement(By.xpath("//*[@id=\"input-66\"]")).getAttribute("value");
        Assertions.assertEquals("Lima",text);
    }
}
