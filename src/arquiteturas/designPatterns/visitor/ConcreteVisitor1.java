package arquiteturas.designPatterns.visitor;

//Vamos criar algumas classes concretas que implementam a interface Visitor.
class ConcreteVisitor1 implements Visitor {
	// Método para visitar um ConcreteElementA e realizar uma operação específica.
	@Override
	public void visit(ConcreteElementA element) {
		element.operationA();
	}

	// Método para visitar um ConcreteElementB e realizar uma operação específica.
	@Override
	public void visit(ConcreteElementB element) {
		element.operationB();
	}
}
