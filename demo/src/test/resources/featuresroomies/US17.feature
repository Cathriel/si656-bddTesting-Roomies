Feature: Calificar inmueble
  Scenario: Arrendatario califica el inmueble de forma correcta
    Given el usuario desea calificar los inmuebles y se encuentra en el post de este
    When da click en dejar review
    And selecciona la cantidad de estrellas
    Then la review con la calificacion con estrellas es dejada