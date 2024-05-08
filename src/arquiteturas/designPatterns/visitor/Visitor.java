package arquiteturas.designPatterns.visitor;

//Vamos criar uma interface Visitor que define as operações que podem ser realizadas em elementos.
interface Visitor {
	void visit(ConcreteElementA element); // Método para visitar um ConcreteElementA.

	void visit(ConcreteElementB element); // Método para visitar um ConcreteElementB.
}
