class Conta{
	double saldo;
	int agencia=42;
	int numero;
	Cliente titular;
		
	void deposita(double valor) { //definindo metodo
		this.saldo+=valor;
	}
	
	boolean saca(double valor){
		if(this.saldo>=valor) {
				this.saldo-=valor;
				return true;
		}else {
			return false;
		}
	}
	
	boolean transfere(Conta contaDestino,double valor) {
		
		if(this.saldo>=valor){
			this.saldo-=valor;
			contaDestino.deposita(valor);
			return true;
		} else {
			return false;
		}
		
		
	}
		
	

}
	