package empresa;

import java.util.Scanner;

public class Opcoes {
	
	private Scanner sr;
	private Cofre cofrinho;
	
	public Opcoes() {
		sr = new Scanner(System.in);
		cofrinho = new Cofre();
	}
	
	public void showOpcoes() {
		System.out.println("Cofrinho");
		System.out.println("1) Adicionar moedas: ");
		System.out.println("2) Remover moedas: ");
		System.out.println("3) Lista moedas: ");
		System.out.println("4) Calcular valor em real: ");
		System.out.println("0) Sair");
		
		String opcaoSelecionada = sr.next();
		
		switch (opcaoSelecionada) {
		case "0":
			System.out.println("Cofre trancado!");
		     break;
		     
		case "1":
			showAdcMoedas();
			showOpcoes();
			break;
			
		case "2":
			showRmvMoedas();
			showOpcoes();
			break;
			
		case "3":
			cofrinho.listagemMoedas();
			showOpcoes();
			break;
			
		case "4":
			double valorConvertido = cofrinho.totalConvertido();
			System.out.println("Valor convertido para real: " +valorConvertido);
			showOpcoes();
			
			
		default:
			System.out.println("Essa opcao não existe!");
			showOpcoes();
			break;
			
		}
	}
	
    private void showAdcMoedas() {
    	System.out.println("Escolha a moeda:");    
		System.out.println("1) Real");    
		System.out.println("2) Dolar");    
		System.out.println("3) Euro");
		
		int opcaoMoeda = sr.nextInt();
		
		System.out.println("Digite o valor: ");
		String valorMoedaTexto = sr.next();
		
		valorMoedaTexto = valorMoedaTexto.replace(",", ".");
		double valorMoeda = Double.parseDouble(valorMoedaTexto);
					
		Moeda moeda = null;
		
		if (opcaoMoeda == 1){
			moeda = new Real(valorMoeda);
		} else if (opcaoMoeda == 2) {	
			moeda = new Dolar(valorMoeda);
		} else if (opcaoMoeda == 3) {	
			moeda = new Euro(valorMoeda);				
		} else {
			System.out.println("Escolha uma das opcoes informadas!");
			showOpcoes();
		}
		
		cofrinho.adicionar(moeda);
		System.out.println("Moeda adicionada");
		
		
    }
    private void showRmvMoedas() {
    	System.out.println("Escolha a moeda:");    
		System.out.println("1) Real");    
		System.out.println("2) Dolar");    
		System.out.println("3) Euro");
		
		int opcaoMoeda = sr.nextInt();
		
		System.out.println("Digite o valor: ");
		String valorMoedaTexto = sr.next();
		
		valorMoedaTexto = valorMoedaTexto.replace(",", ".");
		double valorMoeda = Double.parseDouble(valorMoedaTexto);
					
		Moeda moeda = null;
		
		if (opcaoMoeda == 1){
			moeda = new Real(valorMoeda);
		} else if (opcaoMoeda == 2) {	
			moeda = new Dolar(valorMoeda);
		} else if (opcaoMoeda == 3) {	
			moeda = new Euro(valorMoeda);				
		} else {
			System.out.println("Escolha uma das opcoes informadas!");
			showOpcoes();
		}
		
		cofrinho.remover(moeda);
		System.out.println("Moeda removida");
		
		
    }  
}
