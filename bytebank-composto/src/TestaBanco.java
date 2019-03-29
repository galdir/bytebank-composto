
public class TestaBanco {
	public static void main(String[] args) {
		Cliente cliente1=new Cliente();//declara variavel de referencia ao objeto novo
		cliente1.nome="Galdir";
		cliente1.cpf="222.222.222-22";
		cliente1.profissao="programador";
		
		System.out.println("Nome do cliente="+cliente1.nome);
		
		Conta contaDoGaldir=new Conta();
		contaDoGaldir.deposita(10);
		contaDoGaldir.titular=cliente1;
		
		System.out.println("Titular da conta="+contaDoGaldir.titular.nome);
		System.out.println(contaDoGaldir.titular);
		
	}

	
}
