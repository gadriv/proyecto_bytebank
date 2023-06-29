
public class testReferecia2 {

	public static void main(String[] args) {
		
		//Creamos una Objeto para un nuevo cliente
		Cliente nuevoCliente = new Cliente();
		
		nuevoCliente.setNombre("Gustavo");
		nuevoCliente.setDocumento("123456789");
		nuevoCliente.setTelefono("1234598633");
		
		//Creamos un objeto para una nueva cuenta.
		
		Cuenta nuevaCuenta = new Cuenta();
		
		//nuevaCuenta.titular = nuevoCliente; //AQUI SE ESTABLECE LA REFERENCIA ENTRE EL BJETO CLIENTE Y EL OBJETO CUENTA
		
		
		nuevaCuenta.setTitular(nuevoCliente);
		
		System.out.println(nuevaCuenta.getTitular().getNombre());
		System.out.println(nuevaCuenta.getTitular().getDocumento());
		System.out.println(nuevaCuenta.getTitular().getTelefono());

	}
}
