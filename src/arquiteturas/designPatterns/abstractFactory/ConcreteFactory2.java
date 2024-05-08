package arquiteturas.designPatterns.abstractFactory;

//Fábrica concreta para criar produtos de outra família específica
class ConcreteFactory2 implements AbstractFactory {
	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB2();
	}
}
