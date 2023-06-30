
public class PruebaConstructor {

	public static void main(String[] args) {
		Cuenta nuevaCuenta = new Cuenta(10,6);
		Cuenta nuevaCuenta2 = new Cuenta(21,8);
		Cuenta nuevaCuenta3 = new Cuenta(32,9);
		
		//nuevaCuenta.setAgencia(-10);
		
		System.out.println(nuevaCuenta.getAgencia());
		
		System.out.println(Cuenta.setTotal());
		
	}
}
