package aula_1;

public class Cachorro {
	public String nome;
	public String raca;
	public int idade;
	
	public void latir() {
		System.out.println("O Cachorro: " + nome + " Latiu");
	}
	
	public void GetCachorro() {
		System.out.println("Dados do Cachorro"
			+ "Nome: " + nome
			+ "\nRaça: " + raca
			+ "\nIdade: " + idade
		);
	}
}
