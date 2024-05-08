package arquiteturas.designPatterns.templateMethod;

/**
 * Exemplo de implementação do padrão Template Method. O padrão Template Method
 * é usado para definir o esqueleto de um algoritmo em uma classe base,
 * permitindo que as subclasses substituam etapas específicas desse algoritmo
 * sem alterar sua estrutura.
 */

//Agora vamos criar uma classe de exemplo para demonstrar como usar o padrão Template Method.
public class TemplateMethodPatternExample {
	public static void main(String[] args) {
		// Criando uma instância de ConcreteClassA e chamando o método templateMethod
		AbstractClass objectA = new ConcreteClassA();
		objectA.templateMethod();

		System.out.println();

		// Criando uma instância de ConcreteClassB e chamando o método templateMethod
		AbstractClass objectB = new ConcreteClassB();
		objectB.templateMethod();
	}
}
