package arquiteturas.designPatterns.singleton;

/**
 * Exemplo de implementação do padrão Singleton.
 * O padrão Singleton é usado para garantir que uma classe tenha apenas uma instância
 * e fornece um ponto de acesso global a essa instância.
 */

public class SingletonExample {
	public static void main(String[] args) {
		// Obter a instância do Singleton
		Singleton singleton = Singleton.getInstance();

		// Chamar um método da instância
		singleton.doSomething();
	}
}

//Nesta implementação, a classe Singleton possui um construtor privado para evitar a instanciação direta da classe fora dela mesma. 
//O método estático getInstance() é responsável por fornecer a única instância da classe, criando-a apenas se ainda não foi criada. 
//O método doSomething() é apenas um exemplo de um método da instância do Singleton.

//Este exemplo cria uma instância do Singleton e chama um método da instância. 
//O Singleton garante que, independentemente de quantas vezes você chame getInstance(), 
//apenas uma instância da classe será criada e retornada.