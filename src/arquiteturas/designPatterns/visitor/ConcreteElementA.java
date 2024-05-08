package arquiteturas.designPatterns.visitor;

//Vamos criar algumas classes concretas que implementam a interface Element.
class ConcreteElementA {
	// Método que aceita um visitor e invoca o método visit apropriado.
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	// Método específico de ConcreteElementA.
	public void operationA() {
		System.out.println("ConcreteElementA: Performing operation A.");
	}
}
