package arquiteturas.designPatterns.factoryMethod;

//Agora vamos criar subclasses de Creator, cada uma implementando o Factory Method para criar um tipo específico de Product.
class ConcreteCreatorA extends Creator {
	@Override
	Product factoryMethod() {
		return new ConcreteProductA();
	}
}
