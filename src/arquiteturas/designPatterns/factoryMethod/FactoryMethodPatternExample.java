package arquiteturas.designPatterns.factoryMethod;

/**
 * Exemplo de implementação do padrão Factory Method. O padrão Factory Method
 * define uma interface para criar um objeto, mas permite às subclasses alterar
 * o tipo de objetos que serão criados.
 */

//Agora vamos criar uma classe de exemplo para demonstrar como usar o padrão Factory Method.
public class FactoryMethodPatternExample {
	public static void main(String[] args) {
		// Criando um objeto ConcreteCreatorA e chamando sua operação.
		Creator creatorA = new ConcreteCreatorA();
		creatorA.anOperation();

		// Criando um objeto ConcreteCreatorB e chamando sua operação.
		Creator creatorB = new ConcreteCreatorB();
		creatorB.anOperation();
	}
}
