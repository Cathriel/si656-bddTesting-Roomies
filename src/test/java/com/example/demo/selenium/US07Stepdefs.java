package com.example.demo.selenium;

import com.example.demo.GenericWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class US07Stepdefs {

    public static WebDriver webDriver;

    public US07Stepdefs() {
        webDriver = GenericWebDriver.getWebDriver();
    }

    @Given("el arrendatario se encuentra en la seccion del anuncio de alquiler elegido")
    public void elArrendatarioSeEncuentraEnLaSeccionDelAnuncioDeAlquilerElegido() {

        // Carga la pagina
        webDriver.get("https://roomiesfrontend.web.app/");
        // --Maximiza la ventana
        webDriver.manage().window().maximize();

        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/div[2]/span/a[2]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div/div/div[1]/div/div[6]/button")).click();
    }

    @When("se dirija a la seccion Datos del Arrendador")
    public void seDirijaALaSeccionDatosDelArrendador() {
        String title= webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[3]/div/div/div[10]")).getText();
        Assertions.assertEquals("Datos del arrendador",title);
    }

    @Then("se muestra informacion relevante sobre este")
    public void seMuestraInformacionRelevanteSobreEste() {
        String title= webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[3]/div/div/div[10]")).getText();
        Assertions.assertEquals("Datos del arrendador",title);
    }

}
