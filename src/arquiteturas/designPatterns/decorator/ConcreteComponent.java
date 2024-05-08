package arquiteturas.designPatterns.decorator;

//Vamos criar uma classe concreta que implementa a interface Component.
class ConcreteComponent implements Component {
	@Override
	public void operation() {
		System.out.println("ConcreteComponent operation performed.");
	}
}
