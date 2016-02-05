package calculadora;

import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import calculadora.calculadora;

public class claseCambio {
	calculadora calcu = new calculadora();
	
	
	//Feature: calculadora escenarios normales y Feature: calculadora variando escenarios
	@Given("los parametros '(.+)', y '(.+)'")
	public void mandarParametros(final float uno, final float dos) {
		calcu.asignarValores(uno,dos);
	}
	
	
	// Feature: calculadora outline y Feature: calculadora variando escenarios
	@Given("^parametros (\\d+) y (\\d+)$")
	public void mandarParametrosTabla(final float uno, final float dos)
	{
		calcu.asignarValores(uno,dos);
	}
 
	
	//Feature: calculadora escenarios normales  y Feature: calculadora variando escenarios
	@When("el operador sea '(.+)'")
	public void hacerOperacion(String operador) {
		calcu.asignarOperador(operador);
	}
	
	
	//  Feature: calculadora outline  y Feature: calculadora variando escenarios
	@When("^el operador es \"(.*?)\"$")
	public void hacerOperacionTabla(String operador) {
		calcu.asignarOperador(operador);
	}
 
	
	//Feature: calculadora escenarios normales y Feature: calculadora variando escenarios
	@Then("solucion '(.+)'")
	public void Soluciones(final float resultado) {
		//System.out.println("r = "+calcu.getResultado()+ "resultado = "+resultado);
		assertTrue(calcu.getResultado() == resultado);
	}
	
	
	//Feature: calculadora outline  y Feature: calculadora variando escenarios
	@Then("^el resultado deberia ser (\\d+)$")
	public void SolucionesTabla(final float resultado) {
		//System.out.println("r = "+calcu.getResultado()+ "resultado = "+resultado);
		assert(calcu.getResultado() == resultado);
	}
	
	
	
	
	
}
