package arquiteturas.designPatterns.memento;

//Vamos criar uma classe originadora que possui o estado interno e pode criar e restaurar mementos.
class Originator {
	private String state;

	// Método para definir o estado interno do originador.
	public void setState(String state) {
		this.state = state;
	}

	// Método para criar um memento com o estado atual do originador.
	public Memento createMemento() {
		return new Memento(state);
	}

	// Método para restaurar o estado interno do originador a partir de um memento.
	public void restoreFromMemento(Memento memento) {
		state = memento.getState();
	}

	// Método de exemplo para mostrar o estado atual do originador.
	public void displayState() {
		System.out.println("Current state: " + state);
	}
}
