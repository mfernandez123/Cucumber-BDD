package calculadora;

public class calculadora {
	
	private float numeroUno, numeroDos, resultado;
	private String operador;
	
	public calculadora ()
	{
		
	}
	
	public void asignarValores(float uno, float dos)
	{
		numeroUno = uno;
		numeroDos = dos;
	}
	
	public void asignarOperador(String oper)
	{
		operador = oper;
		if (operador.equals("sumar"))
		{
			this.sumar(numeroUno, numeroDos);
		}
		else if (operador.equals("restar"))
		{
			this.restar(numeroUno, numeroDos);
		}
		else if (operador.equals("multiplicar"))
		{
			this.multiplicar(numeroUno, numeroDos);
		}
		else if (operador.equals("dividir"))
		{
			this.dividir(numeroUno, numeroDos);
		}
		
	}
	
	public calculadora (float uno, float dos, String oper)
	{
		numeroUno = uno;
		numeroDos = dos;
		operador = oper;
	}
	
	public void sumar (float uno, float dos)
	{
		resultado =  uno + dos;
	}
	
	public void restar (float uno, float dos)
	{
		resultado =  uno - dos;
	}
	
	public void multiplicar (float uno, float dos)
	{
		resultado = uno * dos;
	}
	
	public void dividir (float uno, float dos)
	{
		resultado =  uno / dos;
	}

	public float getNumeroUno() {
		return numeroUno;
	}

	public void setNumeroUno(float numeroUno) {
		this.numeroUno = numeroUno;
	}

	public float getNumeroDos() {
		return numeroDos;
	}

	public void setNumeroDos(float numeroDos) {
		this.numeroDos = numeroDos;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public float getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}

}
