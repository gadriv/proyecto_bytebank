
public class PruebaMetodos {
	
	public static void main(String[] args) {
		
		cuenta miCuenta = new cuenta();
		
		miCuenta.saldo = 300;
		
		miCuenta.depositar(200);
		
		System.out.println(miCuenta.saldo);
		
		miCuenta.retirar(100);
		
		//Primera parte
		System.out.println();
		System.out.println(miCuenta.saldo);
		
		//Segunda parte
		
		cuenta otraCuenta = new cuenta();
	
		otraCuenta.saldo = 1000;
		
		boolean transferencia = otraCuenta.transferir(400, miCuenta);
		
		System.out.println();
		if (transferencia) {
			System.out.println("Transferencia exitosa");
		}else {
			System.out.println("No fue posible");
		}
		
		System.out.println();
		System.out.println(otraCuenta.saldo);
		System.out.println(miCuenta.saldo);
		
		
		
	
	}

}
