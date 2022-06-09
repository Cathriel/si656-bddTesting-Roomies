Feature: Saber las normas de convivencia del arrendador
  Scenario: Usuario visualiza las normas de convivencia
    Given el usuario se encuentra en la seccion Buscar Inmueble
    When selecciona el anuncio del inmueble
    And selecciona la opcion Mostrar normas de convivencia del inmueble
    Then aparecera una ventana con las normas generales del inmueble
  Scenario: Inmueble no posee normas de convivencia
    Given un anuncio no posee normas de convivencia
    When el usuario seleccione ese anuncio y luego la opcion Mostrar Normas de convivencia
    Then se muestra el mensaje Este inmueble no posee normas de convivencia