package arquiteturas.designPatterns.abstractFactory;

//Fábrica concreta para criar produtos de uma família específica
class ConcreteFactory1 implements AbstractFactory {
	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB1();
	}
}
