//Entidad cuenta

class Cuenta{
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	
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
	
}