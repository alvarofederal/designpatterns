package arquiteturas.designPatterns.state;

//Vamos criar uma classe de contexto que mantém uma referência para o estado atual e permite que o estado mude dinamicamente.
class Context {
	private State state;

	// Método para definir o estado atual.
	public void setState(State state) {
		this.state = state;
	}

	// Método para executar uma operação com base no estado atual.
	public void request() {
		state.handle();
	}
}
