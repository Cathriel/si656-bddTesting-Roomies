Feature: Visualizar arrendatarios cercanos
  Scenario: Usuario busca roommates de cuartos cercanos
    Given El usuario inicia sesion y luego completa los tests de personalidad y activa su ubicacion
    When selecciona la seccion de Buscar Roommate y selecciona la opcion mas cercanos
    Then se muestra una lista de los posibles compañeros de convivencia cercanos
  Scenario: Usuario contacta a algún compañero de cuarto
    Given El usuario esta en la seccion de Buscar Roommate
    When selecciona a uno de ellos y la opcoion Contactar
    Then se abre una ventana para enviar un mensaje al usuario