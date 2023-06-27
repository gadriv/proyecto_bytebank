
public class testReferecia2 {

	public static void main(String[] args) {
		
		//Creamos una Objeto para un nuevo cliente
		Cliente nuevoCliente = new Cliente();
		
		nuevoCliente.nombre = "Gustavo";
		nuevoCliente.documento = "123456789";
		nuevoCliente.telefono = "1234598633";
		
		//Creamos un objeto para una nueva cuenta.
		
		Cuenta nuevaCuenta = new Cuenta();
		
		nuevaCuenta.titular = nuevoCliente; //AQUI SE ESTABLECE LA REFERENCIA ENTRE EL BJETO CLIENTE Y EL OBJETO CUENTA
		
		System.out.println(nuevaCuenta.titular.nombre);
		System.out.println(nuevaCuenta.titular.documento);
		System.out.println(nuevaCuenta.titular.telefono);

	}
}
