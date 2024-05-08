package arquiteturas.designPatterns.abstractFactory;

//Produto B concreto para a segunda família
class ConcreteProductB2 implements AbstractProductB {
	@Override
	public void operationB() {
		System.out.println("Produto B2 está realizando a operação B.");
	}
}
