package arquiteturas.designPatterns.composite;

//Agora vamos criar uma classe base para os componentes, que pode ser tanto um componente individual quanto um composto.
abstract class BaseComponent implements Component {
	// Método para adicionar um componente como filho (apenas relevante para
	// componentes compostos).
	public void add(Component component) {
		throw new UnsupportedOperationException("add() operation not supported for this component.");
	}

	// Método para remover um componente filho (apenas relevante para componentes
	// compostos).
	public void remove(Component component) {
		throw new UnsupportedOperationException("remove() operation not supported for this component.");
	}

	// Método para obter um componente filho em uma posição específica (apenas
	// relevante para componentes compostos).
	public Component getChild(int index) {
		throw new UnsupportedOperationException("getChild() operation not supported for this component.");
	}

	// Métodos adicionais podem ser adicionados aqui conforme necessário para
	// funcionalidades comuns a todos os componentes.
}
