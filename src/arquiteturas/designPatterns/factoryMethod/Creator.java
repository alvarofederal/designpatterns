package arquiteturas.designPatterns.factoryMethod;

//Agora vamos definir a classe Creator, que contém o Factory Method para criar objetos Product.
abstract class Creator {
	// O Factory Method que será implementado pelas subclasses para criar objetos
	// Product.
	abstract Product factoryMethod();

	// Outros métodos da classe Creator podem utilizar o Factory Method para criar
	// produtos.
	public void anOperation() {
		Product product = factoryMethod();
		product.doSomething();
	}
}
