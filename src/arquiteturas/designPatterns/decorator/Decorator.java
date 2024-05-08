package arquiteturas.designPatterns.decorator;

//Agora vamos criar uma classe abstrata para os decoradores.
abstract class Decorator implements Component {
	protected Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		component.operation();
	}
}
