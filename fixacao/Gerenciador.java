package atividadePOO;

import java.util.ArrayList;

public class Gerenciador {
	
	ArrayList<Produto> lista = new ArrayList<Produto>();
	
	public String inserir(Produto produto) {
		
		try {
			lista.add(produto);
			return "produto adicionado na lista";
		}catch(Exception erro) {
			return "erro ao adicionar produto na lista";
		}
	}
	
	public String alterar(int posicao, Produto produto) {
		
		try {
			lista.set(posicao, produto);
			return "produto alterado";
		}catch(Exception erro) {
			return "erro ao alterar produto";
		}
		
	}
	
	public void separar(int posicao) {
		Produto pSelecionado = lista.get(posicao);
		System.out.println("ID: " + pSelecionado.id);
		System.out.println("nome: " + pSelecionado.nome);
		System.out.println("preço: " + pSelecionado.preco);
		System.out.println();
	}
	
     public String excluir(int posicao) {
		
		try {
			lista.remove(posicao);
			return "produto excluido";
		}catch(Exception erro) {
			return "erro ao excluir produto";
		}
		
	} 
    
    public void fechar() {
    	System.out.println("===========");
    	System.out.println("fim do programa");
    	System.out.println("===========");
    	
    }
    
    public void menu() {
    	System.out.println("opções:");
    	System.out.println("===========");
    	System.out.println("1- mostrar lista");
    	System.out.println("2- inserir produto");
    	System.out.println("3- alterar produto");
    	System.out.println("4- listar produto");
    	System.out.println("5- excluir produto");
    	System.out.println("6- sair");
    	System.out.println("===========");
    }
    
    public void volta(String volta) {
    	System.out.println(volta);
    	System.out.println("===========");
    	System.out.println();
    }
    
    public ArrayList<Produto> listar() {
    	return lista;
    }

}
