package arquiteturas.designPatterns.abstractFactory;

//Produto A concreto para a primeira família
class ConcreteProductA1 implements AbstractProductA {
	@Override
	public void operationA() {
		System.out.println("Produto A1 está realizando a operação A.");
	}
}
