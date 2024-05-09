package arquiteturas.orientacaoObjeto.construtores;

/**
 * Exemplo de construtores em Java. Um construtor é um método especial usado
 * para inicializar objetos de uma classe. É invocado automaticamente quando um
 * objeto é criado. Pode ser usado para inicializar campos e realizar outras
 * operações de inicialização.
 */

public class ConstrutoresExemplo {
	private int numero;
	private String texto;

	// Construtor padrão (sem parâmetros)
	public ConstrutoresExemplo() {
		this.numero = 0;
		this.texto = "Exemplo";
	}

	// Construtor personalizado (com parâmetros)
	public ConstrutoresExemplo(int numero, String texto) {
		this.numero = numero;
		this.texto = texto;
	}

	// Método para exibir informações do objeto
	public void exibirInformacoes() {
		System.out.println("Número: " + numero);
		System.out.println("Texto: " + texto);
	}

	public static void main(String[] args) {
		// Criando instâncias usando diferentes construtores
		ConstrutoresExemplo objeto1 = new ConstrutoresExemplo();
		ConstrutoresExemplo objeto2 = new ConstrutoresExemplo(42, "Hello, World!");

		// Exibindo informações dos objetos
		System.out.println("Objeto 1:");
		objeto1.exibirInformacoes();

		System.out.println("\nObjeto 2:");
		objeto2.exibirInformacoes();
	}
}
