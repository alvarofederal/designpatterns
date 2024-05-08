package arquiteturas.designPatterns.flyweight;

//Agora vamos criar uma classe de exemplo para demonstrar como usar o padrão Flyweight.

public class FlyweightPatternExample {
	public static void main(String[] args) {
		// Criando a fábrica Flyweight
		FlyweightFactory flyweightFactory = new FlyweightFactory();

		// Obtendo ou criando objetos Flyweight com base no estado intrínseco
		Flyweight flyweight1 = flyweightFactory.getFlyweight("state1");
		Flyweight flyweight2 = flyweightFactory.getFlyweight("state2");
		Flyweight flyweight3 = flyweightFactory.getFlyweight("state1"); // Reutilizando o objeto existente

		// Chamando o método operation em cada objeto Flyweight
		flyweight1.operation();
		flyweight2.operation();
		flyweight3.operation();
	}
}
