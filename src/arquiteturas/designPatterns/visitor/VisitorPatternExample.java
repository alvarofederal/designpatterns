package arquiteturas.designPatterns.visitor;

/**
 * Exemplo de implementação do padrão Visitor. O padrão Visitor é usado para
 * separar algoritmos de objetos estruturados, permitindo adicionar novas
 * operações aos objetos sem modificar suas classes.
 */

//Agora vamos criar uma classe de exemplo para demonstrar como usar o padrão Visitor.
public class VisitorPatternExample {
	public static void main(String[] args) {
		// Criando elementos
		ConcreteElementA elementA = new ConcreteElementA();
		ConcreteElementB elementB = new ConcreteElementB();

		// Criando visitors
		Visitor visitor1 = new ConcreteVisitor1();
		Visitor visitor2 = new ConcreteVisitor2();

		// Visitando elementos com diferentes visitors
		elementA.accept(visitor1);
		elementB.accept(visitor1);

		System.out.println();

		elementA.accept(visitor2);
		elementB.accept(visitor2);
	}
}
