package entities;

public class Pensao {
	
	private String nome;
	private String email;
	private int quartoEscolhido;
	
	public Pensao(String n, String e, int qe) {
		this.nome = n;
		this.email = e;
		this.quartoEscolhido = qe;
	}
	
	public void relatorioOcupacao() {
		System.out.println(quartoEscolhido + ": " + nome + ", " + email);
	}
	
}
