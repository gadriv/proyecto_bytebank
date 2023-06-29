//Entidad cuenta

class Cuenta{
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	
	//METODO PARA DEPORSITAR
	// Este metodo no retorna valor para este ejemplo
	
	public void depositar (double valor){ 
	
		this.saldo = this.saldo + valor;
	}
	
	//METODO PARA RETIRAR
	//Este metodo retorna valor
	
	public boolean retirar (double valor){
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			
			//tambien se pude colocar asi> this.saldo-=valor;
			return true;
		}else {
			return false;
		}
	}
	
	
	//METODO PARA TRANSFERIR 
	
	public boolean transferir (double valor, Cuenta cuentaTranferir) {
		
		if (this.saldo>=valor) {
			this.saldo-=valor;
			cuentaTranferir.depositar(valor);
			return true;
			
		}return false;
		
	}
	
	//METODOS GETTER AND SETTER PARA ASIGNAR VALORES A LAS VARIABLE PRIVADAS
	
	
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente NuevoTitular) {
		
		this.titular = NuevoTitular;
		
	}
		
	
	public int getAgencia() {
		return this.agencia;
	}
	

	public void setAgencia(int agencia) {
		if(agencia > 0) {
			this.agencia = agencia;
		}else {
			System.out.println("No se pueden introducir valores negativos.");
		}
	}
	

	
}

	 