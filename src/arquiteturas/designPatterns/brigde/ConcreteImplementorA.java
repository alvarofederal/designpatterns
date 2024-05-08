package arquiteturas.designPatterns.brigde;

//Implementação concreta A
class ConcreteImplementorA implements Implementor {
	@Override
	public void operationImpl() {
		System.out.println("Implementação A executada.");
	}
}