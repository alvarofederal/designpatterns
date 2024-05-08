package arquiteturas.designPatterns.iterator;

import java.util.List;

//Classe Concreta do Iterador
class ConcreteIterator implements IteratorPattern {
	private List<Object> items;
	private int position = 0;

	public ConcreteIterator(List<Object> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		return position < items.size();
	}

	@Override
	public Object next() {
		if (this.hasNext()) {
			return items.get(position++);
		}
		return null;
	}
}
