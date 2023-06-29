
public class TestReferenciaNull {

	public static void main(String[] args) {
		
		Cuenta nuevaCuenta = new Cuenta();
		
		Cliente nuevoCliente = new Cliente();// Este referencia se agrego despues para validar que el resultado NULL
		nuevaCuenta.setTitular(nuevoCliente);

		//Aqui se esta asignando un paramentro a un objeto que no esta referenciados o instanciado/
		// nuevaCuenta.titular.nombre = "Gustavo"; 
		
		
		System.out.println(nuevaCuenta.getTitular());//Este valor es el que tiene por defecto este parametro en el objeto Cuenta.
		System.out.println(nuevaCuenta.getTitular().getNombre()); //Se imprime NULL por que no tiene asignaci[on.
	}
}
