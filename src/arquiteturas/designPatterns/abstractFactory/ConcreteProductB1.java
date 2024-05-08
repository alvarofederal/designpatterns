package arquiteturas.designPatterns.abstractFactory;

//Produto B concreto para a primeira família
class ConcreteProductB1 implements AbstractProductB {
	@Override
	public void operationB() {
		System.out.println("Produto B1 está realizando a operação B.");
	}
}
