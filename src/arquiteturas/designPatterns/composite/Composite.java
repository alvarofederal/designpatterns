package arquiteturas.designPatterns.composite;

import java.util.ArrayList;
import java.util.List;

//Agora vamos criar uma classe para os componentes compostos.
class Composite implements Component {
	private List<Component> children = new ArrayList<>();

	public void add(Component component) {
		children.add(component);
	}

	public void remove(Component component) {
		children.remove(component);
	}

	@Override
	public void operation() {
		System.out.println("Composite operation performed:");
		for (Component component : children) {
			component.operation();
		}
	}
}
