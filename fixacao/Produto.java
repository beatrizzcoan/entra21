package atividadePOO;

public class Produto {
	
	int id;
	String nome;
	double preco;
	
	public Produto() {
		
	}
	
	public Produto(int id, String nome,double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	public void mostrar() {
		System.out.println(" | " + id + "    |" + nome + "RS" + preco);
	}
}
