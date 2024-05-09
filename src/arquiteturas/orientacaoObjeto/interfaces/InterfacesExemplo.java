package arquiteturas.orientacaoObjeto.interfaces;

/**
 * Exemplo de interfaces em Java. Uma interface é uma coleção de métodos
 * abstratos que definem um comportamento comum. Uma classe pode implementar uma
 * ou várias interfaces. Em Java, as interfaces são implementadas usando a
 * palavra-chave implements.
 */

//Classe principal para demonstrar o uso de interfaces
public class InterfacesExemplo {
	public static void main(String[] args) {
		// Criando uma instância da classe Cachorro
		Cachorro cachorro = new Cachorro();

		// Chamando métodos das interfaces implementadas
		cachorro.emitirSom();
		cachorro.locomover();
	}
}
