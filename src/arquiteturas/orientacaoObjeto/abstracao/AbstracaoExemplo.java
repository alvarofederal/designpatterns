package arquiteturas.orientacaoObjeto.abstracao;

/**
 * Exemplo de abstração em Java. A abstração é o princípio de simplificar e
 * generalizar o comportamento de um objeto, focando apenas nos aspectos mais
 * relevantes para o contexto. Em Java, a abstração é implementada usando
 * classes abstratas e interfaces.
 */

//Classe principal para demonstrar a abstração
public class AbstracaoExemplo {
	public static void main(String[] args) {
		// Criando instâncias das subclasses
		Animal cachorro = new Cachorro();
		Animal gato = new Gato();

		// Chamando o método emitirSom de forma genérica
		// O método específico de cada objeto será chamado devido à implementação da
		// abstração
		cachorro.emitirSom();
		gato.emitirSom();
	}
}
