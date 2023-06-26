
public class test_saldo {

	public static void main(String[] args) {
		saldo miCuenta = new saldo();
        miCuenta.saldo = 500.0;
        saldo otraCuenta = miCuenta;
        otraCuenta.saldo += 1000.0;

        System.out.println(miCuenta.saldo);
