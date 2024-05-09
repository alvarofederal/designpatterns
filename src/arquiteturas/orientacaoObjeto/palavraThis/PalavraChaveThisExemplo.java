package arquiteturas.orientacaoObjeto.palavraThis;

/**
 * Exemplo do uso da palavra-chave "this" em Java. "this" é uma referência
 * implícita ao objeto atual dentro de uma classe. É usado para referenciar os
 * campos e métodos da classe atual.
 */

public class PalavraChaveThisExemplo {
	private int numero;

	// Construtor que recebe um parâmetro
	public PalavraChaveThisExemplo(int numero) {
		// Usando "this" para diferenciar o parâmetro do campo da classe
		this.numero = numero;
	}

	// Método para exibir o valor do campo "numero"
	public void exibirNumero() {
		// Usando "this" para acessar o campo da classe atual
		System.out.println("Número: " + this.numero);
	}

	// Método para atualizar o valor do campo "numero"
	public void atualizarNumero(int novoNumero) {
		// Usando "this" para diferenciar o parâmetro do campo da classe
		this.numero = novoNumero;
	}

	public static void main(String[] args) {
		// Criando uma instância da classe
		PalavraChaveThisExemplo exemplo = new PalavraChaveThisExemplo(42);

		// Chamando métodos da instância criada
		exemplo.exibirNumero();
		exemplo.atualizarNumero(99);
		exemplo.exibirNumero();
	}
}
