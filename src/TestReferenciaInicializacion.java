
public class TestReferenciaInicializacion {
	
	public static void main(String[] args) {
		
		Cuenta nuevaCuenta = new Cuenta(3,4);
		
		Cliente nuevoCliente = new Cliente();
		
		//Se crea dentro de titular una referencia a un nuevo objeto que solo puede ser accedido desde nuevaCuenta.titular
		//Esto tambien se puede hacer desde la entidad o metodo cuenta, inicializando el atributo "Cliente".
		
		//nuevaCuenta.titular = new Cliente(); 
		
		nuevaCuenta.setTitular(nuevoCliente);
		
		//nuevaCuenta.titular.nombre = "Gustavo";
		
	//	System.out.println(nuevaCuenta.titular.nombre); //Se imprime un error porque no esta instanciado.
		
		System.out.println(nuevaCuenta.getTitular());
		System.out.println(nuevoCliente);
	
	}
}
