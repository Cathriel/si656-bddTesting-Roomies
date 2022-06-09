Feature: Publicar avisos de alquiler

  Scenario: Usuario esta afiliado a un plan
    Given el usuario ha iniciado sesión y se encuentra afiliado a un plan
    When Seleccione Publicar anuncio
    Then se muestra la pagina para crear el anuncio de vivienda a alquilar

  Scenario: Usuario no esta afiliado a un plan
    Given el usuario no ha iniciado sesión
    When Seleccione Publicar anuncio
    Then se le redirige a la vista de iniciar sesión