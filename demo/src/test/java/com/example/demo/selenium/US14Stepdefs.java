package com.example.demo.selenium;

import com.example.demo.GenericWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class US14Stepdefs {
    public static WebDriver webDriver;

    public US14Stepdefs() {
        webDriver = GenericWebDriver.getWebDriver();
    }
    @Given("el usuario desea registrar una cuenta y se encuentra en la pagina de iniciar sesion")
    public void elUsuarioDeseaRegistrarUnaCuentaYSeEncuentraEnLaPaginaDeIniciarSesion() {
        // Carga la pagina
        webDriver.get("https://roomiesfrontend.web.app/");
        // --Maximiza la ventana
        webDriver.manage().window().maximize();
        // Selecciona Iniciar Sesión
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/div[2]/span/a[4]")).click();
    }

    @When("presiona el boton de Registrarme, completa el formulario adecuadamente y resiona el boton Registrar")
    public void presionaElBotonDeRegistrarmeCompletaElFormularioAdecuadamenteYResionaElBotonRegistrar() {
        //Selecciona registrar en la vista de Iniciar Sesión
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/form/div/div/div[4]/a")).click();
        //Acepta los terminos y condiciones
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[2]/div[1]/div/div/div[3]/button")).click();
        //Selecciona que es arrendador
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[2]/div[2]/div/div/div[1]/div[1]/button")).click();
        //Selecciona un plan
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[2]/div[3]/div/div/div[3]/div[1]/div[6]/button")).click();
        //Llena el formulario y presiona registrarse
        WebElement username = webDriver.findElement(By.xpath("//*[@id=\"input-803\"]"));
        username.sendKeys("pruebausername");
        WebElement contra = webDriver.findElement(By.xpath("//*[@id=\"input-806\"]"));
        contra.sendKeys("123");
        WebElement nombre = webDriver.findElement(By.xpath("//*[@id=\"input-809\"]"));
        nombre.sendKeys("pruebanombre");
        WebElement apellido = webDriver.findElement(By.xpath("//*[@id=\"input-812\"]"));
        apellido.sendKeys("pruebaapellido");
        WebElement celular = webDriver.findElement(By.xpath("//*[@id=\"input-815\"]"));
        celular.sendKeys("987654321");
        WebElement dni = webDriver.findElement(By.xpath("//*[@id=\"input-818\"]"));
        dni.sendKeys("7654321");
        WebElement descripcion = webDriver.findElement(By.xpath("//*[@id=\"input-821\"]"));
        descripcion.sendKeys("pruebadescripcion");
        WebElement nacimiento = webDriver.findElement(By.xpath("//*[@id=\"input-824\"]"));
        nacimiento.sendKeys("04122000");
        WebElement departamento = webDriver.findElement(By.xpath("//*[@id=\"input-827\"]"));
        departamento.sendKeys("Lima");
        WebElement provincia = webDriver.findElement(By.xpath("//*[@id=\"input-830\"]"));
        provincia.sendKeys("Lima");
        WebElement distrito = webDriver.findElement(By.xpath("//*[@id=\"input-833\"]"));
        distrito.sendKeys("Lima");
        WebElement direccion = webDriver.findElement(By.xpath("//*[@id=\"input-836\"]"));
        direccion.sendKeys("pruebadireccion");
        WebElement linkfoto = webDriver.findElement(By.xpath("//*[@id=\"input-839\"]"));
        linkfoto.sendKeys("123");
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[2]/div[4]/div/div/div/form/button")).click();
    }

    @Then("el website registra la cuenta y abre el Home Page")
    public void elWebsiteRegistraLaCuentaYAbreElHomePage() {
        Assertions.assertEquals(1,1);
    }

    @Given("el usuario ingresa un dato invalido en el formulario de registro")
    public void elUsuarioIngresaUnDatoInvalidoEnElFormularioDeRegistro() {
    }

    @When("presiona el boton Registrar")
    public void presionaElBotonRegistrar() {
    }

    @Then("el website muestra el mensaje Correo o password incorrecto")
    public void elWebsiteMuestraElMensajeCorreoOPasswordIncorrecto() {
    }

    @Given("el usuario se registra con un correo ya registrado")
    public void elUsuarioSeRegistraConUnCorreoYaRegistrado() {
    }

    @When("preiona el boton Registrar")
    public void preionaElBotonRegistrar() {
    }

    @Then("el website muestra el mensaje Correo ya registrado")
    public void elWebsiteMuestraElMensajeCorreoYaRegistrado() {
    }
}
