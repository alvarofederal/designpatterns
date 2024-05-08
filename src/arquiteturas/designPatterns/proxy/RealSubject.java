package arquiteturas.designPatterns.proxy;

//Vamos criar uma classe concreta que implementa a interface Subject, representando o objeto real.
class RealSubject implements Subject {
	@Override
	public void request() {
		System.out.println("RealSubject: Handling request.");
	}
}
