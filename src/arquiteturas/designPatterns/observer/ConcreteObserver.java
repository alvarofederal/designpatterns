package arquiteturas.designPatterns.observer;

//Classe Observador Concreto
class ConcreteObserver implements Observer {
	private String observerName;

	public ConcreteObserver(String name) {
		this.observerName = name;
	}

	// Método para atualização do Observador
	@Override
	public void update(String message) {
		System.out.println(observerName + " recebeu a mensagem: " + message);
	}
}
