package arquiteturas.designPatterns.strategy;

//Vamos criar uma classe de contexto que mantém uma referência para a estratégia atual e permite trocar de estratégia dinamicamente.
class Context {
	private Strategy strategy;

	// Setter para definir a estratégia atual
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	// Método que chama a estratégia atual
	public void executeStrategy() {
		if (strategy != null) {
			strategy.execute();
		} else {
			System.out.println("Nenhuma estratégia definida.");
		}
	}
}
