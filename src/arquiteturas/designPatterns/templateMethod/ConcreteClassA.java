package arquiteturas.designPatterns.templateMethod;

//Vamos criar algumas subclasses que estendem a classe abstrata e implementam o método específico.
class ConcreteClassA extends AbstractClass {
	@Override
	protected void specificOperation() {
		System.out.println("ConcreteClassA: Performing specific operation.");
	}
}
