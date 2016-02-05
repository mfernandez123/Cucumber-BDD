$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("calculadora/calculadoraSimple.feature");
formatter.feature({
  "line": 2,
  "name": "calculadora escenarios normales",
  "description": "Este escenario comprobar� el comportamiento de una calculadora al pasarle dos enteros y una operaci�n",
  "id": "calculadora-escenarios-normales",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Run"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Suma",
  "description": "",
  "id": "calculadora-escenarios-normales;suma",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "los parametros \u00271\u0027, y \u00271\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "el operador sea \u0027sumar\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "solucion \u00272\u0027",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 16
    },
    {
      "val": "1",
      "offset": 23
    }
  ],
  "location": "claseCambio.mandarParametros(float,float)"
});
formatter.result({
  "duration": 123706317,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sumar",
      "offset": 17
    }
  ],
  "location": "claseCambio.hacerOperacion(String)"
});
formatter.result({
  "duration": 904434,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 10
    }
  ],
  "location": "claseCambio.Soluciones(float)"
});
formatter.result({
  "duration": 2033438,
  "status": "passed"
});
});