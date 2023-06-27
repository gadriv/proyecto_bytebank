
public class Ejercicio_Clase4 {

		public static void main(String[] args) {
			
			Cuenta1 CuentaDeMarcela = new Cuenta1();
			
			CuentaDeMarcela.titular = new Cliente1();
			
			CuentaDeMarcela.titular.nombre = "Marcela";
			
			System.out.println(CuentaDeMarcela.titular.nombre);
		}
		
}
