package arquiteturas.designPatterns.composite;

//Agora vamos criar uma classe de exemplo para demonstrar como usar o padrão Composite.

public class CompositePatternExample {
	public static void main(String[] args) {
		// Criando componentes individuais
		Leaf leaf1 = new Leaf("Leaf 1");
		Leaf leaf2 = new Leaf("Leaf 2");
		Leaf leaf3 = new Leaf("Leaf 3");

		// Criando componente composto e adicionando componentes individuais a ele
		Composite composite = new Composite();
		composite.add(leaf1);
		composite.add(leaf2);

		// Executando operações nos componentes
		leaf1.operation();
		leaf2.operation();
		leaf3.operation(); // Neste caso, como é um componente individual, será apenas uma operação
							// simples.

		// Executando operação no componente composto (que por sua vez, executa
		// operações em seus filhos)
		composite.operation();
	}
}
