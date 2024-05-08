package arquiteturas.designPatterns.factoryMethod;

class ConcreteCreatorB extends Creator {
	@Override
	Product factoryMethod() {
		return new ConcreteProductB();
	}
}
