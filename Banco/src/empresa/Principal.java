package empresa;

public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta(111,"Mario",2000,500);
		
		c1.info();
		
		if(!c1.sacar(2000)) {
			System.out.println("Falha ao sacar!");
		}
		 
		if(!c1.depositar(-500)) {
			System.out.println("Falha ao depositar!");
			
		}
		System.out.println();
		c1.info();

	}

}
