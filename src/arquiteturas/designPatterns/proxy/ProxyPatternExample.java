package arquiteturas.designPatterns.proxy;

/**
 * Exemplo de implementação do padrão Proxy. O padrão Proxy é usado para
 * fornecer um substituto ou representante para outro objeto para controlar o
 * acesso a ele.
 */

//Agora vamos criar uma classe de exemplo para demonstrar como usar o padrão Proxy.
public class ProxyPatternExample {
	public static void main(String[] args) {
		// Criando um objeto proxy
		Proxy proxy = new Proxy();

		// Chamando o método request através do proxy
		proxy.request();
	}
}
