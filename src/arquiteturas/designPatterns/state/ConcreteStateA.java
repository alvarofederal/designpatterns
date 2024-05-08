package arquiteturas.designPatterns.state;

//Vamos criar algumas classes concretas que implementam a interface State para representar os diferentes estados.
class ConcreteStateA implements State {
	@Override
	public void handle() {
		System.out.println("ConcreteStateA: Handling operation in State A.");
	}
}
