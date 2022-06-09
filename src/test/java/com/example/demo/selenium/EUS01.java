package com.example.demo.selenium;

import com.example.demo.GenericWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EUS01 {

    public static WebDriver webDriver;

    public EUS01() {
        webDriver = GenericWebDriver.getWebDriver();
    }

    @Given("el arrendador ha iniciado sesión y se dirige a su perfil")
    public void elArrendadorHaIniciadoSesiónYSeDirigeASuPerfil() {

        // Carga la pagina
        webDriver.get("https://roomies-upc.web.app/");
        // --Maximiza la ventana
        webDriver.manage().window().maximize();
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/div[2]/span/a[4]/span")).click();

        //Selecciona registrar en la vista de Iniciar Sesión
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/form/div/div/div[4]/a")).click();
        //Acepta los terminos y condiciones
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[2]/div[1]/div/div/div[3]/button/span")).click();
        //Selecciona que es arrendador
        int segundos1 = 20;
        webDriver.manage().timeouts().implicitlyWait(segundos1, TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[2]/div[2]/div/div/div[1]/div[1]/button/span")).click();

        //Selecciona un plan
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[2]/div[3]/div/div/div[3]/div[1]/div[6]/button")).click();
        //Llena el formulario y presiona registrarse
        WebElement username = webDriver.findElement(By.xpath("//*[@id=\"input-109\"]"));
        username.sendKeys("Landlord1");
        WebElement contra = webDriver.findElement(By.xpath("//*[@id=\"input-112\"]"));
        contra.sendKeys("1");
        WebElement nombre = webDriver.findElement(By.xpath("//*[@id=\"input-115\"]"));
        nombre.sendKeys("Andreluis Pool");
        WebElement apellido = webDriver.findElement(By.xpath("//*[@id=\"input-118\"]"));
        apellido.sendKeys("Ingaroca Torres");
        WebElement celular = webDriver.findElement(By.xpath("//*[@id=\"input-121\"]"));
        celular.sendKeys("987654321");
        WebElement dni = webDriver.findElement(By.xpath("//*[@id=\"input-124\"]"));
        dni.sendKeys("73256793");
        WebElement descripcion = webDriver.findElement(By.xpath("//*[@id=\"input-127\"]"));
        descripcion.sendKeys("pruebadescripcion");
        WebElement nacimiento = webDriver.findElement(By.xpath("//*[@id=\"input-130\"]"));
        nacimiento.sendKeys("04122000");
        WebElement departamento = webDriver.findElement(By.xpath("//*[@id=\"input-133\"]"));
        departamento.sendKeys("Lima");
        WebElement provincia = webDriver.findElement(By.xpath("//*[@id=\"input-136\"]"));
        provincia.sendKeys("Lima");
        WebElement distrito = webDriver.findElement(By.xpath("//*[@id=\"input-139\"]"));
        distrito.sendKeys("Lima");
        WebElement direccion = webDriver.findElement(By.xpath("//*[@id=\"input-142\"]"));
        direccion.sendKeys("pruebadireccion");
        WebElement linkfoto = webDriver.findElement(By.xpath("//*[@id=\"input-145\"]"));
        linkfoto.sendKeys("123");
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[2]/div[4]/div/div/div/form/button/span")).click();
    }

    @When("presiona el botón “Validar” donde ingresa su DNI")
    public void presionaElBotónValidarDondeIngresaSuDNI() {
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/button/span")).click();
    }

    @Then("si es correcto el DNI con sus nombres y apellidos, le aparecerá el mensaje de “Perfil Verificado por DNI”")
    public void siEsCorrectoElDNIConSusNombresYApellidosLeApareceráElMensajeDePerfilVerificadoPorDNI() {
        String name = webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/main/div/div/div[1]/p/b")).getText();
        Assertions.assertEquals("Andreluis Pool Ingaroca Torres", name);
    }

    @Given("el arrendatario ha iniciado sesión y se dirige a su perfil")
    public void elArrendatarioHaIniciadoSesiónYSeDirigeASuPerfil() {

        // Carga la pagina
        webDriver.get("https://roomies-upc.web.app/");
        // --Maximiza la ventana
        webDriver.manage().window().maximize();
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/div[2]/span/a[4]/span")).click();

        //Selecciona registrar en la vista de Iniciar Sesión
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/form/div/div/div[4]/a")).click();
        //Acepta los terminos y condiciones
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[2]/div[1]/div/div/div[3]/button/span")).click();
        //Selecciona que es arrendatario
        int segundos1 = 20;
        webDriver.manage().timeouts().implicitlyWait(segundos1, TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[2]/div[2]/div/div/div[1]/div[2]/button/span")).click();

        //Selecciona un plan
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[2]/div[3]/div/div/div[3]/div[1]/div[6]/button/span")).click();

        //Llena el formulario y presiona registrarse
        WebElement username = webDriver.findElement(By.xpath("//*[@id=\"input-109\"]"));
        username.sendKeys("Leaseholder1");
        WebElement contra = webDriver.findElement(By.xpath("//*[@id=\"input-112\"]"));
        contra.sendKeys("1");
        WebElement nombre = webDriver.findElement(By.xpath("//*[@id=\"input-115\"]"));
        nombre.sendKeys("Andreluis Pool");
        WebElement apellido = webDriver.findElement(By.xpath("//*[@id=\"input-118\"]"));
        apellido.sendKeys("Ingaroca Torres");
        WebElement celular = webDriver.findElement(By.xpath("//*[@id=\"input-121\"]"));
        celular.sendKeys("987654321");
        WebElement dni = webDriver.findElement(By.xpath("//*[@id=\"input-124\"]"));
        dni.sendKeys("73256793");
        WebElement descripcion = webDriver.findElement(By.xpath("//*[@id=\"input-127\"]"));
        descripcion.sendKeys("pruebadescripcion");
        WebElement nacimiento = webDriver.findElement(By.xpath("//*[@id=\"input-130\"]"));
        nacimiento.sendKeys("04122000");
        WebElement departamento = webDriver.findElement(By.xpath("//*[@id=\"input-133\"]"));
        departamento.sendKeys("Lima");
        WebElement provincia = webDriver.findElement(By.xpath("//*[@id=\"input-136\"]"));
        provincia.sendKeys("Lima");
        WebElement distrito = webDriver.findElement(By.xpath("//*[@id=\"input-139\"]"));
        distrito.sendKeys("Lima");
        WebElement direccion = webDriver.findElement(By.xpath("//*[@id=\"input-142\"]"));
        direccion.sendKeys("pruebadireccion");
        WebElement linkfoto = webDriver.findElement(By.xpath("//*[@id=\"input-145\"]"));
        linkfoto.sendKeys("123");
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[2]/div[4]/div/div/div/form/button/span")).click();
    }

    @When("presiona el botón “Validar” donde ingresa su DNI el arrendatario")
    public void presionaElBotónValidarDondeIngresaSuDNIElArrendatario() {
        int segundos2 = 20;
        webDriver.manage().timeouts().implicitlyWait(segundos2, TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/button/span")).click();
    }

    @Then("si es correcto el DNI con sus nombres y apellidos, le aparecerá el mensaje de “Perfil Verificado por DNI” al arrendatario")
    public void siEsCorrectoElDNIConSusNombresYApellidosLeApareceráElMensajeDePerfilVerificadoPorDNIAlArrendatario() {

        String name = webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/main/div/div/div[1]/p/b")).getText();
        Assertions.assertEquals("Andreluis Pool Ingaroca Torres", name);
    }
}
