package empresa;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Olá");
		Aluno a = new Aluno();
		a.matricula=1001;
		a.nome="Super Mario";
		a.cpf="111222333";
				
		a.nome="Super Luigi";
		
		Aluno b = new Aluno();
		b.matricula=1002;
		b.nome="Yoshi";
		b.cpf="444555666";
		
		a.info();
		b.info();

	}

}
