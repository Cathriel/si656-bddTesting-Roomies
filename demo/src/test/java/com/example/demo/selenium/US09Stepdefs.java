package com.example.demo.selenium;

import com.example.demo.GenericWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class US09Stepdefs {

    public static WebDriver webDriver;

    public US09Stepdefs() {
        webDriver = GenericWebDriver.getWebDriver();
    }
    @Given("el usuario desde que la aplicacion web este operativa durante todo el dia")
    public void elUsuarioDesdeQueLaAplicacionWebEsteOperativaDuranteTodoElDia() {
        //Entra a la página para visualizar que esta disponible 24/7
        webDriver.get("https://roomiesfrontend.web.app/");
        //Maximizamos la ventana
        webDriver.manage().window().maximize();
    }

    @When("ingrese a la hora de su preferencia")
    public void ingreseALaHoraDeSuPreferencia() {
        //Vamos a iniciar sesión
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/div[2]/span/a[4]/span")).click();

        //Hacemos el login
        WebElement usuario = webDriver.findElement(By.xpath("//*[@id=\"input-66\"]"));
        usuario.sendKeys("lucho1");
        WebElement contra = webDriver.findElement(By.xpath("//*[@id=\"input-69\"]"));
        contra.sendKeys("123");

        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/form/div/div/div[3]/button")).click();
    }

    @Then("puede visualizar el contenido y realizar acciones sin ningun inconveniente")
    public void puedeVisualizarElContenidoYRealizarAccionesSinNingunInconveniente() {
        //Comprobamos el correcto funcionamiento accediendo a la vista home

    }
}
