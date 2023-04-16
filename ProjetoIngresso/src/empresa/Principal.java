package empresa;

public class Principal {

	public static void main(String[] args) {
		Ingresso iv = new IngressoVip("Rock in Marilia",200,100);		
		iv.info();
		
		System.out.println("--------------------");
		
		Ingresso i = new Ingresso("Rock in Campinas",50);
		
		i.info();
	}

}
