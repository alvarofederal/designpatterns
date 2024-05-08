package arquiteturas.designPatterns.visitor;

class ConcreteElementB {
	// Método que aceita um visitor e invoca o método visit apropriado.
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	// Método específico de ConcreteElementB.
	public void operationB() {
		System.out.println("ConcreteElementB: Performing operation B.");
	}
}
