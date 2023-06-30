
public class PruebaMetodos {
	
	public static void main(String[] args) {
		
		Cuenta miCuenta = new Cuenta(99,987);
		
		miCuenta.depositar(300);
		
		miCuenta.depositar(200);
		
		System.out.println(miCuenta.getSaldo());
		
		miCuenta.retirar(100);
		
		//Primera parte
		System.out.println();
		System.out.println(miCuenta.getSaldo());
		
		//Segunda parte
		
		Cuenta otraCuenta = new Cuenta(67,45);
	
		otraCuenta.depositar(1000);
		
		boolean transferencia = otraCuenta.transferir(400, miCuenta);
		
		System.out.println();
		if (transferencia) {
			System.out.println("Transferencia exitosa");
		}else {
			System.out.println("No fue posible");
		}
		
		System.out.println();
		System.out.println(otraCuenta.getSaldo());
		System.out.println(miCuenta.getSaldo());
		
		
		
	
	}

}
