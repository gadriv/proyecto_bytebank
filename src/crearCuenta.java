
public class crearCuenta {
	public static void main(String[] args) {
		cuenta primeraCuenta = new cuenta();
		primeraCuenta.saldo = 1000;
		
		System.out.println(primeraCuenta.saldo);
		
		cuenta segundaCuenta = new cuenta();
		segundaCuenta.saldo = 500;
		
		System.out.println(segundaCuenta.saldo);
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
	}
}
