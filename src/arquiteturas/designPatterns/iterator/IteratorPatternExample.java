package arquiteturas.designPatterns.iterator;

/**
 * Exemplo de implementação do padrão Iterator.
 * O padrão Iterator é usado para fornecer uma maneira de acessar os elementos de uma coleção
 * sequencialmente sem expor sua representação subjacente.
 */

//Exemplo de uso
public class IteratorPatternExample {
	public static void main(String[] args) {
		// Criando uma coleção
		ConcreteContainer container = new ConcreteContainer();
		container.addItem("Item 1");
		container.addItem("Item 2");
		container.addItem("Item 3");

		// Obtendo um iterador
		IteratorPattern iterator = container.getIterator();

		// Iterando sobre os itens
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

//Nesta implementação, temos a interface IteratorPattern, que define métodos para acessar elementos sequencialmente 
//(hasNext() e next()). A classe ConcreteIterator implementa esta interface e fornece uma implementação para trabalhar com uma lista de objetos.

//Além disso, temos a interface Container, que define um método para obter um iterador. 
//A classe ConcreteContainer implementa esta interface e mantém uma lista de objetos. 
//Ela fornece uma implementação para criar um iterador específico para essa lista.

//No exemplo de uso, criamos uma coleção (ConcreteContainer), adicionamos alguns itens a ela e obtemos um iterador. 
//Em seguida, iteramos sobre os itens usando o iterador. Este exemplo demonstra como o padrão 
//Iterator pode ser usado para acessar elementos de uma coleção sem expor sua implementação subjacente.
