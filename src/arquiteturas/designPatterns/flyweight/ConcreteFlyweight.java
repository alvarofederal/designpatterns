package arquiteturas.designPatterns.flyweight;

//Vamos criar uma classe concreta que implementa a interface Flyweight.
class ConcreteFlyweight implements Flyweight {
	private String intrinsicState;

	public ConcreteFlyweight(String intrinsicState) {
		this.intrinsicState = intrinsicState;
	}

	@Override
	public void operation() {
		System.out.println("ConcreteFlyweight with intrinsic state: " + intrinsicState);
	}
}
