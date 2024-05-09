package arquiteturas.orientacaoObjeto.polimorfismo;

/**
 * Exemplo de polimorfismo em Java. O polimorfismo é o princípio que permite que
 * objetos de diferentes classes sejam tratados de forma uniforme, permitindo
 * que métodos sejam chamados de maneira genérica. Em Java, o polimorfismo é
 * implementado através de sobrescrita de métodos (métodos com a mesma
 * assinatura em classes diferentes) e ligação dinâmica (dynamic binding).
 */

//Classe principal para demonstrar o polimorfismo
public class PolimorfismoExemplo {
	public static void main(String[] args) {
		// Criando instâncias das subclasses
		Animal cachorro = new Cachorro();
		Animal gato = new Gato();

		// Chamando o método emitirSom de forma genérica
		// O método específico de cada objeto será chamado devido ao polimorfismo
		cachorro.emitirSom();
		gato.emitirSom();
	}
}
