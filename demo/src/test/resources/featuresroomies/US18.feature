Feature: Filtrar inmuebles
  Scenario: Arrendatario filtra los inmuebles
    Given el usuario quiere usar los filtros al momento de hacer su busqueda
    When empieza a llenar el formulario de filtros
    Then los resultados de la busqueda comienzan a reducirse