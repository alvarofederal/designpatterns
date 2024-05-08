package arquiteturas.designPatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

//Agora vamos criar uma fábrica Flyweight que gerencia os objetos Flyweight e os reutiliza, se já existirem.
class FlyweightFactory {
	private Map<String, Flyweight> flyweights = new HashMap<>();

	// Método para obter ou criar um objeto Flyweight com base no estado intrínseco
	// fornecido.
	public Flyweight getFlyweight(String intrinsicState) {
		if (!flyweights.containsKey(intrinsicState)) {
			flyweights.put(intrinsicState, new ConcreteFlyweight(intrinsicState));
		}
		return flyweights.get(intrinsicState);
	}
}
