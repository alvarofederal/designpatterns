package arquiteturas.designPatterns.factoryMethod;

//Agora vamos criar algumas classes concretas que implementam a interface Product.
class ConcreteProductA implements Product {
	@Override
	public void doSomething() {
		System.out.println("ConcreteProductA is doing something.");
	}
}
