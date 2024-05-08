package arquiteturas.designPatterns.templateMethod;

class ConcreteClassB extends AbstractClass {
	@Override
	protected void specificOperation() {
		System.out.println("ConcreteClassB: Performing specific operation.");
	}
}
