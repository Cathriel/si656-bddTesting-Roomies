Feature: Eliminar avisos de alquiler

  Scenario: Usuario ha iniciado sesion
    Given que el usuario inicia sesion
    When seleccione Eliminar anuncio
    Then el anuncio se elimina satisfactoriamente

  Scenario: Usuario no ha iniciado sesion
    Given el usuario no ha inciado sesion
    When se dirige a su perfil para eliminar un anuncio
    Then se le redirige a la seccion Iniciar Sesion