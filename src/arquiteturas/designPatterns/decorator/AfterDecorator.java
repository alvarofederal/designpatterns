package arquiteturas.designPatterns.decorator;

//Decorador que adiciona funcionalidade depois da operação.
class AfterDecorator extends Decorator {
	public AfterDecorator(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		super.operation();
		System.out.println("AfterDecorator operation performed.");
	}
}
