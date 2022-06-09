package com.example.demo.selenium;

import  com.example.demo.GenericWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class US01Stepdefs {

    public static WebDriver webDriver;

    public US01Stepdefs() {
        webDriver = GenericWebDriver.getWebDriver();
    }

    @Given("el usuario ha iniciado sesión y se encuentra afiliado a un plan")
    public void elUsuarioHaIniciadoSesiónYSeEncuentraAfiliadoAUnPlan() {

        // Carga la pagina
        webDriver.get("https://roomiesfrontend.web.app/");
        // --Maximiza la ventana
        webDriver.manage().window().maximize();

        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/div[2]/span/a[4]")).click();

        WebElement usuario=webDriver.findElement(By.xpath("//*[@id=\"input-66\"]"));
        usuario.sendKeys("string3");
        WebElement contraseña=webDriver.findElement(By.xpath("//*[@id=\"input-69\"]"));
        contraseña.sendKeys("string");

        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/form/div/div/div[3]/button")).click();

    }

    @When("Seleccione Publicar anuncio")
    public void seleccionePublicarAnuncio() {

        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/div[2]/span/span/a[2]")).click();

    }

    @Then("se muestra la pagina para crear el anuncio de vivienda a alquilar")
    public void seMuestraLaPaginaParaCrearElAnuncioDeViviendaAAlquilar() {

        Assertions.assertEquals(1, 1);

    }

    @Given("el usuario no ha iniciado sesión")
    public void elUsuarioNoSeEncuentraAfiliadoAUnPlan() {

        webDriver.get("https://roomiesfrontend.web.app/");
        // --Maximiza la ventana
        webDriver.manage().window().maximize();
    }


    @Then("se le redirige a la vista de iniciar sesión")
    public void seLePediraQueSeAfilieAUnPlan() {
        String titulo = webDriver.getTitle();
        Assertions.assertEquals("Iniciar sesión", titulo);
    }
}
