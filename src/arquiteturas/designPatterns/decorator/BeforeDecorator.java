package arquiteturas.designPatterns.decorator;

//Vamos criar algumas classes concretas para os decoradores.

//Decorador que adiciona funcionalidade antes da operação.
class BeforeDecorator extends Decorator {
	public BeforeDecorator(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		System.out.println("BeforeDecorator operation performed.");
		super.operation();
	}
}
