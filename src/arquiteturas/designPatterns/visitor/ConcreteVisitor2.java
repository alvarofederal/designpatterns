package arquiteturas.designPatterns.visitor;

class ConcreteVisitor2 implements Visitor {
	// Método para visitar um ConcreteElementA e realizar uma operação específica.
	@Override
	public void visit(ConcreteElementA element) {
		System.out.println("ConcreteVisitor2: Visiting ConcreteElementA.");
	}

	// Método para visitar um ConcreteElementB e realizar uma operação específica.
	@Override
	public void visit(ConcreteElementB element) {
		System.out.println("ConcreteVisitor2: Visiting ConcreteElementB.");
	}
}
