package arquiteturas.designPatterns.brigde;

//Abstração refinada
class RefinedAbstraction extends Abstraction {
	public RefinedAbstraction(Implementor implementor) {
		super(implementor);
	}

	@Override
	public void operation() {
		System.out.println("Abstração refinada executada.");
		implementor.operationImpl();
	}
}
