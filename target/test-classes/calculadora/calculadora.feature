#@Run
#Feature: calculadora variando escenarios
#  Este escenario comprobará el comportamiento de una calculadora al pasarle algunos parámetros
#  
#  Scenario: Suma uno
#    Given los parametros '7', y '14'
#    When el operador sea 'sumar'
#    Then solucion '21'
#    
#  Scenario: Suma dos
#    Given los parametros '9', y '3'
#    When el operador sea 'sumar'
#    Then solucion '12'
#      
#  Scenario: Resta uno
#    Given los parametros '7', y '14'
#    When el operador sea 'restar'
#    Then solucion '-7'
#
#  Scenario: Resta dos
#    Given los parametros '9', y '3'
#    When el operador sea 'restar'
#    Then solucion '6'
#    
#  Scenario: Multiplicacion 
#    Given los parametros '9', y '3'
#    When el operador sea 'multiplicar'
#    Then solucion '27'
#    
#  Scenario: Division 
#    Given los parametros '9', y '3'
#    When el operador sea 'dividir'
#    Then solucion '3'
#
#
#  Scenario Outline: tablas
#    Given parametros <uno> y <dos>
#    When el operador es <operando>
#    Then el resultado deberia ser <resultado> 
#
#  Examples:
#    | uno   | dos | operando   | resultado |
#    |  12   |  5  |  "sumar"   | 17 | 
#    |  20   |  5  |  "restar"  | 15 |
#    |  35   |  7  |  "dividir" | 5  |
#    |  4    |  2  |  "multiplicar" | 8 |
  