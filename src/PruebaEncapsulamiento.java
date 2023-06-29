
public class PruebaEncapsulamiento {
	
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta();
		
		Cliente cliente = new Cliente();
		
		cliente.setNombre("Gustavo Rivera");
		cliente.setDocumento("klshdk12121");
		cliente.setTelefono("70219255");
		
		cuenta.setTitular(cliente); 
		
		System.out.println(cliente.getNombre());
		System.out.println(cliente.getDocumento());
		System.out.println(cliente.getTelefono());
		
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());//ACCEDIENDO DESDE EL METODO CUENTA
	}

}
