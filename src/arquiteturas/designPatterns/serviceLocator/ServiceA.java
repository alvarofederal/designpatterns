package arquiteturas.designPatterns.serviceLocator;

//Vamos criar algumas classes concretas que implementam a interface Service.
class ServiceA implements Service {
	@Override
	public void execute() {
		System.out.println("Executing ServiceA.");
	}
}
