package arquiteturas.designPatterns.prototype;

/**
 * Exemplo de implementação do padrão Prototype. O padrão Prototype é usado para
 * criar novos objetos duplicando um objeto existente, conhecido como protótipo.
 * Isso permite a criação de novos objetos sem depender de subclasses.
 */

//Agora vamos criar uma classe de exemplo para demonstrar como usar o padrão Prototype.
public class PrototypePatternExample {
	public static void main(String[] args) {
		// Criando um protótipo
		ConcretePrototype prototype = new ConcretePrototype("Initial Field Value");

		// Clonando o protótipo para criar um novo objeto
		ConcretePrototype clonedPrototype = (ConcretePrototype) prototype.clone();

		// Alterando o campo do objeto clonado
		clonedPrototype.setField("Modified Field Value");

		// Exibindo os campos do protótipo original e do objeto clonado
		System.out.println("Original Prototype Field: " + prototype.getField());
		System.out.println("Cloned Prototype Field: " + clonedPrototype.getField());
	}
}
