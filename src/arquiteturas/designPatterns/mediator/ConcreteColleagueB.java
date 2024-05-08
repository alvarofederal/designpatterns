package arquiteturas.designPatterns.mediator;

class ConcreteColleagueB implements Colleague {
	private Mediator mediator;

	public ConcreteColleagueB(Mediator mediator) {
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
		System.out.println("ConcreteColleagueB received message: " + message);
	}
}
