package arquiteturas.designPatterns.iterator;

import java.util.ArrayList;
import java.util.List;

//Classe Concreta da Coleção
class ConcreteContainer implements Container {
	private List<Object> items = new ArrayList<>();

	public void addItem(Object item) {
		items.add(item);
	}

	@Override
	public IteratorPattern getIterator() {
		return new ConcreteIterator(items);
	}
}
