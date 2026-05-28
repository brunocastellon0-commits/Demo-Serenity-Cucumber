package com.swag.pe.steps.validation;

import com.swag.pe.pages.validations.ValidationPage;
import net.serenitybdd.annotations.Step;
import java.time.Duration; // Importamos la librería para manejar el tiempo

public class ValidationStep extends ValidationPage {
    
    @Step("Validar visualizacion del modulo de productos")
    public Boolean titleIsVisible() {
        // Le damos 10 segundos de paciencia al robot para que el elemento aparezca
        return lbl_product.withTimeoutOf(Duration.ofSeconds(10)).waitUntilVisible().isDisplayed();
    }
    
    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplayed(){
        return lbl_errorMessage.isDisplayed();
    }
}