package empresa;

import java.util.ArrayList;

public class Cofre {
	
	private ArrayList<Moeda> listaMoedas;
	
	public Cofre() {
		this.listaMoedas = new ArrayList<>();
	}
	
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		this.listaMoedas.remove(moeda);
	}
	
	public void listagemMoedas() {
		
		if (this.listaMoedas.isEmpty()) {
		    System.out.println("Nao existem moedas no cofre");
		    return;
	}
		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
	}

	public double totalConvertido() {
		
		if (this.listaMoedas.isEmpty()) {
			return 0;
		}
		
		double valorAcumulado = 0;
		
		for (Moeda moeda : this.listaMoedas) {
			valorAcumulado = valorAcumulado + moeda.converter();
		}
		
		return valorAcumulado;
	}	

}
