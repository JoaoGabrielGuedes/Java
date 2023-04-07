package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Avaliacao luigi = new Avaliacao();
		Avaliacao mario = new Avaliacao(7,4,10);
		luigi.n1 = 8;
		luigi.n2 = 3;
		luigi.n3 = 7.5;
		
		
		
		System.out.println("A média aritmetica do Mario é: " +mario.mediaAritmetica());
		System.out.println("A média ponderada do Mario é: " +mario.mediaPonderada());
		
		System.out.println("A média aritmetica do Luigi é: " +luigi.mediaAritmetica());
		System.out.println("A média ponderada do Luigi é: " +luigi.mediaPonderada());
		

	}

}
