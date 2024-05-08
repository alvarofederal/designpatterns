package arquiteturas.designPatterns.abstractFactory;

//Produto A concreto para a segunda família
class ConcreteProductA2 implements AbstractProductA {
	@Override
	public void operationA() {
		System.out.println("Produto A2 está realizando a operação A.");
	}
}
