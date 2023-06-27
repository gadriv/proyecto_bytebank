
public class TestReferenciaInicializacion {
	public static void main(String[] args) {
		
		Cuenta nuevaCuenta = new Cuenta();
		
		//Se crea dentro de titular una referencia a un nuevo objeto que solo puede ser accedido dede nuevaCuenta.titular
		//Esto tambien se puede hacer desde la entidad o metodo cuenta, inicializando el atributo "Cliente".
		nuevaCuenta.titular = new Cliente(); 
		
		nuevaCuenta.titular.nombre = "Gustavo";
		
		System.out.println(nuevaCuenta.titular.nombre); //Se imprime un error porque no esta instanciado.
	}
}
