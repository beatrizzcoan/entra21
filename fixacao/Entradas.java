package atividadePOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Entradas {
	static Gerenciador gerenciador = new Gerenciador();
	
	public static void main(String[] args) {
		
		ArrayList<Produto> lista = gerenciador.listar();
		
		int entrada = 1;
		int posicao;
		String volta = "";
		
		System.out.println();
		System.out.println("===========");
		System.out.println("|produtos|");
		System.out.println("===========");
		System.out.println();
		
		while(entrada < 6 && entrada > 0) {
			gerenciador.menu();
			entrada = new Scanner(System.in).nextInt();
			
			switch(entrada) {
			case 1:
				System.out.println("id" + "nome" + "preco");
				for(int i = 0; i < lista.size(); i++) {
					lista.get(i).mostrar();
				}
				break;
			case 2:
				System.out.println("digite o id do produto:");
				int id = new Scanner(System.in).nextInt();
				
				System.out.println("digite o nome do produto:");
				String nome = new Scanner(System.in).next();
				
				System.out.println("digite o preço do produto:");
				double preco = new Scanner(System.in).nextDouble();
				
				Produto produto = new Produto(id, nome, preco);
				
				volta = gerenciador.inserir(produto);
				gerenciador.volta(volta);
				break;
				
			case 3:
				System.out.println("digite a posição para alterar:");
				posicao = new Scanner(System.in).nextInt();
				
				System.out.println("digite o novo id do produto:");
				int novoid = new Scanner(System.in).nextInt();
				
				System.out.println("digite o novo nome do produto:");
				String novonome = new Scanner(System.in).next();
				
				System.out.println("digite o novo preço do produto:");
				double novopreco = new Scanner(System.in).nextDouble();
				
				Produto newProduto = new Produto(novoid, novonome, novopreco);
				
				volta = gerenciador.alterar(posicao, newProduto);
				gerenciador.volta(volta);
				break;
				
			case 4:
				System.out.println("digite a única posição do produto que quer visualizar: ");
				posicao = new Scanner(System.in).nextInt();
				
				gerenciador.separar(posicao);
				break;
				
			case 5:
				System.out.println("digite a posição do produto para excluir: ");
				posicao = new Scanner(System.in).nextInt();
				
				volta = gerenciador.excluir(posicao);
				gerenciador.volta(volta);
				break;
				
			}
		}
		
	}
}
