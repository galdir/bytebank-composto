
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaVanessa=new Conta();
		
		System.out.println(contaDaVanessa.saldo);
		
		contaDaVanessa.titular=new Cliente();
				
		System.out.println(contaDaVanessa.titular);
		//contaDaVanessa.titular.nome="Vanessa";
		
		System.out.println(contaDaVanessa.titular.nome);
		
	}
}
