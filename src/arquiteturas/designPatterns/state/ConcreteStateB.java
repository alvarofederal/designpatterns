package arquiteturas.designPatterns.state;

class ConcreteStateB implements State {
	@Override
	public void handle() {
		System.out.println("ConcreteStateB: Handling operation in State B.");
	}
}
