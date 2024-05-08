package arquiteturas.designPatterns.mediator;

//Vamos criar algumas classes concretas que implementam a interface Colleague.
class ConcreteColleagueA implements Colleague {
	private Mediator mediator;

	public ConcreteColleagueA(Mediator mediator) {
		this.mediator = mediator;
	}

	// Método para enviar uma mensagem para todos os colegas através do mediador
	@Override
	public void sendMessage(String message) {
		mediator.sendMessage(message, this);
	}

	// Método para receber uma mensagem do mediador
	@Override
	public void receiveMessage(String message) {
		System.out.println("ConcreteColleagueA received message: " + message);
	}
}
