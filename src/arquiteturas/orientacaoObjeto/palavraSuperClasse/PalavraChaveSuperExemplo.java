package arquiteturas.orientacaoObjeto.palavraSuperClasse;

/**
 * Exemplo do uso da palavra-chave "super" em Java. "super" é uma referência
 * implícita à superclasse atual dentro de uma classe. É usado para chamar
 * métodos da superclasse e acessar os campos da superclasse.
 */

//Classe principal para demonstrar o uso da palavra-chave "super"
public class PalavraChaveSuperExemplo {
	public static void main(String[] args) {
		// Criando uma instância da subclasse Cachorro
		Cachorro cachorro = new Cachorro("Mamífero", "Labrador");

		// Chamando método da subclasse
		cachorro.emitirSom();
	}
}
