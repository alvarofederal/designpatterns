package arquiteturas.designPatterns.adapter;

//Classe do Adaptador
class AdapterImpl implements Adapter {
	private Target adaptee;

	// Construtor que recebe o objeto a ser adaptado
	public AdapterImpl(Target adaptee) {
		this.adaptee = adaptee;
	}

	// Implementação do método específico da interface do adaptador
	@Override
	public void specificRequest() {
		// Chamando o método do objeto alvo adaptado
		adaptee.request();
	}
}
