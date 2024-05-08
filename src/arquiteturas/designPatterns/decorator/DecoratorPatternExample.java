package arquiteturas.designPatterns.decorator;

//Agora vamos criar uma classe de exemplo para demonstrar como usar o padrão Decorator.

public class DecoratorPatternExample {
	public static void main(String[] args) {
		// Criando o componente base
		Component component = new ConcreteComponent();

		// Decorando o componente base com um decorador BeforeDecorator e depois com um
		// AfterDecorator
		Component decoratedComponent = new AfterDecorator(new BeforeDecorator(component));

		// Executando operação no componente decorado
		decoratedComponent.operation();
	}
}
