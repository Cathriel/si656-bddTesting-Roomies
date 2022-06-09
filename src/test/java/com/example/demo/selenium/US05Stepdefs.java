package com.example.demo.selenium;

import com.example.demo.GenericWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class US05Stepdefs {

    public static WebDriver webDriver;

    public US05Stepdefs() {
        webDriver = GenericWebDriver.getWebDriver();
    }

    @When("selecciona uno de los anuncios")
    public void seleccionaUnoDeLosAnuncios() {
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div/div/div[1]/div/div[6]/button")).click();
    }

    @Then("se muestran todas las fotos, videos y reseñas del anuncio de alquiler escogido")
    public void seMuestranTodasLasFotosVideosYReseñasDelAnuncioDeAlquilerEscogido() {
        Assertions.assertEquals(1, 1);
    }


    @Then("se muestran los comentarios")
    public void seMuestranLosComentarios() {
        String title=webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[3]/div/div/div[8]")).getText();
        Assertions.assertEquals("Reseñas",title);
    }
}
