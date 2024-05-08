package arquiteturas.designPatterns.memento;

//Vamos criar uma classe de cuidador que é responsável por manter e gerenciar mementos.
class Caretaker {
	private Memento memento;

	// Método para definir o memento a ser mantido pelo cuidador.
	public void setMemento(Memento memento) {
		this.memento = memento;
	}

	// Método para obter o memento mantido pelo cuidador.
	public Memento getMemento() {
		return memento;
	}
}
