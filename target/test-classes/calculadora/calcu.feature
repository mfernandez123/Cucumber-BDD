@Run
Feature: calculadora escenarios normales
  Este escenario comprobar� el comportamiento de una calculadora al pasarle algunos par�metros
  
  Scenario: Suma uno
    Given los parametros '1', y '1'
    When el operador sea 'sumar'
    Then solucion '2'
    